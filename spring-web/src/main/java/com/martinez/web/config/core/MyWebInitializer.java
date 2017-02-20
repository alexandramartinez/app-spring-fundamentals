package com.martinez.web.config.core;

import com.martinez.config.ServiceContext;
import com.martinez.web.config.SpringWebContext;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {ServiceContext.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringWebContext.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
