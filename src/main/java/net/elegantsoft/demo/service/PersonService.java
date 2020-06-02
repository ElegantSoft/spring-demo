package net.elegantsoft.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import net.elegantsoft.demo.dao.PersonDao;
import net.elegantsoft.demo.model.Person;

@Service
public class PersonService {

  private final PersonDao personDao;

  public int addPerson(Person person) {
    return personDao.insertPerson(person);
  }

  @Autowired
  public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
    this.personDao = personDao;
  }
}