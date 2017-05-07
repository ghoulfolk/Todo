package com.todo.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter @Setter
public abstract class GenericObject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Basic(optional = false)  
	@Column(name = "id", nullable = false)
	protected Long id;

}
