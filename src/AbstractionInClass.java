    abstract class TV{
        abstract void turnOn();
        abstract void turnOff();
    }
    class TVRemote extends TV{
        @Override
        void turnOn(){
          System.out.println("Tv is turned ON." );
        }
        @Override
        void turnOff(){
            System.out.println("Tv is turned OFF.");
        }
    }