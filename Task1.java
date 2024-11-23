import java.util.Random;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Task1{
	public static void main(String[] args)throws IOException {

		int totalScore=0;
		
		int num;
		
		boolean playagain = true;

		while(playagain){
			int maxAttempt = 5;

			int min=1;
			int max=100;

		int userInput = 0;
		
		int attempt = 0;

		Random random = new Random();

		num = random.nextInt(100);

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		boolean guessCorrect = false;

		while( attempt < maxAttempt && !guessCorrect){

		 System.out.printf("Attempt %d/%d : ", attempt +1 ,maxAttempt);

		 userInput = Integer.parseInt(bf.readLine());

		 if(userInput < min || userInput > max){
		 	System.out.println("Invalid input ! please eneter the nummber between 1 to 100");
		 	continue;
		 }
		 attempt++;
		 System.out.println(num);
		 if(userInput==num){
		 	System.out.println("your guess is correct");
		 	guessCorrect=true;
		 	totalScore += attempt;
		 }
		 else if (userInput<num) {
			 System.out.println("TOO LOW! Try Again");
		 }else{
		 	System.out.println("TOO HIGH! Try Again");
		 }
		}
		if(!guessCorrect){
                System.out.printf("Sorry, you've used all %d attempts. The correct number was %d.\n", maxAttempt, num);
		}
		 

		 System.out.println("Do you want to play Again:(yes/no)");

		 String response = bf.readLine().toLowerCase();

		 playagain = response.equals("yes");

		}
		System.out.printf("Your Total Score is %d",totalScore);
	}
}
