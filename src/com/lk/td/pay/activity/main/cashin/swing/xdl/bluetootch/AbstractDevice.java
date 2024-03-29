package com.lk.td.pay.activity.main.cashin.swing.xdl.bluetootch;


public abstract class AbstractDevice {
    public abstract void initController();

    public abstract void disconnect();

    public abstract boolean isControllerAlive();

    public abstract BuletootchController getController();

    public abstract void connectDevice();
}
