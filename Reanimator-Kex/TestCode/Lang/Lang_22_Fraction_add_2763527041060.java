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

public class Fraction_add_2763527041060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340672;
     Object term340754;

    public Fraction_add_2763527041060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340672 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term340672, term340672.getClass(), "numerator", 1073741824);
        setIntField(term340672, term340672.getClass(), "denominator", 1080050268);
        term340754 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term340754, term340754.getClass(), "numerator", 1073741824);
        setIntField(term340754, term340754.getClass(), "denominator", -1145528674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term340754;
        try {
            callMethod(klass, "add", argTypes, term340672, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


