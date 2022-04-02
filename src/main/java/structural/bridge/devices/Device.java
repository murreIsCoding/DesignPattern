package structural.bridge.devices;

/**
 * @Author LMY
 * @Date 2022/4/2 11:59
 * @Version 1.0
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
