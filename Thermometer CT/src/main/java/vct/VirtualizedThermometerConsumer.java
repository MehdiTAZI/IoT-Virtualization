package vct;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Requires;

@Component(name="AnnotatedTemperatureClient", immediate=true)
@Instantiate
public class VirtualizedThermometerConsumer {

    @Requires
    private VirtualizedThermometer[] virtualizedThermometers;

    public double celsiusToFahrenheit(final double celsius) {
        for (VirtualizedThermometer virtualizedThermometer : virtualizedThermometers) {
            return virtualizedThermometer.celsiusToFahrenheit(celsius);
        }
        return 0;
    }

}
