package org.launchcode.techjobs.oo;
import java.util.Objects;

public class Location extends JobField{

    //deleted repeated code and converted Location because all fields and methods are listed in Job Field.
    public Location(String value) {
        super(value);
    }
    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
