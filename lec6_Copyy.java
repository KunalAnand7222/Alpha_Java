public class lec6_Copyy {
    public static void main(String[] args) {
        // copy all property of one object to other object
        Kuni k1=new Kuni(56,"kunu");
        System.out.println(k1.age);
        k1.marks[0]=59;
        Kuni k2=new Kuni(k1);//in copy constructor we are passing object of 1st constructor
        k1.age=96; //if we change any variable of first object there will be no impact on copy constructor after we made copy constructor
        // but in case of array it will imnpact because in array we refer to refernce of array
        System.out.println(k2.age);
        k1.marks[0]=97; //it will effect copy constr after copy cons made because array is referncing object
        System.out.println(k2.marks[0]);

    }
    
}
class Kuni{
     int age;
     String name;
     int marks[];
    Kuni(int ag,String name){
        this.name=name;
        this.age=ag;
        marks=new int[1];
    
        
    }
    Kuni(Kuni k1){
        this.name=k1.name;
        this.age=k1.age; //assigning copy cons value 
        this.marks=k1.marks;

    }

    
}
