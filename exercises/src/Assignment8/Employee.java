package Assignment8;
import java.io.*;
public abstract class Employee implements Serializable{
	
    private static final long serialVersionUID = 1L;

    private String name;
    
    public Employee() {}

    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
		this.name = name;
	}

	public abstract double calculateSalary();
}