package javakampOdev.Entities;

import java.time.LocalDate;

import javakampOdev.Abstract.Entity;

public class Customer implements Entity {

	 private int Id;
	 private String firstName;
	 private String lastName;
	 private LocalDate dateOfBirth;
	 private String NationalyId;
	 
	
	 
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalyId) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalyId = nationalyId;
	}


	 public Customer() {
			// TODO Auto-generated constructor stub
		}
	

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalyId() {
		return NationalyId;
	}
	public void setNationalyId(String nationalyId) {
		NationalyId = nationalyId;
	}
}
