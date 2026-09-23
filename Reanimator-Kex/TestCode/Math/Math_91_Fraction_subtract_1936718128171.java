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

public class Fraction_subtract_1936718128171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51220;
     Object term51308;

    public Fraction_subtract_1936718128171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51220 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term51220, term51220.getClass(), "numerator", 4194304);
        setIntField(term51220, term51220.getClass(), "denominator", -2147483647);
        term51308 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term51308, term51308.getClass(), "numerator", 8388608);
        setIntField(term51308, term51308.getClass(), "denominator", -2122379322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term51308;
        try {
            callMethod(klass, "subtract", argTypes, term51220, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


