package com.powertrain.ecu.obd.reader.io;

public interface ObdProgressListener {

    void stateUpdate(final ObdCommandJob job);

}