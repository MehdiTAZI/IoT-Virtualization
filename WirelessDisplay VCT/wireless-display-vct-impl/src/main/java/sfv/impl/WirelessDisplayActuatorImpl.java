package sfv.impl;

import helper.WirelessCTDriver;
import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;
import sfv.service.WirelessDisplayActuator;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 06/11/2016.
 *
 * This java class is an implementation  of the Sensor Function Virtualization (SFV) component of the IoT virtualization approach,
 * which allows the virtualization of a wireless display device.
 */
/*@Component
@Provides*/
public class WirelessDisplayActuatorImpl implements WirelessDisplayActuator {

    private WirelessCTDriver wirelessCTDriver;
    public WirelessDisplayActuatorImpl(){
        wirelessCTDriver = new WirelessCTDriver();
    }
    public void displayText(String text) {
        // 1 - call the CT
        wirelessCTDriver.displayMessage(text);
    }
}
