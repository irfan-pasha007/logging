package com.ito.loggerExample.logg;





import org.apache.log4j.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController
{
	Logger logger = Logger.getLogger(LogController.class);
@RequestMapping(value ="/")
public void getstring()
{
	logger.debug("its debugging  -----------------");
	logger.info("Info level log message");
	logger.debug("Debug level log message");
	logger.error("Error level log message");
}
}
