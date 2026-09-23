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

public class Fraction_add_1454977021317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83175;
     Object term83255;

    public Fraction_add_1454977021317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83175 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term83175, term83175.getClass(), "numerator", 16384);
        setIntField(term83175, term83175.getClass(), "denominator", 1263662444);
        term83255 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term83255, term83255.getClass(), "numerator", 1024);
        setIntField(term83255, term83255.getClass(), "denominator", -1877927962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term83255;
        try {
            callMethod(klass, "add", argTypes, term83175, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


