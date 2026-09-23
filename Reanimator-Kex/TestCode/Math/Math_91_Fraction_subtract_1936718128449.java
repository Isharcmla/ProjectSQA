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

public class Fraction_subtract_1936718128449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162871;
     Object term162959;

    public Fraction_subtract_1936718128449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162871 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term162871, term162871.getClass(), "numerator", 1073741824);
        setIntField(term162871, term162871.getClass(), "denominator", -2147483647);
        term162959 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term162959, term162959.getClass(), "numerator", 1073741824);
        setIntField(term162959, term162959.getClass(), "denominator", -1360328950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term162959;
        try {
            callMethod(klass, "subtract", argTypes, term162871, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


