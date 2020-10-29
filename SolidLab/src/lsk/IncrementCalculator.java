package lsk;

public class IncrementCalculator {
	public double calculateIcrement(double afection, int years) {
		double increment=0;
		if (years>+65) {
			increment=afection*0.5;
		}else if (65 > years && years >=45) {
			increment=afection*0.3;
		}
		return increment;
	}
}
