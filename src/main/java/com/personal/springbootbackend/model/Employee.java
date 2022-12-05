package com.personal.springbootbackend.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String firstName;

	private String lastName;

	private String emailId;
}
	

