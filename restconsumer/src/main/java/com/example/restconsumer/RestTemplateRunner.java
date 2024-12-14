package com.example.restconsumer;

// import java.util.Arrays;
// import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//import com.example.restconsumer.Actor;

@Component
public class RestTemplateRunner implements CommandLineRunner  {
	

	private Logger logger = LoggerFactory.getLogger(RestTemplateRunner.class); 
	
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public void run(String... args) throws Exception {
		getOneActor();
//		getAllInvoices();
//		getOneInvoice();
//		updateInvoice();
//		deleteInvoice();
	}
	
	@SuppressWarnings({ "deprecation" })
	private void getOneActor() {
		String url = "http://localhost:8080/demo-0.0.1-SNAPSHOT/api/actors/{id}";
		System.out.println(url);
	//	ResponseEntity<String> response= restTemplate.getForEntity(url, String.class, 9);
	    ResponseEntity<String> response= restTemplate.exchange(url, HttpMethod.GET, null, String.class,7);
	    logger.info("Response Body : {}", response.getBody());
	    logger.info("Status code value : {}", response.getStatusCodeValue());
	//	logger.info("Status code : {}",response.getStatusCode().name());
	}
}
