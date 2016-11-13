package cvct;

import cvt.VirtualThermometer;
import cvt.VirtualWirelessDisplay;
import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.Requires;
import org.apache.felix.ipojo.annotations.StaticServiceProperty;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 13/11/2016.
 *
 * This java class is an implementation of the Virtual Connected Thing (VCT) component of the IoT virtualization approach,
 * which allows the virtualization of the thermometer connected device.
 */
@Component
@Provides(
            properties= {
            @StaticServiceProperty(name="name", value="iWirelessDisplayThermometer", type="java.lang.String"),
            @StaticServiceProperty(name="version", value="1.0", type="java.lang.Integer")
            }
        )
public class WirelessDisplayThermometerImpl implements WirelessDisplayThermometer {

    @Requires
    private VirtualThermometer[] virtualThermometers;

    @Requires
    private VirtualWirelessDisplay[] virtualWirelessDisplays;

    public void displayTemperature(final double celsius) {
        for (VirtualThermometer virtualThermometer : virtualThermometers) {
            Double celsiusToFahrenheit = virtualThermometer.celsiusToFahrenheit(celsius);
            for (VirtualWirelessDisplay virtualWirelessDisplay : virtualWirelessDisplays) {
                virtualWirelessDisplay.displayText(celsiusToFahrenheit.toString());
                return;
            }
        }

    }
}
