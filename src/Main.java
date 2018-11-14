import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double geld = 20;

        //vragen
        String[] vendingVragen = {"Wil je iets eten of drinken?", "Warm of koud?", "Zoet of Hartig?", "Gezond of Ongezond?", "met of zonder alcohol?"};

        //antwoorden
        String[] vendingAntwoorden = new String[15];
        while (geld >= 0.85){
            
            System.out.println("Je hebt nog €" +geld+",-");


            //eten of drinken
            System.out.println(vendingVragen[0]);
            vendingAntwoorden[0] = scan.next();
        }

    }

}
