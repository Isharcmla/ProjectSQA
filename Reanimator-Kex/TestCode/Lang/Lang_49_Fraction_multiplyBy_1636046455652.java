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

public class Fraction_multiplyBy_1636046455652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181261;
     Object term181341;

    public Fraction_multiplyBy_1636046455652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181261 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term181261, term181261.getClass(), "numerator", 939320154);
        term181341 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term181341, term181341.getClass(), "numerator", 41282);
        setIntField(term181341, term181341.getClass(), "denominator", 1812005641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term181341;
        try {
            callMethod(klass, "multiplyBy", argTypes, term181261, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


