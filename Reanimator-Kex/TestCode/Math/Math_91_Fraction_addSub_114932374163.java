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

public class Fraction_addSub_114932374163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10630;
     Object term10718;

    public Fraction_addSub_114932374163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10630 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term10630, term10630.getClass(), "numerator", 1048576);
        setIntField(term10630, term10630.getClass(), "denominator", 1);
        term10718 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term10718, term10718.getClass(), "numerator", 16777216);
        setIntField(term10718, term10718.getClass(), "denominator", -2147483644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term10718;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term10630, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


