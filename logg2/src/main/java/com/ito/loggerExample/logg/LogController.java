package com.ito.loggerExample.logg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController
{
	private static final Logger logger=LogManager.getLogger(LogController.class);
	
@RequestMapping(value = "/hi")
public String getstring() {
	logger.debug("its debugging  -----------------");
	return "hii people";
}
}
