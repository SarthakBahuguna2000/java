
package com.practice;

 public  class Hexagon extends Find {
	int side;
	
	public double calculateArea() {
		return ((3 * Math.sqrt(3) *
                (side * side)) / 2);
	}
public Hexagon(int side)
{
	super("Hexagon");
	this.side=side;
}
public int getside()
{
	return side;
}
public void setside(int side)
{
	this.side=side;
}
 }
