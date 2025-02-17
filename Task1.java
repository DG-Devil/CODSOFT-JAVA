//This program is to tell whether or not the user guess is correct compare to the random number...
//it generates. It will also print how close or high it is.

import java.util.*;

public class Task1{
    public static void main(String[] args) {
        int max=3;
	int n = 100;

        Scanner sc = new Scanner(System.in);
	for(int i=1;i<=max;i++){

	int r = (int)(Math.random() * n);  //Generating a random Number
	System.out.print("Enter your guess (Attempt " + i + " of " + max  + "): ");
        int guess = sc.nextInt(); 	//User's guess
        
	Compare var = new Compare(r, guess);

        var.compareNumbers();

	if(r==guess){break;}

	}
	sc.close();

    }

    static class Compare {
	int r;
        int guess;  
	Compare(int r, int guess){
            this.r = r;
            this.guess = guess;
        }

        void compareNumbers() {
	int temp=0;
	int diff=0;
        if (r == guess) {
                System.out.println("Congratulations! Your guess is correct.");
            }


	 if(guess > r){
		temp=guess;
		diff=guess-r;
	}else {
		temp=r;
		diff=r-guess;
	}

	if(diff>10){System.out.println("Your guess was HIGH!");} //If the differene b/w 'Guess' and 'Random_No' is..
	else{System.out.println("Your guess was CLOSE !");}		//below 10 than it will print a 'Close Guess'
	
	System.out.println("The correct number was: " + r);
        }
    }
}

