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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Position")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Position implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "PositionID")
	@Id
	private int id;

	@Column(name = "PositionName", nullable = false, unique = true)
	private String positionName;

//	@ToString.Exclude
	@JsonIgnore
	@OneToMany(mappedBy = "position")
	private List<Account> accounts;

}
