package com.example.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {

	public Mono<Employee> findEmployeeById(String id);

	public Flux<Employee> findAll();

}
