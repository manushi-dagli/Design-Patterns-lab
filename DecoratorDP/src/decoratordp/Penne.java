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
public class Penne implements Pasta{

    @Override
    public String type() {
        return ("Penne Pasta");
    }

    @Override
    public float cost() {
        return 50;
    }
    
}
