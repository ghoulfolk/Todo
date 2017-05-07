package com.todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "task")
public class Todo extends GenericObject{

	@Column(name="task_name")
	private String taskName;
	
}
