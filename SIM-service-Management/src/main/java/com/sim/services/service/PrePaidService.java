package com.sim.services.service;

import org.springframework.stereotype.Service;

import com.sim.services.model.PrePaid;
@Service
public class PrePaidService {
public PrePaid prePaid(){
	PrePaid prepaid=new PrePaid();
	prepaid.setId(1);
	prepaid.setName("56 days");
	prepaid.setPlan("Rs-499+GST-1.5gb monthly data/unlimited calls/daaily 100 msgs");
	return prepaid;
}
}
