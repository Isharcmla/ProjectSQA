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

public class Fraction_subtract_14436274401616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474623;
     Object term474703;

    public Fraction_subtract_14436274401616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474623 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term474623, term474623.getClass(), "numerator", -2147483648);
        setIntField(term474623, term474623.getClass(), "denominator", -8462872);
        term474703 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term474703, term474703.getClass(), "numerator", -2147483648);
        setIntField(term474703, term474703.getClass(), "denominator", 12679316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term474703;
        try {
            callMethod(klass, "subtract", argTypes, term474623, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


