package com.valencia.professor.macon.modules.hw12_extended_poly_assignment;

//TODO:
// find 'position' and capitilize where needs be
// clean code -> correct the constructors to setters

public class HwTwelve {
    public static void main(String[] args) {
//        System.out.println("i call to the LORD, who is worthy of praise");
//        System.out.println("https://www.topendsports.com/world/lists/popular-sport/fans.htm");

        Person[] people = new Person[100]{
            new Person("Hank", "H.", "Aaron", 85),
                    new Person("Barry", "L.", "Bonds", 55),
                    new Person("Jackie", "R.", "Robinson", 53),
                    new Person("Peyton", "A.", "Manning", 43),
                    new Person("Terry", "F.", "Bradshaw", 70),
                    new Person("Colin", "R.", "Kaepernick", 31),
                    new Person("Mario", "J.", "Lemieux", 53),
                    new Person("Wayne", "D.", "Gretzky", 58),
                    new Person("Kendall", "C.", "Schofield", 27),
                    new Person("Phil", "A.", "Mickleson", 49),
                    new Person("Paula", "X.", "Creamer", 32),
                    new Person("Michelle", "S.", "Wie", 29),
                    new Person("Dom", "A.", "Dwyer", 28),
                    new Person("Brian", "T.", "Rowe", 30),
                    new Person("Ronaldo", "A.", "Moreira", 39)
        };


//Testing EQUALS:: java 18 polymorphism 33:42

    }
}


//TODO:
// figure out the array situation
// complete the equals() method for each class
// create a menu style -> last


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