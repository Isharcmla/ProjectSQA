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

public class Fraction_multiplyBy_16360464552554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761424;
     Object term761504;

    public Fraction_multiplyBy_16360464552554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term761424 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term761424, term761424.getClass(), "numerator", 503822738);
        term761504 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term761504, term761504.getClass(), "numerator", 178578);
        setIntField(term761504, term761504.getClass(), "denominator", 292814885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term761504;
        try {
            callMethod(klass, "multiplyBy", argTypes, term761424, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


