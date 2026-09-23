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

public class Fraction_multiplyBy_16360464551123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325418;
     Object term325498;

    public Fraction_multiplyBy_16360464551123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325418 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term325418, term325418.getClass(), "numerator", 427355490);
        term325498 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term325498, term325498.getClass(), "numerator", 24177986);
        setIntField(term325498, term325498.getClass(), "denominator", 1920366597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term325498;
        try {
            callMethod(klass, "multiplyBy", argTypes, term325418, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


