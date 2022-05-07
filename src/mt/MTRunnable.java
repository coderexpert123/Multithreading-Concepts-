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
public class MTRunnable implements Runnable{
    
    
    //myFunction
    public void run(){
        
        
        try{
            
            System.out.println("Thred running"+Thread.currentThread().getId());
            
            
        }catch(Exception e){
            System.out.println("Something went wrong");
            
        }
        
    }
    
    //main method
    public static void main(String [] args){
        
        
        int n=8;
        for(int i=0;i<n;i++){
            
            Thread ob=new Thread(new MTRunnable());
            ob.start();
            
            
        }
    }
    
}
