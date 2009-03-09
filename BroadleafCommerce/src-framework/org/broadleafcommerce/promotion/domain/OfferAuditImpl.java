package org.broadleafcommerce.promotion.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OFFER_AUDIT")
public class OfferAuditImpl implements Serializable,OfferAudit {
	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "OFFER_AUDIT_ID")
	private Long id;
	
	@ManyToOne(targetEntity = OfferImpl.class)
	@JoinColumn(name = "OFFER_ID")
	private Offer offer;
	
	@Column(name = "OFFER_CODE_ID")
	private Long offerCodeId;
	
	@Column(name = "CUSTOMER_ID")
	private Long customerId;
	
	@Column(name = "ORDER_ID", nullable = true)
	private Long orderId;
	
	@Column(name = "FULLFILLMENT_GROUP_ID", nullable = true)
	private Long fullfillmentGroupId;

	@Column(name = "RELATED_RETAIL_PRICE")
	private BigDecimal relatedRetailPrice;
	
	@Column(name = "RELATED_SALE_PRICE")
	private BigDecimal relatedSalePrice;
	
	@Column(name = "RELATED_PRICE")
	private BigDecimal relatedPrice;
		
	@Column(name = "REDEEMED_DATE")
	private Date redeemedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public Long getOfferCodeId() {
		return offerCodeId;
	}

	public void setOfferCodeId(Long offerCodeId) {
		this.offerCodeId = offerCodeId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getFullfillmentGroupId() {
		return fullfillmentGroupId;
	}

	public void setFullfillmentGroupId(Long fullfillmentGroupId) {
		this.fullfillmentGroupId = fullfillmentGroupId;
	}

	public BigDecimal getRelatedRetailPrice() {
		return relatedRetailPrice;
	}

	public void setRelatedRetailPrice(BigDecimal relatedRetailPrice) {
		this.relatedRetailPrice = relatedRetailPrice;
	}

	public BigDecimal getRelatedSalePrice() {
		return relatedSalePrice;
	}

	public void setRelatedSalePrice(BigDecimal relatedSalePrice) {
		this.relatedSalePrice = relatedSalePrice;
	}

	public BigDecimal getRelatedPrice() {
		return relatedPrice;
	}

	public void setRelatedPrice(BigDecimal relatedPrice) {
		this.relatedPrice = relatedPrice;
	}

	public Date getRedeemedDate() {
		return redeemedDate;
	}

	public void setRedeemedDate(Date redeemedDate) {
		this.redeemedDate = redeemedDate;
	}

	
	
}
