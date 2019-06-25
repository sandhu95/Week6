
public class Circle 
{
	//-----Properties
	private double radius;
	
	//-----Constructor
	public Circle(double radius)
	{
		this.radius=radius;
	}

	//-----Methods
	public double area( double rad)
	{
		double area;
		area= (22/7)*rad*rad;
		return area;
	}
	public double circumf( double rad)
	{
		double circumference;
		circumference= 2*(22/7)*rad;
		return circumference;
	}
	public double dm( double rad)
	{
		double diameter;
		diameter= 2*rad;
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
