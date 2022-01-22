package com.productsapp.jwt;

import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public final class JwtPayload {
	@NotNull
	private String username;
	@NotNull
	private String password;
}
