package srp;

import java.util.Map;

public class AfectionCalculator {
	public double calculateAfection(Map<Symptom,Integer> m) {
		double afection=0;
		int symptomNumber = 0;
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
