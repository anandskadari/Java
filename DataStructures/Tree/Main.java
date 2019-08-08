import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args){

       /* BinarySearchTree bs = new BinarySearchTree(8);
        bs.insert(5);
        bs.insert(9);
        bs.insert(2);
        bs.insert(7);
        bs.insert(6);

        System.out.println("---Pre Order---");
        bs.preOrder();
        System.out.println("---Post Order---");
        bs.postOrder();
        System.out.println(("---Level Order---"));
        bs.levelOrder();
*/
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);


        }
    }



class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.

    int getSuitPriority(String suitString) {
        switch(suitString){
            case "spades":
                return 1;
            case "diamonds":
                return 2;
            case "hearts":
                return 3;
            case "clubs":
                return 4;
        }
        //Write your code here.
        return 0;

    }


}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        //Write your code here.
        if(c1.value>c2.value)
        {
            points1++;
        }
        else if(c1.value==c2.value)
        {
            if(c1.getSuitPriority(c1.suit) > c2.getSuitPriority(c2.suit))
            {
                points1++;
            }
            else
            {
                points2++;
            }
        }

        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }

}
