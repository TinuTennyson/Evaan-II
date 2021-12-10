package com.eurekagcpdatabase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {
	
	public Menu(int id, String value) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.value = value;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

	@Column(name = "value")
    private String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Menu() {
		
	}
	
}
