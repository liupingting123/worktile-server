package com.worktile.exception;


public class ItemsException extends Exception {

	private String message;

	public ItemsException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
