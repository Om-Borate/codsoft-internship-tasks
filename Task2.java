import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Task2{
	public static void main(String[] args)throws IOException {
		// 6 subjects 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your Marks Obtained (out of 100) in each Subject");	

		System.out.print("Maths : " );
		int maths = Integer.parseInt(br.readLine());
		
		System.out.print("Java : " );
		int java = Integer.parseInt(br.readLine());

		System.out.print("Electonic : " );
		int electonic = Integer.parseInt(br.readLine());
		
		System.out.print("Python : " );
		int python = Integer.parseInt(br.readLine());

		System.out.print("JavaScript : " );
		int javaScript = Integer.parseInt(br.readLine());

		System.out.print("DataBase SQL : " );
		int sql = Integer.parseInt(br.readLine());

		double totalmarksScore=0;
		double totalMarks=600;
		double average=0;
		double notLessThen= 35.0;

		totalmarksScore +=maths+java+javaScript+electonic+python+sql;

		System.out.println("Your Total Score is "+totalmarksScore +" Out of 600\n");

		average = Math.round(totalmarksScore/totalMarks*100);

		char grade=0;
		if(average>=90)
		{
			grade='O';
		}
		else if(average>=80) {
			grade='A';
		}
		else if(average>=70)
		{
			grade='B';
		}
		else if(average>=60)
		{
			grade='C';
		}
		else if (average>=50) {
			grade='D';
		}
		else if (average>=40) {
			grade='E';
		}
		else if (average < notLessThen) {
			grade='F';
		}
		System.out.println("Grade :" + grade);
		System.out.println(average);
	}
}