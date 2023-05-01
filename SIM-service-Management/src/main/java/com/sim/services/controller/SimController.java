package com.sim.services.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sim.services.model.PostPaid;
import com.sim.services.model.PrePaid;
import com.sim.services.service.PostPaidService;
import com.sim.services.service.PrePaidService;

@RestController
@RequestMapping("api/v1/sim/service")
public class SimController {
@Autowired
	private PostPaidService postpaidservice;

@Autowired
private PrePaidService prepaidservice;

private static final Logger logger=Logger.getLogger("SimController.class");

@RequestMapping("/postpaid")
public PostPaid getPostpaidService(PostPaid popaid) throws IOException {
	logger.info("\n Entering to Postpaid service");
	popaid=postpaidservice.postPaid();
	String sfile=popaid.toString();
	File file=new File(sfile);
//	//file.createNewFile();
//	try (FileOutputStream fos = new FileOutputStream(file)) {
//		fos.write(0);
//		//fos.write(file.canWrite());
	//}
	//	popaid.setId(popaid.getId());
//	popaid.setName(popaid.getName());
//	popaid.setPlan(popaid.getPlan());
	return popaid;
}
@RequestMapping("/prepaid")
public PrePaid  getPrepaidService(PrePaid prepaid) {
	logger.info("\n Entering to prepaid paid service");
	return prepaid=prepaidservice.prePaid();
	
}
}
