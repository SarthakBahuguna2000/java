package javaassignment;
class solveit
{
	double PA,  rate ;
	   String Type,  gender;
	   int age,time;
	   public solveit(double PA,double rate, int age , String Type , String gender, int time)

{
                this.PA=PA;
                this.rate=rate;
                this.age=age;
                this.Type=Type;
                this.gender=gender;
                this.time=time;
                		
                
}
	   public void calculate()
	   {
		   if (Type=="SI")
		   {
			   if (age>60)
			   {
				   rate=1/100+rate;
			   }
			   if(time>1 && time<=3 )
			   {
				   rate=5/1000+rate;
			   }
			   else if(time>3 && time<=5 )
			   {
				   rate=1/100+rate;
			   }
			   else if(time>5 )
			   {
				   rate=15/100+rate;
			   }
			   if(Type=="Female" );
			   {
				   rate=5/1000+rate;
			   }
			 double amount=(PA* rate*time)/100;
			 System.out.println("total Simple interest=" +amount);
		   }
		   else if (Type=="CI")
		   {
			   if (age>60)
			   {
				   rate=1/100+rate;
			   }
			   if(time>1 && time<=3 )
			   {
				   rate=5/1000+rate;
			   }
			   else if(time>3 && time<=5 )
			   {
				   rate=1/100+rate;
			   }
			   else if(time>5 )
			   {
				   rate=15/100+rate;
			   }
			   if(Type=="Female" );
			   {
				   rate=5/1000+rate;
			   }
			 double amount=PA* (Math.pow(1+rate/100, time));
			 System.out.println("total compund interest=" +amount);
		   }
		  
	   }
}
public class Interest {
   public static void main(String[] args)
   {
	   solveit ob=new solveit(4.3,8.0,55,"SI","Female",2);
			   ob.calculate();
	   
   }
}
