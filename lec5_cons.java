public class lec5_cons{
    public static void main(String[] args) {
        // constructor : auto called at the time of object creation
        // have same name as class or structure
        // dont have return type
        // called only once at time of object creation
        //memory allocation happens when constructor is called
        Studen s1=new Studen("kuni");
        System.out.println(s1.name); //cant directly acces variable if we declare var inside subclass
        // Types of constructor:
        // Default :Non parametrized
        // parametrized 
        // copy constructor
        // default cant access outside class or in sub class
        // if u create a obj of default constructor and u havent made a default constructor it will throw an error ...u k java by default create a constructor but if u do like this it throw error
        // Studen s2=new Studen(); throw error
        // same constructor name but different argumnt is called as constructor overloading
        // Constructor overloading is an example of polymorphism
        
        
        
    }
    
}
class Studen{
    public String name;
    int age;
    Studen(String name){
        System.out.println("COnstructor called!.....");
        this.name=name;
        // this.age=age;
    }
    
}
