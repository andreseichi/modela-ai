package com.modelagem.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelagem.api.model.Person;

public interface PersonRepositoy extends JpaRepository<Person, Long> {
}
