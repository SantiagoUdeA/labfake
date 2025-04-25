package com.udea.labfaker;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;


@SpringBootTest
class LabfakerApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health(){
		Assertions.assertEquals("Health check ok", dataController.healthCheck());
	}

	@Test
	void versions(){
		Assertions.assertEquals("Version its 1.0.0", dataController.version());
	}

	@Test
	void nationLength(){
		Assertions.assertEquals(10, dataController.getRandomNations().size());
	}

	@Test
	void currenciesLength(){
		Assertions.assertEquals(20, dataController.getRandomCurrencies().size());
	}

	@Test
	void randomCurrenciesFormat(){
		JsonNode response = dataController.getRandomCurrencies();
		response.forEach(currency -> {
			String code = currency.get("code").asText();
			Assertions.assertEquals(String.class, code.getClass());
		});
	}

	@Test
	void testRandomNationsPerformance(){
		long startTime = System.currentTimeMillis();
		dataController.getRandomNations();
		long endTime = System.currentTimeMillis();
		var executionTime = endTime - startTime;
		System.out.println(executionTime);
		Assertions.assertTrue(executionTime < 2000);
	}

	@Test
	void aviationLength(){
		Integer aviationLength = dataController.getRandomAviation().size();
		Assertions.assertEquals(20, aviationLength);
	}

}
