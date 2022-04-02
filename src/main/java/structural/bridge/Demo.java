package structural.bridge;

import structural.bridge.devices.Device;
import structural.bridge.devices.Radio;
import structural.bridge.devices.Tv;
import structural.bridge.remotes.AdvancedRemote;
import structural.bridge.remotes.BasicRemote;

/**
 * @Author LMY
 * @Date 2022/4/2 12:01
 * @Version 1.0
 */

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}