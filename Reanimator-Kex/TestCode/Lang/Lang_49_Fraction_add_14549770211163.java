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

public class Fraction_add_14549770211163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337781;
     Object term337861;

    public Fraction_add_14549770211163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337781 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term337781, term337781.getClass(), "numerator", 8388608);
        setIntField(term337781, term337781.getClass(), "denominator", 154070124);
        term337861 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term337861, term337861.getClass(), "numerator", 8388608);
        setIntField(term337861, term337861.getClass(), "denominator", -212209178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term337861;
        try {
            callMethod(klass, "add", argTypes, term337781, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


