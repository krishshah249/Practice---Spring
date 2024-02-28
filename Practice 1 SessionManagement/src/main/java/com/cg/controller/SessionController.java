package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Session;
import com.cg.service.SessionServiceImpl;

@RestController
public class SessionController {

	@Autowired private SessionServiceImpl service;
	
	
	@PostMapping(value="/createSession",consumes= {"application/json"})
	public ResponseEntity<String> createSession(@RequestBody Session s) {
		service.addSession(s);
		return new ResponseEntity<String>("Record Successfully Created:",HttpStatus.OK);
	}
	
	@PutMapping(value="/updateSession",consumes={"application/json"})
	public ResponseEntity<String> updateSession(@RequestBody Session s) {
		service.updateSession(s);
		return new ResponseEntity<String>("Record Successfully Updated:",HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deleteSession-{id}")
	public ResponseEntity<String> deleteSession(@PathVariable int id) {
		service.deleteSession(id);
		return new ResponseEntity<String>("Record Successfully Deleted:",HttpStatus.OK);
	}
	
	@GetMapping(value="/viewAllSession",produces={"application/json"})
	public List<Session> viewAllSession(){
	return service.getAllSession();
	}
}
