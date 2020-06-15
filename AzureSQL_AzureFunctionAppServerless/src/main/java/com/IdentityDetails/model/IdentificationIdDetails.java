package com.IdentityDetails.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IdentificationIdDetails")
public class IdentificationIdDetails {
	@Id
	@Column(name = "CardId")
	private String cardId;

	@Column(name = "CardName")
	private String CardName;

	public IdentificationIdDetails() {
	}

	public IdentificationIdDetails(String cardId, String cardName) {
		super();
		this.cardId = cardId;
		CardName = cardName;
	}

	public IdentificationIdDetails(String cardId) {
		super();
		this.cardId = cardId;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return CardName;
	}

	public void setCardName(String cardName) {
		CardName = cardName;
	}

}
