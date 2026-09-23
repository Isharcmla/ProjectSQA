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

public class Fraction_subtract_14436274401693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497060;
     Object term497140;

    public Fraction_subtract_14436274401693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497060 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term497060, term497060.getClass(), "numerator", 1073741824);
        setIntField(term497060, term497060.getClass(), "denominator", -1207959560);
        term497140 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term497140, term497140.getClass(), "numerator", 268435456);
        setIntField(term497140, term497140.getClass(), "denominator", 1006632924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term497140;
        try {
            callMethod(klass, "subtract", argTypes, term497060, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


