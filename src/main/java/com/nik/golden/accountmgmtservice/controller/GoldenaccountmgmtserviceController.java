package com.nik.golden.accountmgmtservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nik.golden.accountmgmtservice.model.GoldenaccountmgmtserviceModel;

@RestController
@RequestMapping("goldenaccountmgmt")
public class GoldenaccountmgmtserviceController {

	@Autowired
	EurekaInstanceConfigBean eurekaConfigBean;
	
	@GetMapping("/status/check")
	public ResponseEntity<GoldenaccountmgmtserviceModel> status()
	{
		GoldenaccountmgmtserviceModel model = new GoldenaccountmgmtserviceModel();
		model.setId(1);
		model.setName("Golden Account Management Model Name "+eurekaConfigBean.getInstanceId());
		
		return new ResponseEntity<GoldenaccountmgmtserviceModel>(model, HttpStatus.OK);
	}
}
