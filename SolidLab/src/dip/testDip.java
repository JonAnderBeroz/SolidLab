package dip;

public class testDip {

	public static void main(String[] args) {
		AfectionCalculatorAbstraction ac1 = new CalcAfection();
		AfectionCalculatorAbstraction ac2 = new AfectionCalculator();
		IncrementCalculatorAbstraction incr1 = new CalcIncrement();
		IncrementCalculatorAbstraction incr2 = new IncrementCalculator();
		Covid19Pacient p = new Covid19Pacient();
		p.setYears(67);
		Symptom s1 = new CardioVascularSymptom();
		s1.setCovidImpact(54);
		s1.setSeverityIndex(5);
		Symptom s2 = new NeuroMuscularSymptom();
		s2.setCovidImpact(24);
		s2.setSeverityIndex(3);
		
		p.addSymptom(s1, 1);
		p.addSymptom(s2, 1);
		
		System.out.println("Impact1: " + p.calcCovid19Impact(ac1, incr1));
		System.out.println("Impact2: " + p.calcCovid19Impact(ac2, incr1));
		p.setYears(47);
		System.out.println("Impact3: " + p.calcCovid19Impact(ac2, incr2));
		System.out.println("Impact4: " + p.calcCovid19Impact(ac2, incr1));
	}

}
