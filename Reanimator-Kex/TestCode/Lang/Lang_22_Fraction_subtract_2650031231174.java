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

public class Fraction_subtract_2650031231174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379043;
     Object term379125;

    public Fraction_subtract_2650031231174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379043 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term379043, term379043.getClass(), "numerator", 536870912);
        setIntField(term379043, term379043.getClass(), "denominator", -5250152);
        term379125 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term379125, term379125.getClass(), "numerator", 256);
        setIntField(term379125, term379125.getClass(), "denominator", 3312684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term379125;
        try {
            callMethod(klass, "subtract", argTypes, term379043, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


