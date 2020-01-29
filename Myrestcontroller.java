package com.cts;
import java.util.*;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myrestcontroller { 
	HashMap<Integer,Product> m = new HashMap<Integer, Product>();
	@RequestMapping("/home")
	public  HashMap<Integer,Product> Myrestcontroller()
	{
		
		m.put(101,new Product(1001,"TV",50000,2) );
		m.put(102,new Product(1002,"Mobile",30000,5) );
		m.put(103,new Product(1003,"Laptop",60000,1) );
		return m;
	}

	@RequestMapping("/data")
	public String display1()
	{
		return "hello";
	}
	@RequestMapping("/jsondata")
	public String display2()
	{
		return "welcome";
	}
	@RequestMapping(value="/getbyid/{pd}",method=RequestMethod.GET)
	public Product getById(@PathVariable("pd") int id)
	{
		return m.get(id);
		
	}
}
