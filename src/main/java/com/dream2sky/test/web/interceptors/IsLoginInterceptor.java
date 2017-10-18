package com.dream2sky.test.web.interceptors;

import java.util.Map;

import com.dream2sky.test.web.models.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class IsLoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println(invocation.getAction().toString());
		ActionContext context = invocation.getInvocationContext();
		Map<String, Object> session = context.getSession();
		if (session.get("currentUserInfo") != null) {
			System.out.println("session is not null");
			return invocation.invoke();
		} else {
			System.out.println("session is null");
			return "login";
		}
	}

}
