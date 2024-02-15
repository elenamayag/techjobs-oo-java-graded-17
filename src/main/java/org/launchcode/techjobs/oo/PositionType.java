package org.launchcode.techjobs.oo;
import java.util.Objects;

public class PositionType extends JobField{

    //deleted repeated code and converted PositionType because all fields and methods are listed in Job Field.
    public PositionType(String value) {
        super(value);
    }
    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
