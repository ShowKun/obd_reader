
package com.powertrain.ecu.obd.commands.pressure;

import com.powertrain.ecu.obd.commands.pressure.PressureCommand;
import com.powertrain.ecu.obd.enums.AvailableCommandNames;

/**
 * <p>FuelPressureCommand class.</p>
 *
 */
public class FuelPressureCommand extends PressureCommand {

    /**
     * <p>Constructor for FuelPressureCommand.</p>
     */
    public FuelPressureCommand() {
        super("01 0A");
    }

    /**
     * <p>Constructor for FuelPressureCommand.</p>
     *
     * @param other a {@link com.github.pires.obd.commands.pressure.FuelPressureCommand} object.
     */
    public FuelPressureCommand(FuelPressureCommand other) {
        super(other);
    }

    /**
     * {@inheritDoc}
     * <p>
     * TODO describe of why we multiply by 3
     */
    @Override
    protected final int preparePressureValue() {
        return buffer.get(2) * 3;
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.FUEL_PRESSURE.getValue();
    }

}
