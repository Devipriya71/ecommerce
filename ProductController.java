package com.cts.product.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.model.ProductModel;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductModel product;
	@Autowired
	ProductService prodService;
	@RequestMapping("/")
	public String gotohome(Model m) {
		m.addAttribute("product",product);
		return("home");
	}
	
	@RequestMapping(value="process.do",method=RequestMethod.POST)
	public ModelAndView processproduct(@Valid @ModelAttribute("product") ProductModel product,BindingResult br) {
		String path=null;
		ModelAndView modelAndView = new ModelAndView();
		if(br.hasErrors()) {
			path="home";
		}
		else {
			path="success";
			int pid = prodService.addproduct(product);
			modelAndView.addObject("msg","Stored successfully with "+pid+" !!!");
		}
		modelAndView.setViewName(path);
		return modelAndView;
	}
}
