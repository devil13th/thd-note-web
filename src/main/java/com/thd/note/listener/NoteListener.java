package com.thd.note.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
//@WebListener
public class NoteListener implements ServletContextListener,HttpSessionListener, HttpSessionAttributeListener,  
ServletContextAttributeListener, ServletRequestListener,  
ServletRequestAttributeListener {


    
    //=============================   ServletContext 相关===================================  
      
    public void contextInitialized(ServletContextEvent sce) {  
        //ServletContext(Application)初始化的时候触发(启动服务器的时候)  
        System.out.println("========================contextInitialized() 创建ServletContext========================");  
        //可以获取ServletContext  
        System.out.println(sce.getServletContext());  
    }  
    
    public void contextDestroyed(ServletContextEvent sce) {  
        //ServletContext(Application)销毁的时候触发(关闭服务器的时候 或服务停止的时候)  
        System.out.println("========================contextDestroyed() 销毁ServletContext========================");  
        //可以获取ServletContext  
        System.out.println(sce.getServletContext());  
    }  
  
    public void attributeAdded(ServletContextAttributeEvent arg0) {  
        // 当ServletContext创建属性的时候触发 (调用ServletContext.setAttribute()方法时触发)  
        System.out.println("========================attributeAdded() ServletContext创建属性========================");  
        //创建的属性名  
        System.out.println("属性名：" + arg0.getName());  
        //创建属性的值  
        System.out.println("属性值：" + arg0.getValue());  
          
  
    }  
  
    public void attributeReplaced(ServletContextAttributeEvent arg0) {  
        // 当ServletContext替换某属性的值时候触发 (调用ServletContext.setAttribute()方法时触发 (此处是替换某个值))  
        System.out.println("========================attributeReplaced() ServletContext替换属性========================");  
        //被替换属性值的属性名  
        System.out.println("属性名：" + arg0.getName());  
        //替换属性的值  
        System.out.println("属性值：" + arg0.getValue());  
    }  
      
    public void attributeRemoved(ServletContextAttributeEvent arg0) {  
        // 当ServletContext移除某属性的时候触发 (调用ServletContext.removeAttribute()方法时触发)  
        System.out.println("========================attributeRemoved() ServletContext移除属性========================");  
        //移除的属性名  
        System.out.println("属性名：" + arg0.getName());  
        //移除属性的值  
        System.out.println("属性值：" + arg0.getValue());  
    }  
  
      
  
      
      
    //=============================   Session 相关     ===================================  
  
    public void sessionCreated(HttpSessionEvent arg0) {  
        //HttpSession初始化的时候触发(某个客户端第一次请求的时候)  
        System.out.println("========================sessionCreated() 创建 HttpSession========================");  
        //可以获取HttpSession  
        System.out.println(arg0.getSession());  
  
    }  
  
    public void sessionDestroyed(HttpSessionEvent arg0) {  
        //HttpSession销毁的时候触发(某个客户端关闭连接，或长时间没有响应的时候触发)  
        System.out.println("========================sessionDestroyed() 销毁 HttpSession========================");  
        //可以获取HttpSession  
        System.out.println(arg0.getSession());  
  
    }  
  
    public void attributeAdded(HttpSessionBindingEvent arg0) {  
        // 当HttpSession创建属性的时候触发 (调用HttpSession.setAttribute()方法时触发)  
        System.out.println("========================attributeAdded()HttpSession创建属性========================");  
        //创建的属性名  
        System.out.println("属性名：" + arg0.getName());  
        //创建属性的值  
        System.out.println("属性值：" + arg0.getValue());  
  
    }  
      
    public void attributeReplaced(HttpSessionBindingEvent arg0) {  
        // 当HttpSession替换某属性的值时候触发 (调用HttpSession.setAttribute()方法时触发 (此处是替换某个值))  
        System.out.println("========================attributeReplaced() HttpSession替换属性========================");  
        //被替换属性值的属性名  
        System.out.println("属性名：" + arg0.getName());  
        //替换属性的值  
        System.out.println("属性值：" + arg0.getValue());  
  
    }  
      
    public void attributeRemoved(HttpSessionBindingEvent arg0) {  
        // 当HttpSession移除某属性的时候触发 (调用HttpSession.removeAttribute()方法时触发)  
        System.out.println("========================attributeRemoved() HttpSession移除属性========================");  
        //移除的属性名  
        System.out.println("属性名：" + arg0.getName());  
        //移除属性的值  
        System.out.println("属性值：" + arg0.getValue());  
  
    }  
      
    //=============================   Request 相关     ===================================  
      
  
    public void requestInitialized(ServletRequestEvent arg0) {  
        //ServletRequest 初始化的时候触发(客户端向服务器发送请求的时候)  
        System.out.println("========================requestDestroyed() 创建 ServletRequest========================");  
        //可以获取ServletRequest  
        System.out.println(arg0.getServletRequest());  
  
    }  
      
    public void requestDestroyed(ServletRequestEvent arg0) {  
        //ServletRequest 销毁的时候触发  
        System.out.println("========================requestDestroyed() 销毁 ServletRequest========================");  
        //可以获取ServletRequest  
        System.out.println(arg0.getServletRequest());  
  
    }  
      
    public void attributeAdded(ServletRequestAttributeEvent arg0) {  
        // 当(ServletRequest创建属性的时候触发 (调用ServletRequest.setAttribute()方法时触发)  
        System.out.println("========================attributeAdded() ServletRequest创建属性========================");  
        //创建的属性名  
        System.out.println("属性名：" + arg0.getName());
        //创建属性的值  
        System.out.println("属性值：" + arg0.getValue());  
    }  
      
    public void attributeReplaced(ServletRequestAttributeEvent arg0) {  
        // 当ServletRequest替换某属性的值时候触发 (调用ServletRequest.setAttribute()方法时触发 (此处是替换某个值))  
        System.out.println("========================attributeReplaced() ServletRequest替换属性========================");  
        //被替换属性值的属性名  
        System.out.println("属性名：" + arg0.getName());  
        //替换属性的值  
        System.out.println("属性值：" + arg0.getValue());  
    }  
      
    public void attributeRemoved(ServletRequestAttributeEvent arg0) {  
        // 当ServletRequest移除某属性的时候触发 (调用ServletRequest.removeAttribute()方法时触发)  
        System.out.println("========================attributeRemoved() ServletRequest移除属性========================");  
        //移除的属性名  
        System.out.println("属性名：" + arg0.getName());  
        //移除属性的值  
        System.out.println("属性值：" + arg0.getValue());  
  
  
    }  
	
	

}
