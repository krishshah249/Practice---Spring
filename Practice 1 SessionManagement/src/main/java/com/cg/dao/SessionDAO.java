package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Session;

@Repository
public interface SessionDAO extends JpaRepository<Session, Integer> {

}
