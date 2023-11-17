package Assignment8;

public class SalesEmployee extends Employee {
	
    private double sales;
    private double commissionPercent;
    
    public SalesEmployee() {}

    public SalesEmployee(String name, double sales, double commissionPercent){
        super(name);
        this.sales = sales;
        this.commissionPercent = commissionPercent;
    }

    public double getSales() {
		return sales;
	}

	public double getCommissionPercent() {
		return commissionPercent;
	}

	public double calculateSalary(){
        return sales * commissionPercent/100;
    }
    
    public void setSales(double sales) {
		this.sales = sales;
	}

	public void setCommissionPercent(double commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

	public String toString() {
    	return "Sales employee: " + getName() + ", sales " + sales + " €, commission percent " + commissionPercent + " %";
    }
}