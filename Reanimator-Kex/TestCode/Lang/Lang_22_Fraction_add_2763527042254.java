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

public class Fraction_add_2763527042254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735215;
     Object term735297;

    public Fraction_add_2763527042254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term735215 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term735215, term735215.getClass(), "numerator", 134217728);
        setIntField(term735215, term735215.getClass(), "denominator", 1211240508);
        term735297 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term735297, term735297.getClass(), "numerator", 8192);
        setIntField(term735297, term735297.getClass(), "denominator", -1681591538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term735297;
        try {
            callMethod(klass, "add", argTypes, term735215, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


