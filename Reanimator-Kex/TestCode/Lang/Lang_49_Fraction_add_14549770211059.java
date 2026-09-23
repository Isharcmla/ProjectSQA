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

public class Fraction_add_14549770211059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305840;
     Object term305920;

    public Fraction_add_14549770211059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305840 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term305840, term305840.getClass(), "numerator", 1073741824);
        setIntField(term305840, term305840.getClass(), "denominator", 136839276);
        term305920 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term305920, term305920.getClass(), "numerator", 1073741824);
        setIntField(term305920, term305920.getClass(), "denominator", -136839322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term305920;
        try {
            callMethod(klass, "add", argTypes, term305840, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


