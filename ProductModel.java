package com.cts.product.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Repository;
@Repository
public class ProductModel {
	@NotNull
	private Integer pId;
	@NotBlank
	@Size(max = 10,min = 3)
	private String pName;
	@NotNull
	private Integer pQuantity;
	@NotNull
	private Float pPrice;
	@NotNull
	private Integer pTax;
	
	public ProductModel() {
		
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Integer getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(Integer pQuantity) {
		this.pQuantity = pQuantity;
	}

	public Float getpPrice() {
		return pPrice;
	}

	public void setpPrice(Float pPrice) {
		this.pPrice = pPrice;
	}

	public Integer getpTax() {
		return pTax;
	}

	public void setpTax(Integer pTax) {
		this.pTax = pTax;
	}
}
