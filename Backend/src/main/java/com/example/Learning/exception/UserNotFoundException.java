package com.example.Learning.exception;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(Long id) {
		super("could not found the user id "+id);
	}

}
