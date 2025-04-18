package com.example.Practise.entity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
@Entity
@Table(name="cust_ci")
public class CustomerContactInformation{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int CST_ID;
	private String CSTDET_CONTACT_T;
	private String CSTDET_CONTACT_V ; 
	private LocalDateTime CSTCL_EFCTV_DATE; 
	private LocalDateTime end_date ;
	private LocalDateTime start_date;
	public CustomerContactInformation() {
		
	}
	public int getCST_ID() {
		return CST_ID;
	}
	public void setCST_ID(int cST_ID) {
		CST_ID = cST_ID;
	}
	public String getCSTDET_CONTACT_T() {
		return CSTDET_CONTACT_T;
	}
	public void setCSTDET_CONTACT_T(String cSTDET_CONTACT_T) {
		CSTDET_CONTACT_T = cSTDET_CONTACT_T;
	}
	public String getCSTDET_CONTACT_V() {
		return CSTDET_CONTACT_V;
	}
	public void setCSTDET_CONTACT_V(String cSTDET_CONTACT_V) {
		CSTDET_CONTACT_V = cSTDET_CONTACT_V;
	}
	public LocalDateTime getCSTCL_EFCTV_DATE() {
		return CSTCL_EFCTV_DATE;
	}
	public void setCSTCL_EFCTV_DATE(LocalDateTime cSTCL_EFCTV_DATE) {
		CSTCL_EFCTV_DATE = cSTCL_EFCTV_DATE;
	}
	public LocalDateTime getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDateTime end_date) {
		this.end_date = end_date;
	}
	public LocalDateTime getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDateTime start_date) {
		this.start_date = start_date;
	}
	
}
