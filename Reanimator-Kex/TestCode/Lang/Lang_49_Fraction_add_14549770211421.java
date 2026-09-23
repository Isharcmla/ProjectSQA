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

public class Fraction_add_14549770211421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414691;
     Object term414771;

    public Fraction_add_14549770211421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term414691 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term414691, term414691.getClass(), "numerator", 33554432);
        setIntField(term414691, term414691.getClass(), "denominator", 1358090172);
        term414771 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term414771, term414771.getClass(), "numerator", 1073741824);
        setIntField(term414771, term414771.getClass(), "denominator", -1991536050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term414771;
        try {
            callMethod(klass, "add", argTypes, term414691, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


