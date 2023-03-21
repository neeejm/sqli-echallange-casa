package com.example.jpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import com.example.jpa.models.Person;
import com.example.jpa.repositories.PersonRepository;

@SpringBootTest
@ActiveProfiles("test")
class JpaApplicationTests {

	@Autowired
	private PersonRepository personRepository;

	@Test
	void shouldSavePerson() {
		Person person = new Person("test", 10);
		personRepository.save(person);
		Person expectedPerson = personRepository.findById(1L).get();
		assertEquals(expectedPerson.getName(), person.getName());

	}

}
