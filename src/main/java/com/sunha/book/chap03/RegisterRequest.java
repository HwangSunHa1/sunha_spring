package com.sunha.book.chap03;

public class RegisterRequest {
	String email; // ÀÌ¸ÞÀÏ
	String password; // ºñ¹Ð¹øÈ£
	String name; // ÀÌ¸§

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "RegisterRequest [email=" + email + ", name=" + name + "]";
	}
}