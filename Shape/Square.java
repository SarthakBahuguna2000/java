package com.practice;

public class Square extends Find {
	
		int side;

		public Square(int side) {
			super("Square");
			this.side = side;
		}
		
		public double calculateArea() {
			return this.side*this.side;
		}

		public int getSide() {
			return side;
		}

		public void setSide(int side) {
			this.side = side;
		}
		
		

	}

