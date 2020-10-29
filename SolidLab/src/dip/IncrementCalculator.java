package dip;

public class IncrementCalculator extends IncrementCalculatorAbstraction {
	public double calculateIncrementPerYear(Covid19Pacient p ,double afection) {
		double increment=0;
		if (p.getYears()>+65) {
			increment=afection*0.5;
		}else if (65 > p.getYears() && p.getYears() >=45) {
			increment=afection*0.3;
		}
		return increment;
	}
}
