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

public class Fraction_subtract_1443627440571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157106;
     Object term157186;

    public Fraction_subtract_1443627440571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157106 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term157106, term157106.getClass(), "numerator", 262144);
        setIntField(term157106, term157106.getClass(), "denominator", -1259299016);
        term157186 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term157186, term157186.getClass(), "numerator", 1073741824);
        setIntField(term157186, term157186.getClass(), "denominator", 1606577020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term157186;
        try {
            callMethod(klass, "subtract", argTypes, term157106, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


