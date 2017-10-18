package com.dream2sky.test.web.actions;

import java.util.Map;

import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.ApplicationAware;

import com.dream2sky.test.web.models.USERROLES;
import com.dream2sky.test.web.models.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@ParentPackage("struts-default")
@Namespace("/account")
public class AccountAction extends ActionSupport implements ModelDriven<User>, ApplicationAware {

	private User user = new User();
	private Map<String, Object> session;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Action(value = "login", results = { @Result(name = "adminLogin", location = "/WEB-INF/admin/index.jsp"),
			@Result(name = "staffLogin", location = "/WEB-INF/staff/index.jsp"),
			@Result(name = "error", location = "/WEB-INF/error.jsp") })
	public String Login() {
		System.out.println("roles:" + user.getRole());
		System.out.println("username:" + user.getUsername());
		System.out.println("password:" + user.getPassword());
		if ((user.getRole() == USERROLES.ADMIN.getIndex() && user.getUsername().equals("admin")
				&& user.getPassword().equals("hehe"))
				|| user.getRole() == USERROLES.STAFF.getIndex() && user.getUsername().equals("user")
						&& user.getPassword().equals("hehe")) {
			session.put("currentUserInfo", user);
			System.out.println(session.hashCode());
			return user.getRole() == USERROLES.ADMIN.getIndex() ? "adminLogin" : "staffLogin";
		} else
			return ERROR;
	}

	@Action(value = "logout", results = { @Result(name = "success", location = "/WEB-INF/account/login.jsp") })
	public String Logout() {

		System.out.println("logout");

		if (this.session.containsKey("currentUserInfo")) {
			this.session.remove("currentUserInfo");
			return SUCCESS;
		}
		return ERROR;
	}

	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public void setApplication(Map<String, Object> session) {
		this.session = session;
	}

}
