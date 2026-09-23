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

public class Fraction_add_2763527042577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term845725;
     Object term845807;

    public Fraction_add_2763527042577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term845725 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term845725, term845725.getClass(), "numerator", 1073741824);
        setIntField(term845725, term845725.getClass(), "denominator", 1419272116);
        term845807 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term845807, term845807.getClass(), "numerator", 268435456);
        setIntField(term845807, term845807.getClass(), "denominator", -2083687894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term845807;
        try {
            callMethod(klass, "add", argTypes, term845725, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


