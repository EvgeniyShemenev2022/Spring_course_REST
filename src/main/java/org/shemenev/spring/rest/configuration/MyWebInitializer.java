package org.shemenev.spring.rest.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


// класс для реализации Dispatcher Servlet
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;   // т.к. в этом приложении нет root config файлов
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MyConfig.class};  // ссылка на конфигурационный файл
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
