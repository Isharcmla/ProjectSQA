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

public class Fraction_add_1454977021937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268338;
     Object term268418;

    public Fraction_add_1454977021937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268338 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term268338, term268338.getClass(), "numerator", -2147483648);
        setIntField(term268338, term268338.getClass(), "denominator", 1102710116);
        term268418 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term268418, term268418.getClass(), "numerator", -2147483648);
        setIntField(term268418, term268418.getClass(), "denominator", -1625355454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term268418;
        try {
            callMethod(klass, "add", argTypes, term268338, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


