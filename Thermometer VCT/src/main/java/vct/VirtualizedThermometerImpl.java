package vct;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.StaticServiceProperty;
import vct.lfv.impl.TemperatureConverterImpl;
import vct.lfv.service.TemperatureConverter;
import vct.sfv.impl.TemperatureSensorImpl;
import vct.sfv.service.TemperatureSensor;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 13/11/2016.
 *
 * This java class is an implementation of the Virtual Connected Thing (VCT) component of the IoT virtualization approach,
 * which allows the virtualization of the thermometer connected device.
 */
@Component
@Provides(
            properties= {
            @StaticServiceProperty(name="name", value="iThermometer", type="java.lang.String"),
            @StaticServiceProperty(name="version", value="1.0", type="java.lang.Integer")
            }/*,
            specifications={TemperatureConverter.class,TemperatureSensor.class},
            strategy="SERVICE/INSTANCE" -- new instance
            */
        )
//@Instantiate --> reconfigure the variable for the next provide
public class VirtualizedThermometerImpl implements VirtualizedThermometer {

    private TemperatureConverter temperatureConverter;
    private TemperatureSensor temperatureSensor;

    public VirtualizedThermometerImpl(){
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


       /*
    @ServiceProperty(name="name", value="iThermometer", mandatory=false)
    private String name;

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
}
