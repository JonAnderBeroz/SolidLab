package lsk;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Covid19PatitentTest {
	Covid19Pacient c19 = new Covid19Pacient();
	@Test
	void symptons() {
		try {
			//test variables
			double expected = 4;
			Symptom s1 =  new Symptom();
			Symptom s2 =  new Symptom();
			Symptom s3 = new Symptom();
			s1.setSeverityIndex(2);
			s2.setSeverityIndex(3);
			s3.setSeverityIndex(4);
			s1.setCovidImpact(60);					
			s2.setCovidImpact(60);
			s3.setCovidImpact(60);
			c19.addSymptom(s1, 1);
			c19.addSymptom(s2, 2);
			c19.addSymptom(s3, 1);
			c19.setYears(25);
			//call method
			double result = c19.calcCovid19Impact();
			assertTrue(expected==result);
		}catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
