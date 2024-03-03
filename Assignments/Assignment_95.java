package Assignments;

//WAP to update the value of private variable username = "abc@grotechmind.com" to something else using getter and setter
class Sensitive   
{
	private String Username="rashmi@gmail.com";  
	public String getUsername()      
	{
		return Username;   
	}
	public void setUsername(String Username)     
	{
		this.Username=Username;
	}
}
public class Assignment_95 {

	public static void main(String[] args) 
	{
				Sensitive a1=new Sensitive();
				a1.setUsername("ramya@gmail.com");
				System.out.println(a1.getUsername());   
			}

	}


