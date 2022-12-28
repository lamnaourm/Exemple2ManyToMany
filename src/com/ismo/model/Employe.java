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
import lombok.Getter;

@Data
@Entity
@Table(name="T_EMPLOYE")
public class Employe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_emp")
	int id;
	
	@Column(name = "nom_emp")
	String nom; 
	
	@Column(name = "prenom_emp")
	String prenom;
	
	@ManyToMany(mappedBy = "employes")
	Set<Projet> projets = new HashSet<Projet>();
	
}
