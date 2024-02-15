package org.launchcode.techjobs.oo;
import java.util.Objects;

public class CoreCompetency extends JobField {

    //deleted repeated code and converted CoreCompetency because fields and methods are listed in Job Field.
    public CoreCompetency(String value) {
        super(value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.
}
