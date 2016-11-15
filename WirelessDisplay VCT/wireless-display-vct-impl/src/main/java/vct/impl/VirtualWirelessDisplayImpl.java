package vct.impl;

import cvt.service.VirtualWirelessDisplay;
import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.ServiceProperty;
import sfv.service.WirelessDisplayActuator;

/**
 * Created by MehdiTAZI on 14/11/2016.
 */
@Component
@Provides
@Instantiate
public class VirtualWirelessDisplayImpl implements VirtualWirelessDisplay {

    @ServiceProperty(name="name", value="iVirtualWirelessDisplay")
    public String name;

    @ServiceProperty(name="version", value="1.0")
    public Integer version;

    @ServiceProperty(name="type", value= "vct")
    public String type;

    private WirelessDisplayActuator wirelessDisplayActuator;

    public VirtualWirelessDisplayImpl(){
        this.wirelessDisplayActuator = new VirtualWirelessDisplayImpl();
    }

    public void displayText(final String text) {
        this.wirelessDisplayActuator.displayText(text);
    }
}
