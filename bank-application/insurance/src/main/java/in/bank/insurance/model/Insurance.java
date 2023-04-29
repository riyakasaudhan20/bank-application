package in.bank.insurance.model;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance")
public class Insurance {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "insured_amount")
	private int insuredAmount;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "insurance_type")
	private String insuranceType;

	@Column(name = "insurance_end_date")
	private LocalDate endDate;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(int insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Insurance [customerId=" + customerId + ", insuredAmount=" + insuredAmount + ", insuranceType="
				+ insuranceType + ", endDate=" + endDate + "]";
	}
	
	
	
}
