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
public class Sauce implements Pasta{

    protected Pasta pasta;

    public Sauce(Pasta pasta) {
        this.pasta = pasta;
    }
    
    @Override
    public String type() {
        return pasta.type();
    }

    @Override
    public float cost() {
        return pasta.cost();
    }
    
}
