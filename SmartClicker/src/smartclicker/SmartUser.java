package smartclicker;

import java.util.ArrayList;

public class SmartUser {

	String userId;
	
	ArrayList<String> createdQuizIds; 
	ArrayList<String> courseIds;
	
	SmartUser(String userId){
		this.userId=userId;
		
	}
	
	public String getGoogleId() {
		return userId;
	}
	




}
