import java.util.Scanner;
import java.lang.Math.*;
public class Circle 
{
	//-----Properties
	private double radius;
	
	//-----Constructor
	public Circle()
	{
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}

	//-----Methods
	public double area()
	{
		double area;
		area= Math.PI*radius*radius;
		return area;
	}
	public double circumf()
	{
		double circumference;
		circumference= 2*Math.PI*radius;
		return circumference;
	}
	public double dm()
	{
		double diameter;
		diameter= 2*radius;
		return diameter;
	}
	
	//-----Getters and Setters
		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		public static void main( String args[])
		{
			Circle cir= new Circle();
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the radius: ");
			cir.setRadius(input.nextDouble());
			System.out.println("area: "+cir.area());
			System.out.println("circumference: "+cir.circumf());
			System.out.println("diameter: "+cir.dm());
			input.close();
		}
}
