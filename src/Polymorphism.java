    class Person{
        void role(){
            System.out.println("Iam a person.");
        }
    }
class Father extends Person{
    @Override
    void role(){
        System.out.println("Iam a Father.");
    }
}