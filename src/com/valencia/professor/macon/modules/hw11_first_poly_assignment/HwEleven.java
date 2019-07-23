package com.valencia.professor.macon.modules.hw11_first_poly_assignment;
//https://www.w3schools.com/java/java_polymorphism.asp

public class HwEleven {
    public static void main(String[] args) {
//        System.out.println("thank you for the strength i need oh' LORD.");

        Person person;
        Athlete athlete = new Athlete("Steph Curry", 31, "Warriors", "Shooting guard");

        System.out.println("Athlete Player Info::");
        System.out.println("----------------------");
        person=athlete;
        System.out.println(person);
        System.out.println();

//BASEBALL:
        System.out.println("Baseball Player Info::");
        System.out.println("----------------------");
        BaseballPlayer hank = new BaseballPlayer("Hank Aaron", 85, 2, "Right");
        person=hank;
        aPerson(hank);
        System.out.println();

        BaseballPlayer barry = new BaseballPlayer("Barry Bonds", 54, 4, "Left");
        person=barry;
        aPerson(barry);
        System.out.println();

//FOOTBALL:
        System.out.println("Football Player Info::");
        System.out.println("----------------------");
        FootballPlayer terry = new FootballPlayer("Terry Crews", 50, "Defense");
        person=terry;
        aPerson(terry);
        System.out.println();

        FootballPlayer peyton = new FootballPlayer("Peyton Manning", 43, "Offense");
        person=peyton;
        aPerson(peyton);
        System.out.println();

//HOCKEY:
        System.out.println("Hockey Player Info::");
        System.out.println("----------------------");
        HockeyPlayer mario = new HockeyPlayer("Mario Lemieux", 53, "Steiner Sports");
        person=mario;
        aPerson(mario);
        System.out.println();

        HockeyPlayer wayne = new HockeyPlayer("Wayne Gretzky", 58, "Titan 2020");
        person=wayne;
        aPerson(wayne);
        System.out.println();

//Golfer:
        System.out.println("Golf Player Info::");
        System.out.println("----------------------");
        GolfPlayer paula  = new GolfPlayer("Paula Creamer", 32, "CDW");
        person=paula;
        aPerson(paula);
        System.out.println();

        GolfPlayer phil = new GolfPlayer("Phil Mickelson", 49, "KPMG");
        person=phil;
        aPerson(phil);
        System.out.println();

//Soccer:
        System.out.println("Soccer Player Info::");
        System.out.println("----------------------");
        SoccerPlayer danilo = new SoccerPlayer("Danilo da Silva", 28, "Defender");
        person=danilo;
        aPerson(danilo);
        System.out.println();

        SoccerPlayer carlos = new SoccerPlayer("Roberto Carlos", 46, "Defender");
        person=carlos;
        aPerson(carlos);
        System.out.println();
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
    }

}




//TODO:
//  UPDATE:: printing twice wen calling method and wont print the 'doThis()' unless called  a certain way
// Program Specifications:
// Design the following program:
//      A person has a name, and age.
//      An athlete is a person.
//      An athlete has a team and position.
// ..
//      A baseball player is an athlete and a person.
//      A baseball player has a battingPosition.
// ..
//      Baseball players either bat lefthanded, righthanded or both.
// ..
//      A football player is an athlete and a person.
//      A football player has a specialty.
//      A football player's speciality is either Offense, Defense, or Special Teams.
// ..
//      A hockey player is an athlete and a person.
//      A hockey player has a stickBrand.
// ..
//      A golfer is an athlete and a person.
//      A golfer has a mainSponser.
// ..
//      A soccer player is an athlete and a person.
//      A soccer player has a fieldPosition - goalKeeper, defender, midFielder, or forward
// ..
//      All sport type objects have a method named doThis();
// ..
//      BaseballPlayer -> doThis() displays I hit something.
// ..
//      FootballPlayer -> doThis() displays I tackle something.
// ..
//      HockeyPlayer -> doThis() displays I sit in a penalty box.
// ..
//      Golfer -> doThis() displays I putt it in the hole.
// ..
//      SoccerPlayer -> doThis() displays I kick the ball
// ..
//      ... in general, all sports have a doThis() method that displays something.
// ..
//      Main()
//      Create the classes Person, Athlete, BaseballPlayer
//      Create the classes FootballPlayer, HockeyPlayer, Golfer, SoccerPlayer
//      Create the doThis() method in each class
// ..
// In main create the follow reference variables:
//      BaseballPlayer Hank (create this reference variable)
//      FootballPlayer Terry (create this reference variable)
//      HockeyPlayer Mario (create this reference variable)
//      Golfer Paula (create this reference variable)
//      SoccerPlayer Danilo (create this reference variable)
//      BaseballPlayer Barry (create this reference variable)
//      FootballPlayer Peyton (create this reference variable)
//      HockeyPlayer Wayne (create this reference variable)
//      Golfer Phil (create this reference variable)
//      SoccerPlayer Carlos (create this reference variable)
// ..
//      And then...
// ..
//      Call each sport's doThis method (one at a time) passing each player.
//      Call the toString methods for each player object.
//      You are to turn in a UML, and CODE.