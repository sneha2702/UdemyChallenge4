/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay)
    {
        if(hourOfDay<0 || hourOfDay>23)
        {
            return false;
        }
        else if(barking== true)
        {
            if(hourOfDay<8 || hourOfDay >22)
            {
                return true;
            }
        }
        return false;
    }  
}
