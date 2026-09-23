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

public class Fraction_multiplyBy_163604645580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9543;
     Object term9623;

    public Fraction_multiplyBy_163604645580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9543 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term9543, term9543.getClass(), "numerator", 1392506434);
        term9623 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term9623, term9623.getClass(), "numerator", 49009154);
        setIntField(term9623, term9623.getClass(), "denominator", 1478493389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term9623;
        try {
            callMethod(klass, "multiplyBy", argTypes, term9543, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


