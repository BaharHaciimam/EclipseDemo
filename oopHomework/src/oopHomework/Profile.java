package oopHomework;

public class Profile {
	
	public Profile() {
		
	}
	
	public Profile(int id,String name, String mail, String password, String courses) {
		this.id= id;
		this.name=name;
		this.mail=mail;
		this.password=password;
		this.courses=courses;		
	}

	
	int id;
	String name;
	String mail;
	String password;
	String courses;

}
