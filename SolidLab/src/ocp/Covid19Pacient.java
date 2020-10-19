package ocp;

import java.util.*;

public class Covid19Pacient extends Pacient{
	Map<Symptom,Integer> symptoms=new HashMap<>();
	public void addSymptom(Symptom c, Integer w){
		symptoms.put(c, w);
	}
	double calcCovid19Impact() {
		double impact;
		double increment=0;
		double afection=0;
		int symptomNumber = 0;
		for (Symptom s : symptoms.keySet()) {
			afection = afection+s.getSeverityIndex()*symptoms.get(s);
			symptomNumber++;
		}
		if(symptomNumber > 0) {
			 afection = afection/symptomNumber;
		}
		if (getYears()>65) increment=afection*0.5;
		//calculate impact	
		impact= afection+increment;
		return impact;
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
