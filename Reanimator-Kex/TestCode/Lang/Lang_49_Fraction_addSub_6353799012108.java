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

public class Fraction_addSub_6353799012108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620437;
     Object term620517;

    public Fraction_addSub_6353799012108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term620437 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term620437, term620437.getClass(), "numerator", 2147483647);
        setIntField(term620437, term620437.getClass(), "denominator", 262144);
        term620517 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term620517, term620517.getClass(), "numerator", -2147483648);
        setIntField(term620517, term620517.getClass(), "denominator", 262144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term620517;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term620437, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


