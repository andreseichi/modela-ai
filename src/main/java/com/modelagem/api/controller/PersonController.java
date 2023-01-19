package com.modelagem.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelagem.api.dto.PersonDTO;
import com.modelagem.api.model.Person;
import com.modelagem.api.repository.PersonRepositoy;

@RestController
@RequestMapping("/api/person")
public class PersonController {

  @Autowired
  private PersonRepositoy repository;

  @GetMapping
  public List<Person> list() {
    return repository.findAll();
  }

  @PostMapping
  public void create(@RequestBody PersonDTO req) {
    repository.save(new Person(req));

    System.out.println(req);
  }
}
