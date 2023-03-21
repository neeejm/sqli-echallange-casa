package com.example.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jpa.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
