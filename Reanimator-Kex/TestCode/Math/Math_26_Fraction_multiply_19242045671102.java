package org.apache.commons.math3.fraction;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiply_19242045671102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539730;
     Object term539820;

    public Fraction_multiply_19242045671102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539730 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term539730, term539730.getClass(), "numerator", -1073741822);
        term539820 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term539820, term539820.getClass(), "numerator", -1073741822);
        setIntField(term539820, term539820.getClass(), "denominator", 1350566803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term539820;
        try {
            callMethod(klass, "multiply", argTypes, term539730, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


