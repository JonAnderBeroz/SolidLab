package srp;

public abstract class Symptom {
	public abstract int getSeverityIndex();
	public abstract void setSeverityIndex(int severityIndex);
	public abstract int getCovidImpact();
	public abstract void setCovidImpact(int covidImpact);
	public abstract int getAffectedDays();
	public abstract void setAffectedDays(int affectedDays);
}
