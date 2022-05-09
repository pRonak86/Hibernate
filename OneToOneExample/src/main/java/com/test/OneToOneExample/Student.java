package com.test.OneToOneExample;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "STU100")
public class Student {

	@Id
	@GeneratedValue(generator = "xyz",strategy = GenerationType.AUTO) //to generate auto increment value in table column in ID
	@GenericGenerator(name = "xyz",strategy = "foreign",parameters = {@Parameter(value = "details",name = "property")}) 
	private int id;
	// to indentify the foreign key in details table as nameed "id"
	@Column(name = "Stu_Name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Details details;
	
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
