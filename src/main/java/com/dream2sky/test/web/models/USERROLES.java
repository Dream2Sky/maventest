package com.dream2sky.test.web.models;

public enum USERROLES {

	ADMIN("admin", 0), STAFF("staff", 1);

	private String name;
	private int index;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	private USERROLES(String name, int index) {
		this.name = name;
		this.index = index;
	}

}
