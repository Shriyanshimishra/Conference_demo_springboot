package com.shriyanshi.pluralspringboot.conference_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shriyanshi.pluralspringboot.conference_demo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
