package cn.jersey;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注册jersey servlet
 */
@Configuration
public class ConfigBean {

    @Bean
    public ServletRegistrationBean jerseyServlet() {
        //手动注册servlet
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new ServletContainer(), "/rest/*");
        registrationBean.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS,JerseyResourceConfig.class.getName());

        return registrationBean;
    }
}
