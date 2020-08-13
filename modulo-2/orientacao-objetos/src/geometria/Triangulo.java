package geometria;

public class Triangulo {
	public double ladoA, ladoB, ladoC;
	
	public double areaTriangulo() {

		double p = (ladoA + ladoB + ladoC) / 2.0;
		double area = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));

		// 3.00 4.00 5.00
		// 7.50 4.50 4.02
		//System.out.println("area   "+area);
		return area;
	}
}
