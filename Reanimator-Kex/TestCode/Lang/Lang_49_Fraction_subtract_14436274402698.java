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

public class Fraction_subtract_14436274402698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term804616;
     Object term804696;

    public Fraction_subtract_14436274402698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term804616 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term804616, term804616.getClass(), "numerator", 1048576);
        setIntField(term804616, term804616.getClass(), "denominator", -1749119656);
        term804696 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term804696, term804696.getClass(), "numerator", 2097152);
        setIntField(term804696, term804696.getClass(), "denominator", 1627455500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term804696;
        try {
            callMethod(klass, "subtract", argTypes, term804616, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


