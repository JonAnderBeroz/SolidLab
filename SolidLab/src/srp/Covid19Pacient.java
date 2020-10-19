package srp;


import java.util.*;

public class Covid19Pacient extends Pacient{
	Map<Symptom,Integer> symptoms=new HashMap<>();
	
	public void addSymptom(Symptom c, Integer w){
		symptoms.put(c, w);
	}
	
	double calcCovid19Impact() {	
		double impact;
		if (getYears() <= 10) {
			return 0;
		} else {
			//calculate afection
			double afection = calculateAfection(symptoms);
			//calculate increment
			double increment= calculateIcrement(afection);
			//calculate impact	
			impact= afection+increment;
			return impact;
		}

	}

	private double calculateAfection(Map<Symptom,Integer> m) {
		double afection=0;
		int symptomNumber = 0;
		for (Symptom s : symptoms.keySet()) {
			if (s.getCovidImpact() > 50) {
				afection = afection+s.getSeverityIndex()*symptoms.get(s);
				symptomNumber++;
			}	
		}
		if (symptomNumber == 0) {
			return 0;
		} else {
			return afection/symptomNumber;
		}
	}
	
	private double calculateIcrement(double afection) {
		double increment=0;
		if (getYears()>+65) {
			increment=afection*0.5;
		}else if (65 > getYears() && getYears() >=45) {
			increment=afection*0.3;
		}
		return increment;
	}
	
	public int sanatedDays(){
		int i = 0; 
		int max = 0;
		int ad = 0;
		for (Symptom s: symptoms.keySet()) {
			ad = s.getAffectedDays();
			if (i == 0) {
				i++;
				max= ad;
			} else if (max <= ad) {
				max = ad;
			}
		}
		return max;
	}
}
