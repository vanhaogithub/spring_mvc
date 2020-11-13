package com.bachkhoa.api.admin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bachkhoa.dto.NewDTO;

@RestController(value = "newAPIOfAdmin")
public class NewAPI {

	@PostMapping("/api/new")
	public NewDTO createNew(@RequestBody NewDTO newDTO) {
		return newDTO;
	}

	@PutMapping("/api/new")
	public NewDTO updateNew(@RequestBody NewDTO newDTO) {
		return newDTO;
	}

	@DeleteMapping("/api/new")
	public void deleteNew(@RequestBody long[] ids) {
		System.out.println("ok");
	}
}
