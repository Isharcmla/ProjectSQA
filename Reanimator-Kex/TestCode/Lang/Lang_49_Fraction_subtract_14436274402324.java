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

public class Fraction_subtract_14436274402324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687764;
     Object term687844;

    public Fraction_subtract_14436274402324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term687764 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term687764, term687764.getClass(), "numerator", 268435456);
        setIntField(term687764, term687764.getClass(), "denominator", -990731272);
        term687844 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term687844, term687844.getClass(), "numerator", 67108864);
        setIntField(term687844, term687844.getClass(), "denominator", 511840476);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term687844;
        try {
            callMethod(klass, "subtract", argTypes, term687764, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


