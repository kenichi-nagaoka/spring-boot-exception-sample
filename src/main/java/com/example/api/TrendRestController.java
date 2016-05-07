package com.example.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/trends")
public class TrendRestController {

	@RequestMapping(method = RequestMethod.GET)
	String getCustomers() {
		return "Something Trends";
	}
}