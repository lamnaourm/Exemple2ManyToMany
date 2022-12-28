package com.ismo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="T_PROJET")
public class Projet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_proj")
	int id;
	
	@Column(name = "nom_proj")
	String nom; 
	
	@Column(name = "ville_proj")
	String ville;
	
	@ManyToMany
	@JoinTable(name="T_EMP_PROJ", 
			joinColumns = @JoinColumn(name="id_proj"), 
			inverseJoinColumns = @JoinColumn(name="id_emp"))
	Set<Employe> employes = new HashSet<Employe>();
}
