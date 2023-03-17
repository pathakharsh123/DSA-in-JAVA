public class OOPS{
    public static  void main(String args[]){
        Student s1 = new Student();
        s1.name = "Harsh";
        s1.roll=  2119;
        s1.password = "abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=  new Student(s1);
        s2.password = "xyz";


        Fish f = new Fish();
        f.eat();
    }
    
}
class Pen{
    // prop+functions
    private String color;
    private int tip;    

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
        this.tip =  tip;
    }
}
class Student{
    String  name;
    int roll;
    String password;
    int marks[];
    // shallow copy construtor
    Student(Student s1){
        marks = new int[3];
        this.name =  s1.name;
        this.roll=  s1.roll;
        this.marks=  s1.marks;
    }
    // deep copy constructor
    Student(Student s1){
        marks= new int[3];
        this.name=  s1.name;
        this.roll= s1.roll;
        for (int i=0;i<marks.length;i++){
            this.marks[i]=  s1.marks[i];
        }

    }

    Student(){
        marks = new int[3];
        System.out.println("constructor is called...");
    }
    Student(String name){
        marks = new int[3];
        this.name=  name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}

// inheritance 
// base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
