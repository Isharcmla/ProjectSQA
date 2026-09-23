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

public class Fraction_subtract_14436274401643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term482326;
     Object term482406;

    public Fraction_subtract_14436274401643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term482326 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term482326, term482326.getClass(), "numerator", 131072);
        setIntField(term482326, term482326.getClass(), "denominator", -1688731912);
        term482406 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term482406, term482406.getClass(), "numerator", 256);
        setIntField(term482406, term482406.getClass(), "denominator", 1032072284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term482406;
        try {
            callMethod(klass, "subtract", argTypes, term482326, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


