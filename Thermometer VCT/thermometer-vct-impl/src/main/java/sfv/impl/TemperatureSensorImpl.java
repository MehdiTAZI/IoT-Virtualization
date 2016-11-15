package sfv.impl;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;
import sfv.service.TemperatureSensor;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 06/11/2016.
 *
 * This java class is an implementation  of the Sensor Function Virtualization (SFV) component of the IoT virtualization approach,
 * which allows the virtualization of an LCD Screen.
 */
/*@Component
@Provides
@Instantiate*/
public class TemperatureSensorImpl implements TemperatureSensor {

    public void getTemperature(String text) {
        throw new NotImplementedException();
    }

}
