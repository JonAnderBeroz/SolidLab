package dip;

import java.util.Map;


public class CalcAfection extends AfectionCalculatorAbstraction {
	public double calculateSympomsAfection(Covid19Pacient p) {
		double afection=0;
		int symptomNumber = 0;
		Map<Symptom, Integer> symptoms = p.getSypmtoms();
		for (Symptom s : symptoms.keySet()) {
			afection = afection+s.getSeverityIndex()*symptoms.get(s);
			symptomNumber++;
		}
		if (symptomNumber == 0) {
			return 0;
		} else {
			return afection/symptomNumber;
		}
	}
}
