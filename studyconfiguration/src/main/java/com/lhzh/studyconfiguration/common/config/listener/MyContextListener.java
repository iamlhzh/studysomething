package com.lhzh.studyconfiguration.common.config.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author 卢宏政
 * @date 2022/5/15 18:35
 */
public class MyContextListener implements ServletContextListener {

    /**
     * * Notification that the web application initialization process is starting.
     * All ServletContextListeners are notified of context initialization before
     * any filter or servlet in the web application is initialized.
     * The default implementation is a NO-OP.
     *
     * @param sce Information about the ServletContext that was initialized
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("容器启动了");
    }

    /**
     * * Notification that the servlet context is about to be shut down. All
     * servlets and filters have been destroyed before any
     * ServletContextListeners are notified of context destruction.
     * The default implementation is a NO-OP.
     *
     * @param sce Information about the ServletContext that was destroyed
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("容器销毁了");
    }
}
