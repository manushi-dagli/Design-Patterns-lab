// package exp1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User1
 */
class SimCard{
    String simCardCompany;
    void setSimCompany(String cardName){
        simCardCompany=cardName;
    }
    String getSimCompany(){
        return simCardCompany;
    }
}

abstract class MyOldPhone{
    public abstract void MyPhotos();
    public abstract void MyDocs();
}

interface MobilePhone{
    public SimCard simCard=new SimCard();
    void chargingport();
    void screen();
    void battery();
}

public class MyPhone extends MyOldPhone implements MobilePhone{
    public static void main(String[] args){
        
        MyPhone mySamsungPhone=new MyPhone();
		mySamsungPhone.simCard.setSimCompany("Jio");
		System.out.println("My Samsung phone have "+mySamsungPhone.simCard.getSimCompany()+" sim card");
        mySamsungPhone.battery();
        mySamsungPhone.chargingport();
        mySamsungPhone.screen();
		mySamsungPhone.MyDocs();
		mySamsungPhone.MyPhotos();
    }

    @Override
    public void chargingport() {
       System.out.println("My Samsung phone have c-type charging port");
    }

    @Override
    public void screen() {
        System.out.println("My Samsung phone have 6-inch amoled display screen");
    }

    @Override
    public void battery() {
        System.out.println("My Samsung phone have 6000mAh battery");
    }

    @Override
    public void MyPhotos() {
        System.out.println("My Samsung phone have my Old phone's photos");
    }

    @Override
    public void MyDocs() {
        System.out.println("My Samsung phone have my Old phone's docs ");
    }
}
