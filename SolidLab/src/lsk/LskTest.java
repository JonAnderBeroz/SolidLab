package lsk;

public class LskTest {

	public static void main(String[] args) {
		Covid19Pacient p = new Covid19Pacient();
		Symptom s1 = new Symptom();
		s1.setCovidImpact(1);
		s1.setName("tos");
		s1.setSeverityIndex(1);
		Symptom s2 = new IncurableSymptom();
		s2.setCovidImpact(1);
		s2.setName("tristeza");
		s2.setSeverityIndex(1);
		p.addSymptom(s1, 1);
		p.addSymptom(s2, 1);
		p.showSymptoms();
		p.cure();
	}

}
