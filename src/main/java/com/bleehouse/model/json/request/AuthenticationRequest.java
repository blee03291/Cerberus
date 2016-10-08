package com.bleehouse.model.json.request;

import lombok.Data;

@Data
public class AuthenticationRequest {

	private static final long serialVersionUID = 6624726180748515507L;
	private String username;
	private String password;

	public AuthenticationRequest() {
		super();
	}

	public AuthenticationRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}
}
