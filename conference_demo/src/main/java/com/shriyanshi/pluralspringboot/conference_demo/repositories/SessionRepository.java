package com.shriyanshi.pluralspringboot.conference_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shriyanshi.pluralspringboot.conference_demo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
