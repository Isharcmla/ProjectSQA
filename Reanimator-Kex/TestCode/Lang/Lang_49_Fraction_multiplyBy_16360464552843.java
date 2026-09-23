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

public class Fraction_multiplyBy_16360464552843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term850427;
     Object term850507;

    public Fraction_multiplyBy_16360464552843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term850427 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term850427, term850427.getClass(), "numerator", 1610579962);
        term850507 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term850507, term850507.getClass(), "numerator", 3);
        setIntField(term850507, term850507.getClass(), "denominator", 2147418097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term850507;
        try {
            callMethod(klass, "multiplyBy", argTypes, term850427, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


