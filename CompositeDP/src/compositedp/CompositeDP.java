/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedp;

/**
 *
 * @author User1
 */
public class CompositeDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChiefMinister cm=new ChiefMinister("Bhupendra Patel","ChiefMinister");
        ChiefMinister minister1=new ChiefMinister("Rushikesh Patel","Minister of Education");
        ChiefMinister minister2=new ChiefMinister("Harsh Sanghvi","Home Minister");
        ChiefMinister officer1=new ChiefMinister("Rohit Chaudhary","DEO");
        ChiefMinister officer2=new ChiefMinister("SJ Haider","Eductional Advisor");
        ChiefMinister officer3=new ChiefMinister("Gen. Manoj Pande","Head of Army");
        ChiefMinister officer4=new ChiefMinister("Ajit kumar Doval","Defense Advisor");
        cm.add(minister1);
        cm.add(minister2);
        minister1.add(officer1);
        minister1.add(officer2);
        minister2.add(officer3);
        minister2.add(officer4);
       
        System.out.println(cm);
        System.out.println(cm.getEmployees());
        
        System.out.println(minister1);
        System.out.println(minister1.getEmployees());
        
        System.out.println(minister2);
        System.out.println(minister2.getEmployees());
    }
    
}
