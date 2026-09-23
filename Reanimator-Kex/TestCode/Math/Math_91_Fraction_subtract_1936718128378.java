package org.apache.commons.math.fraction;

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
import java.lang.ArithmeticException;
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_1936718128378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131427;
     Object term131515;

    public Fraction_subtract_1936718128378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131427 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term131427, term131427.getClass(), "numerator", -2147483648);
        setIntField(term131427, term131427.getClass(), "denominator", -2147483647);
        term131515 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term131515, term131515.getClass(), "numerator", -2147483648);
        setIntField(term131515, term131515.getClass(), "denominator", -1208090922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term131515;
        try {
            callMethod(klass, "subtract", argTypes, term131427, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


