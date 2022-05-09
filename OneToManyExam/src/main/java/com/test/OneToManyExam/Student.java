package com.test.OneToManyExam;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Detail")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_id;
	private String fname;
	private int contact;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "s_id")
	private List<MarkDetails> markDetails;

	public List<MarkDetails> getMarkDetails() {
		return markDetails;
	}

	public void setMarkDetails(List<MarkDetails> markDetails) {
		this.markDetails = markDetails;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

}
