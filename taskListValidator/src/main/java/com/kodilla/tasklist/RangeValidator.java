package com.kodilla.tasklist;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RangeValidator implements ConstraintValidator<Range, Integer> {

    private int minValue;
    private int maxValue;

    @Override
    public void initialize(Range constraintAnnotation) {
        minValue = constraintAnnotation.min();
        maxValue = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        return value >= minValue && value <= maxValue;
    }
}
