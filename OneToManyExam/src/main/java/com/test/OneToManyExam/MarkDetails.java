package com.test.OneToManyExam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Marks")
public class MarkDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int test_id;
	private String subject;
	private int max_marks;
	private int obt_marks;
	public int getTest_id() {
		return test_id;
	}
	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMax_marks() {
		return max_marks;
	}
	public void setMax_marks(int max_marks) {
		this.max_marks = max_marks;
	}
	public int getObt_marks() {
		return obt_marks;
	}
	public void setObt_marks(int obt_marks) {
		this.obt_marks = obt_marks;
	}
	
	

}
