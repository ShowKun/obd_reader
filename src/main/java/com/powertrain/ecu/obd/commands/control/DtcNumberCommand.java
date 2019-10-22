
package com.powertrain.ecu.obd.commands.control;

import com.powertrain.ecu.obd.commands.ObdCommand;
import com.powertrain.ecu.obd.enums.AvailableCommandNames;


public class DtcNumberCommand extends ObdCommand {

    private int codeCount = 0;
    private boolean milOn = false;

    /**
     * Default ctor.
     */
    public DtcNumberCommand() {
        super("01 01");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.powertrain.ecu.obd.commands.control.DtcNumberCommand} object.
     */
    public DtcNumberCommand(DtcNumberCommand other) {
        super(other);
    }

    /** {@inheritDoc} */
    @Override
    protected void performCalculations() {
        // ignore first two bytes [hh hh] of the response
        final int mil = buffer.get(2);
        milOn = (mil & 0x80) == 128;
        codeCount = mil & 0x7F;
    }

    /**
     * <p>getFormattedResult.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFormattedResult() {
        final String res = milOn ? "MIL is ON" : "MIL is OFF";
        return res + codeCount + " codes";
    }

    /** {@inheritDoc} */
    @Override
    public String getCalculatedResult() {
        return String.valueOf(codeCount);
    }

    /**
     * <p>getTotalAvailableCodes.</p>
     *
     * @return the number of trouble codes currently flaggd in the ECU.
     */
    public int getTotalAvailableCodes() {
        return codeCount;
    }

    /**
     * <p>Getter for the field <code>milOn</code>.</p>
     *
     * @return the state of the check engine light state.
     */
    public boolean getMilOn() {
        return milOn;
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.DTC_NUMBER.getValue();
    }

}
