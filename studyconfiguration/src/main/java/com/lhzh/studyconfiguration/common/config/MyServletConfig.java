package com.lhzh.studyconfiguration.common.config;

import com.lhzh.studyconfiguration.common.config.listener.MyContextListener;
import com.lhzh.studyconfiguration.common.config.listener.MyRequestListener;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.EventListener;

/**
 * @author 卢宏政
 * @date 2022/5/15 18:15
 */
@Configuration
public class MyServletConfig {

    @Bean
    public ServletRegistrationBean myServlet(){
        return new ServletRegistrationBean(new MyServlet(),"/myServlet");
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/hello","/myServlet");
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myContextListener(){
        ServletListenerRegistrationBean<EventListener> eventListenerServletListenerRegistrationBean = new ServletListenerRegistrationBean<>();
        eventListenerServletListenerRegistrationBean.setListener(new MyContextListener());
        return eventListenerServletListenerRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myRequestListener(){
        ServletListenerRegistrationBean<EventListener> eventListenerServletListenerRegistrationBean = new ServletListenerRegistrationBean<>();
        eventListenerServletListenerRegistrationBean.setListener(new MyRequestListener());
        return eventListenerServletListenerRegistrationBean;
    }

}
