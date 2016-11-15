package sfv.impl;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Provides;
import sfv.service.LCDScreenActuator;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 06/11/2016.
 *
 * This java class is an implementation  of the Sensor Function Virtualization (SFV) component of the IoT virtualization approach,
 * which allows the virtualization of of a temperature sensor.
 */
@Component
@Provides
@Instantiate
public class LCDScreenActuatorImpl implements LCDScreenActuator {

    private int width;
    private int height;

    public LCDScreenActuatorImpl(){
        this.width=16;
        this.height=2;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void displayText(final String text) {
        displayText(text, 0, 0);
    }

    public void displayText(final String text, final int x, final int y) {

        if(x<this.width && y < this.height){

            for(int j=0;j<y;j++)
                System.out.println();

            for(int i=0;i<x;i++)
                System.out.print(" ");

            System.out.print(text);

        }

    }

    public void clear() {
        for(int i=0;i<this.width*this.height;i++)
            System.out.print("\b");
    }

    public void setSize(final int width, final int height) {
        this.width = width;
        this.height= height;
    }

}
