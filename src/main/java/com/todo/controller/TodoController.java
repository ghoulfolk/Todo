package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todo.model.Todo;
import com.todo.repository.TodoRepository;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	TodoRepository todoRepository;

	//get one todo based on its id: eg. http://localhost:8080/todo/8
		@CrossOrigin
		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public Todo getTodo(@PathVariable Long id) throws Exception {
			return todoRepository.getOne(id);
		}

		//get all todos eg. http://localhost:8080/todo/
		@CrossOrigin
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public List<Todo> getAllTodos() throws Exception {
			return todoRepository.findAll();	
		}

		//create a new todo http://localhost:8080/todo/
		@CrossOrigin
		@RequestMapping(value = "/", method = RequestMethod.POST, headers = {"Content-type=application/json"})
		public Todo newTodo(@RequestBody Todo t) throws Exception {
			return todoRepository.save(t);
		}

		//delete todo by id. http://localhost:8080/todo/8
		@CrossOrigin
		@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
		public void deleteTodo(@PathVariable Long id) {
			todoRepository.delete(id);
		}
}
