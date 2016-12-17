package tw.j2ee;

import java.io.Serializable;

/*
  
 */

public class Member implements Serializable {
	private String id;
	private String name;
	
	public Member(){
		System.out.println("Member()");
	}
	
	public void setId(String id){
		this.id = id;
		System.out.println("setId()");
		}
	public void setName(String name){
		this.name = name;
		System.out.println("setName()");
		}
	public String getId(){return id;}
	public String getName(){return name;}
	
}

