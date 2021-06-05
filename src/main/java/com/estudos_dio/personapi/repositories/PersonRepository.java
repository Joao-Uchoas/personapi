package com.estudos_dio.personapi.repositories;

import com.estudos_dio.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
