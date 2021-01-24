/*
 * Copyright (C) 2021 cdesigner.eu for EDU
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package electricstove_edu_1;

/**
 *
 * @author Phenom
 * This class initialize data for further work. real application read data from file or connect to a database.
 */
public class Initialize { // not used because initialisation method has been added into a file containing main method - please take a lok in ElectricStove_EDU_1.java

    public Initialize() {
  
        //  this function / constructor populate example objects for further work
        HeaterPlate mora_1200_a1 = new HeaterPlate(1200, 180, 17.25f, "MO123"); // 1200W example heater plate
        HeaterPlate mora_1500_a1 = new HeaterPlate(1500, 180, 17.25f, "MO123"); // 1500W example heater plate
         
         
        Heater mora_850_up_a1 = new Heater(850, HeaterType.ETA123, 17.50f, "ETA123212112");
        Heater mora_850_bottom_a1 = new Heater(1250, HeaterType.ETA245, 17.50f, "ETA123212112");
        
        ElectricStove mora_E550 = new ElectricStove(mora_1200_a1, mora_1200_a1, mora_1200_a1, mora_1500_a1, mora_850_up_a1, mora_850_bottom_a1, StoveType.electric_cooktop, 225f, "SN10007E25", "Mora E550");
        
        
        
    }
    
    
    
}
