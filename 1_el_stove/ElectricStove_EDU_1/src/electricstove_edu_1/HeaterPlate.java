/*
 * Copyright (C) 2021 Phenom
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
 */
public class HeaterPlate {

    private int electric_power;
    private float diameter;
    private float price;
    private String serial_ID;
    
    public HeaterPlate(int electric_power, float diameter, float price, String serial_ID) {
        this.electric_power = electric_power;
        this.diameter = diameter;
        this.price = price;
        this.serial_ID = serial_ID;
    }

    public int getElectric_power() {
        return electric_power;
    }

    public float getDiameter() {
        return diameter;
    }

    public float getPrice() {
        return price;
    }

    public String getSerial_ID() {
        return serial_ID;
    }

    public void setElectric_power(int electric_power) {
        this.electric_power = electric_power;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerial_ID(String serial_ID) {
        this.serial_ID = serial_ID;
    }
    
    
 
    
}
