package com.dix.actions;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginFormAction
{
	private String login;
	private String password;
	private HttpSession session;
	
	public String getLogin() 
	{
		return login;
	}

	public void setLogin(String login) 
	{
		this.login = login;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String login() throws Exception 
	{
		
	    if (login != null && login.equals("admin")
                && password != null && password.equals("admin")) 
        {    
        	//session.setAttribute("login", login);
             
            return "loginPass";
        }
        return "loginFail";
    }
}
