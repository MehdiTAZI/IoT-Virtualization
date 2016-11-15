package vct;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.StaticServiceProperty;
import lfv.impl.TemperatureConverterImpl;
import lfv.service.TemperatureConverter;
import sfv.impl.TemperatureSensorImpl;
import sfv.service.TemperatureSensor;
import vct.service.VirtualThermometer;

import java.lang.Integer;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 13/11/2016.
 *
 * This java class is an implementation of the Virtual Connected Thing (VCT) component of the IoT virtualization approach,
 * which allows the virtualization of the thermometer connected device.
 */
@Component
@Provides
@Instantiate
public class VirtualThermometerImpl implements VirtualThermometer {

    private TemperatureConverter temperatureConverter;
    private TemperatureSensor temperatureSensor;

    @ServiceProperty(name="name", value="iThermometer")
    public String name;

    @ServiceProperty(name="version", value="1.0")
    public Integer version;

    public VirtualThermometerImpl(){
        temperatureConverter = new TemperatureConverterImpl();
        temperatureSensor = new TemperatureSensorImpl();
    }
    public double celsiusToFahrenheit(final double celsius) {
        return temperatureConverter.celsiusToFahrenheit(celsius);
    }

    public double fahrenheitToCelsius(final double fahrenheit) {
        return temperatureConverter.fahrenheitToCelsius(fahrenheit);
    }

    public void getTemperature(final String text) {
        temperatureSensor.getTemperature(text);
    }

}


/*

    @ServiceController(value=false, specification=FooService.class) --> set the field to true of false to unregister/register it from service registry
    private boolean controller; // Service Controller

    @PostRegistration
    public void registered(ServiceReference ref) {
        System.out.println("Registered");
    }

    @PostUnregistration
    public void unregistered(ServiceReference ref) {
        System.out.println("Unregistered");
    }
*/

/*
*     Provides (
            properties= {
            @StaticServiceProperty(name="name", value="iThermometer", type="java.lang.String"),
            @StaticServiceProperty(name="version", value="1.0", type="java.lang.Integer")
            }/*,
            specifications={TemperatureConverter.class,TemperatureSensor.class},
            strategy="SERVICE/INSTANCE" -- new instance
)
* */
