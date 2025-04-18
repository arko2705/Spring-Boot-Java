package com.example.Practise.entity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Table(name="customer_identification")
public class CustomerIdentification {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int customer_identification_id;
	 private String customer_identifier;
	 @Column(name="customer_identification_type")
	 private Integer bruh;
	 private String Customer_Identification_Item;
	 private LocalDateTime effective_date;
	 private LocalDateTime cst_acpt_ts;
	 private LocalDateTime cst_acpt_ts_utc_offset;
	 private String cst_contact;
	 private String cst_crud_value;
	 private LocalDateTime cst_dob;
	 private LocalDateTime cst_effective_date;
	 private String cst_email;
	 private LocalDateTime cst_host_ts; 
	 private LocalDateTime cst_local_ts;
	 private String cst_mobile;
	 private String cst_prgm_id;
	 private String cst_status;
	 private String cst_type;
	 private String cst_user_id;
	 private String cst_uuid;
	 private String cst_ws_id;
	 public CustomerIdentification(){
		 
	 }
	public int getCustomer_identification_id() {
		return customer_identification_id;
	}
	public void setCustomer_identification_id(int customer_identification_id) {
		this.customer_identification_id = customer_identification_id;
	}
	public String getCustomer_identifier() {
		return customer_identifier;
	}
	public void setCustomer_identifier(String customer_identifier) {
		this.customer_identifier = customer_identifier;
	}
	public Integer getbruh() {
		return bruh;
	}
	public void setbruh(Integer customer_identification_type) {
		this.bruh = bruh;
	}
	public String getCustomer_Identification_Item() {
		return Customer_Identification_Item;
	}
	public void setCustomer_Identification_Item(String customer_Identification_Item) {
		Customer_Identification_Item = customer_Identification_Item;
	}
	public LocalDateTime getEffective_date() {
		return effective_date;
	}
	public void setEffective_date(LocalDateTime effective_date) {
		this.effective_date = effective_date;
	}
	public LocalDateTime getCst_acpt_ts() {
		return cst_acpt_ts;
	}
	public void setCst_acpt_ts(LocalDateTime cst_acpt_ts) {
		this.cst_acpt_ts = cst_acpt_ts;
	}
	public LocalDateTime getCst_acpt_ts_utc_offset() {
		return cst_acpt_ts_utc_offset;
	}
	public void setCst_acpt_ts_utc_offset(LocalDateTime cst_acpt_ts_utc_offset) {
		this.cst_acpt_ts_utc_offset = cst_acpt_ts_utc_offset;
	}
	public String getCst_contact() {
		return cst_contact;
	}
	public void setCst_contact(String cst_contact) {
		this.cst_contact = cst_contact;
	}
	public String getCst_crud_value() {
		return cst_crud_value;
	}
	public void setCst_crud_value(String cst_crud_value) {
		this.cst_crud_value = cst_crud_value;
	}
	public LocalDateTime getCst_dob() {
		return cst_dob;
	}
	public void setCst_dob(LocalDateTime cst_dob) {
		this.cst_dob = cst_dob;
	}
	public LocalDateTime getCst_effective_date() {
		return cst_effective_date;
	}
	public void setCst_effective_date(LocalDateTime cst_effective_date) {
		this.cst_effective_date = cst_effective_date;
	}
	public String getCst_email() {
		return cst_email;
	}
	public void setCst_email(String cst_email) {
		this.cst_email = cst_email;
	}
	public LocalDateTime getCst_host_ts() {
		return cst_host_ts;
	}
	public void setCst_host_ts(LocalDateTime cst_host_ts) {
		this.cst_host_ts = cst_host_ts;
	}
	public LocalDateTime getCst_local_ts() {
		return cst_local_ts;
	}
	public void setCst_local_ts(LocalDateTime cst_local_ts) {
		this.cst_local_ts = cst_local_ts;
	}
	public String getCst_mobile() {
		return cst_mobile;
	}
	public void setCst_mobile(String cst_mobile) {
		this.cst_mobile = cst_mobile;
	}
	public String getCst_prgm_id() {
		return cst_prgm_id;
	}
	public void setCst_prgm_id(String cst_prgm_id) {
		this.cst_prgm_id = cst_prgm_id;
	}
	public String getCst_status() {
		return cst_status;
	}
	public void setCst_status(String cst_status) {
		this.cst_status = cst_status;
	}
	public String getCst_type() {
		return cst_type;
	}
	public void setCst_type(String cst_type) {
		this.cst_type = cst_type;
	}
	public String getCst_user_id() {
		return cst_user_id;
	}
	public void setCst_user_id(String cst_user_id) {
		this.cst_user_id = cst_user_id;
	}
	public String getCst_uuid() {
		return cst_uuid;
	}
	public void setCst_uuid(String cst_uuid) {
		this.cst_uuid = cst_uuid;
	}
	public String getCst_ws_id() {
		return cst_ws_id;
	}
	public void setCst_ws_id(String cst_ws_id) {
		this.cst_ws_id = cst_ws_id;
	}
	 
	 
}
