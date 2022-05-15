package com.lhzh.studyconfiguration.common.config.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author 卢宏政
 * @date 2022/5/15 18:41
 */
public class MyRequestListener implements ServletRequestListener {

    /**
     * The request is about to go out of scope of the web application.
     * The default implementation is a NO-OP.
     *
     * @param sre Information about the request
     */
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("requestDestroyed");
    }

    /**
     * The request is about to come into scope of the web application.
     * The default implementation is a NO-OP.
     *
     * @param sre Information about the request
     */
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("requestInitialized");
    }
}
