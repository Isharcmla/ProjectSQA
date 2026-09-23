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

public class Fraction_multiplyBy_16360464551097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317320;
     Object term317400;

    public Fraction_multiplyBy_16360464551097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317320 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term317320, term317320.getClass(), "numerator", 1584854);
        setIntField(term317320, term317320.getClass(), "denominator", 1473544283);
        term317400 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term317400, term317400.getClass(), "numerator", 2128871746);
        setIntField(term317400, term317400.getClass(), "denominator", 1210805879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term317400;
        try {
            callMethod(klass, "multiplyBy", argTypes, term317320, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


