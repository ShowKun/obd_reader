
package com.powertrain.ecu.obd.commands.temperature;

import com.powertrain.ecu.obd.commands.temperature.TemperatureCommand;
import com.powertrain.ecu.obd.enums.AvailableCommandNames;

/**
 * Temperature of intake air.
 *
 */
public class AirIntakeTemperatureCommand extends TemperatureCommand {

    /**
     * <p>Constructor for AirIntakeTemperatureCommand.</p>
     */
    public AirIntakeTemperatureCommand() {
        super("01 0F");
    }

    /**
     * <p>Constructor for AirIntakeTemperatureCommand.</p>
     *
     * @param other a {@link com.github.pires.obd.commands.temperature.AirIntakeTemperatureCommand} object.
     */
    public AirIntakeTemperatureCommand(AirIntakeTemperatureCommand other) {
        super(other);
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.AIR_INTAKE_TEMP.getValue();
    }

}
