package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_265003123778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245726;
     Object term245808;

    public Fraction_subtract_265003123778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245726 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term245726, term245726.getClass(), "numerator", 67108864);
        setIntField(term245726, term245726.getClass(), "denominator", -83997128);
        term245808 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term245808, term245808.getClass(), "numerator", 32768);
        setIntField(term245808, term245808.getClass(), "denominator", 69997564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term245808;
        try {
            callMethod(klass, "subtract", argTypes, term245726, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


