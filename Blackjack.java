import java.util.Scanner;

public class Blackjack {
        public static void main(String[] args){
            int gameNum = 1;//what game #
            int userChoice = 0;
            int hand1 = 0;//value of the cards, aka 10 for jack and 2 for 2
            int dealerHand = 0;//dealer's hand
            int gamesTied = 0;//tie games
            double gamesWon = 0.0;//wins as a double for percentage calculation
            double percentageWins=0.0;//percentage of wins
            int gamesLost = 0;// Fat Ls


            P1Random rng = new P1Random();//Getting first card and initializing scanner
            int playerCard1 = (rng.nextInt(13) + 1);
            Scanner scnr = new Scanner(System.in);

            System.out.println("START GAME #" + gameNum);//Start the first game

            switch (playerCard1) //Main switch
            {
                case 1:
                    System.out.println("Your card is a ACE!");//Updates card and hand
                    hand1 +=1;
                    break;
                case 2:
                    System.out.println("Your card is a 2!");//Updates card and hand
                    hand1 += 2;
                    break;
                case 3:
                    System.out.println("Your card is a 3!");//Updates card and hand
                    hand1 += 3;
                    break;
                case 4:
                    System.out.println("Your card is a 4!");//Updates card and hand
                    hand1 += 4;
                    break;
                case 5:
                    System.out.println("Your card is a 5!");//Updates card and hand
                    hand1 += 5;
                    break;
                case 6:
                    System.out.println("Your card is a 6!");//Updates card and hand
                    hand1 += 6;
                    break;
                case 7:
                    System.out.println("Your card is a 7!");//Updates card and hand
                    hand1 += 7;
                    break;
                case 8:
                    System.out.println("Your card is a 8!");//Updates card and hand
                    hand1 += 8;
                    break;
                case 9:
                    System.out.println("Your card is a 9!");//Updates card and hand
                    hand1 += 9;
                    break;
                case 10:
                    System.out.println("Your card is a 10!");//Updates card and hand
                    hand1 += 10;
                    break;
                case 11:
                    System.out.println("Your card is a JACK!");//Updates card and hand
                    hand1 += 10;
                    break;
                case 12:
                    System.out.println("Your card is a QUEEN!");//Updates card and hand
                    hand1 += 10;
                    break;
                case 13:
                    System.out.println("Your card is a KING!");//Updates card and hand
                    hand1 += 10;
                    break;
            }


            System.out.println("Your hand is: " + hand1);//First hand only
            while(userChoice!=4)//The main menu while loop
            {
                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.println("Choose an option:");
                userChoice=scnr.nextInt();//Allows for user input
                if (userChoice == 1) //If you want a new card
                {
                    playerCard1 = (rng.nextInt(13) + 1);//Here we go again, gets a card
                    switch (playerCard1) {
                        case 1:
                            System.out.println("Your card is a ACE!");
                            hand1 +=1;
                            break;
                        case 2:
                            System.out.println("Your card is a 2!");
                            hand1 += 2;
                            break;
                        case 3:
                            System.out.println("Your card is a 3!");
                            hand1 += 3;
                            break;
                        case 4:
                            System.out.println("Your card is a 4!");
                            hand1 += 4;
                            break;
                        case 5:
                            System.out.println("Your card is a 5!");
                            hand1 += 5;
                            break;
                        case 6:
                            System.out.println("Your card is a 6!");
                            hand1 += 6;
                            break;
                        case 7:
                            System.out.println("Your card is a 7!");
                            hand1 += 7;
                            break;
                        case 8:
                            System.out.println("Your card is a 8!");
                            hand1 += 8;
                            break;
                        case 9:
                            System.out.println("Your card is a 9!");
                            hand1 += 9;
                            break;
                        case 10:
                            System.out.println("Your card is a 10!");//All of these show the card, 10+ make hand1 10
                            hand1 += 10;
                            break;
                        case 11:
                            System.out.println("Your card is a JACK!");
                            hand1 += 10;
                            break;
                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            hand1 += 10;
                            break;
                        case 13:
                            System.out.println("Your card is a KING!");
                            hand1 += 10;
                            break;


                    }
                    System.out.println("Your hand is: " + hand1);//Prints hand
                    if (hand1 == 21)
                    {
                        System.out.println("BLACKJACK! You win!");//Blackjack
                        gameNum+=1;
                        gamesWon+=1;
                        hand1=0;
                        System.out.println("START GAME # " + gameNum);//Plays again after blackjack
                        playerCard1 = (rng.nextInt(13) + 1);
                        switch (playerCard1) {
                            case 1:
                                System.out.println("Your card is a ACE!");
                                hand1 +=1;
                                break;
                            case 2:
                                System.out.println("Your card is a 2!");
                                hand1 += 2;
                                break;
                            case 3:
                                System.out.println("Your card is a 3!");
                                hand1 += 3;
                                break;
                            case 4:
                                System.out.println("Your card is a 4!");
                                hand1 += 4;
                                break;
                            case 5:
                                System.out.println("Your card is a 5!");
                                hand1 += 5;
                                break;
                            case 6:
                                System.out.println("Your card is a 6!");
                                hand1 += 6;
                                break;
                            case 7:
                                System.out.println("Your card is a 7!");
                                hand1 += 7;
                                break;
                            case 8:
                                System.out.println("Your card is a 8!");
                                hand1 += 8;
                                break;
                            case 9:
                                System.out.println("Your card is a 9!");
                                hand1 += 9;
                                break;
                            case 10:
                                System.out.println("Your card is a 10!");
                                hand1 += 10;
                                break;
                            case 11:
                                System.out.println("Your card is a JACK!");
                                hand1 += 10;
                                break;
                            case 12:
                                System.out.println("Your card is a QUEEN!");
                                hand1 += 10;
                                break;
                            case 13:
                                System.out.println("Your card is a KING!");
                                hand1 += 10;
                                break;


                        }
                        System.out.println("Your hand is: " +hand1);
                        continue;
                    }
                    if(hand1>21)
                    {
                        System.out.println("You exceeded 21! You lose.");//Bust and play again
                        hand1=0;
                        gamesLost+=1;
                        gameNum+=1;
                        System.out.println("START GAME #"+ gameNum);
                        playerCard1 = (rng.nextInt(13) + 1);
                        switch (playerCard1) {
                            case 1:
                                System.out.println("Your card is a ACE!");
                                hand1 +=1;
                                break;
                            case 2:
                                System.out.println("Your card is a 2!");
                                hand1 += 2;
                                break;
                            case 3:
                                System.out.println("Your card is a 3!");
                                hand1 += 3;
                                break;
                            case 4:
                                System.out.println("Your card is a 4!");
                                hand1 += 4;
                                break;
                            case 5:
                                System.out.println("Your card is a 5!");
                                hand1 += 5;
                                break;
                            case 6:
                                System.out.println("Your card is a 6!");
                                hand1 += 6;
                                break;
                            case 7:
                                System.out.println("Your card is a 7!");
                                hand1 += 7;
                                break;
                            case 8:
                                System.out.println("Your card is a 8!");
                                hand1 += 8;
                                break;
                            case 9:
                                System.out.println("Your card is a 9!");
                                hand1 += 9;
                                break;
                            case 10:
                                System.out.println("Your card is a 10!");
                                hand1 += 10;
                                break;
                            case 11:
                                System.out.println("Your card is a JACK!");
                                hand1 += 10;
                                break;
                            case 12:
                                System.out.println("Your card is a QUEEN!");
                                hand1 += 10;
                                break;
                            case 13:
                                System.out.println("Your card is a KING!");
                                hand1 += 10;
                                break;}
                                System.out.println("Your hand is: "+ hand1);
                    }




                } else if (userChoice == 2) //What happens when you hold
                {
                    dealerHand = rng.nextInt(11)+16;
                    System.out.println("Dealer's hand: " + dealerHand);
                    System.out.println("Your hand is: " + hand1);
                    if (dealerHand <= hand1 || dealerHand >=22)
                    {
                        if (dealerHand == hand1)//tie
                        {
                            System.out.println("It's a tie! No one wins!");
                            gamesTied+=1;

                        }
                        else
                            {
                            System.out.println("You win!");//If it's not a tie and the above is true you win
                            gamesWon+=1;

                        }

                    }
                    else
                    {
                        System.out.println("Dealer wins!");//If neither is true you lose
                        gamesLost+=1;
                    }
                    gameNum+=1;
                    hand1=0;
                    System.out.println("START GAME #" + gameNum);//No matter what we play again
                    playerCard1 = (rng.nextInt(13) + 1);
                    switch (playerCard1) {
                        case 1:
                            System.out.println("Your card is a ACE!");
                            hand1 +=1;
                            break;
                        case 2:
                            System.out.println("Your card is a 2!");
                            hand1 += 2;
                            break;
                        case 3:
                            System.out.println("Your card is a 3!");
                            hand1 += 3;
                            break;
                        case 4:
                            System.out.println("Your card is a 4!");
                            hand1 += 4;
                            break;
                        case 5:
                            System.out.println("Your card is a 5!");
                            hand1 += 5;
                            break;
                        case 6:
                            System.out.println("Your card is a 6!");
                            hand1 += 6;
                            break;
                        case 7:
                            System.out.println("Your card is a 7!");
                            hand1 += 7;
                            break;
                        case 8:
                            System.out.println("Your card is a 8!");
                            hand1 += 8;
                            break;
                        case 9:
                            System.out.println("Your card is a 9!");
                            hand1 += 9;
                            break;
                        case 10:
                            System.out.println("Your card is a 10!");
                            hand1 += 10;
                            break;
                        case 11:
                            System.out.println("Your card is a JACK!");
                            hand1 += 10;
                            break;
                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            hand1 += 10;
                            break;
                        case 13:
                            System.out.println("Your card is a KING!");
                            hand1 += 10;
                            break;


                    }
                    System.out.println("Your hand is: " + hand1);//Prints hand
                }
                else if (userChoice == 3)
                {
                    System.out.println("Number of Player wins: " + (int)gamesWon);//Displays stats
                    System.out.println("Number of Dealer wins: " + gamesLost);
                    System.out.println("Number of tie games: " + gamesTied);
                    gameNum=gameNum-1;//Makes sure games played is accurate
                    System.out.println("Total # of games played is: " + gameNum);
                    if (gameNum == 0) //Doesn't show percentage if no games played
                    {
                        System.out.println("");
                    }
                    if (gameNum > 0)
                    {
                        percentageWins = (gamesWon / (double) gameNum) * 100; //Calculates percentage
                        System.out.println("Percentage of Player wins: " + percentageWins + "%\n");
                    }

                }
                else if (userChoice == 4)
                {
                    //exits by not doing anything
                }
                else
                    {
                    System.out.println("Invalid input!");//If value is not valid, prints this
                    System.out.println("Please enter an integer value between 1 and 4.");
                    continue;
                }
            }
        }

    }

