package inheritance;

class info {
	int age,rollno;
	String name,course;
	
 public void setage(int age)
 {
	 this.age=age;
 }
 public void setName(String name)
 {
	 this.name=name;
 }
 public void setrollno(int rollno)
 {
	 this.rollno=rollno;
 }
 public void setcourse(String course)
 {
	 this.course=course;
 }
}
public class student
{
	public static void main(String [] args)
	{
		info ob =new info();
		ob.setage(19);
		ob.setcourse("CSE");
		ob.setName("Amit");
		ob.setrollno(10001);
		System.out.println("Done");
	}
}