import java.util.Scanner;
public class App {
    public static void main(String[] args){
        ExecuteProgram();
    }
    private static void ExecuteProgram(){
        PrintDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the choice:");
        int choice = scanner.nextInt();
        switch(choice){
                case 1:
                    AbstractClass(scanner);
                    break;

                case 2:
                    ExecuteSingleton();
                    break;

                case 3:
                    InterfaceCalculation();
                    break;

                case 4:
                    ExecuteEncapsulation();
                    break;

                case 5:
                    Inheritance();
                    break;

                case 6:
                    AbstractionInClass();
                    break;

                case 7:
                    DataHiding();
                    break;

                case 8:
                    Polymorphism();
                    break;

                case 9:
                    OverloadingMethod();
                    break;

                case 10:
                    OverridingMethod();
                    break;

                case 11:
                    SuperKeyword();
                    break;

                case 12:
                    This();
                    break;

                case 13:
                    StaticKeyword();
                    break;

                case 14:
                    AccessModifier();
                    break;
                        
                default:
                    System.out.println("Enter the correct choice");
                    break;
            }
    }

    private static void PrintDetails(){
        System.out.println("1. Abstract Class");
        System.out.println("2. Singleton Class");
        System.out.println("3. Interface Class");
        System.out.println("4. Encapsulation in Class");
        System.out.println("5. Inheritance in Class");
        System.out.println("6. Abstraction In Class");
        System.out.println("7. DataHiding In Class");
        System.out.println("8. Polymorphism In Class");
        System.out.println("9. OverloadingMethod In Class");
        System.out.println("10. OverridingMethod In Class");
        System.out.println("11. Super Keyword");
        System.out.println("12. This Keyword In Class");
        System.out.println("13. Static keyword in class");
        System.out.println("14. AccessModifier");
    }

    private static void AbstractClass(Scanner scanner){
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your Age");
        int age = scanner.nextInt();
        System.out.println("Enter your Salary");
        float salary = scanner.nextFloat();
        AbstractClass obj = new Employee();
        obj.AbstractClassMethod(name, age, salary);
    }

    private static void InterfaceCalculation(){
        TestClass t = new TestClass();
        t.display();
    }

    private static void ExecuteEncapsulation(){
            
        Programmer p = new Programmer();
        p.setName("Encapsulation Class");
        System.out.println("Name=> " + p.getName());
    }
    
    private static void Inheritance(){
        Animal a;
        a = new Dog();
        a.sound();  

        a = new Cat();
        a.sound(); 

        a = new Cow();
        a.sound();  
        
    }

    private static void AbstractionInClass(){
        TV remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();  
    }

    private static void DataHiding(){
        Human ob = new Human();
        ob.No_Of_legs();
        Elephant ob1 = new Elephant();
        ob1.No_Of_legs();
        
    }

    private static void Polymorphism(){
       
     System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.3));
    }

    private static void OverloadingMethod(){
           Product ob = new Product();

        // Calling method to Multiply 2 numbers
        int prod1 = ob.multiply(1, 2);

        // Printing Product of 2 numbers
        System.out.println(
            "Product of the two integer value: " + prod1);

        // Calling method to multiply 3 numbers
        int prod2 = ob.multiply(1, 2, 3);

        // Printing product of 3 numbers
        System.out.println(
            "Product of the three integer value: " + prod2);
        }

private static void OverridingMethod(){
     Parent obj = new Child();
        obj.show();   

}

private static void SuperKeyword(){
        Car small = new Car();
        small.display();
}

private static void This(){
      Number object = new Number(25 , 30);
      object.display();
}  

private static void StaticKeyword(){
        
        Student s1 = new Student(101, "Ravi");
        Student s2 = new Student(102, "Amit");

        s1.display();
        s2.display();
    }  
private static void AccessModifier(){
  Person p = new Person();
        p.setName("Alice");
        System.out.println(p.getName());
}

    private static void ExecuteSingleton(){
        SingletonClass x = SingletonClass.getInstance();

        SingletonClass y = SingletonClass.getInstance();
        x.s = (x.s).toUpperCase();
        System.out.println("String from x: " + x.s + ", y: " + y.s);
        y.s = (y.s).toLowerCase();

        System.out.println("String from x: " + x.s + ", y: " + y.s);
    }
}