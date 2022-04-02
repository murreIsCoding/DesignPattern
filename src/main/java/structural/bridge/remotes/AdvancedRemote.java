package structural.bridge.remotes;

import structural.bridge.devices.Device;

/**
 * @Author LMY
 * @Date 2022/4/2 12:01
 * @Version 1.0
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}