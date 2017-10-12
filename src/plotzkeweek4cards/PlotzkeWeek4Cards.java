/**
 * Daniel Plotzke
 * Description: Tested throughly through trial & error (realizing errors
 * immediately), but used debug with line breakpoint when things
 * got more confusing. (Step-through testing)
 */
package plotzkeweek4cards;

/**
 *
 * @author dan2203524
 */
import java.awt.font.NumericShaper;
import java.util.Scanner;

public class PlotzkeWeek4Cards
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter card initials: ");
        // Stores card info (both string and number) into string "card"
        String card = in.next();
        int digit2 = 0;
        String suit = "";
        if (Character.isDigit(card.charAt(1))) // Tests if 1st char is digit
        {
            int digit1 = Integer.parseInt(card.substring(0, 1));
            String cardvalueconvert = "";
            int cardValue = 0;
            if (card.length() == 3)
            {
                cardValue = Integer.parseInt(card.substring(0, 2));
                digit2 = Integer.parseInt(card.substring(0, 2)); // used for 
                suit = card.substring(2, 3);
            } else
            {
                suit = card.substring(1, 2);
                cardValue = Integer.parseInt(card.substring(0, 1));
            }
//      System.out.println(digit1);
//      System.exit(0);
//      System.out.println(card); 
//    if (digit1 <= 9 && digit2 != 10) 
//    {
//      cardValue = Integer.parseInt(card.substring(0,1));
//    }
//    else //(digit2 == 10) 
//            {
//                cardValue = Integer.parseInt(card.substring(0,2));
//            }
            switch (cardValue)
            {
                case 1:
                {
                    cardvalueconvert = "One";
                    break;
                }
                case 2:
                {
                    cardvalueconvert = "Two";
                    break;
                }
                case 3:
                {
                    cardvalueconvert = "Three";
                    break;
                }
                case 4:
                {
                    cardvalueconvert = "Four";
                    break;
                }
                case 5:
                {
                    cardvalueconvert = "Five";
                    break;
                }
                case 6:
                {
                    cardvalueconvert = "Six";
                    break;
                }
                case 7:
                {
                    cardvalueconvert = "Seven";
                    break;
                }
                case 8:
                {
                    cardvalueconvert = "Eight";
                    break;
                }
                case 9:
                {
                    cardvalueconvert = "Nine";
                    break;
                }
                case 10:
                {
                    cardvalueconvert = "Ten";
                    break;
                }
            }
            switch (suit.toLowerCase())
            {
                case "h":
                    suit = "Hearts";
                    break;

                case "c":
                    suit = "Clubs";
                    break;

                case "s":
                    suit = "Spades";
                    break;

                case "d":
                    suit = "Diamonds";
                    break;
            }
            System.out.println(cardvalueconvert + " of " + suit);
        } else // 1st char is NOT digit
        {
            String cardName = card.substring(0, 1);
            suit = card.substring(1, 2);
            switch (cardName.toLowerCase())
            {
                case "k":
                    cardName = "King";
                    break;

                case "q":
                    cardName = "Queen";
                    break;

                case "j":
                    cardName = "Jack";
                    break;

                case "a":
                    cardName = "Ace";
                    break;
            }
            switch (suit.toLowerCase())
            {
                case "h":
                    suit = "Hearts";
                    break;

                case "c":
                    suit = "Clubs";
                    break;

                case "s":
                    suit = "Spades";
                    break;

                case "d":
                    suit = "Diamonds";
                    break;
            }
            System.out.println(cardName + " of " + suit);
        }

    }

}
