package com.incedo.kirke.rag.ragapp.mappers;

import org.springframework.jdbc.core.RowMapper;

import com.incedo.kirke.rag.ragapp.model.RagEntry;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RagMapper implements RowMapper<RagEntry> {

	@Override
	public RagEntry mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		RagEntry entry = new RagEntry();
		
		entry.setCurrentLevel(rs.getString("current_level"));
		entry.setFirstName(rs.getString("first_name"));
		entry.setLastName(rs.getString("last_name"));
		
		entry.setEmail(rs.getString("email"));

		entry.setProgram(rs.getString("program"));
		entry.setCurrentLevel(rs.getString("current_level"));
		entry.setDoj(rs.getDate("doj"));
		entry.setLastPromotedOn(rs.getDate("last_promoted_on"));
		
		entry.setRag(rs.getInt("rag"));
		entry.setEtaDate(rs.getDate("eta_date"));
		entry.setRagNotes(rs.getString("notes"));
		
		entry.setMonth(rs.getInt("month"));
		entry.setYear(rs.getInt("year"));
		
		entry.setId(rs.getInt("id"));
		
		
		return entry;
	}
}
