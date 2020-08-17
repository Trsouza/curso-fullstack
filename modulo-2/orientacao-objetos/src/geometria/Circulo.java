package geometria;

public class Circulo {

	public double radius;
	static double casa;

	public double circunferencia() {
		return 2.0 * Math.PI * radius;
	}

	public double volume() {
		return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
	}

	@Override
	public String toString() {
		return String.format("Circunferência: %.2f%nVolume: %.2f%nPI: %.2f%n", circunferencia(), volume(), Math.PI);
	}
}
