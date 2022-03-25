package com.th.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Formation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  long id;
@Column(unique = true)
private String titre;
private double prix;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}



}
