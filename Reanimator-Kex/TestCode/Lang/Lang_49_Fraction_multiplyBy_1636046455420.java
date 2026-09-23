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

public class Fraction_multiplyBy_1636046455420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114545;
     Object term114625;

    public Fraction_multiplyBy_1636046455420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114545 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term114545, term114545.getClass(), "numerator", 1132595674);
        term114625 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term114625, term114625.getClass(), "numerator", 1132595674);
        setIntField(term114625, term114625.getClass(), "denominator", 1851777033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term114625;
        try {
            callMethod(klass, "multiplyBy", argTypes, term114545, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


