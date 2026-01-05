        abstract class Creature{
        abstract void No_Of_legs();
    }
class Elephant extends Creature{
    void No_Of_legs(){
        System.out.println("It has Four legs");
    }
}
class Human extends Creature{
    public void No_Of_legs(){
        System.out.println("It has two legs");
    }
}    