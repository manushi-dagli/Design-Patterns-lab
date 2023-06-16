/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User1
 */
interface MobilePhone{
    //void speaker();
    void chargingport();
    void screen();
    void battery();
}

/**
 *
 * @author User1
 */
abstract class samsung_galaxySeries{
    public abstract void GPS();
    public abstract void bluetooth();
    public void name(){
        System.out.println("This is a Samsung Galaxy Phone");
    }
}

class sim_card{
    String simCardCompany;
    void setSimCompany(String cardName){
        simCardCompany=cardName;
    }
    String getSimCompany(){
        return simCardCompany;
    }
}

public class samsung_Aseries extends samsung_galaxySeries implements MobilePhone{
    public static void main(String[] args){
        MobilePhone galaxyA71=new samsung_Aseries();
        galaxyA71.chargingport();
        galaxyA71.screen();
        galaxyA71.battery();
        
        
    }
    
    @Override
    public void battery() {
        System.out.println("Samsung phone have a battery");
    }

    @Override
    public void chargingport() {
        System.out.println("Samsung phone have a C-type charging port");
    }

    @Override
    public void screen() {
        System.out.println("Samsung phone has a 6-inch amoled display screen");
    }

    @Override
    public void GPS() {
        System.out.println("Samsung phone has a GPS system");
    }

    @Override
    public void bluetooth() {
        System.out.println("Samsung phone provides bluetooth");
    }

    
   
    
}
