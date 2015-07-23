import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Employee1  extends Employee{
	@Column(name="EMPCMPNY")
	private String empcmpny;

	public String getEmpcmpny() {
		return empcmpny;
	}

	public void setEmpcmpny(String empcmpny) {
		this.empcmpny = empcmpny;
	} 

}
