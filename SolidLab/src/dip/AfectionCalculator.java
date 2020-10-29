package dip;

import java.util.Map;

public class AfectionCalculator extends AfectionCalculatorAbstraction {
	public double calculateSympomsAfection(Covid19Pacient p) {
		double afection=0;
		int symptomNumber = 0;
		Map<Symptom, Integer> m = p.getSypmtoms();
		for (Symptom s : m.keySet()) {
			if (s.getCovidImpact() > 50) {
				afection = afection+s.getSeverityIndex()*m.get(s);
				symptomNumber++;
			}	
		}
		if (symptomNumber == 0) {
			return 0;
		} else {
			return afection/symptomNumber;
		}
	}
}
