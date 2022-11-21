package org.example;

import org.example.abstraction.Validator;
import org.example.exception.ValidatorException;
import org.example.impl.validators.GenderValidator;
import org.example.impl.validators.IDValidator;
import org.example.impl.validators.ISODateValidator;
import org.example.impl.validators.ValidatorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("ID: ");
        var id = scanner.next();
        System.out.println("BirthDate: ");
        var birthDate = scanner.next();
        System.out.println("Gender: ");
        var gender = scanner.next();
        try {
            ValidatorService.validate(List.of(
                    new IDValidator(id),
                    new ISODateValidator(birthDate),
                    new GenderValidator(gender)
            ));
            System.out.println("Input is valid");
        } catch (ValidatorException e) {
            System.err.println(e.getMessage());
        }
    }
}