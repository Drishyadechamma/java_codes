package com.training.day1;

public class MyOwnException_I extends Exception {
	String mess;

	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public MyOwnException_I(String mess) {
		super();
		this.mess = mess;
	}
	public MyOwnException_I() {
		super();
	}
}
