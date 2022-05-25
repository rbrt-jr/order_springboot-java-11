package com.myprojectweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myprojectweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u1 = new User(1L, "André", "andre@sapo.pt", "+351920356359", "gatinho");
		return ResponseEntity.ok().body(u1);
	}
}
