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

public class Fraction_add_1454977021805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226206;
     Object term226286;

    public Fraction_add_1454977021805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226206 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term226206, term226206.getClass(), "numerator", 128);
        setIntField(term226206, term226206.getClass(), "denominator", 1778369348);
        term226286 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term226286, term226286.getClass(), "numerator", 2048);
        setIntField(term226286, term226286.getClass(), "denominator", -2098203598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term226286;
        try {
            callMethod(klass, "add", argTypes, term226206, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


