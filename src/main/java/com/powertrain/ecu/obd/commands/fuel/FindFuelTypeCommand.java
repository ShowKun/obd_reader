
package com.powertrain.ecu.obd.commands.fuel;

import com.powertrain.ecu.obd.commands.ObdCommand;
import com.powertrain.ecu.obd.enums.AvailableCommandNames;
import com.powertrain.ecu.obd.enums.FuelType;

/**
 * This command is intended to determine the vehicle fuel type.
 *
 */
public class FindFuelTypeCommand extends ObdCommand {

    private int fuelType = 0;

    /**
     * Default ctor.
     */
    public FindFuelTypeCommand() {
        super("01 51");
    }

    /**
     * Copy ctor
     *
     * @param other a {@link com.github.pires.obd.commands.fuel.FindFuelTypeCommand} object.
     */
    public FindFuelTypeCommand(FindFuelTypeCommand other) {
        super(other);
    }

    /** {@inheritDoc} */
    @Override
    protected void performCalculations() {
        // ignore first two bytes [hh hh] of the response
        fuelType = buffer.get(2);
    }

    /** {@inheritDoc} */
    @Override
    public String getFormattedResult() {
        try {
            return FuelType.fromValue(fuelType).getDescription();
        } catch (NullPointerException e) {
            return "-";
        }
    }

    /** {@inheritDoc} */
    @Override
    public String getCalculatedResult() {
        return String.valueOf(fuelType);
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.FUEL_TYPE.getValue();
    }

}
