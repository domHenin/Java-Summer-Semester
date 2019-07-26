package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

import java.util.Scanner;

public class HwTwelve {
    public static void main(String[] args) {
//        System.out.println("i call to the LORD, who is worthy of praise");
//        System.out.println("https://www.topendsports.com/world/lists/popular-sport/fans.htm");

//ARRAY:
        Person people[] = new Person[100];

//MENU BUILD:
        char option;

        do {
            option=getChoice();

            switch (option) {
                case 'B':
                    people[0]= new BaseballPlayer("Hank", "H.", "Aaron", 85, 8, "Right");
                    aPerson(people[0]);

                    people[1]= new BaseballPlayer("Barry", "L.", "Bonds", 55, 4, "Left");
                    aPerson(people[1]);

                    people[2]= new BaseballPlayer("Jackie", "R.", "Robinson", 53, 147, "Right");
                    aPerson(people[2]);
                    break;

                case 'F':
                    people[3]= new FootballPlayer("Peyton", "A.", "Manning", 43, "Offense");
                    aPerson(people[3]);

                    people[4]= new FootballPlayer("Terry", "F.", "Bradshaw", 43, "Offense");
                    aPerson(people[4]);

                    people[5]= new FootballPlayer("Colin", "R.", "Kaepernick", 31, "Offense");
                    aPerson(people[5]);
                    break;

                case 'H':
                    people[6]= new HockeyPlayer("Mario", "J.", "Lemieux", 53, "Steiner Sports");
                    aPerson(people[6]);

                    people[7]= new HockeyPlayer("Wayne", "D.", "Gretzky", 58, "Titan2020");
                    aPerson(people[7]);

                    people[8]= new HockeyPlayer("Kendall", "C.", "Schofield", 27, "XT901");
                    aPerson(people[8]);
                    break;

                case 'G':
                    people[9]= new GolfPlayer("Phil", "A.", "Mickleson", 49, "KPMG");
                    aPerson(people[9]);

                    people[10]= new GolfPlayer("Paula", "X.", "Creamer", 32, "CDW");
                    aPerson(people[10]);

                    people[11]= new GolfPlayer("Michelle", "S.", "Wie", 29, "KPMG");
                    aPerson(people[11]);

                case 'S':
                    people[12]= new SoccerPlayer("Dom", "A.", "Dwyer", 28, "Forward");
                    aPerson(people[12]);

                    people[13]= new SoccerPlayer("Brian", "T.", "Rowe", 30, "Goal Keeper");
                    aPerson(people[13]);

                    people[14]= new SoccerPlayer("Ronaldo", "A.", "Moreira", 39, "Forward");
                    aPerson(people[14]);
                    break;

                case 'Q':
                    System.out.println("Exiting Program!");
                    System.out.println("Thank you for your time.");
                    break;

                default:
                    break;
            }
        } while (option != 'Q');



//Testing EQUALS:: java 18 polymorphism 33:42

    }

    public static void aPerson(Person person) {

        System.out.println(person.toString());

        if (person instanceof BaseballPlayer) {
            System.out.println(((BaseballPlayer) person).doThis());
        }

        if (person instanceof FootballPlayer) {
            System.out.println(((FootballPlayer) person).doThis());
        }

        if (person instanceof HockeyPlayer) {
            System.out.println(((HockeyPlayer) person).doThis());
        }

        if (person instanceof GolfPlayer) {
            System.out.println(((GolfPlayer) person).doThis());
        }

        if (person instanceof SoccerPlayer) {
            System.out.println(((SoccerPlayer) person).doThis());
        }

        System.out.println("The Objective of the Game: ");
        person.objective();
    }


    public static char getChoice() {
        char result;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("#########################");
        System.out.println("# [B]aseball Players #");
        System.out.println("# [F]ootball Players #");
        System.out.println("# [H]ockey Players\t #");
        System.out.println("# [G]olf Players\t #");
        System.out.println("# [S]occer Players\t #");
        System.out.println("# [Q]uit Program\t #");
        System.out.println("#########################");

        System.out.println("Enter Selection: ");
        result=scanner.nextLine().toUpperCase().charAt(0);

        return result;
    }
}


//TODO:
// complete the equals() method for each class
// clean up toString() method. user BASEBALL as example
// figure out the array situation --> COMPLETE
// create a menu style -> last -> COMPLETE
//create new methods for hockey player and have them extend hockey player


//CODE GRAVEYARD::

//Person person;
//    Athlete athlete = new Athlete("Steph Curry", 31, "Warriors", "Shooting guard");
//
//    person=athlete;
//        System.out.println("Athlete Player Info::");
//        System.out.println("----------------------");
//        System.out.println(person);
//        System.out.println();
//
////BASEBALL:
//        System.out.println("Baseball Player Info::");
//        System.out.println("----------------------");
//    BaseballPlayer hank = new BaseballPlayer("Hank Aaron", 85, 2, "Right");
//    person=hank;
//    aPerson(hank);
//        System.out.println();
//
//    BaseballPlayer barry = new BaseballPlayer("Barry Bonds", 54, 4, "Left");
//    person=barry;
//    aPerson(barry);
//        System.out.println();
//
////FOOTBALL:
//        System.out.println("Football Player Info::");
//        System.out.println("----------------------");
//    FootballPlayer terry = new FootballPlayer("Terry Crews", 50, "Defense");
//    person=terry;
//    aPerson(terry);
//        System.out.println();
//
//    FootballPlayer peyton = new FootballPlayer("Peyton Manning", 43, "Offense");
//    person=peyton;
//    aPerson(peyton);
//        System.out.println();
//
////HOCKEY:
//        System.out.println("Hockey Player Info::");
//        System.out.println("----------------------");
//    HockeyPlayer mario = new HockeyPlayer("Mario Lemieux", 53, "Steiner Sports");
//    person=mario;
//    aPerson(mario);
//        System.out.println();
//
//    HockeyPlayer wayne = new HockeyPlayer("Wayne Gretzky", 58, "Titan 2020");
//    person=wayne;
//    aPerson(wayne);
//        System.out.println();
//
////Golfer:
//        System.out.println("Golf Player Info::");
//        System.out.println("----------------------");
//    GolfPlayer paula  = new GolfPlayer("Paula Creamer", 32, "CDW");
//    person=paula;
//    aPerson(paula);
//        System.out.println();
//
//    GolfPlayer phil = new GolfPlayer("Phil Mickelson", 49, "KPMG");
//    person=phil;
//    aPerson(phil);
//        System.out.println();
//
////Soccer:
//        System.out.println("Soccer Player Info::");
//        System.out.println("----------------------");
//    SoccerPlayer danilo = new SoccerPlayer("Danilo da Silva", 28, "Defender");
//    person=danilo;
//    aPerson(danilo);
//        System.out.println();
//
//    SoccerPlayer carlos = new SoccerPlayer("Roberto Carlos", 46, "Defender");
//    person=carlos;
//    aPerson(carlos);
//        System.out.println();
//}

//    public static void aPerson(Person person) {
//
//        System.out.println(person.toString());
//
//        if (person instanceof BaseballPlayer) {
//            System.out.println(((BaseballPlayer) person).doThis());
//        }
//
//        if (person instanceof FootballPlayer) {
//            System.out.println(((FootballPlayer) person).doThis());
//        }
//
//        if (person instanceof HockeyPlayer) {
//            System.out.println(((HockeyPlayer) person).doThis());
//        }
//
//        if (person instanceof GolfPlayer) {
//            System.out.println(((GolfPlayer) person).doThis());
//        }
//
//        if (person instanceof SoccerPlayer) {
//            System.out.println(((SoccerPlayer) person).doThis());
//        }
//    }