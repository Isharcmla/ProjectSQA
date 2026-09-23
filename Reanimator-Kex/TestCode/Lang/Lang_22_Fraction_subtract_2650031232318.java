package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_2650031232318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term757003;
     Object term757085;

    public Fraction_subtract_2650031232318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term757003 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term757003, term757003.getClass(), "numerator", 134217728);
        setIntField(term757003, term757003.getClass(), "denominator", -2010045048);
        term757085 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term757085, term757085.getClass(), "numerator", 256);
        setIntField(term757085, term757085.getClass(), "denominator", 1125919716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term757085;
        try {
            callMethod(klass, "subtract", argTypes, term757003, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


