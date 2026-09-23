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

public class Fraction_subtract_740425991334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132513;
     Object term132603;

    public Fraction_subtract_740425991334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132513 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term132513, term132513.getClass(), "numerator", -2147483648);
        setIntField(term132513, term132513.getClass(), "denominator", 1);
        term132603 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term132603, term132603.getClass(), "numerator", 4096);
        setIntField(term132603, term132603.getClass(), "denominator", -2147483644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term132603;
        try {
            callMethod(klass, "subtract", argTypes, term132513, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


