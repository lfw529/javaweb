package com.lfw.myssm.filters;

import com.lfw.myssm.util.StringUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = {"*.do"}, initParams = {@WebInitParam(name = "encoding", value = "UTF-8")})  //配置值
public class CharacterEncodingFilter implements Filter {
    private String encoding = "UTF-8";  //默认值，没有配置时，就采用该值

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String encodingStr = filterConfig.getInitParameter("encoding");
        if (StringUtil.isNotEmpty(encodingStr)) {
            encoding = encodingStr;
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ((HttpServletRequest) servletRequest).setCharacterEncoding(encoding);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
