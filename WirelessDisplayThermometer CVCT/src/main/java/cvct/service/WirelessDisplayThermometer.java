package cvct.service;

import lfv.service.TemperatureConverter;
import sfv.service.TemperatureSensor;

/**
 * Created by MehdiTAZI on 13/11/2016.
 */
public interface WirelessDisplayThermometer {
    void displayTemperature(final double celsius);
}
