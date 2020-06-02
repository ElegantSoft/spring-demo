package net.elegantsoft.demo.dao;

import java.util.UUID;

import net.elegantsoft.demo.model.Person;

public interface PersonDao {
  int insertPerson(UUID id, Person person);

  default int insertPerson(Person person) {
    UUID id = UUID.randomUUID();
    return insertPerson(id, person);
  }
}