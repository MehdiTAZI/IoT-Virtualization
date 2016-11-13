package vct;

import sfv.service.WirelessDisplayActuator;

/**
 * Created by MehdiTAZI on 14/11/2016.
 */
public class VirtualWirelessDisplayImpl implements VirtualWirelessDisplay {

    private WirelessDisplayActuator wirelessDisplayActuator;

    public VirtualWirelessDisplayImpl(){
        this.wirelessDisplayActuator = new VirtualWirelessDisplayImpl();
    }

    public void displayText(final String text) {
        this.wirelessDisplayActuator.displayText(text);
    }
}
