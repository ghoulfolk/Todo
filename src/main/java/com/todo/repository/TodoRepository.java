package com.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.todo.model.Todo;

public interface TodoRepository  extends JpaRepository<Todo, Long> {

	List<Todo> findByTaskName(@Param("t") String task);

}