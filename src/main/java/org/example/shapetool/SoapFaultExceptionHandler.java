package org.example.shapetool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.soap.server.endpoint.SoapFaultDefinition;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class SoapFaultExceptionHandler {

    @Bean
    public SoapFaultMappingExceptionResolver exceptionResolver() {

        SoapFaultMappingExceptionResolver resolver = new SoapFaultMappingExceptionResolver();

        Properties mappings = new Properties();

        mappings.setProperty(
                ShapeValidationException.class.getName(),
                SoapFaultDefinition.CLIENT.toString()
        );

        resolver.setExceptionMappings(mappings);

        SoapFaultDefinition defaultFault = new SoapFaultDefinition();
        defaultFault.setFaultCode(SoapFaultDefinition.SERVER);

        resolver.setDefaultFault(defaultFault);

        return resolver;
    }
}