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

public class Fraction_subtract_14436274402413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716690;
     Object term716770;

    public Fraction_subtract_14436274402413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716690 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term716690, term716690.getClass(), "numerator", 32768);
        setIntField(term716690, term716690.getClass(), "denominator", -1282027144);
        term716770 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term716770, term716770.getClass(), "numerator", 128);
        setIntField(term716770, term716770.getClass(), "denominator", 1851931292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term716770;
        try {
            callMethod(klass, "subtract", argTypes, term716690, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


