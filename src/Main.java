import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double geld = 20;

        //vragen
        String[] vendingVragen = { "Wil je iets eten of drinken?", "Warm of koud?", "Zoet of Hartig?","Gezond of Ongezond?", "met of zonder alcohol?", "met of zonder koffie?", "bier of wijn?", "met of zonder prik?"};

        //antwoorden
        String[] vendingAntwoorden = new String[15];


        while (geld >= 0.85){


            System.out.println("Je hebt nog €" +geld+",-");
            //eten of drinken
            System.out.println(vendingVragen[0]);
            vendingAntwoorden[0] = scan.next();


            //als het eten is
            if (vendingAntwoorden[0].equals("eten")) {


                System.out.println(vendingVragen[1]);
                vendingAntwoorden[1] = scan.next();

                System.out.println(vendingVragen[2]);
                vendingAntwoorden[2] = scan.next();

                System.out.println(vendingVragen[3]);
                vendingAntwoorden[3] = scan.next();


                if (vendingAntwoorden[1].equals("warm") && (vendingAntwoorden[2].equals("zoet") && (vendingAntwoorden[3].equals("gezond")))) {
                    if (geld >= 2.50) {

                        System.out.println("      _               __                      _   _           \n" +
                                "     | |             / _|                    | | (_)          \n" +
                                "  ___| |_ ___   ___ | |_ _ __   ___  ___ _ __| |_ _  ___  ___ \n" +
                                " / __| __/ _ \\ / _ \\|  _| '_ \\ / _ \\/ _ \\ '__| __| |/ _ \\/ __|\n" +
                                " \\__ \\ || (_) | (_) | | | |_) |  __/  __/ |  | |_| |  __/\\__ \\\n" +
                                " |___/\\__\\___/ \\___/|_| | .__/ \\___|\\___|_|   \\__| |\\___||___/\n" +
                                "                        | |                     _/ |          \n" +
                                "                        |_|                    |__/           ");
                        geld = geld - 2.50;
                    } else {
                        geenGeld();
                    }


                } else if (vendingAntwoorden[1].equals("warm") && (vendingAntwoorden[2].equals("zoet") && (vendingAntwoorden[3].equals("ongezond")))) {
                    if (geld >= 1.80) {
                        System.out.println("   _____                      _        \n" +
                                "  / ____|                    | |       \n" +
                                " | |    _   _ _ __   ___ __ _| | _____ \n" +
                                " | |   | | | | '_ \\ / __/ _` | |/ / _ \\\n" +
                                " | |___| |_| | |_) | (_| (_| |   <  __/\n" +
                                "  \\_____\\__,_| .__/ \\___\\__,_|_|\\_\\___|\n" +
                                "             | |                       \n" +
                                "             |_|                       ");
                        geld = geld - 1.80;
                    } else {
                        geenGeld();
                    }


                } else if (vendingAntwoorden[1].equals("warm") && (vendingAntwoorden[2].equals("hartig") && (vendingAntwoorden[3].equals("gezond")))) {
                    if (geld >= 3.45) {
                        System.out.println("   _____           _                            _                                     _             \n" +
                                "  / ____|         | |                          | |                                   | |            \n" +
                                " | |  __  ___  ___| |_ ___   ___  _ __ ___   __| | ___      __ _ _ __ ___   ___ _ __ | |_ ___ _ __  \n" +
                                " | | |_ |/ _ \\/ __| __/ _ \\ / _ \\| '_ ` _ \\ / _` |/ _ \\    / _` | '__/ _ \\ / _ \\ '_ \\| __/ _ \\ '_ \\ \n" +
                                " | |__| |  __/\\__ \\ || (_) | (_) | | | | | | (_| |  __/   | (_| | | | (_) |  __/ | | | ||  __/ | | |\n" +
                                "  \\_____|\\___||___/\\__\\___/ \\___/|_| |_| |_|\\__,_|\\___|    \\__, |_|  \\___/ \\___|_| |_|\\__\\___|_| |_|\n" +
                                "                                                            __/ |                                   \n" +
                                "                                                           |___/                                    ");
                        geld = geld - 3.45;
                    } else {
                        geenGeld();
                    }


                } else if (vendingAntwoorden[1].equals("warm") && (vendingAntwoorden[2].equals("hartig") && (vendingAntwoorden[3].equals("ongezond")))) {
                    if (geld >= 1.50) {
                        System.out.println("  _  __          _        _   \n" +
                                " | |/ /         | |      | |  \n" +
                                " | ' / _ __ ___ | | _____| |_ \n" +
                                " |  < | '__/ _ \\| |/ / _ \\ __|\n" +
                                " | . \\| | | (_) |   <  __/ |_ \n" +
                                " |_|\\_\\_|  \\___/|_|\\_\\___|\\__|");
                        geld = geld - 1.50;
                    } else {
                        geenGeld();
                    }


                } else if (vendingAntwoorden[1].equals("koud") && (vendingAntwoorden[2].equals("zoet") && (vendingAntwoorden[3].equals("gezond")))) {
                    if (geld >= 1.75) {
                        System.out.println("  ______          _ _             _           _      \n" +
                                " |  ____|        (_) |           | |         | |     \n" +
                                " | |__ _ __ _   _ _| |_ ___  __ _| | __ _  __| | ___ \n" +
                                " |  __| '__| | | | | __/ __|/ _` | |/ _` |/ _` |/ _ \\\n" +
                                " | |  | |  | |_| | | |_\\__ \\ (_| | | (_| | (_| |  __/\n" +
                                " |_|  |_|   \\__,_|_|\\__|___/\\__,_|_|\\__,_|\\__,_|\\___|\n" +
                                "                                                     \n" +
                                "                                                     ");
                        geld = geld - 1.75;

                    } else {
                        geenGeld();
                    }

                } else if (vendingAntwoorden[1].equals("koud") && (vendingAntwoorden[2].equals("zoet") && (vendingAntwoorden[3].equals("ongezond")))) {
                    if (geld >= 0.85) {
                        System.out.println("  ____        _    _                  \n" +
                                " |  _ \\      | |  | |                 \n" +
                                " | |_) | __ _| | _| | __ ___   ____ _ \n" +
                                " |  _ < / _` | |/ / |/ _` \\ \\ / / _` |\n" +
                                " | |_) | (_| |   <| | (_| |\\ V / (_| |\n" +
                                " |____/ \\__,_|_|\\_\\_|\\__,_| \\_/ \\__,_|\n" +
                                "                                      \n" +
                                "                                      ");
                        geld = geld - 0.80;
                    } else {
                        geenGeld();
                    }


                } else if (vendingAntwoorden[1].equals("koud") && (vendingAntwoorden[2].equals("hartig") && (vendingAntwoorden[3].equals("gezond")))) {
                    if (geld >= 1.40) {
                        System.out.println("   _____                        _                              _   _           \n" +
                                "  / ____|                      | |                            | | (_)          \n" +
                                " | (___  _ __   ___   ___ _ __ | |_ ___  _ __ ___   __ _  __ _| |_ _  ___  ___ \n" +
                                "  \\___ \\| '_ \\ / _ \\ / _ \\ '_ \\| __/ _ \\| '_ ` _ \\ / _` |/ _` | __| |/ _ \\/ __|\n" +
                                "  ____) | | | | (_) |  __/ |_) | || (_) | | | | | | (_| | (_| | |_| |  __/\\__ \\\n" +
                                " |_____/|_| |_|\\___/ \\___| .__/ \\__\\___/|_| |_| |_|\\__,_|\\__,_|\\__| |\\___||___/\n" +
                                "                         | |                                     _/ |          \n" +
                                "                         |_|                                    |__/           ");
                        geld = geld - 1.40;
                    } else {
                        geenGeld();
                    }

                } else if (vendingAntwoorden[1].equals("koud") && (vendingAntwoorden[2].equals("hartig") && (vendingAntwoorden[3].equals("ongezond")))) {
                    if (geld >= 0.90) {
                        System.out.println("  ______     _    _    _         _____ _     _           \n" +
                                " |___  /    | |  | |  (_)       / ____| |   (_)          \n" +
                                "    / / __ _| | _| | ___  ___  | |    | |__  _ _ __  ___ \n" +
                                "   / / / _` | |/ / |/ / |/ _ \\ | |    | '_ \\| | '_ \\/ __|\n" +
                                "  / /_| (_| |   <|   <| |  __/ | |____| | | | | |_) \\__ \\\n" +
                                " /_____\\__,_|_|\\_\\_|\\_\\_|\\___|  \\_____|_| |_|_| .__/|___/\n" +
                                "                                              | |        \n" +
                                "                                              |_|        ");
                        geld = geld - 0.90;
                    } else {
                        geenGeld();
                    }


                } else {
                    System.out.println("ongeldige input");
                }



            //als het drinken is
            }else if (vendingAntwoorden[0].equals("drinken")) {

                    System.out.println(vendingVragen[1]);
                    vendingAntwoorden[1] = scan.next();

                    System.out.println(vendingVragen[4]);
                    vendingAntwoorden[4] = scan.next();


                    if (vendingAntwoorden[1].equals("warm") && (vendingAntwoorden[4].equals("met"))) {
                        System.out.println(vendingVragen[5]);
                        vendingAntwoorden[5] = scan.next();

                        if (vendingAntwoorden[5].equals("met")){
                            if (geld >= 4.50) {
                                System.out.println("  _____      _          _                  __  __          \n" +
                                        " |_   _|    (_)        | |                / _|/ _|         \n" +
                                        "   | |  _ __ _ ___  ___| |__     ___ ___ | |_| |_ ___  ___ \n" +
                                        "   | | | '__| / __|/ __| '_ \\   / __/ _ \\|  _|  _/ _ \\/ _ \\\n" +
                                        "  _| |_| |  | \\__ \\ (__| | | | | (_| (_) | | | ||  __/  __/\n" +
                                        " |_____|_|  |_|___/\\___|_| |_|  \\___\\___/|_| |_| \\___|\\___|\n" +
                                        "                                                           \n" +
                                        "                                                           ");
                                geld = geld - 4.50;
                            }else{
                                geenGeld();
                            }

                        }else if (vendingAntwoorden[5].equals("zonder")){
                            if (geld >= 3.25){
                                System.out.println("   _____ _ _   _ _             _ _       \n" +
                                        "  / ____| (_) (_) |           (_|_)      \n" +
                                        " | |  __| |_   _| |____      ___ _ _ __  \n" +
                                        " | | |_ | | | | | '_ \\ \\ /\\ / / | | '_ \\ \n" +
                                        " | |__| | | |_| | | | \\ V  V /| | | | | |\n" +
                                        "  \\_____|_|\\__,_|_| |_|\\_/\\_/ |_| |_| |_|\n" +
                                        "                               _/ |      \n" +
                                        "                              |__/       ");
                                geld = geld - 3.25;
                            }else {
                                geenGeld();
                            }
                        }


                    } else if (vendingAntwoorden[1].equals("warm") && (vendingAntwoorden[4].equals("zonder"))) {
                        System.out.println(vendingVragen[5]);
                        vendingAntwoorden[5] = scan.next();

                        if (vendingAntwoorden[5].equals("met")){
                            if (geld >= 1) {
                                System.out.println("  _  __      __  __ _      \n" +
                                        " | |/ /     / _|/ _(_)     \n" +
                                        " | ' / ___ | |_| |_ _  ___ \n" +
                                        " |  < / _ \\|  _|  _| |/ _ \\\n" +
                                        " | . \\ (_) | | | | | |  __/\n" +
                                        " |_|\\_\\___/|_| |_| |_|\\___|\n" +
                                        "                           \n" +
                                        "                           ");
                                geld = geld - 1;
                            }else{
                                geenGeld();
                            }

                        }else if (vendingAntwoorden[5].equals("zonder")){
                            if (geld >= 1){
                                System.out.println("  _______ _               \n" +
                                        " |__   __| |              \n" +
                                        "    | |  | |__   ___  ___ \n" +
                                        "    | |  | '_ \\ / _ \\/ _ \\\n" +
                                        "    | |  | | | |  __/  __/\n" +
                                        "    |_|  |_| |_|\\___|\\___|\n" +
                                        "                          \n" +
                                        "                          ");
                                geld = geld - 1;
                            }else {
                                geenGeld();
                            }
                        }


                    } else if (vendingAntwoorden[1].equals("koud") && (vendingAntwoorden[4].equals("met"))) {
                        System.out.println(vendingVragen[6]);
                        vendingAntwoorden[6] = scan.next();


                    } else if (vendingAntwoorden[1].equals("koud") && (vendingAntwoorden[4].equals("zonder"))) {
                        System.out.println(vendingVragen[7]);
                        vendingAntwoorden[7] = scan.next();


                    }


            }
        }

        System.out.println("je hebt niet genoeg geld meer om iets te kopen, fijne dag!");


    }

    public static void geenGeld(){
        System.out.println("Je hebt niet genoeg geld meer");
    }

}