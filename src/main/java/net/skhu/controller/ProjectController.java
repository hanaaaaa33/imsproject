package net.skhu.controller;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.repository.ProjectRepository;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController {

	@Autowired
	ProjectRepository projectrepository;

	@GetMapping("/project")
	HashMap<String,Object> list() {
		HashMap<String,Object> json = new HashMap<>();
		json.put("list",projectrepository.findAll());

		return json;
	}
}