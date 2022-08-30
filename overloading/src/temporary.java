package overloading;

 class shape {
void draw()
{
	System.out.println("Drawing");
}
}
class rectangle extends shape
{
	void draw()
	{
		System.out.println("drawung rectangle");
	}
}
class circle extends shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}
class Triangle extends shape
{
	void draw()
	{
		System.out.println("drawing triangle");
		
	}
}
public class temporary
{
	public static void main(String [] args)
	{
		shape s;
		s=new rectangle();
		s.draw();
		s=new circle();
		s.draw();
	}
}
