/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Main {
    public static void main(String[] args) {
        BarkingDog bd = new BarkingDog();
       boolean result= bd.shouldWakeUp(true,10);
        System.out.println(result);
    }
}
