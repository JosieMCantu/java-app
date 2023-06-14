package com.example.springboot;

import org.springframework.data.repository.CrudRepository;
import com.example.springboot.Greeting;

public interface GreetingRepository extends CrudRepository<Greeting, Integer> {
}