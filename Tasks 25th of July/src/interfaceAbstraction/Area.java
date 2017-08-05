package interfaceAbstraction;

import java.util.Scanner;

public class Area implements circle {
	Scanner scanner=new Scanner(System.in);
	double r,ar;

	@Override
	public void input() {
		System.out.println("Enter the radius: ");
		r=scanner.nextDouble();
		
		
	}

	@Override
	public void calculate() {
		ar=pi*r*r;
		
	}

	@Override
	public void output() {
		System.out.println("Area of the circle = " +ar);
		
	}
public static void main(String[] args){
	
	Area area=new Area();
	area.input();
	area.calculate();
	area.output();
}
}
