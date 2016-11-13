package sfv.impl;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;
import sfv.service.LCDScreenActuator;
import sfv.service.TemperatureSensor;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 06/11/2016.
 *
 * This java class is an implementation  of the Sensor Function Virtualization (SFV) component of the IoT virtualization approach,
 * which allows the virtualization of of a temperature sensor.
 */
@Component
@Provides
public class LCDScreenActuatorImpl implements TemperatureSensor {

    public void getTemperature(String text) {
       throw new NotImplementedException();
    }
}
