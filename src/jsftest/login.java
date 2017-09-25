package jsftest;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="login")
@RequestScoped
public class login {
	
	private String username;
	private String password;
	private String message;
		public String getusername() {
			return username;
		}
		public void setusername(String username) {
			this.username = username;
		}
		public String getpassword() {
			return password;
		}
		public void setpassword(String password) {
			this.password = password;
		}
		public String getmessage() {
			return message;
		}
		public void setmessage(String message) {
			this.message = message;
		}
		public String login() {
			if(username.equals("Admin") && password.equals("Admin")) {
				message="Successfully logged-in";
				return "Successful_login";
			}
			else
			{
				message= "Username/Password is wrong";
				return "response";
			}
		}
}

	

