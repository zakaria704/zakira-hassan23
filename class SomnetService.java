import java.util.Scanner;


//zakriye hasan ali c6240258
class SomnetService {

    static Scanner input = new Scanner(System.in);
    static double balance = 1000.0;

    public static void main(String[] args) {

        System.out.print("Dial *100#: ");
        String code = input.nextLine();
        if (code.equals("*100#")) {
            showMenu();
        } else {
            System.out.println("USSD Code Khaldan!");
        }
    }

    public static void showMenu() {

        int choice;

        do {
            System.out.println("\n====== SOMNET ======");
            System.out.println("1. Itus Haragga");
            System.out.println("2. Maaraynta");
            System.out.println("3. PIN-PUK");
            System.out.println("4. Lacag Qaldantay");
            System.out.println("5. Adeegyada Somnet");
            System.out.println("6. VIP Numbers");
            System.out.println("7. Wadamada Bulaal");
            System.out.println("8. Agent");
            System.out.println("9. Ka bax");

            System.out.print("Dooro: ");
            choice = input.nextInt();

            processChoice(choice);

        } while (choice != 9);
    }

    public static void processChoice(int choice) {


        switch (choice) {

            case 1:
                System.out.println("\n--- Itus Haragga ---");
                System.out.println("Haraagaagu waa: $" + balance);


                break;

            case 2:
                int manageChoice;

                System.out.println("\nMaaraynta->");
                System.out.println("1. Internet Configuration");
                System.out.println("2. Isdiiwaangelin");
                System.out.println("3. Bedel Luqada");
                System.out.println("4. Ka bax");

                System.out.print("Dooro: ");
                manageChoice = input.nextInt();
                input.nextLine();

                switch (manageChoice) {

                    case 1:
                        System.out.println("\nInternet Configuration waa la furay.");
                        break;

                    case 2:
                        System.out.print("soo gali Magacaaga oo sadaxan: ");
                        String name = input.nextLine();

                        if (name.length ()>=10) {
                            System.out.println(name + " Waalagu diwaan galiyay ");
                        } else {
                            System.out.println("laguma diwaan galin fadlan magac 10 xaraf kabadi.");
                        }
                        break;



                    case 3:
                        System.out.println("\nBedel Luqada->");
                        System.out.println("1. Somali");
                        System.out.println("2. English");

                        System.out.print("Dooro: ");
                        int lang = input.nextInt();

                        if (lang == 1) {
                            System.out.println("Luqadda waxaa loo beddelay Somali.");
                        } else if (lang == 2) {
                            System.out.println("Language has been changed to English.");
                        } else {
                            System.out.println("Doorasho khaldan.");
                        }
                        break;

                    case 4:
                        System.out.println("Waad ka baxday Maaraynta.");
                        break;

                    default:
                        System.out.println("Doorasho khaldan.");
                }
            case 3:
                System.out.println("\n------ PIN-PUK ------");

                System.out.print("Gali Telephone Number-ka: ");
                String phone = input.next();

                if (phone.length() == 9 && phone.matches("[0-9]+")) {

                    int pin = (int)(Math.random() * 9000) + 1000;     // 4-digit PIN
                    int puk = (int)(Math.random() * 90000000) + 10000000; // 8-digit PUK

                    System.out.println("\nTelephone Number: " + phone);
                    System.out.println("PIN: " + pin);
                    System.out.println("PUK: " + puk);

                } else {
                    System.out.println("Telephone Number-ka waa khalad!");
                }



            case 4:
                System.out.println("\n--- Lacag Qaldantay ---");
                System.out.print("Gali Number-ka Qaldamay: ");
                String wrong = input.next();
                System.out.println("Waxaad gelisay: " + wrong);
                break;

            case 5:

                int adeeg;

                do {

                    System.out.println("\n===== ADEEGYADA SOMNET =====");
                    System.out.println("1. Isticmaalka Adeegga GSM-ka");
                    System.out.println("2. Xirmooyinka Somnet");
                    System.out.println("3. Ka bax");
                    System.out.print("Dooro: ");

                    adeeg = input.nextInt();

                    switch (adeeg) {

                        case 1:

                            int gsm;

                            do {

                                System.out.println("\n===== ISTICMAALKA ADEEGGA GSM-KA =====");
                                System.out.println("1. Code-yada SIM-ka");
                                System.out.println("2. Jeeb");
                                System.out.println("3. EVCPlus");
                                System.out.println("4. Merchant");
                                System.out.println("5. Reseller");
                                System.out.println("6. Code-yada Adeegyada");
                                System.out.println("7. Ka bax");
                                System.out.print("Dooro: ");

                                gsm = input.nextInt();

                                switch (gsm) {

                                    case 1:
                                        System.out.println("Code-yada SIM-ka");
                                        break;

                                    case 2:
                                        System.out.println("Jeeb");
                                        break;

                                    case 3:
                                        System.out.println("EVCPlus");
                                        break;

                                    case 4:
                                        System.out.println("Merchant");
                                        break;

                                    case 5:
                                        System.out.println("Reseller");
                                        break;

                                    case 6:
                                        System.out.println("Code-yada Adeegyada");
                                        break;

                                    case 7:
                                        System.out.println("Waxaad ku noqotay Adeegyada Somnet.");
                                        break;

                                    default:
                                        System.out.println("Doorasho khaldan.");
                                }

                            } while (gsm != 7);

                            break;

                        case 2:

                            int xirmo;

                            do {

                                System.out.println("\n===== XIRMOOYINKA SOMNET =====");
                                System.out.println("1. Xirmooyinka Qanciye");
                                System.out.println("2. Xirmooyinka Maqsuud");
                                System.out.println("3. Xirmooyinka Mifi Plus");
                                System.out.println("4. Xirmooyinka Bulaal");
                                System.out.println("5. Ka bax");
                                System.out.print("Dooro: ");

                                xirmo = input.nextInt();

                                switch (xirmo) {

                                    case 1:
                                        System.out.println("Xirmooyinka Qanciye");
                                        break;

                                    case 2:
                                        System.out.println("Xirmooyinka Maqsuud");
                                        break;

                                    case 3:
                                        System.out.println("Xirmooyinka Mifi Plus");
                                        break;

                                    case 4:
                                        System.out.println("Xirmooyinka Bulaal");
                                        break;

                                    case 5:
                                        System.out.println("Waxaad ku noqotay Adeegyada Somnet.");
                                        break;

                                    default:
                                        System.out.println("Doorasho khaldan.");
                                }

                            } while (xirmo != 5);

                            break;

                        case 3:
                            System.out.println("Waxaad ku noqotay Menu-ga weyn.");
                            break;

                        default:
                            System.out.println("Doorasho khaldan.");
                    }

                } while (adeeg != 3);

                break;
            case 6:
                int vip;

                do {
                    System.out.println("\n--- VIP Numbers ---");
                    System.out.println("1. Golden");
                    System.out.println("2. Silver");
                    System.out.println("3. Ka bax");

                    System.out.print("Dooro: ");
                    vip = input.nextInt();

                    switch (vip) {

                        case 1:
                            int golden;
                            do {
                                System.out.println("\nGolden VIP Numbers->");
                                System.out.println("1- 684000077   $49.50");
                                System.out.println("2- 684111333   $49.50");
                                System.out.println("3- 684111555   $49.50");
                                System.out.println("4- 684111666   $49.50");
                                System.out.println("5- 684111777   $49.50");
                                System.out.println("99. Next");
                                System.out.println("0. Ka bax");

                                System.out.print("Dooro: ");
                                golden = input.nextInt();

                                switch (golden) {

                                    case 1:
                                        System.out.println("Waxaad dooratay: 684000077 - $49.50");
                                        break;

                                    case 2:
                                        System.out.println("Waxaad dooratay: 684111333 - $49.50");
                                        break;

                                    case 3:
                                        System.out.println("Waxaad dooratay: 684111555 - $49.50");
                                        break;

                                    case 4:
                                        System.out.println("Waxaad dooratay: 684111666 - $49.50");
                                        break;

                                    case 5:
                                        System.out.println("Waxaad dooratay: 684111777 - $49.50");
                                        break;

                                    case 99:
                                        System.out.println("Page-ka xiga wali lama darin.");
                                        break;

                                    case 0:
                                        System.out.println("Dib ugu laabtay VIP Menu.");
                                        break;

                                    default:
                                        System.out.println("Doorasho Khaldan.");
                                }

                            } while (golden != 0);
                            break;

                        case 2:
                            int silver;
                            do {
                                System.out.println("\nSilver VIP Numbers->");
                                System.out.println("1- 686001030   $19.50");
                                System.out.println("2- 686001040   $19.50");
                                System.out.println("3- 686001060   $19.50");
                                System.out.println("4- 686001070   $19.50");
                                System.out.println("5- 686001090   $19.50");
                                System.out.println("99. Next");
                                System.out.println("0. Ka bax");

                                System.out.print("Dooro: ");
                                silver = input.nextInt();

                                switch (silver) {

                                    case 1:
                                        System.out.println("Waxaad dooratay: 686001030 - $19.50");
                                        break;

                                    case 2:
                                        System.out.println("Waxaad dooratay: 686001040 - $19.50");
                                        break;

                                    case 3:
                                        System.out.println("Waxaad dooratay: 686001060 - $19.50");
                                        break;

                                    case 4:
                                        System.out.println("Waxaad dooratay: 686001070 - $19.50");
                                        break;

                                    case 5:
                                        System.out.println("Waxaad dooratay: 686001090 - $19.50");
                                        break;

                                    case 99:
                                        System.out.println("Page-ka xiga wali lama darin.");
                                        break;

                                    case 0:
                                        System.out.println("Dib ugu laabtay VIP Menu.");
                                        break;

                                    default:
                                        System.out.println("Doorasho Khaldan.");
                                }

                            } while (silver != 0);
                            break;

                        case 3:
                            System.out.println("Waxaad ku noqotay Menu-ga weyn.");
                            break;

                        default:
                            System.out.println("Doorasho Khaldan.");
                    }

                } while (vip != 3);
                break;

            case 7:

                int random = (int)(Math.random() * 11); // Random 0 ilaa 10

                switch (random) {
                    case 0:
                        System.out.println("USA");
                        break;
                    case 1:
                        System.out.println("Turkey");
                        break;
                    case 2:
                        System.out.println("Kenya");
                        break;
                    case 3:
                        System.out.println("Ethiopia");
                        break;
                    case 4:
                        System.out.println("UAE");
                        break;
                    case 5:
                        System.out.println("Qatar");
                        break;
                    case 6:
                        System.out.println("Saudi Arabia");
                        break;
                    case 7:
                        System.out.println("Uganda");
                        break;
                    case 8:
                        System.out.println("Sudan");
                        break;
                    case 9:
                        System.out.println("Egypt");
                        break;
                    case 10:
                        System.out.println("Djibouti");
                        break;
                }

                break;
            case 8:
                System.out.println("\nAgent->");
                System.out.print("Gali Number-ka: ");
                String agentNumber = input.next();

                System.out.println("\n1. Xaqiiji");
                System.out.println("2. Ka noqo");
                System.out.print("Dooro: ");
                int confirm = input.nextInt();

                if (confirm == 1) {
                    System.out.println("Waxaad dirtay: " + agentNumber);
                } else {
                    System.out.println("Hawlgalka waa la joojiyay.");
                }
                break;

            case 9:
                System.out.println("\n Waku mahad san tahay isticmalka adega Somnet.");
                break;

            default:
                System.out.println("Doorasho Khaldan!");
        }
    }
}
