package com.dream2sky.test.web.actions;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;

import com.dream2sky.test.web.models.USERROLES;
import com.dream2sky.test.web.models.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AccountAction extends ActionSupport implements ModelDriven<User>, ApplicationAware {

	private User user = new User();
	private Map<String, Object> session;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String Login() {
		if ((user.getRole() == USERROLES.ADMIN.getIndex() && user.getUsername().equals("admin")
				&& user.getPassword().equals("hehe"))
				|| user.getRole() == USERROLES.STAFF.getIndex() && user.getUsername().equals("user")
						&& user.getPassword().equals("hehe")) {
			session.put("currentUserInfo", user);
			return user.getRole() == USERROLES.ADMIN.getIndex() ? "adminLogin" : "staffLogin";
		} else
			return ERROR;

	}

	public String Logout() {
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
