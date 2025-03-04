
//This program is a QIUZ GAME, it takes 20 seconds for the user to answer the question.

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] q1 = {"2) James Gosling", "Who invented Java Programming?", "1) Guido van Rossum", "2) James Gosling", "3) Dennis Ritchie", "4) Bjarne Stroustrup"};
        String[] q2 = {"4) Saw the salad dressing", "Why did the tomato turn red?", "1) It had to", "2) Nature's Work", "3) It can not become yellow", "4) Saw the salad dressing"};
        String[] q3 = {"4) Heart", "What can you break, even if you never pick it up or touch it?", "1) Glass", "2) Promise", "3) Code", "4) Heart"};
        String[] q4 = {"4) Bug in code", "What is the most dangerous disease", "1) Dengue", "2) Cancer", "3) Malaria", "4) Bug in code"};
        String[] q5 = {"4) A Joke", "What can be cracked, made, told, and played?", "1) Literature", "2) Everything", "3) A Quote", "4) A Joke"};

        String[] ques;
        String[] incorrect = new String[50];
        String[] incorrect_ans = new String[50];

        int no_of_questions = 5;
        int score = 0;
        int ans = 0;
        int n = 0;
        ques = q1;

        System.out.println("\n♦--- Welcome to 'Apna Quiz' ---♦\n");
        System.out.println(" -> There are total 5 questions\n -> You would have 20 seconds to answer a question\n -> If unattempted, it will be counted as incorrect\n -> Final score will be shown on the screen after the quiz\n");
        System.out.println("Press 1 to start the game...");
        int start = sc.nextInt();

        for (int i = 1; i <= no_of_questions; i++) {
            System.out.print("\nQuestion " + i + ") ");
            for (int j = 1; j <= 5; j++) {
                System.out.println(ques[j]);
            }

            final int countdownTime = 20; 
            final boolean[] isAnswered = {false};  

            Thread timerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int timeLeft = countdownTime; timeLeft > 0; timeLeft--) {
                        if (isAnswered[0]) break;  
                        System.out.print("\rTime remaining: " + timeLeft + " seconds   ");
                        try {
                            Thread.sleep(1000);  
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (!isAnswered[0]) {
                        System.out.println("\rTIME'S UP!               ");  
			System.out.println("Press 1 to continue...");
                    }
                }
            });

            timerThread.start(); 
            System.out.print("\n-> ");
            n = sc.nextInt();
            isAnswered[0] = true; 

            if (ques[n + 1].equals(ques[0])) {
                score += 1;
            } else {
                incorrect[ans] = ques[1];
                incorrect_ans[ans] = ques[0];
                ans += 1;
            }

            if (i == 1) {
                ques = q2;
            } else if (i == 2) {
                ques = q3;
            } else if (i == 3) {
                ques = q4;
            } else if (i == 4) {
                ques = q5;
            }
        }

        int length = ans;
        int cor = no_of_questions - ans;
        System.out.println("----------------------------------------------------------------");
        if (ans > 0) {
            System.out.println("\nYou gave wrong answer to these questions: ");
        }
        for (int k = 0; k < length; k++) {
            System.out.println("\nQuestion: " + incorrect[k]);
            System.out.println("Answer: " + incorrect_ans[k]);
        }
        System.out.println("\n----------------------------------------------------------------");

        System.out.println("\nCORRECT: " + cor);
        System.out.println("INCORRECT: " + ans);
        System.out.println("\n♦--- SCORE ---♦: " + score);
        sc.close();
    }
}
