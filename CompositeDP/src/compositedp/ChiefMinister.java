/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedp;

import java.util.ArrayList;

/**
 *
 * @author User1
 */
public class ChiefMinister {
    String name;
    String designation;
    ArrayList<ChiefMinister> Ministers;

    public ChiefMinister(String name, String designation) {
        this.name = name;
        this.designation = designation;
        Ministers=new ArrayList<>();
    }
    
    public void add(ChiefMinister e){
        Ministers.add(e);
    }
    
    public void remove(ChiefMinister e){
        Ministers.remove(e);
    }
    
    public ArrayList<ChiefMinister> getEmployees(){
        return Ministers;
    }
    
    public String toString(){
        return ("Employee: [Name: "+name+" Designation: "+designation+" ]");
    }
    
}
