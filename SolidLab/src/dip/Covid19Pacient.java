package dip;


import java.util.*;

public class Covid19Pacient extends Pacient{
	Map<Symptom,Integer> symptoms=new HashMap<>();

	public void addSymptom(Symptom c, Integer w){
		symptoms.put(c, w);
	}

	public Map<Symptom,Integer> getSypmtoms(){
		return this.symptoms;
	}
	double calcCovid19Impact(AfectionCalculatorAbstraction ca, IncrementCalculatorAbstraction incr) {
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		afection=ca.calculateSympomsAfection (this);
		//calculate increment
		increment=incr.calculateIncrementPerYear (this, afection);
		//calculate impact
		impact=afection+increment;
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
