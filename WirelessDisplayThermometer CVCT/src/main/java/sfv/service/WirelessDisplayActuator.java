package sfv.service;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 06/11/2016.
 *
 * This java interface is an exposition service of the Sensor Function Virtualization (SFV) component of the IoT virtualization approach,
 * which allows the exposition of a wireless display device.
 */
public interface WirelessDisplayActuator {
    void displayText(final String text);
}
