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

public class Fraction_subtract_14436274402827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844975;
     Object term845055;

    public Fraction_subtract_14436274402827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term844975 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term844975, term844975.getClass(), "numerator", 128);
        setIntField(term844975, term844975.getClass(), "denominator", -1050248);
        term845055 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term845055, term845055.getClass(), "numerator", 32768);
        setIntField(term845055, term845055.getClass(), "denominator", 1031580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term845055;
        try {
            callMethod(klass, "subtract", argTypes, term844975, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


