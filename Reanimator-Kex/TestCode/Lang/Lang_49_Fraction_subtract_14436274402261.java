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

public class Fraction_subtract_14436274402261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668750;
     Object term668830;

    public Fraction_subtract_14436274402261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term668750 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term668750, term668750.getClass(), "numerator", 1073741824);
        setIntField(term668750, term668750.getClass(), "denominator", -838745096);
        term668830 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term668830, term668830.getClass(), "numerator", 1073741824);
        setIntField(term668830, term668830.getClass(), "denominator", 620474844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term668830;
        try {
            callMethod(klass, "subtract", argTypes, term668750, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


