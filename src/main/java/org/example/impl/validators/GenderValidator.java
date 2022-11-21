package org.example.impl.validators;

import org.example.abstraction.Validator;

public class GenderValidator implements Validator {
    private final String gender;

    public GenderValidator(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean isValid() {
        if (gender == null) {
            return false;
        }
        try {
            if (gender.equals("male") || gender.equals("female")) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
