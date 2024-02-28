public class lec2_accessModifier {
    public static void main(String[] args) {
// Accessmodi|within_class|withinpackage|out_pack_by_subcl|out_pack
// private   yes           no            no                no
// default   yes            yes          no                no
// protected yes            yes          yes               yes
// public yes               yes          yes               yes
    
    student s1=new student();
    // s1.number=56;   cant access outside class
    // can only change but cant access
    s1.setpss(987);
    s1.num=987;//protected can be access outside class
    // System.out.println(s1.number); cant access
    s1.display();
    }
    

    
}
class student{
    private int number;
    protected int num;
     void setpss(int pass){
        number=pass;
    }
    void display(){
        System.out.println(number);
    }


}
// }
