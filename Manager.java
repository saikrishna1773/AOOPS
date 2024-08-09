package com.bank;

public class Manager {
	private static Manager instance;
	private boolean loggedin;
	private String username;
	
	private Manager() {
		this.loggedin=false;
		this.username=null;
	}
	public static synchronized Manager getInstance() {
		if(instance==null) {
			instance= new Manager();
		}
		return instance;
	}
	public void login(String username) {
        this.loggedin = true;
        this.username = username;
        System.out.println(username + "has logged in.");
    }
	public void logout() {
		 System.out.println(username + " has logged out.");
	        this.loggedin = false;
	        this.username = null;
	    
	}
	public boolean isLoggedin() {
        return loggedin;
    }
}
