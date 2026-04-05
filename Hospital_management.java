package oops_practice;

interface Billable {
	double calculateBill();
}

abstract class Person{
	protected String name;
	protected int age;
	
	//constructor in abstract class
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public abstract void showDetails();
}

class Doctor extends Person implements Billable {
	private String specialization;
	private double consultationFee;
	
	//constructor initializes a Doctor object.
	public Doctor(String name,int age,String specialization,double consultationFee) {
		super(name,age);           //Because name and age belong to the parent class Person.So the parent constructor is called first to initialize common values.
		this.specialization = specialization;    //Why this.specialization = specialization Because the parameter and instance variable have the same name.
		this.consultationFee = consultationFee;
	}
	
	@Override
	public void showDetails() {
		System.out.println("Doctor Name       : " + name);
        System.out.println("Age               : " + age);
        System.out.println("Specialization    : " + specialization);
        System.out.println("Consultation Fee  : " + consultationFee);
	}
	
  @Override
  public double calculateBill() {
    	return consultationFee;
  }
  //overloading as method name is same
  public void treatPatient() {
  	System.out.println(name+" is treating a patient.");
  }
  public void treatPatient(String patientName) {
    	System.out.println(name+" is treating a patient."+ patientName);
  }
	
}
public class prac2 {

	public static void main(String[] args) {
	

	}

}
