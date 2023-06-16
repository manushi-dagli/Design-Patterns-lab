/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratordp;

/**
 *
 * @author User1
 */
public class DecoratorDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Price of "+new RedSauce(new Fusilli()).type()+" is: "+new RedSauce(new Fusilli()).cost());
        System.out.println("Price of "+new WhiteSauce(new Fusilli()).type()+" is: "+new WhiteSauce(new Fusilli()).cost());
        System.out.println("Price of "+new RedSauce(new Penne()).type()+" is: "+new RedSauce(new Penne()).cost());
        System.out.println("Price of "+new WhiteSauce(new Penne()).type()+" is: "+new WhiteSauce(new Penne()).cost());
    }
    
}
