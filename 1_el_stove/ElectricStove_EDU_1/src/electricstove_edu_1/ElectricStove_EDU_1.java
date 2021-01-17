/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricstove_edu_1;

/**
 *
 * @author cdesigner.eu
 */
public class ElectricStove_EDU_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is testing code for our educational application
        HeaterPlate testPlate = new HeaterPlate(1200, 1800, 23.5f,"mora" );
        System.out.println("Power of the selected plate is: " + testPlate.getElectric_power() + "W");
    }
    
}
