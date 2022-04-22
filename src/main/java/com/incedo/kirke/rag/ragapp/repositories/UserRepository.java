package com.incedo.kirke.rag.ragapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incedo.kirke.rag.ragapp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByEmail(String email);
}
