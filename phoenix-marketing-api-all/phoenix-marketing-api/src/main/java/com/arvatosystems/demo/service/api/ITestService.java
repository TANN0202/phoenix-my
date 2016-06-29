package com.arvatosystems.demo.service.api;

import com.arvatosystems.demo.service.api.idto.ITestBean;
import com.arvatosystems.demo.service.api.idto.ITestResult;


/**
 * @author chao.liuc
 *
 */
public interface ITestService {

	ITestResult get(String token, String parm, Long timestamp);
	
	ITestResult post(ITestBean testBean);
 
}
