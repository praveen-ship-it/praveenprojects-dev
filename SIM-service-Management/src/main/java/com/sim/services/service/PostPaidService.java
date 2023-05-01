package com.sim.services.service;

import org.springframework.stereotype.Service;

import com.sim.services.model.PostPaid;
@Service
public class PostPaidService {
public PostPaid postPaid(){
	PostPaid postpaid=new PostPaid();
	postpaid.setId(1);
	postpaid.setName("Unlimited");
	postpaid.setPlan("Rs-599+GST-75gb monthly data/unlimited calls");
	return postpaid;
}
}
