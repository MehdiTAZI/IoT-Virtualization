package vct.sfv.service;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 06/11/2016.
 *
 * This java interface is an exposition service of the Sensor Function Virtualization (SFV) component of the IoT virtualization approach,
 * which allows the exposition of an LCD Screen.
 */
public interface LCDScreenActuator {
    void displayText(final String text);
    void displayText(final String text, final int x, final int y);
    void clear();
    void setSize(final int width, final int height);
    int getWidth();
    int getHeight();

}
