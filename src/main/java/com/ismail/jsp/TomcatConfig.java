package com.ismail.jsp;

import java.util.HashMap;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.Jsp;
import org.springframework.stereotype.Component;

/**
 * https://tomcat.apache.org/tomcat-8.5-doc/jasper-howto.html
 * 
 * This will make JSP recompile each time there is a change in the JSP page
 * 
 * @author ismail
 * @since 20220603
 */
@Component
public class TomcatConfig implements WebServerFactoryCustomizer<TomcatServletWebServerFactory>
{

    @Override
    public void customize(TomcatServletWebServerFactory factory)
    {
        // customize the factory here

        HashMap<String, String> initParams = new HashMap<>();
        initParams.put("development", "true");
        initParams.put("checkInterval", "0");
        //initParams.put("keepgenerated", "false");

        Jsp jsp = factory.getJsp();
        jsp.setInitParameters(initParams);

        //factory.setInitParameters(initParams);

    }
}