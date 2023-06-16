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
abstract class galaxyA70{
    
}

public class samsung_interface extends galaxyA70 implements MobilePhone{
    public static void main(String[] args){
        samsung_interface galaxyA71=new samsung_interface();
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
    
}
