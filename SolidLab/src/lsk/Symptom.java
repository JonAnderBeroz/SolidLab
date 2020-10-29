package lsk;

public class Symptom {
	public String name;
	int covidImpact; int severityIndex;
	public void show(){
		System.out.println("symptom value :"+name+" severityIndex :"+
				severityIndex+" covidImpact:"+covidImpact);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
	public void cure(){
		System.out.println("treatment applied to: "+name);
	}
}
