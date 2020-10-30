package lsk;

public class CurableSymptoms extends Symptom  implements iCurableSymptoms {
	@Override
	public void cure() {
		System.out.println("treatment applied to: "+name);
	}
	
}
