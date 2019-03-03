package com.sample.SpringBootSample.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.SpringBootSample.entity.IndexEntity;

@RestController
public class IndexController {

	@RequestMapping(method=RequestMethod.GET, value="/index" )
	public ResponseEntity<IndexEntity> firstCall() {
		System.out.println("Call made");
		String message = "Thank you for calling Spring boot API Service";
		/*Map messageMap = new HashMap<>();
		JSONObject responseJson = new JSONObject(message); 
		messageMap.put("firstMessage",responseJson);
		*/
		IndexEntity indexEntity= new IndexEntity();
		indexEntity.setMessage(message);
//		indexEntity.testAspect();
		return new ResponseEntity<IndexEntity>(indexEntity,HttpStatus.OK);
		 
	}
}
