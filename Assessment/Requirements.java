package com.bhavna.assessment;
import java.util.Scanner;
public class Requirements {
	    public String fullName;
	    public String Name;
	   
	    public String password;
	    public String emailId;
	    public long phoneNo;
	    
	    public String getFullName() {
	        return fullName;
	    }
	    public void setFullName(String fullName) {
	        this.fullName = fullName;
	    }
	   
	   
	    public String getUserName() {
	        return Name;
	    }
	    public void setUserName(String Name) {
	        this.Name = Name;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public String getEmailId() {
	        return emailId;
	    }
	    public void setEmailId(String emailId) {
	        this.emailId = emailId;
	    }
	   
	    public long getPhoneNo() {
            return phoneNo;
        }
        public void setPhoneNo(long phoneNo) {
            this.phoneNo = phoneNo;
        }
        @Override
        public String toString() {
            return " [fullName=" + fullName + ",   userName=" + Name + ", password=" +
                password + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
        }
	    
public void login()
{
	Scanner scanner = new Scanner(System.in) ;
        System.out.print(" Enter user name => ");
        String userName = scanner.nextLine();

        System.out.print(" Enter password => ");
        String password = scanner.nextLine();

        if ("sarthak".equals(userName) && "987654321".equals(password)) {
            System.out.println(" User successfully logged-in.. ");
        } else {
            System.out.println(" In valid userName or password ");
        }
    
}
public void register()
{
	 Scanner scanner = new Scanner(System.in);
         
         
       
		 Requirements ob=new Requirements();
         System.out.print(" Enter FullName => ");
         String fullName = scanner.nextLine();
         ob.setFullName(fullName);

         System.out.print(" Enter userName => ");
         String userName = scanner.nextLine();
         ob.setUserName(userName);

         System.out.print(" Enter password => ");
         String password = scanner.nextLine();
         ob.setPassword(password);

         System.out.print(" Enter emailId => ");
         String emailId = scanner.nextLine();
         ob.setEmailId(emailId);

         System.out.print(" Enter phoneNo => ");
         long phoneNo = scanner.nextLong();
         
         System.out.println(ob.toString());
        

         
     }
}


