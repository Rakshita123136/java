class A implements Runnable{
    public void run(){
        for(int i = 0;i<=5 ;i++){
            System.out.println("i = " +i);
        }
        System.out.println("Exit A");
    }
}
class Thread1 {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        t.start();
    }
}