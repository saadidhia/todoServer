package com.todoapp.Controller;
import com.todoapp.Entity.*;
import com.todoapp.Services.TodoHardCodedService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3001")
public class TodoResource {
	
	@Autowired private TodoHardCodedService todoService;
	
	@GetMapping("/users/{username}/todos")
	public List<todo> getAllTodos(@PathVariable String username){
		return todoService.findAll();
	}
	
	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deletetodoById(@PathVariable String username, @PathVariable Long id){
		todo todo=todoService.removeById(id);
		if (todo!=null) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.notFound().build();
	}

}
