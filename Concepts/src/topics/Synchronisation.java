package topics;

public class Synchronisation{  
public static void main(String args[]){  
Sync obj = new Sync();//only one object  
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
} 