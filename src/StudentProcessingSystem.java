
public class StudentProcessingSystem {

	public static void main(String[] args) {
		
		float res1, res2;
		
		Semester1 std1 = new Semester1("Arpita", 1001, 10250);
		Semester2 std2 = new Semester2("ARPITA", 1001, 10250);
		
		std1.setMarks(57, 65, 70);
		std2.setMarks(85, 76, 88, 91);
		std1.showDetails(true);
		std1.getSubject();
		std2.getSubject();
		
		res1 = std1.CalculateResult();
		System.out.println("Percentage obtained by " + std1.name + " in semester1 is: " + res1+" %");
		System.out.println();
		res2 = std2.CalculateResult();
		System.out.println("Percentage obtained by " + std2.name + " in semester2 is: " + res2+" %");		
		System.out.println();
		System.out.println("Final Percentage: " + ((res1+res2)/2) + " %");
		System.out.println();
		
		Semester1 std11 = new Semester1("Jyoti", 1021, 10550);
		Semester2 std21 = new Semester2("Jyoti", 1021, 10550);
		
		std11.setMarks(75, 87, 60);
		std21.setMarks(88, 96, 83, 90);
		std11.showDetails(true);
		std11.getSubject();
		std21.getSubject();
		
		res1 = std11.CalculateResult(); 
		System.out.println("Percentage obtained by " + std11.name + " in semester1 is: " + res1+" %");
		System.out.println();
		res2 = std21.CalculateResult();
		System.out.println("Percentage obtained by " + std21.name + " in semester1 is: " + res2+" %");
		System.out.println();
		System.out.println("Final Percentage: " + ((res1+res2)/2) + " %");
		System.out.println();
	}

}
