package Assignment8;

public class HourlyEmployee extends Employee {
	
    private double hours;
    private double hourlyWage;
    
    public HourlyEmployee() {}

    public HourlyEmployee(String name, double hours, double houryWage){
        super(name);
        this.hours = hours;
        this.hourlyWage = houryWage;
    }

    public double calculateSalary(){
        return hours * hourlyWage;
    }
     
    public double getHours() {
		return hours;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	public String toString() {
    	return "Hourly employee: " + getName() + ", hours " + hours + ", hourly wage " + hourlyWage + " €";
    }
}