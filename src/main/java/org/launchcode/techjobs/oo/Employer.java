package org.launchcode.techjobs.oo;
import java.util.Objects;

public class Employer extends JobField{

    //deleted repeated code and converted Employer because all fields and methods are listed in Job Field.
    public Employer(String value) {
        super(value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
