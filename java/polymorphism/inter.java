package polymorphism;
//demonstrating the concept of  interface ,ploymorphism and method impentation
interface area{
    final static float pi= 3.14f;
    float compute (float x , float y);
}
class rectangle implements area {
    public float compute (float x,float y){
        return (x*y);
    }
}
class circle implements area {
    public float compute(float x , float y){
        return(pi * x * x);
    }
}
public class inter {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        circle cir = new circle();
        System.out.println("area of rectangle = " +rect.compute(10 ,20));
        area AREA ;
        AREA = rect;
        System.out.println("area of the cir");
    }
}
