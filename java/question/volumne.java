//write a code to calcuate the voume of 3D obj with hep of function cal function ,display function
class test22 {
    double widht,height,lenght,volumne;
    public void vol(){
        widht = 10;
        height = 5;
        lenght = 15.5;
        volumne = widht*height*lenght;
    }
    public void display(){
        System.out.println("volumne od 3D object = " +volumne);
    }
}
public class volumne {
public static void main (String []args)
    {
        test22 ab = new test22();
        ab.vol();
        ab.display();
    }
}
 /*this is output 
  * volumne od 3D object = 775.0
  */