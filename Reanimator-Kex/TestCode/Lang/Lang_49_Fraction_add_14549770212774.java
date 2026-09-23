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

public class Fraction_add_14549770212774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term828228;
     Object term828308;

    public Fraction_add_14549770212774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term828228 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term828228, term828228.getClass(), "numerator", -2147483648);
        setIntField(term828228, term828228.getClass(), "denominator", 834003100);
        term828308 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term828308, term828308.getClass(), "numerator", 512);
        setIntField(term828308, term828308.getClass(), "denominator", -1090523202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term828308;
        try {
            callMethod(klass, "add", argTypes, term828228, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


