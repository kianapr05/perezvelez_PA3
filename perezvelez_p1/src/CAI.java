import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

    public static int correction(int ans) {
        SecureRandom sr3 = new SecureRandom();
        int wrong;
        int right;
        int score = 0;

        if (ans == 0) {
            wrong = sr3.nextInt(4);

            switch (wrong) {
                case 0:
                    System.out.println("That answer is wrong.");
                    break;

                case 1:
                    System.out.println("Sorry, that's incorrect.");
                    break;

                case 2:
                    System.out.println("Wrong, don’t give up!");
                    break;

                case 3:
                    System.out.println("No, but keep trying.");
                    break;
            }
        }

        else if (ans == 1) {
            score = 1;
            right = sr3.nextInt(4);

            switch (right) {
                case 0:
                    System.out.println("Very good!");
                    break;

                case 1:
                    System.out.println("Excellent!");
                    break;

                case 2:
                    System.out.println("Nice work!");
                    break;

                case 3:
                    System.out.println("Keep up the good work!");
                    break;
            }
        }

        return score;
    }

    public static int mixed(int level, int mix) {
        SecureRandom sr = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        float input = 0;
        float answer = 0;
        int c = 0;

        if (level == 1) {
            switch (mix) {
                case 1:
                    num1 = sr.nextInt(9)+1;
                    num2 = sr.nextInt(9)+1;
                    answer = num1 * num2;
                    System.out.println("How much is " + num1 + " times " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 2:
                    num1 = sr.nextInt(9)+1;
                    num2 = sr.nextInt(9)+1;
                    answer = (float) ((double)num1 / (double)num2);
                    System.out.println(answer);
                    System.out.println("How much is " + num1 + " divided by " + num2 + "? Round to at least one decimal place.");

                    input = scnr.nextFloat();

                    if (Math.abs(answer - input) < 0.1) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 3:
                    num1 = sr.nextInt(9)+1;
                    num2 = sr.nextInt(9)+1;
                    answer = num1 + num2;
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 4:
                    num1 = sr.nextInt(9)+1;
                    num2 = sr.nextInt(9)+1;
                    answer = num1 - num2;
                    System.out.println("How much is " + num1 + " minus " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;
            }

        }

        else if (level == 2) {
            switch (mix) {
                case 1:
                    num1 = sr.nextInt(90)+10;
                    num2 = sr.nextInt(90)+10;
                    answer = num1 * num2;
                    System.out.println("How much is " + num1 + " times " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 2:
                    num1 = sr.nextInt(90)+10;
                    num2 = sr.nextInt(90)+10;
                    answer = (float) ((double)num1 / (double)num2);
                    System.out.println(answer);
                    System.out.println("How much is " + num1 + " divided by " + num2 + "? Round to at least one decimal place.");

                    input = scnr.nextFloat();

                    if (Math.abs(answer - input) < 0.1) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 3:
                    num1 = sr.nextInt(90)+10;
                    num2 = sr.nextInt(90)+10;
                    answer = num1 + num2;
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 4:
                    num1 = sr.nextInt(90)+10;
                    num2 = sr.nextInt(90)+10;
                    answer = num1 - num2;
                    System.out.println("How much is " + num1 + " minus " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;
            }
        }

        else if (level == 3) {
            switch (mix) {
                case 1:
                    num1 = sr.nextInt(900)+100;
                    num2 = sr.nextInt(900)+100;
                    answer = num1 * num2;
                    System.out.println("How much is " + num1 + " times " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 2:
                    num1 = sr.nextInt(900)+100;
                    num2 = sr.nextInt(900)+100;
                    answer = (float) ((double)num1 / (double)num2);
                    System.out.println(answer);
                    System.out.println("How much is " + num1 + " divided by " + num2 + "? Round to at least one decimal place.");

                    input = scnr.nextFloat();

                    if (Math.abs(answer - input) < 0.1) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 3:
                    num1 = sr.nextInt(900)+100;
                    num2 = sr.nextInt(900)+100;
                    answer = num1 + num2;
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 4:
                    num1 = sr.nextInt(900)+100;
                    num2 = sr.nextInt(900)+100;
                    answer = num1 - num2;
                    System.out.println("How much is " + num1 + " minus " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;
            }
        }

        else if (level == 4) {
            switch (mix) {
                case 1:
                    num1 = sr.nextInt(9000)+1000;
                    num2 = sr.nextInt(9000)+1000;
                    answer = num1 * num2;
                    System.out.println("How much is " + num1 + " times " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 2:
                    num1 = sr.nextInt(9000)+1000;
                    num2 = sr.nextInt(9000)+1000;
                    answer = (float) ((double)num1 / (double)num2);
                    System.out.println(answer);
                    System.out.println("How much is " + num1 + " divided by " + num2 + "? Round to at least one decimal place.");

                    input = scnr.nextFloat();

                    if (Math.abs(answer - input) < 0.1) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 3:
                    num1 = sr.nextInt(9000)+1000;
                    num2 = sr.nextInt(9000)+1000;
                    answer = num1 + num2;
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;

                case 4:
                    num1 = sr.nextInt(9000)+1000;
                    num2 = sr.nextInt(9000)+1000;
                    answer = num1 - num2;
                    System.out.println("How much is " + num1 + " minus " + num2 + "?");

                    input = scnr.nextFloat();
                    if (input == answer) {
                        c = 1;
                    }
                    else {
                        c = 0;
                    }
                    break;
            }
        }

        return c;
    }

    public static int lvl(int level, int type) {
        SecureRandom sr = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int mix;
        float input = 0;
        float answer = 0;
        int b = 0;

        if (level == 1) {
            switch (type) {
                case 1:
                    num1 = sr.nextInt(9)+1;
                    num2 = sr.nextInt(9)+1;
                    answer = num1 * num2;
                    System.out.println("How much is " + num1 + " times " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 2:
                    num1 = sr.nextInt(9)+1;
                    num2 = sr.nextInt(9)+1;
                    answer = (float) ((double)num1 / (double)num2);
                    System.out.println(answer);
                    System.out.println("How much is " + num1 + " divided by " + num2 + "? Round to at least one decimal place.");

                    input = scnr.nextFloat();

                    if (Math.abs(answer - input) < 0.1) {
                        b = 1;
                    }
                    break;

                case 3:
                    num1 = sr.nextInt(9)+1;
                    num2 = sr.nextInt(9)+1;
                    answer = num1 + num2;
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 4:
                    num1 = sr.nextInt(9)+1;
                    num2 = sr.nextInt(9)+1;
                    answer = num1 - num2;
                    System.out.println("How much is " + num1 + " minus " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 5:
                    mix = sr.nextInt(4)+1;
                    b = mixed(level,mix);
                    break;
            }

        }

        else if (level == 2) {
            switch (type) {
                case 1:
                    num1 = sr.nextInt(90)+10;
                    num2 = sr.nextInt(90)+10;
                    answer = num1 * num2;
                    System.out.println("How much is " + num1 + " times " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 2:
                    num1 = sr.nextInt(90)+10;
                    num2 = sr.nextInt(90)+10;
                    answer = (float) ((double)num1 / (double)num2);
                    System.out.println(answer);
                    System.out.println("How much is " + num1 + " divided by " + num2 + "? Round to at least one decimal place.");

                    input = scnr.nextFloat();

                    if (Math.abs(answer - input) < 0.1) {
                        b = 1;
                    }
                    break;

                case 3:
                    num1 = sr.nextInt(90)+10;
                    num2 = sr.nextInt(90)+10;
                    answer = num1 + num2;
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 4:
                    num1 = sr.nextInt(90)+10;
                    num2 = sr.nextInt(90)+10;
                    answer = num1 - num2;
                    System.out.println("How much is " + num1 + " minus " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 5:
                    mix = sr.nextInt(4)+1;
                    b = mixed(level,mix);
                    break;
            }
        }

        else if (level == 3) {
            switch (type) {
                case 1:
                    num1 = sr.nextInt(900)+100;
                    num2 = sr.nextInt(900)+100;
                    answer = num1 * num2;
                    System.out.println("How much is " + num1 + " times " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 2:
                    num1 = sr.nextInt(900)+100;
                    num2 = sr.nextInt(900)+100;
                    answer = (float) ((double)num1 / (double)num2);
                    System.out.println(answer);
                    System.out.println("How much is " + num1 + " divided by " + num2 + "? Round to at least one decimal place.");

                    input = scnr.nextFloat();

                    if (Math.abs(answer - input) < 0.1) {
                        b = 1;
                    }
                    break;

                case 3:
                    num1 = sr.nextInt(900)+100;
                    num2 = sr.nextInt(900)+100;
                    answer = num1 + num2;
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 4:
                    num1 = sr.nextInt(900)+100;
                    num2 = sr.nextInt(900)+100;
                    answer = num1 - num2;
                    System.out.println("How much is " + num1 + " minus " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 5:
                    mix = sr.nextInt(4)+1;
                    b = mixed(level,mix);
                    break;
            }
        }

        else if (level == 4) {
            switch (type) {
                case 1:
                    num1 = sr.nextInt(9000)+1000;
                    num2 = sr.nextInt(9000)+1000;
                    answer = num1 * num2;
                    System.out.println("How much is " + num1 + " times " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 2:
                    num1 = sr.nextInt(9000)+1000;
                    num2 = sr.nextInt(9000)+1000;
                    answer = (float) ((double)num1 / (double)num2);
                    System.out.println(answer);
                    System.out.println("How much is " + num1 + " divided by " + num2 + "? Round to at least one decimal place.");

                    input = scnr.nextFloat();

                    if (Math.abs(answer - input) < 0.1) {
                        b = 1;
                    }
                    break;

                case 3:
                    num1 = sr.nextInt(9000)+1000;
                    num2 = sr.nextInt(9000)+1000;
                    answer = num1 + num2;
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 4:
                    num1 = sr.nextInt(9000)+1000;
                    num2 = sr.nextInt(9000)+1000;
                    answer = num1 - num2;
                    System.out.println("How much is " + num1 + " minus " + num2 + "?");

                    input = scnr.nextFloat();

                    if (input == answer) {
                        b = 1;
                    }
                    break;

                case 5:
                    mix = sr.nextInt(4)+1;
                    b = mixed(level,mix);
                    break;
            }
        }

        return b;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int level;
        int type;
        int score = 0;
        int percent;
        int a = 0;
        int student = 1;
        int ans = 2;



        while (student == 1) {

            a = 0;
            score = 0;

            System.out.println("Enter a level of difficulty between 1 and 4");
            level = scn.nextInt();

            System.out.println("Enter '1' to study multiplication");
            System.out.println("Enter '2' to study division");
            System.out.println("Enter '3' to study addition");
            System.out.println("Enter '4' to study subtraction");
            System.out.println("Enter '5' to study a mix of the above");
            type = scn.nextInt();

            while(a < 10) {
                ans = 2;
                ans = lvl(level,type);
                score += correction(ans);
                a += 1;
            }

            System.out.println("You got " + score + " out of 10 correct.");
            percent = score * 100 / 10;

            if (percent < 75) {
                System.out.println("");
                System.out.println("Please ask your teacher for extra help");
            }

            else {
                System.out.println("");
                System.out.println("Congratulations, you are ready to go to the next level!");
            }

            System.out.println("If another student is ready to test their math skills, enter the number '1'");
            System.out.println("If all students are done testing, enter the number '0'");
            student = scn.nextInt();

        }


    }
}