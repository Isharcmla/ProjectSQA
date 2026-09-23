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

public class Fraction_add_14549770211804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527228;
     Object term527308;

    public Fraction_add_14549770211804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527228 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term527228, term527228.getClass(), "numerator", 2048);
        setIntField(term527228, term527228.getClass(), "denominator", 1668542364);
        term527308 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term527308, term527308.getClass(), "numerator", 1024);
        setIntField(term527308, term527308.getClass(), "denominator", -2081546562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term527308;
        try {
            callMethod(klass, "add", argTypes, term527228, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


