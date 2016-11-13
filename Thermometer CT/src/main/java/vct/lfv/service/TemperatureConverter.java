package vct.lfv.service;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 06/11/2016.
 *
 * This java interface is an exposition service of the Logical Function Virtualization (LFV) component of the IoT virtualization approach,
 * which allows the exposition of the thermometer connected device application logics.
 */
public interface TemperatureConverter {
    double celsiusToFahrenheit(final double celsius);
    double fahrenheitToCelsius(final double fahrenheit);
}
