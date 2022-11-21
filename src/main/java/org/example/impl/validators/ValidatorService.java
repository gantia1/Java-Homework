package org.example.impl.validators;

import org.example.abstraction.Validator;
import org.example.exception.ValidatorException;

import java.util.List;

public class ValidatorService {
    public static void validate(List<Validator> validators) throws ValidatorException {
        for (Validator validator : validators) {
            if (!validator.isValid()) {
                throw new ValidatorException(
                        validator.getClass().getSimpleName() + " failed. "
                );
            }
        }
    }
}
