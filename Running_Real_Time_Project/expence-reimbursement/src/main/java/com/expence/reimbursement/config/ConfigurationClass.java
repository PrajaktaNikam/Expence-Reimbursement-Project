package com.expence.reimbursement.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationClass 
{
	@Bean
	public ModelMapper modelMapper() 
	{
		return new ModelMapper();
	}

}
