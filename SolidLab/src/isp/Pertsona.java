package isp;

public class Pertsona implements iAdina {
	String name;
	int adina;

	public void setAdina(int adina) {
		this.adina = adina;
	}
	@Override
	public int getAdina() {
		return this.adina;
	}	
	
	public double getIncrement(int afektion) {
		CalcIncrement ca = new CalcIncrement();
		return ca.calculateIncrementPerYear(this, afektion);
	}
}
