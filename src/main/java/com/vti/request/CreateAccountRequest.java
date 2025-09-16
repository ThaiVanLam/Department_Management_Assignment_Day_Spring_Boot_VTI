package com.vti.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateAccountRequest {
	private String email;

	private String username;

	private String fullname;

	private int departmentId;

	private int positionId;
}
