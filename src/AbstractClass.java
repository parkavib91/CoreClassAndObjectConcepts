abstract class AbstractClass {
    abstract void AbstractClassMethod(String name, int age, float salary);
}
// Abstraction performed using extends
    class Employee extends AbstractClass {
    void AbstractClassMethod(String name, int age, float salary) {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
    }
}