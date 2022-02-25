package com.innovation.shape;

class Circle 
{
	private float radius;
	private float pi;
	public Circle()
	{
		this(1.5f);
		System.out.println("radius"+radius);
	}
	private  Circle(float radius)
	{
		this(1.5f,3.5f);
		System.out.println("radius2 ="+radius);
	}
	public Circle(float radius,float pi)
	{
		this.pi=3.5f;
		this.radius=radius;
		System.out.println("radius2 ="+radius+" "+","+"pi ="+pi);
	}
	float calculateCircleArea(float radius)
	{
		return(pi*radius*radius);
	}
	float calculateCircumference(float radius)
	{
		return(2*pi*radius);
	}
	class Area
	{
		public static void main(String[] args)
		{
			Circle c1=new Circle();
			System.out.println("Area ="+c1.calculateCircleArea(2.5f));
			System.out.println("Cirucmference ="+c1.calculateCircumference(2.5f));
		}
			
		
	}
	

}
