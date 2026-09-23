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

public class Fraction_subtract_1443627440954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273975;
     Object term274055;

    public Fraction_subtract_1443627440954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273975 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term273975, term273975.getClass(), "numerator", -2147483648);
        setIntField(term273975, term273975.getClass(), "denominator", -1119880392);
        term274055 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term274055, term274055.getClass(), "numerator", -2147483648);
        setIntField(term274055, term274055.getClass(), "denominator", 1671433852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term274055;
        try {
            callMethod(klass, "subtract", argTypes, term273975, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


