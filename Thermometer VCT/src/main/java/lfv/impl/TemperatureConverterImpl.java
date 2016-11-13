package lfv.impl;

import lfv.service.TemperatureConverter;
import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 06/11/2016.
 *
 * This java class is an implementation of the Logical Function Virtualization (LFV) component of the IoT virtualization approach,
 * which allows the virtualization of the thermometer connected device application logics.
 */
@Component
@Provides
public class TemperatureConverterImpl implements TemperatureConverter {

    private static final double TO_F_FACTOR = (9.0/5.0);
    private static final double TO_C_FACTOR = (5.0/9.0);
    private static final int CONST_OPR = 32;

    public double celsiusToFahrenheit(final double celsius) {
        return TO_F_FACTOR * (celsius + CONST_OPR);
    }

    public double fahrenheitToCelsius(final double fahrenheit) {
        return TO_C_FACTOR * (fahrenheit - CONST_OPR);
    }
}
