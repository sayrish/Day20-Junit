package com.junit.java;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

import org.junit.Test;

public class userRegistration {

	public boolean firstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public boolean lastName(String lastname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastname);
		return matcher.matches();
	}

	public boolean email(String email) {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean mobileNumber(String number) {
		String regex = "^(91)()[6-9]{1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(number);
		return matcher.matches();
	}

	public boolean password(String password) {
		String regex = "((?=.*[A-Z]).{8,})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

	public boolean password2(String password) {
		String regex = "((?=.*[A-Z])(?=.*[0-9]).{8,})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();

	}
	public boolean password3(String password) {
		String regex = "((?=.[a-z]).{8,9})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
	public boolean password4(String password) {
		String regex = "((?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$-%^&*]).{8,})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
	public boolean emailIdValidator(String emailId) {
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }
}
