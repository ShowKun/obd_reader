
package com.powertrain.ecu.obd.commands.protocol;

import com.powertrain.ecu.obd.commands.ObdCommand;

/**
 * Reset trouble codes.
 *
 */
public class ResetTroubleCodesCommand extends ObdCommand {

    /**
     * <p>Constructor for ResetTroubleCodesCommand.</p>
     */
    public ResetTroubleCodesCommand() {
        super("04");
    }

    /** {@inheritDoc} */
    @Override
    protected void performCalculations() {

    }

    /** {@inheritDoc} */
    @Override
    public String getFormattedResult() {
        return getResult();
    }

    /** {@inheritDoc} */
    @Override
    public String getCalculatedResult() {
        return getResult();
    }


    /** {@inheritDoc} */
    @Override
    public String getName() {
        return getResult();
    }

}
