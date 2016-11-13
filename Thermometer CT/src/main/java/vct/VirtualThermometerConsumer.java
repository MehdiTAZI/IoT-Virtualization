package vct;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Requires;

@Component(name="AnnotatedTemperatureClient", immediate=true)
@Instantiate
public class VirtualThermometerConsumer {

    @Requires
    private VirtualThermometer[] virtualThermometers;

    public double celsiusToFahrenheit(final double celsius) throws Exception {
        for (VirtualThermometer virtualThermometer : virtualThermometers) {
            return virtualThermometer.celsiusToFahrenheit(celsius);
        }
        throw new Exception("No VirtualThermometer Service Found !");
    }

}
