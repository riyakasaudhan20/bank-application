package in.bank.cards.model;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Cards {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="card_id")
	private int cardId;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="card_number")
	private int cardNumber;
	
	
	@Column(name="card_type")
	private String cardType;
	
	@Column(name="expir_date")
	private LocalDate ExpirDate;

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public LocalDate getExpirDate() {
		return ExpirDate;
	}

	public void setExpirDate(LocalDate expirDate) {
		ExpirDate = expirDate;
	}

	@Override
	public String toString() {
		return "Cards [cardId=" + cardId + ", customerId=" + customerId + ", cardNumber=" + cardNumber + ", cardType="
				+ cardType + ", ExpirDate=" + ExpirDate + "]";
	}

			
	
	
	
	
}
