package lfv.consumer;

import lfv.service.TemperatureConverter;
import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Requires;

@Component(name="AnnotatedTemperatureClient", immediate=true)
@Instantiate
public class TemperatureConverterConsumer {

@Requires
private TemperatureConverter[] temperatureConverters;

public double celsiusToFahrenheit(final double celsius) throws Exception {
        for (TemperatureConverter temperatureConverter : temperatureConverters) {
            return temperatureConverter.celsiusToFahrenheit(celsius);
        }
        throw new Exception("No VirtualThermometer Service Found !");
    }

}
