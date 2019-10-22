
package com.powertrain.ecu.obd.commands.pressure;

import com.powertrain.ecu.obd.commands.pressure.PressureCommand;
import com.powertrain.ecu.obd.enums.AvailableCommandNames;

/**
 * Intake Manifold Pressure
 *
 */
public class IntakeManifoldPressureCommand extends PressureCommand {

    /**
     * Default ctor.
     */
    public IntakeManifoldPressureCommand() {
        super("01 0B");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.pressure.IntakeManifoldPressureCommand} object.
     */
    public IntakeManifoldPressureCommand(IntakeManifoldPressureCommand other) {
        super(other);
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.INTAKE_MANIFOLD_PRESSURE.getValue();
    }

}
