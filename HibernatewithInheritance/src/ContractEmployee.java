
public class ContractEmployee extends Employee{
	private int salary_per_hour;
	private String contract_duration;
	public int getSalary_per_hour() {
		return salary_per_hour;
	}
	public void setSalary_per_hour(int salary_per_hour) {
		this.salary_per_hour = salary_per_hour;
	}
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

}
