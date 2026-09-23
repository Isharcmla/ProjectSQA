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

public class Fraction_multiplyBy_16360464551380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402960;
     Object term403040;

    public Fraction_multiplyBy_16360464551380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402960 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term402960, term402960.getClass(), "numerator", 251797538);
        term403040 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term403040, term403040.getClass(), "numerator", 251797538);
        setIntField(term403040, term403040.getClass(), "denominator", 1297377341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term403040;
        try {
            callMethod(klass, "multiplyBy", argTypes, term402960, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


