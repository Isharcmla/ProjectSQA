package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_14436274401128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326422;
     Object term326502;

    public Fraction_subtract_14436274401128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326422 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term326422, term326422.getClass(), "numerator", 512);
        setIntField(term326422, term326422.getClass(), "denominator", -2047247528);
        term326502 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term326502, term326502.getClass(), "numerator", 8192);
        setIntField(term326502, term326502.getClass(), "denominator", 1485223692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term326502;
        try {
            callMethod(klass, "subtract", argTypes, term326422, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


