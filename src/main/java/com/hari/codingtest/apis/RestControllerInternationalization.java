package com.hari.codingtest.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;


import java.util.Locale;

//@RestController
public class RestControllerInternationalization {

    // Look for resource bundle files with names : messages.properties in src/main/resources

   /* @Autowired
    MessageSource messageSource;

    @GetMapping("/")
    public String getData(Locale locale) {
        return  messageSource.getMessage("error.notfound", null, locale);
    }*/

}
