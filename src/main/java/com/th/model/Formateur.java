package com.th.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formateur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String nom,prenom,grade,telephone,mdp;
@Column(unique = true)
private String email;
private int recrutement,age;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getRecrutement() {
	return recrutement;
}
public void setRecrutement(int recrutement) {
	this.recrutement = recrutement;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
