package Rock_Paper_and_Scissors;

import java.util.Random;
import java.util.Scanner;

   public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose rock, paper or scissors:");
        String playerMove = scanner.nextLine();

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0){
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        }else{
            computerMove = "scissors";
        }
        System.out.println("The computer chose " + computerMove);

        if (playerMove.equals(computerMove)){
            System.out.println("This game was a draw");
        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("You win");
        }else {
            System.out.println("You lose");
        }


    }

       static boolean playerWins (String playerMove, String computerMove) {
            if (playerMove.equals("rock")){
                return computerMove.equals("scissors");
            } else if (playerMove.equals("paper")) {
                return computerMove.equals("rock");
            }else {
                return computerMove.equals("paper");
            }
       }
   }

