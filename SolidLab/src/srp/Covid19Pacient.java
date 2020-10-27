package srp;


import java.util.*;

public class Covid19Pacient extends Pacient{
	Map<Symptom,Integer> symptoms=new HashMap<>();
	AfectionCalculator aC = new AfectionCalculator();
	IncrementCalculator iC = new IncrementCalculator();
	
	public void addSymptom(Symptom c, Integer w){
		symptoms.put(c, w);
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
