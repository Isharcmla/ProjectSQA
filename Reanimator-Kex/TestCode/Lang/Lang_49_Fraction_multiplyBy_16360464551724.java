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

public class Fraction_multiplyBy_16360464551724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505104;
     Object term505184;

    public Fraction_multiplyBy_16360464551724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term505104 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term505104, term505104.getClass(), "numerator", 1610612994);
        term505184 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term505184, term505184.getClass(), "numerator", 10485761);
        setIntField(term505184, term505184.getClass(), "denominator", 1306939365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term505184;
        try {
            callMethod(klass, "multiplyBy", argTypes, term505104, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


