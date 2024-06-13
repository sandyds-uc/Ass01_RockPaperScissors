import java.util.Scanner;

public class RockPaperScissors // class RockPaperScissors
{
    public static void main(String[] args) // main()
    {
        // declare & initialize variables
        String playerAMove = ""; // String playerAMove = “”
        String playerBMove = ""; // String playerBMove = “”
        int playerAWins = 0; // num playerAWins = 0
        int playerBWins = 0; // num playerBWins = 0
        String isDone = "N"; // String isDone = “N”
        String trash = ""; // String trash for bad isDone input
        Scanner in = new Scanner(System.in);

        do // input validation checker
        {
            System.out.print("\nPlayer A, choose R, P, or S (Rock, Paper, or Scissors): "); // prompt user A to choose R, P, or S
            playerAMove = in.nextLine(); // input player A choice
            System.out.print("Player B, choose R, P, or S (Rock, Paper, or Scissors): "); // prompt user B to choose R, P, or S
            playerBMove = in.nextLine(); // input player B choice
            if(playerAMove.equalsIgnoreCase("R")) // when player A chooses Rock
            {
                if(playerBMove.equalsIgnoreCase("R")) // when A chose Rock & B also chooses Rock
                {
                    System.out.println("You both chose Rock; it is a tie."); // output “It is a tie; you both chose Rock.”
                }
                else if(playerBMove.equalsIgnoreCase("P")) // if playerBMove == “P” then
                {
                    System.out.println("Paper covers Rock; Player B wins!"); // output “Paper covers Rock; Player B wins!”
                    playerBWins++; // playerBWins = playerBWins + 1
                }
                else if (playerBMove.equalsIgnoreCase("S")) // if playerBMove == "S"
                {
                    System.out.println("Rock breaks Scissors; Player A wins!"); // output “Rock breaks Scissors; Player A wins!”
                    playerAWins++; // playerAWins = playerAWins + 1
                }
                else // code to run if Player B makes and illegal move
                {
                    System.out.println("Illegal move by Player B & it does not count."); // invalid input by Player B
                }
            }
            else if(playerAMove.equalsIgnoreCase("P")) // when player A chooses Paper
            {
                if(playerBMove.equalsIgnoreCase("R")) // when A chose Paper & B chose Rock
                {
                    System.out.println("Paper covers Rock; Player A wins!"); // output "Paper covers Rock; Player A wins!"
                    playerAWins++; // playerAWins = playerAWins + 1
                }
                else if(playerBMove.equalsIgnoreCase("P")) // if playerBMove == "P"
                {
                    System.out.println("You both chose Paper; it is a tie."); // output "You both chose Paper; it is a tie."
                }
                else if (playerBMove.equalsIgnoreCase("S")) // if playerBMove == "S"
                {
                    System.out.println("Scissors cut Paper; Player B wins!"); // output "Scissors cut Paper; Player B wins!"
                    playerBWins++; // playerBWins == playerBWins + 1
                }
                else // code to run if player B makes an illegal move
                {
                    System.out.println("Illegal move by Player B & it does not count."); // invalid input by Player B
                }
            }
            else if(playerAMove.equalsIgnoreCase("S")) // when player A chooses Scissors
            {
                if(playerBMove.equalsIgnoreCase("R")) // when A chose Scissors & B chose Roock
                {
                    System.out.println("Rock breaks Scissors; Player B wins!"); // output "Rock breaks Scissors; Player B wins!"
                    playerBWins++; // playerBWins == playerBWins + 1
                }
                else if(playerBMove.equalsIgnoreCase("P")) // if playerBMove == "P"
                {
                    System.out.println("Scissors cut Paper; Player A wins!"); // output "Scissors cut Paper; Player A Wins!"
                    playerAWins++; // playerAWins = playerAWins + 1
                }
                else if (playerBMove.equalsIgnoreCase("S")) // if playerBMove == "S"
                {
                    System.out.println("You both chose Scissors; it is a tie."); // output "You both chose Scissors; it is a tie."
                }
                else // code to run if player B makes an illegal move
                {
                    System.out.println("Illegal move by Player B & it does not count."); // invalid input by Player B
                }
            }
            else
            {
                System.out.println("Illegal move by Player A & it does not count: " + playerAMove); // invalid input by Player A
            }
            System.out.print("Are you done [YN]? "); // output "Are you done [Y/N]?"
            isDone = in.nextLine(); // input isDone
            if(isDone.equalsIgnoreCase("Y")) // if isDone == Y
            {
                isDone = "Y"; // is done
            }
            else if(isDone.equalsIgnoreCase("N")) // else if isDone == N
            {
                isDone = "N"; // is NOT done
            }
            else // trash response to isDone question
            {
                trash = in.nextLine(); // capture trash input in trash variable
                System.out.println("Illegal Entry: " + trash); // throw trash back at user
                System.out.println("You will play again."); // force user to play again for talking trash
                isDone = "N"; // keep isDone == N
            }
        }while(isDone.equals("N")); // keep looping as long as isDone is N
        System.out.println("\nPlayer A wins: " + playerAWins + " & Player B wins: " + playerBWins); // output “Player A wins: ” + playerAWins + “& Player B wins: ” + playerBWins
    } // return
} // end class