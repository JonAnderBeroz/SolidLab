package isp;


import java.util.*;

public class Covid19Pacient extends Pacient implements iAdina{
	Map<Symptom,Integer> symptoms=new HashMap<>();
	public int getAdina() {
		return this.getYears();
	}
}
