/* Copyright 2016 Nsys #HackTheHouse - Tomas Hrdlicka <tomas@hrdlicka.co.uk>. All rights reserved.
 */

package org.nsys.iot.hackhouse.adapter.virtualsensors.sensor;

import org.nsys.core.NeuralBag;
import org.nsys.iot.hackhouse.core.adapter.SensorAdapter;
import org.nsys.iot.hackhouse.core.model.Device;

/**
 * Temperature and Humidity Sensor Adapter
 *
 * @author Tomas Hrdlicka <tomas@hrdlicka.co.uk>
 * @see <a href="http://nsys.org">Nsys</a>
 */
public class TemperatureHumiditySensorAdapter implements SensorAdapter {

	@Override
	public String process(final Device device, final NeuralBag bag) {
		String json = "{\"temperature\": 20.35, \"humidity\": 50.40}";
		return json;
	}
}