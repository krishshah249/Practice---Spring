package com.cg.service;

import java.util.List;

import com.cg.entities.Session;

public interface SessionService {
	
	public void addSession(Session s);
	
	public void updateSession(Session s);
	
	public List<Session> getAllSession();
	
	public void deleteSession(int sessionId);
	
}
