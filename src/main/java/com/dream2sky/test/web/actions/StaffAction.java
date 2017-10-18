package com.dream2sky.test.web.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("basePackage")
@Namespace("/staff")
public class StaffAction extends ActionSupport {

	@Action(value = "index", results = { @Result(name = "success", location = "/WEB-INF/staff/index.jsp"),
			@Result(name = "login", location = "/WEB-INF/account/login.jsp") }, interceptorRefs = {
					@InterceptorRef("baseInterceptor") })
	public String index() {
		return SUCCESS;
	}

}
