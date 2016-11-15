package ct;

import vct.VirtualThermometerConsumer;

import java.util.Random;

/**
 * Created by Mehdi TAZI (tazimehdi.com) on 06/11/2016.
 *
 * This java class is a simulation of the Connected Thing (CT) component of the IoT virtualization approach,
 * which is the physical part of the thermometer connected device .
 */
public class EmbeddedLogic {


    private VirtualThermometerConsumer virtualThermometerConsumer;

    public EmbeddedLogic(final VirtualThermometerConsumer virtualThermometerConsumer){
        this.virtualThermometerConsumer = virtualThermometerConsumer;
    }

    private double generateRandom(final double min, final double max){
        return   min + (max - min) * new Random().nextDouble();
    }

    public void invoke() throws InterruptedException {
        final double minTemp = - 10;
        final double maxTemp = 43;

        while(true){
            // 1 - read in degree from the thermometer hardware temperature sensor which is in celsius
            double degree = generateRandom(minTemp, maxTemp);

            // 2  - call the virtualized connected object (VCT) "Virtualized Thermometer"

            // 2.1 - Call the Sensor Virtualization Function (SVF) of the VCT  - offloading [Not Implemented]
            //TODO : Not Implemented yet
            // 2.2 - Call the Logical Virtualization Function (LVF) of the VCT

            double celsiusToFahrenheit = 0;
            try {
                celsiusToFahrenheit = this.virtualThermometerConsumer.celsiusToFahrenheit(degree);
                System.out.println(celsiusToFahrenheit);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
