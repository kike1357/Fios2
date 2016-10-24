package fios2;

/**
 *
 * @author epastorizalorenzo
 */
public class Fios2 extends Thread{
    int nDatos;
    
    public static void main(String[] args) {
        
        new Fios2("Juan").start();
        new Fios2("Manolo").start();
        new Fios2("Ana").start();
        new Fios2("Quique").start();
        
    }
    
     public Fios2 (String str) {
        super(str);    
         
     }
     public void run(){
        for (int i=0; i<5; i++)
         try {    
            System.out.println(i + " " + getName());
            System.out.println(" Termina thread " + getName());
            Thread.sleep(1000);      

    } catch
        (InterruptedException e){
        System.out.println ("Fío interrumpido");
        
        
}
     }
}
  

     
           
     

    

