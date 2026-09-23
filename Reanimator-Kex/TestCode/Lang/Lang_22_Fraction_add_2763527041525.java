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

public class Fraction_add_2763527041525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495565;
     Object term495647;

    public Fraction_add_2763527041525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495565 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term495565, term495565.getClass(), "numerator", 268435456);
        setIntField(term495565, term495565.getClass(), "denominator", 56005828);
        term495647 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term495647, term495647.getClass(), "numerator", 1073741824);
        setIntField(term495647, term495647.getClass(), "denominator", -80267534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term495647;
        try {
            callMethod(klass, "add", argTypes, term495565, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


