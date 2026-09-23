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

public class Fraction_multiplyBy_1636046455999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287288;
     Object term287368;

    public Fraction_multiplyBy_1636046455999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287288 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term287288, term287288.getClass(), "numerator", 142197338);
        term287368 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term287368, term287368.getClass(), "numerator", 3670034);
        setIntField(term287368, term287368.getClass(), "denominator", 1598192737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term287368;
        try {
            callMethod(klass, "multiplyBy", argTypes, term287288, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


