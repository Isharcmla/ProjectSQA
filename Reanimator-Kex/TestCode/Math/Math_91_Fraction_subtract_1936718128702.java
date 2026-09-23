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

public class Fraction_subtract_1936718128702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263824;
     Object term263912;

    public Fraction_subtract_1936718128702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263824 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term263824, term263824.getClass(), "numerator", 512);
        setIntField(term263824, term263824.getClass(), "denominator", -2147483647);
        term263912 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term263912, term263912.getClass(), "numerator", 4096);
        setIntField(term263912, term263912.getClass(), "denominator", -234953754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term263912;
        try {
            callMethod(klass, "subtract", argTypes, term263824, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


