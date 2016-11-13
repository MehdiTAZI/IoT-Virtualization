package vct.lfv.consumer;

import vct.lfv.service.TemperatureConverter;
import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Requires;

@Component(name="AnnotatedTemperatureClient", immediate=true)
@Instantiate
public class TemperatureConverterConsumer {

@Requires
private TemperatureConverter[] temperatureConverters;

public double celsiusToFahrenheit(final double celsius) {
        for (TemperatureConverter temperatureConverter : temperatureConverters) {
            return temperatureConverter.celsiusToFahrenheit(celsius);
        }
       return 0;
    }

}
