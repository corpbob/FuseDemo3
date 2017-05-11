package com.pk.testAtrifact.incident;

import org.apache.camel.Processor;
import org.apache.camel.Exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IsmaServiceProcessor implements Processor{
	
	public static final Logger log = LoggerFactory.getLogger(IsmaServiceProcessor.class);
	@Override
    public void process(Exchange exchange) throws Exception {
        // set reply
		log.info("I'm here!");
		  String name = exchange.getIn().getBody(InputSetName.class).getNameInput();
		OutputSetName output = new OutputSetName();
        output.setOutputName("The name you try to set is : "+name);
        exchange.getOut().setBody(output);
    }
}
