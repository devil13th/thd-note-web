package com.thd.note.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.core.annotation.Order;
@Order(1)
//重点
@WebFilter(filterName = "noteFilter", urlPatterns = "/*")
public class NoteFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("destroy " + this.getClass().getName() + " ... ");

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		 System.out.println("NoteFilter doFilter() ...");
		 arg2.doFilter(arg0,arg1);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("load " + this.getClass().getName() + " ... ");

	}

}
