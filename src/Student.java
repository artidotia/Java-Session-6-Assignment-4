//package student.result;

public abstract class Student {
	protected int rollNumber;
	protected int regNumber;
	protected String name;
	
	public Student(String name, int rollNumber, int regNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.regNumber = regNumber;
    }
	
	public abstract float CalculateResult();
	public abstract void getSubject();
	public abstract void showDetails(boolean printValues);
}


