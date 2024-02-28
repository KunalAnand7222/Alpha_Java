public class lec1_ops {
    public static void main(String[] args) {
        //objects are entities(animal,pen,clothes) in real world
        // Classes are group of entities(collection of similar things)(blueprint of objects)
        // class contains attributes and function
        // Class name starts with capital letter and method starts with small letter
        // always try make class below the main classs
        People p1=new People();
        p1.setcolour("Blue");
        p1.setheight(56);
        p1.display();
        p1.colour="red";  //can directly assign value to variavle inside class if data is public
        
        p1.height=933;
        p1.display();




    }
    
}
class People{
    String colour;
    int height;
    void setcolour(String colour){
        this.colour=colour;
    }
    void setheight(int height){
        this.height=height;
    }
    void display(){
        System.out.println(colour+" "+height);
    }
}
