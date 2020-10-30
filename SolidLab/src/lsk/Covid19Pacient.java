package lsk;


import java.util.*;

public class Covid19Pacient extends Pacient{
	Map<Symptom,Integer> symptoms=new HashMap<>();
	AfectionCalculator aC = new AfectionCalculator();
	IncrementCalculator iC = new IncrementCalculator();

	public void addSymptom(Symptom c, Integer w){
		symptoms.put(c, w);
	}

	public void showSymptoms(){
		for (Symptom s: symptoms.keySet())
			s.show();
	}
	public void cure(){
		for (Symptom s: symptoms.keySet())
			if(s instanceof CurableSymptoms) {
				((CurableSymptoms) s).cure();
			}
	}
	double calcCovid19Impact() {	
		double impact;
		if (getYears() <= 10) {
			return 0;
		} else {
			//calculate afection
			double afection = aC.calculateAfection(symptoms);
			//calculate increment
			double increment= iC.calculateIcrement(afection, this.getYears());
			//calculate impact	
			impact= afection+increment;
			return impact;
		}

	}
}
