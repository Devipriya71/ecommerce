package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.ProductModel;
@Service
public class ProductService {
	@Autowired
	ProductDao prodao;
	public int addproduct(ProductModel product) {
		return prodao.addproduct(product);
	}
}
