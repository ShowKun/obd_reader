
package com.powertrain.ecu.obd.commands.temperature;

import com.powertrain.ecu.obd.commands.temperature.TemperatureCommand;
import com.powertrain.ecu.obd.enums.AvailableCommandNames;

/**
 * Engine Coolant Temperature.
 *
 */
public class EngineCoolantTemperatureCommand extends TemperatureCommand {

    /**
     * <p>Constructor for EngineCoolantTemperatureCommand.</p>
     */
    public EngineCoolantTemperatureCommand() {
        super("01 05");
    }

    /**
     * <p>Constructor for EngineCoolantTemperatureCommand.</p>
     *
     * @param other a {@link com.github.pires.obd.commands.temperature.TemperatureCommand} object.
     */
    public EngineCoolantTemperatureCommand(TemperatureCommand other) {
        super(other);
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.ENGINE_COOLANT_TEMP.getValue();
    }

}
