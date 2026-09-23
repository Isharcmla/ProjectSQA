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

public class Fraction_subtract_2650031232111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687525;
     Object term687607;

    public Fraction_subtract_2650031232111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term687525 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term687525, term687525.getClass(), "numerator", -2147483648);
        setIntField(term687525, term687525.getClass(), "denominator", -1239955976);
        term687607 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term687607, term687607.getClass(), "numerator", 131072);
        setIntField(term687607, term687607.getClass(), "denominator", 1010553564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term687607;
        try {
            callMethod(klass, "subtract", argTypes, term687525, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


