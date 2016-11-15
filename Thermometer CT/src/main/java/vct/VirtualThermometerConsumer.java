package vct;

import ct.EmbeddedLogic;
import org.apache.felix.ipojo.annotations.*;
import vct.service.VirtualThermometer;

@Component(name="ThermometerClient", immediate=true)
@Instantiate
public class VirtualThermometerConsumer implements Runnable  {

    /**
     * VirtualThermometer services. Injected by the container.
     */
    @Requires
    private VirtualThermometer[] virtualThermometers;

    /**
     * Delay between two invocations.
     */
    private static final int DELAY = 2000;

    /**
     * End flag.
     */
    private boolean endFlag;


    public double celsiusToFahrenheit(final double celsius) throws Exception {
        for (VirtualThermometer virtualThermometer : virtualThermometers) {
            return virtualThermometer.celsiusToFahrenheit(celsius);
        }
        throw new Exception("No VirtualThermometer Service Found !");
    }

    /**
     * Run method.
     *
     * @see Runnable#run()
     */
    public void run() {
        final EmbeddedLogic embeddedLogic = new EmbeddedLogic(this);
        while (!endFlag) {
            try {
                embeddedLogic.invoke();
                Thread.sleep(DELAY);
            } catch (InterruptedException ie) {
                /* will recheck end */
            }
        }
    }

    /**
     * Starting.
     */
    @Validate
    public void starting() {
        Thread thread = new Thread(this);
        endFlag = false;
        thread.start();
    }

    /**
     * Stopping.
     */
    @Invalidate
    public void stopping() {
        endFlag = true;
    }
}
