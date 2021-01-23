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
 */
public class Heater {
    private int electric_power;
    private final HeaterType heater_type;
    private float price;
    private String serial_ID;

    public Heater(int electric_power, HeaterType heater_type, float price, String serial_ID) {
        this.electric_power = electric_power;
        this.heater_type = heater_type;
        this.price = price;
        this.serial_ID = serial_ID;
    }

    public int getElectric_power() {
        return electric_power;
    }

    public void setElectric_power(int electric_power) {
        this.electric_power = electric_power;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerial_ID() {
        return serial_ID;
    }

    public void setSerial_ID(String serial_ID) {
        this.serial_ID = serial_ID;
    }
    
}
