package com.bleehouse.model.json.response;
import lombok.Data;

@Data
public class AuthenticationResponse {

	private String token;

	public AuthenticationResponse() {
		super();
	}

	public AuthenticationResponse(String token) {
		this.setToken(token);
	}
}
