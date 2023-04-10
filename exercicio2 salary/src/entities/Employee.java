package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
			
	public double netSalary() {
		if (percentage <=0) {
		return grossSalary - tax;
		}
		else { 
		return  grossSalary /100 * percentage + grossSalary-tax; 
		}
	}

	public void increaseSalary (double percentage) {
	percentage = (grossSalary*100) / percentage; 
	}

	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", this.netSalary());
	}

}
