
public class Semester2 extends Student{
	
	private String subject1, subject2, subject3, subject4;
	private float mark1, mark2, mark3, mark4;
	
	public Semester2(String name, int rollNumber, int regNumber) {
        super(name, rollNumber, regNumber);
    }
	
	public void getSubject() {
        subject1 = "Networking Concepts";
        subject2 = "Introduction to JAVA";
        subject3 = "SQL Server";
        subject4 = "Computer System Architecture";
    }
	
	//set marks will be different in both the semesters hence not declaring in student class
    public void setMarks(float mark1, float mark2, float mark3, float mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    public void showDetails(boolean printValues){
    	if (printValues){
    		System.out.println();
    		System.out.println("Student Name: " + name);
    		System.out.println("Roll Number: " + rollNumber);
    		System.out.println("Registration Number: " + regNumber);
    	}
    }
    
    public float CalculateResult() {    
        System.out.println("Marks in " + subject1 +": " + mark1 + "/100");
        System.out.println("Marks in " + subject2 +": " + mark2 + "/100");
        System.out.println("Marks in " + subject3 +": " + mark3 + "/100");
        System.out.println("Marks in " + subject4 +": " + mark4 + "/100");
        //calculate % and return
        return (float) ((mark1 + mark2 + mark3 + mark4) / (4));
    }

}

    
   