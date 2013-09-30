package edu.esprit.carpoolModule.ejb.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DisponibilityTime implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dispoId;
	private Date startTime;
	private Date endTime;
	
	public DisponibilityTime() {
	}
	
	public int getDispoId() {
		return dispoId;
	}
	public void setDispoId(int dispoId) {
		this.dispoId = dispoId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	
	
	
	
}
