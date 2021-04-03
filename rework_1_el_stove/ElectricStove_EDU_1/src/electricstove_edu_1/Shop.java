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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Phenom
 */
public class Shop {
    private  List stoves;
    
    public Shop(){
        stoves = new LinkedList();
        }
    
    
   
   
   public void  addStove(HeaterPlate heater_plate_1, HeaterPlate heater_plate_2, HeaterPlate heater_plate_3, HeaterPlate heater_plate_4, Heater upper_heating_spiral, Heater bottom_heating_spiral, StoveType stove_type, float price, String serial_number, String type_ID) {
        ElectricStove new_stove = new ElectricStove(heater_plate_1, heater_plate_2,  heater_plate_3, heater_plate_4,  upper_heating_spiral,  bottom_heating_spiral,  stove_type,  price,  serial_number,  type_ID);
        stoves.add(new_stove);
    }
   
  public ElectricStove getStove(String serial_number)  {
      for (Iterator i = stoves.iterator(); i.hasNext(); ) {
          ElectricStove stove = (ElectricStove)i.next();
          if (stove.getSerial_number().equals(serial_number)) {
              return stove;
          }
      }
      return null;
  }
  
  public ElectricStove search(ElectricStove searchStove) {
      for (Iterator i = stoves.iterator(); i.hasNext(); ) {
          ElectricStove stove = (ElectricStove)i.next();
          // serial number is not used for search because is very unique for finding wider match
          // same the price
          StoveType stove_type = searchStove.getStove_type();
          if ((stove_type != null) && (!stove_type.equals("")) && (!stove_type.equals(stove.getStove_type()))) {
                    continue;
          }
          
          HeaterPlate heater_plate = searchStove.getHeater_plate_1();  // for further rework, how to find match if one of the heater plates is as in search specified
          if ((heater_plate != null) && (!heater_plate.equals("")) && (!heater_plate.equals(stove.getHeater_plate_1()))) {
                    continue;
          }
          
          
      }
      
      return null;
  }
          
  
  
}
