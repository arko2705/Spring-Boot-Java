package com.example.Practise.entity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
@Entity
@Table(name="customer_proof_of_identity")
public class CustomerProofOfIdentity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Customer_Identifier; 
	private Integer Customer_Proof_Of_ID_Type;
	private String Customer_Classification_Type_Value;
	private LocalDateTime Start_Date; 
	private LocalDateTime End_Date; 
	private LocalDateTime Effective_Date;
	public CustomerProofOfIdentity(){
		
	}
	public int getCustomer_Identifier() {
		return Customer_Identifier;
	}
	public void setCustomer_Identifier(int customer_Identifier) {
		Customer_Identifier = customer_Identifier;
	}
	public Integer getCustomer_Proof_Of_ID_Type() {
		return Customer_Proof_Of_ID_Type;
	}
	public void setCustomer_Proof_Of_ID_Type(Integer customer_Proof_Of_ID_Type) {
		Customer_Proof_Of_ID_Type = customer_Proof_Of_ID_Type;
	}
	public String getCustomer_Classification_Type_Value() {
		return Customer_Classification_Type_Value;
	}
	public void setCustomer_Classification_Type_Value(String customer_Classification_Type_Value) {
		Customer_Classification_Type_Value = customer_Classification_Type_Value;
	}
	public LocalDateTime getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(LocalDateTime start_Date) {
		Start_Date = start_Date;
	}
	public LocalDateTime getEnd_Date() {
		return End_Date;
	}
	public void setEnd_Date(LocalDateTime end_Date) {
		End_Date = end_Date;
	}
	public LocalDateTime getEffective_Date() {
		return Effective_Date;
	}
	public void setEffective_Date(LocalDateTime effective_Date) {
		Effective_Date = effective_Date;
	}
	
}