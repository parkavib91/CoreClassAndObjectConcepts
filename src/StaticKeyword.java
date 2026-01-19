    class Student{
        int rollno;
        String name;
        static String Training_Center = " Smart Learning";
        Student(int r,String n){
        
        rollno = r;
        name = n;
    }
    void display(){
        
        System.out.println(rollno + " " + name + " "
                           + Training_Center);
    }
}