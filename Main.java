class student{
    String name;
    int age;

    void study() {
        System.out.println(name + "is studying");
    }

    void displaydetails() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}
public class Main{
    public static void main(String[] args){
        student s1=new student();
        student s2=new student();
        s1.name="kiran";
        s1.age=20;
        s2.name="akash";
        s2.age=24;
        s1.displaydetails();
        s1.study();
        s2.displaydetails();
        s2.study();
    }
}
