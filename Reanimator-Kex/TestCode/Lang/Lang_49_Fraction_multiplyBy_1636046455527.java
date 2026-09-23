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

public class Fraction_multiplyBy_1636046455527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145138;
     Object term145218;

    public Fraction_multiplyBy_1636046455527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145138 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term145138, term145138.getClass(), "numerator", 925039214);
        setIntField(term145138, term145138.getClass(), "denominator", 385803485);
        term145218 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term145218, term145218.getClass(), "numerator", 705321294);
        setIntField(term145218, term145218.getClass(), "denominator", 1627847947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term145218;
        try {
            callMethod(klass, "multiplyBy", argTypes, term145138, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


