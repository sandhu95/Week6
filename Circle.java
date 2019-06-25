
public class Circle 
{
	//-----Properties
	private double radius;
	
	//-----Constructor
	public Circle()
	{
		this.radius=radius;
	}

	//-----Methods
	public double area()
	{
		double area;
		area= (22/7)*radius*radius;
		return area;
	}
	public double circumf()
	{
		double circumference;
		circumference= 2*(22/7)*radius;
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
}
