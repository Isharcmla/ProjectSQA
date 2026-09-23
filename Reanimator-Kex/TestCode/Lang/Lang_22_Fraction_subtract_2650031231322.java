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

public class Fraction_subtract_2650031231322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430093;
     Object term430175;

    public Fraction_subtract_2650031231322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430093 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term430093, term430093.getClass(), "numerator", 2048);
        setIntField(term430093, term430093.getClass(), "denominator", -1347054104);
        term430175 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term430175, term430175.getClass(), "numerator", 536870912);
        setIntField(term430175, term430175.getClass(), "denominator", 1075744404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term430175;
        try {
            callMethod(klass, "subtract", argTypes, term430093, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


