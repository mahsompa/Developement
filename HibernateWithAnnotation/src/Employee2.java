import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Employee2 extends Employee {
	@Column(name="CITY")
	private String empcity;
	@Column(name="EMPCMPNY")
	private String empcmpny;
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	public String getEmpcmpny() {
		return empcmpny;
	}
	public void setEmpcmpny(String empcmpny) {
		this.empcmpny = empcmpny;
	}

}
