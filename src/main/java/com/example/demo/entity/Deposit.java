package com.example.demo.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;


@Entity
@Table(name = "deposits")
public class Deposit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer depoId;
	@NotNull
	@NotBlank
	@Size(max = 10)
	@Pattern(regexp = "^[1-9]+[0-9]*$")
	private String accNumber;
	@NotNull
	@Range(min = 0)
	private Double amt;
	private String description;

	public Deposit() {
		
	}
	public Deposit(Integer depoId,
			 @NotNull @Size(max = 10) @Pattern(regexp = "^[1-9]+[0-9]*$") String accNumber,
			 @NotNull @Range(min = 0) Double amt, String description) {
		super();
		this.depoId = depoId;
		this.accNumber = accNumber;
		this.amt = amt;
		this.description = description;

	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public Double getAmt() {
		return amt;
	}
	public void setAmt(Double amt) {
		this.amt = amt;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
