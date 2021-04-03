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
public class ElectricStove {
    private HeaterPlate heater_plate_1;
    private HeaterPlate heater_plate_2;
    private HeaterPlate heater_plate_3;
    private HeaterPlate heater_plate_4;
    private Heater upper_heating_spiral;
    private Heater bottom_heating_spiral;
    private StoveType stove_type;
    private float price;
    private String serial_number;
    private String type_ID;

    public ElectricStove(HeaterPlate heater_plate_1, HeaterPlate heater_plate_2, HeaterPlate heater_plate_3, HeaterPlate heater_plate_4, Heater upper_heating_spiral, Heater bottom_heating_spiral, StoveType stove_type, float price, String serial_number, String type_ID) {
        this.heater_plate_1 = heater_plate_1;
        this.heater_plate_2 = heater_plate_2;
        this.heater_plate_3 = heater_plate_3;
        this.heater_plate_4 = heater_plate_4;
        this.upper_heating_spiral = upper_heating_spiral;
        this.bottom_heating_spiral = bottom_heating_spiral;
        this.stove_type = stove_type;
        this.price = price;
        this.serial_number = serial_number;
        this.type_ID = type_ID;
    }

    public HeaterPlate getHeater_plate_1() {
        return heater_plate_1;
    }

    public void setHeater_plate_1(HeaterPlate heater_plate_1) {
        this.heater_plate_1 = heater_plate_1;
    }

    public HeaterPlate getHeater_plate_2() {
        return heater_plate_2;
    }

    public void setHeater_plate_2(HeaterPlate heater_plate_2) {
        this.heater_plate_2 = heater_plate_2;
    }

    public HeaterPlate getHeater_plate_3() {
        return heater_plate_3;
    }

    public void setHeater_plate_3(HeaterPlate heater_plate_3) {
        this.heater_plate_3 = heater_plate_3;
    }

    public HeaterPlate getHeater_plate_4() {
        return heater_plate_4;
    }

    public void setHeater_plate_4(HeaterPlate heater_plate_4) {
        this.heater_plate_4 = heater_plate_4;
    }

    public Heater getUpper_heating_spiral() {
        return upper_heating_spiral;
    }

    public void setUpper_heating_spiral(Heater upper_heating_spiral) {
        this.upper_heating_spiral = upper_heating_spiral;
    }

    public Heater getBottom_heating_spiral() {
        return bottom_heating_spiral;
    }

    public void setBottom_heating_spiral(Heater bottom_heating_spiral) {
        this.bottom_heating_spiral = bottom_heating_spiral;
    }

    public StoveType getStove_type() {
        return stove_type;
    }

    public void setStove_type(StoveType stove_type) {
        this.stove_type = stove_type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }
    
    
    
    
}
