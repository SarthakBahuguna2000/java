package overloading;

	class Vehicle{
		void engine(){
		System.out.println(" engine");
		}
		}

 class Bike extends Vehicle{

		void engine(){

		System.out.println ("bike engine");

		}
		}
	class Car extends Vehicle{

		void engine(){

		System.out.println ("this is car engine");

		}

		}

		public class override {

		public static void main(String[] arg) {

		Bike ob = new Bike ();
		ob.engine();
		Car ob1 = new Car ();

		ob1.engine (); 

		}
		}

