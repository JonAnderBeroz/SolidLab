package ocp;

import java.util.*;

public class Covid19Pacient extends Pacient{
	Map<CardioVascularSymptom,Integer> cardios=new HashMap<>();
	Map<NeuroMuscularSymptom,Integer> neuros=new HashMap<>();
	Map<RespiratorySymptom,Integer> respirs=new HashMap<>();
	public void addCardioSymptom(CardioVascularSymptom c, Integer w){
		cardios.put(c, w);
	}
	public void addNeuroMuscularSymptom(NeuroMuscularSymptom nm, Integer w){
		neuros.put(nm,w);
	}
	public void addRespiratorySymptom (RespiratorySymptom r, Integer w){
		respirs.put(r,w);
	}
	double calcCovid19Impact() {
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		for (CardioVascularSymptom c:cardios.keySet())
			afection=afection+c.getSeverityIndex()*cardios.get(c);
		for (NeuroMuscularSymptom c:neuros.keySet())
			afection=afection+c.getSeverityIndex()*cardios.get(c);
		for (RespiratorySymptom c:respirs.keySet())
			afection=afection+c.getSeverityIndex()*cardios.get(c);
		afection=afection/(cardios.size()+neuros.size()+respirs.size());
		//calculate increment
		if (getYears()>65) increment=afection*0.5;
		//calculate impact
		impact=afection+increment;
		return impact;
	}
}
