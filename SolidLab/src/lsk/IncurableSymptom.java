package lsk;

public class IncurableSymptom extends Symptom{
	@Override
	public void cure() {
		System.out.println("ERROR, can not be treated");
	}
}
