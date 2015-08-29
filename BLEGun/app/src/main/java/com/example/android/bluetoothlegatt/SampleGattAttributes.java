/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import android.util.Log;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static final String TAG = SampleGattAttributes.class.getSimpleName();
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Device Info Service");
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");

        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Generic Access Info");
        attributes.put("00002a00-0000-1000-8000-00805f9b34fb", "Device Name");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb", "Appearance");
        attributes.put("00002a04-0000-1000-8000-00805f9b34fb", "Peripheral Preferred Connection Parameters");

        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute");
        attributes.put("00002a05-0000-1000-8000-00805f9b34fb", "Service Changed");

        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Hardware Information Service");
        attributes.put("00002a23-0000-1000-8000-00805f9b34fb", "System ID");
        attributes.put("00002a24-0000-1000-8000-00805f9b34fb", "Model Number String");
        attributes.put("00002a25-0000-1000-8000-00805f9b34fb", "Serial Number String");
        attributes.put("00002a26-0000-1000-8000-00805f9b34fb", "Firmware Revision String");
        attributes.put("00002a27-0000-1000-8000-00805f9b34fb", "Hardware Revision String");
        attributes.put("00002a28-0000-1000-8000-00805f9b34fb", "Software Revision String");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("00002a2a-0000-1000-8000-00805f9b34fb", "IEEE 11073-20601 Regulatory Certification Data List");
        attributes.put("00002a50-0000-1000-8000-00805f9b34fb", "PnP ID");

        attributes.put("0000fff1-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("0000fff2-0000-1000-8000-00805f9b34fb", "Manufacturer Name String1");
        attributes.put("0000fff3-0000-1000-8000-00805f9b34fb", "Manufacturer Name String2");
        attributes.put("0000fff4-0000-1000-8000-00805f9b34fb", "Manufacturer Name String3");
        attributes.put("0000fff5-0000-1000-8000-00805f9b34fb", "Manufacturer Name String4");
        attributes.put("0000fff6-0000-1000-8000-00805f9b34fb", "Manufacturer Name String5");
        attributes.put("0000fff7-0000-1000-8000-00805f9b34fb", "Manufacturer Name String6");
        attributes.put("0000fff8-0000-1000-8000-00805f9b34fb", "Manufacturer Name String7");

        // TODO: 8/29/15 This is my guess... for temperature
        /*
          Temperature	org.bluetooth.characteristic.temperature	0x2A6E	Adopted
          Temperature Measurement	org.bluetooth.characteristic.temperature_measurement	0x2A1C	Adopted
          Temperature Type	org.bluetooth.characteristic.temperature_type	0x2A1D	Adopted
          0x272F	Celsius temperature (degree Celsius)	org.bluetooth.unit.thermodynamic_temperature.degree_celsius
          0x27AC	thermodynamic temperature (degree Fahrenheit)	org.bluetooth.unit.thermodynamic_temperature.degree_fahrenheit
        */

        attributes.put("00002a6e-0000-1000-8000-00805f9b34fb", "Temperature");
        attributes.put("00002a1c-0000-1000-8000-00805f9b34fb", "Temperature Measurement");
        attributes.put("00002a1d-0000-1000-8000-00805f9b34fb", "Temperature Type");

    }

    public static String lookup(String uuid, String defaultName) {
        Log.d(TAG, "lookup : uuid received is: "+uuid);
        String name = attributes.get(uuid);

        return name == null ? defaultName : name;
    }
}
