package com.microservices.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean currencyConversion(@PathVariable String from,
			@PathVariable String to, @PathVariable BigDecimal quantity) {
		return new CurrencyConversionBean(1L,from, to, BigDecimal.valueOf(65),quantity,BigDecimal.valueOf(65000),8100);
	} 

}
