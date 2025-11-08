package com.apress.todo.repository;

import com.apress.todo.domain.MavenSpring;
import org.springframework.data.repository.CrudRepository;

public interface MavenSpringRepository extends CrudRepository<MavenSpring,String> {
}