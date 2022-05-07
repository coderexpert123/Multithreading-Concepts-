/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mt;

/**
 *
 * @author Nishant Singh
 */
public class MT extends Thread {

    /**
     * @param args the command line arguments
     */
    
    //my Function       
    public void run(){

            try{
                
            System.out.println("Current Thred"+Thread.currentThread().getId());
            
                
            }catch(Exception e){
                    
                    System.out.print("Here is some Exception");
                    
            }

            }
    
    // main Function
    
            public static void main(String[] args) {



                int n=8;
                for(int i =0;i<=n;i++){
                    
                    
                    MT object1=new MT();
                    
                    object1.start();
                    
                   // System.out.print(i);
                    
                    
                }


            }

}
