package com.example.Practise.entity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
@Entity
@Table(name = "cust_details")
public class CustomerDetail{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column( name = "CST_ID")
  private int Id;
   
  @Column( name="cstdet_type")
  private String CustType;
  
  @Column( name="cstdet_dob")
  private LocalDateTime CustDOB;
  
  @Column( name="cstdet_status")
  private String CustStatus;
  
  @Column( name="cstdet_contact")
  private String custContact;
  
  @Column( name="cstdet_mobile")
  private String custMobile;
  
  @Column( name="cstdet_email")
  private String CustEmail;
  
  @Column( name="cstdet_efctv_date")
  private LocalDateTime custDate;
  
  @Column( name="cstdet_crud_value")
  private String CustCrudValue;
  
  @Column( name="cstdet_user_id")
  private String CustUserId;
  
  @Column( name="cstdet_ws_id")
  private String CustWsId;
  
  @Column( name="cstdet_prgm_id")
  private String CustPrgmId;
  
  @Column( name="CSTDET_HOST_TS")
  private LocalDateTime CustHostTs;
  
  @Column( name="CSTDET_LOCAL_TS")
  private LocalDateTime CustLocalTs;
  
  @Column( name="CSTDET_ACPT_TS")
  private LocalDateTime CustAcptTs;
  
  @Column( name="CSTDET_ACPT_TS_UTC_OFST")
  private LocalDateTime CustAcptTsUTc;
  
  @Column( name="cstdet_uuid")
  private String CustUuid;
  
  @Column( name="cstdet_acpt_ts_utc_of")
  private LocalDateTime TsUtc;
  
  
  public CustomerDetail() {
	  
  }


public int getId() {
	return Id;
}


public void setId(int id) {
	Id = id;
}


public String getCustType() {
	return CustType;
}


public void setCustType(String custType) {
	CustType = custType;
}


public LocalDateTime getCustDOB() {
	return CustDOB;
}


public void setCustDOB(LocalDateTime custDOB) {
	CustDOB = custDOB;
}


public String getCustStatus() {
	return CustStatus;
}


public void setCustStatus(String custStatus) {
	CustStatus = custStatus;
}


public String getCustContact() {
	return custContact;
}


public void setCustContact(String custContact) {
	this.custContact = custContact;
}


public String getCustMobile() {
	return custMobile;
}


public void setCustMobile(String custMobile) {
	this.custMobile = custMobile;
}


public String getCustEmail() {
	return CustEmail;
}


public void setCustEmail(String custEmail) {
	CustEmail = custEmail;
}


public LocalDateTime getCustDate() {
	return custDate;
}


public void setCustDate(LocalDateTime custDate) {
	this.custDate = custDate;
}


public String getCustCrudValue() {
	return CustCrudValue;
}


public void setCustCrudValue(String custCrudValue) {
	CustCrudValue = custCrudValue;
}


public String getCustUserId() {
	return CustUserId;
}


public void setCustUserId(String custUserId) {
	CustUserId = custUserId;
}


public String getCustWsId() {
	return CustWsId;
}


public void setCustWsId(String custWsId) {
	CustWsId = custWsId;
}


public String getCustPrgmId() {
	return CustPrgmId;
}


public void setCustPrgmId(String custPrgmId) {
	CustPrgmId = custPrgmId;
}


public LocalDateTime getCustHostTs() {
	return CustHostTs;
}


public void setCustHostTs(LocalDateTime custHostTs) {
	CustHostTs = custHostTs;
}


public LocalDateTime getCustLocalTs() {
	return CustLocalTs;
}


public void setCustLocalTs(LocalDateTime custLocalTs) {
	CustLocalTs = custLocalTs;
}


public LocalDateTime getCustAcptTs() {
	return CustAcptTs;
}


public void setCustAcptTs(LocalDateTime custAcptTs) {
	CustAcptTs = custAcptTs;
}


public LocalDateTime getCustAcptTsUTc() {
	return CustAcptTsUTc;
}


public void setCustAcptTsUTc(LocalDateTime custAcptTsUTc) {
	CustAcptTsUTc = custAcptTsUTc;
}


public String getCustUuid() {
	return CustUuid;
}


public void setCustUuid(String custUuid) {
	CustUuid = custUuid;
}


public LocalDateTime getTsUtc() {
	return TsUtc;
}


public void setTsUtc(LocalDateTime tsUtc) {
	TsUtc = tsUtc;
}
  
  
  
  
  
}
  
  
  
  
  
  
  
