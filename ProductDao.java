package com.cts.product.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.cts.product.model.ProductModel;
@Repository
public class ProductDao {
	HashMap<Integer, ProductModel>prodData = new HashMap<Integer, ProductModel>();
	
	public int addproduct(ProductModel product) {
		prodData.put(product.getpId(), product);
		return(product.getpId());
	}
}
