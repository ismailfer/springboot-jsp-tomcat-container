package com.ismail.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Runs JSP page as a container
 * 
 * @author ismail
 *
 */
@SpringBootApplication(scanBasePackages = "com.ismail.jsp")
public class JspApplication extends SpringBootServletInitializer 
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) 
    {
        return builder.sources(JspApplication.class);
    }

    
    public static void main(String[] args)
    {
        SpringApplication.run(JspApplication.class, args);
    }

}
