package org.example.impl.validators;

import org.example.abstraction.Validator;

public class IDValidator implements Validator {
    private final String id;

    public IDValidator(String id) {
        this.id = id;
    }

    @Override
    public boolean isValid() {
        if (id == null) {
            return false;
        }
        if (id.length() != 11) {
            return false;
        }
        try {
            Long.parseLong(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
