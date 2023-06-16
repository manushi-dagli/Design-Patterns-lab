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
public class WhiteSauce extends Sauce{
    
    public WhiteSauce(Pasta pasta) {
        super(pasta);
    }
    
     public String type(){
        return ("White Sauce "+pasta.type());
    }
    
    public float cost(){
        return (pasta.cost()+60);
    }
    
}
