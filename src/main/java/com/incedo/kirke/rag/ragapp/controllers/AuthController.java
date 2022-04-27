package com.incedo.kirke.rag.ragapp.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.incedo.kirke.rag.ragapp.mappers.RagMapper;
import com.incedo.kirke.rag.ragapp.model.RagEntry;
import com.incedo.kirke.rag.ragapp.model.User;
import com.incedo.kirke.rag.ragapp.repositories.UserRepository;
import com.incedo.kirke.rag.ragapp.requestbody.GetDataRequest;
import com.incedo.kirke.rag.ragapp.requestbody.RagResponse;
import com.incedo.kirke.rag.ragapp.requestbody.Response;
import com.incedo.kirke.rag.ragapp.requestbody.UserCredentials;
import com.incedo.kirke.rag.ragapp.requestbody.UserRegistration;

@RestController("/")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@GetMapping("/auth")
	public String getauth() {

		List q = jdbcTemplate.queryForList("select * from users", new HashMap());

		System.out.println("saaa --" + q.size());

		return "{'status': 'success'}";
	}

	@ResponseBody
	@PostMapping(value = "/auth", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> auth(@RequestBody UserCredentials userCredentials, HttpServletResponse response)
			throws IOException {
		System.out.println("email --" + userCredentials.getEmail());
		System.out.println("password--" + userCredentials.getPassword());
		String email = userCredentials.getEmail();
		String password = userCredentials.getPassword();

		List list = userRepo.findByEmail(email);

		response.setContentType("application/json");
		if (list.size() > 0) {
			User user = (User) list.get(0);

			if (user.getPassword().equals(password)) {
				return new ResponseEntity(new Response("success"), HttpStatus.OK);
			} else {
				return new ResponseEntity(new Response("error"), HttpStatus.OK);
			}
		} else {
			return new ResponseEntity(new Response("error"), HttpStatus.OK);
		}

	}

	@ResponseBody
	@PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> auth(@RequestBody UserRegistration userRegistration, HttpServletResponse response)
			throws IOException {
		System.out.println("email --" + userRegistration.getEmail());
		System.out.println("password--" + userRegistration.getPassword());
		String email = userRegistration.getEmail();
		String password = userRegistration.getPassword();
		String confirmpassword = userRegistration.getConfirmPassword();
		if (!password.contentEquals(confirmpassword)) {
			return new ResponseEntity(new Response("error"), HttpStatus.OK);
		}

		try {
			User user = new User();
			user.setEmail(email);
			user.setPassword(password);
			user.setFirstName(userRegistration.getFirstName());
			user.setLastName(userRegistration.getLastName());
			userRepo.save(user);

			response.setContentType("application/json");
			return new ResponseEntity(new Response("success"), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(new Response("error"), HttpStatus.OK);
		}
	}

	@ResponseBody
	@PostMapping(value = "/getData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RagResponse> getData(@RequestBody GetDataRequest getDataRequest,
			HttpServletResponse response) {

		try {

			RagResponse sresonse = new RagResponse("success");

			List<RagEntry> entries = new ArrayList<RagEntry>();

			System.out.println("month" + getDataRequest.getMonth());
			System.out.println("year" + getDataRequest.getYear());

			List list = jdbcTemplate.query(
					"select * from users u, ragmeeting r where u.id = r.user_id order by u.id asc", new RagMapper());

			
			
			list.forEach(it -> entries.add((RagEntry) it));
			
			
			sresonse.setRagEntryList(entries);

			System.out.println(entries);

			response.setContentType("application/json");
			return new ResponseEntity(sresonse, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(new Response("error"), HttpStatus.OK);
		}

	}

}
