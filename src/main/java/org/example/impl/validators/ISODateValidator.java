package org.example.impl.validators;

import org.example.abstraction.Validator;

public class ISODateValidator implements Validator {
    private final String date;

    public ISODateValidator(String date) {
        this.date = date;
    }

    @Override
    public boolean isValid() {
        if (date == null) {
            return false;
        }
        if (date.length() != 10) {
            return false;
        }
        String[] segments = date.split("-");
        if (segments.length != 3) {
            return false;
        }
        if (segments[0].length() != 4
                || segments[1].length() != 2
                || segments[2].length() != 2) {
            return false;
        }
        try {
            Integer.parseInt(segments[0]);
            Integer.parseInt(segments[1]);
            Integer.parseInt(segments[2]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
