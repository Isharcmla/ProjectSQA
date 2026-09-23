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

public class Fraction_subtract_2650031231035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332393;
     Object term332475;

    public Fraction_subtract_2650031231035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332393 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term332393, term332393.getClass(), "numerator", 256);
        setIntField(term332393, term332393.getClass(), "denominator", -2006487272);
        term332475 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term332475, term332475.getClass(), "numerator", 1073741824);
        setIntField(term332475, term332475.getClass(), "denominator", 1039777260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term332475;
        try {
            callMethod(klass, "subtract", argTypes, term332393, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


