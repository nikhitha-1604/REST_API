//save under package in src/main
package ebook;

public class Employee {

    private int id;
    private String name;
    private int salary;
    private String company;
    
    public Employee(int id, String name, int salary, String company) {

		this.id = id;

		this.name = name;

		this.salary = salary;

		this.company = company;

	}

	

    public int getId() {
        return id;
    }

  
    public void setId(int id) {
        this.id = id;
    }

 
    public String getName() {
        return name;
    }

  
    public void setName(String name) {
        this.name = name;
    }
}

