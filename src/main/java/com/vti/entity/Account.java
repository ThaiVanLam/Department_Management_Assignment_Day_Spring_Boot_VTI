package com.vti.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Account")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "AccountID")
	@Id
	private int id;

	@Column(name = "Email", nullable = false, unique = true)
	private String email;

	@Column(name = "Username", nullable = false, unique = true)
	private String username;

	@Column(name = "FullName", nullable = false)
	private String fullname;

	@ManyToOne
	@JoinColumn(name = "DepartmentID")
	private Department department;

	@ManyToOne
	@JoinColumn(name = "PositionID")
	private Position position;

	public Account(String email, String username, String fullname, Department department, Position position) {
		super();
		this.email = email;
		this.username = username;
		this.fullname = fullname;
		this.department = department;
		this.position = position;
	}

}
