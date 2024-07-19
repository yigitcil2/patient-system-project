package com.example.patient_registiration;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CollectionTable;

@Entity
@Table(name="patient")
@Data // getter-setter
public class Patient {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	

// arda123
	private String Name;
	private String Surname;
	private String username;
	private String password;
	private String tckn;
	private String gender;
	private LocalDate  birthday; //tarih belirtmek için localDate
	
	@ElementCollection //one to many
    @CollectionTable(name = "patient_contacts", joinColumns = @JoinColumn(name = "patient_id")) //verilerin saklanacağı tablo
    @Column(name = "contact")
    private List<String> contacts;
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

}
