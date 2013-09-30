package edu.esprit.carpoolModule.ejb.domaine;

import java.io.File;
import java.io.Serializable;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUser;
	
	private String nomUser;
	private String prenomUser;
	private String emailUser;
	private String telUser;
	private String universityUser;
	private String hobbiesUser;
	private String nationalityUser;
	private boolean smokerUser;
	private String petUser;
	private int livedCollocationUser;
	private String biographyUser;
	private File pictureUser;
	private String streetUser;
	private String cityUser;
	private String townUser;
	private int postCode;
	
	private DisponibilityDays disponibilityDaysUser;
	
	
	
	
	
	
	public String getStreetUser() {
		return streetUser;
	}



	public void setStreetUser(String streetUser) {
		this.streetUser = streetUser;
	}



	public String getCityUser() {
		return cityUser;
	}



	public void setCityUser(String cityUser) {
		this.cityUser = cityUser;
	}



	public String getTownUser() {
		return townUser;
	}



	public void setTownUser(String townUser) {
		this.townUser = townUser;
	}



	public int getPostCode() {
		return postCode;
	}



	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}



	public int getIdUser() {
		return idUser;
	}
	
	
	
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNomUser() {
		return nomUser;
	}
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	public String getPrenomUser() {
		return prenomUser;
	}
	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getTelUser() {
		return telUser;
	}
	public void setTelUser(String telUser) {
		this.telUser = telUser;
	}
	public String getUniversityUser() {
		return universityUser;
	}
	public void setUniversityUser(String universityUser) {
		this.universityUser = universityUser;
	}
	public String getHobbiesUser() {
		return hobbiesUser;
	}
	public void setHobbiesUser(String hobbiesUser) {
		this.hobbiesUser = hobbiesUser;
	}
	public String getNationalityUser() {
		return nationalityUser;
	}
	public void setNationalityUser(String nationalityUser) {
		this.nationalityUser = nationalityUser;
	}
	public boolean isSmokerUser() {
		return smokerUser;
	}
	public void setSmokerUser(boolean smokerUser) {
		this.smokerUser = smokerUser;
	}
	public String getPetUser() {
		return petUser;
	}
	public void setPetUser(String petUser) {
		this.petUser = petUser;
	}
	public int getLivedCollocationUser() {
		return livedCollocationUser;
	}
	public void setLivedCollocationUser(int livedCollocationUser) {
		this.livedCollocationUser = livedCollocationUser;
	}
	public String getBiographyUser() {
		return biographyUser;
	}
	public void setBiographyUser(String biographyUser) {
		this.biographyUser = biographyUser;
	}
	public File getPictureUser() {
		return pictureUser;
	}
	public void setPictureUser(File pictureUser) {
		this.pictureUser = pictureUser;
	}
	
	
	public User(){
		
	}
	
	
	
	
	
	

}
