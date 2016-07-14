
public class Semester1 extends Student{
	
	private String subject1, subject2, subject3;
	private float mark1, mark2, mark3;
	
	public Semester1(String name, int rollNumber, int regNumber) {
        super(name, rollNumber, regNumber);
    }
	
	public void getSubject() {
        subject1 = "Operating Systems";
        subject2 = "DBMS";
        subject3 = "Oracle";
    }
	
	//set marks will be different in both the semesters hence not declaring in student class
    public void setMarks(float mark1, float mark2, float mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
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
    	System.out.println();
        System.out.println("Marks in " + subject1 +": " + mark1 + "/100");
        System.out.println("Marks in " + subject2 +": " + mark2 + "/100");
        System.out.println("Marks in " + subject3 +": " + mark3 + "/100");        
        //calculate % and return
        return (float) ((mark1 + mark2 + mark3) / (3));
    }

}

    
   