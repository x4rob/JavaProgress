package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		double f;
		final int SubtrairF = 32;
		final double Dividby = 5/9.0;
		f = 104;
		double c = (f - SubtrairF ) * Dividby;
		
		
		System.out.println(f + "°F é igual à " + c + "°C.");
		
	}
}
