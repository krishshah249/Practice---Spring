package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.SessionDAO;
import com.cg.entities.Session;
import com.cg.exceptions.ApplicationException;



@Service
@Transactional
public class SessionServiceImpl implements SessionService {
	
	@Autowired private SessionDAO dao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void addSession(Session s) {
		// TODO Auto-generated method stub
		if(dao.existsById(s.getId())) {
			throw new ApplicationException("Session Already exists!!");
			}
		dao.save(s);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void updateSession(Session s) {
		// TODO Auto-generated method stub
		if(dao.existsById(s.getId()))
			dao.save(s);
		else
			throw new ApplicationException("Session not found!");
//		Optional<Session> s1= dao.findById(s.getId());
//		if(s1.isPresent()) {
//			Session temp=s1.get();
//			temp.setDuration(s.getDuration());
//			temp.setFaculty(s.getFaculty());
//			dao.saveAndFlush(temp);
//		}
//		else
//			throw new ApplicationException("Session not found!");

	}
	
	@Transactional(readOnly=true)
	public List<Session> getAllSession() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void deleteSession(int sessionId) {
		// TODO Auto-generated method stub
		Optional<Session> s1= dao.findById(sessionId);
		if(s1.isPresent()) {
		dao.deleteById(sessionId);
		}
		else
			throw new ApplicationException("Session Id does not exists!");
	}

}
