package com.ikubinfo.ioc.bmiconverter.domain.calculate;
import com.ikubinfo.ioc.bmiconverter.domain.bmi.request.BmiRequest;

import org.springframework.stereotype.Service;


import com.ikubinfo.ioc.bmiconverter.domain.bmi.response.BmiRespnse;


@Service
public class CalculateBmi{

public BmiRespnse calculate(BmiRequest request)  {
	
	BmiRespnse response = new BmiRespnse();
	double heightInMeter = request.getHeight() / 100;
	response.setBmi(request.getWeight() / (heightInMeter * heightInMeter));
	return response;

}



}
