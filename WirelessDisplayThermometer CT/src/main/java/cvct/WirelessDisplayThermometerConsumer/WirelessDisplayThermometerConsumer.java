package cvct.WirelessDisplayThermometerConsumer;

import cvct.WirelessDisplayThermometer;
import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Requires;

@Component(name="AnnotatedWirelessDisplayThermometerClient", immediate=true)
@Instantiate

public class WirelessDisplayThermometerConsumer {

@Requires
private WirelessDisplayThermometer[] wirelessDisplayThermometers;

    public void displayTemperature(double celsius) throws Exception {
        for (WirelessDisplayThermometer wirelessDisplayThermometer : wirelessDisplayThermometers) {
            wirelessDisplayThermometer.displayTemperature(celsius);
            break;
        }
        throw new Exception("No VirtualThermometer Service Found !");
    }
}
