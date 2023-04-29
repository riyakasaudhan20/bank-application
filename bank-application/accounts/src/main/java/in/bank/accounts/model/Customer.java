package in.bank.accounts.model;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//we are going to create a structure or model of data
/*
 * CREATE TABLE `customer` (
`customer_id` int AUTO_INCREMENT PRIMARY KEY,
`name` varchar(100) NOT NULL,
`mobile_number` varchar(13) NOT NULL,
`email_id` varchar(100) NOT NULL,
`created_date` date DEFAULT NULL
);
 */
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name = "customer_id")
    private int customerId;
	@Column(name = "name")
	private String name;
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "created_date")
	private String createdDate;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", mobileNumber=" + mobileNumber + ", emailId="
				+ emailId + ", createdDate=" + createdDate + "]";
	}


	}
	
