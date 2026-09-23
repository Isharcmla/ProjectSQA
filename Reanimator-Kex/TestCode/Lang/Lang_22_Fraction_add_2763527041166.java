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

public class Fraction_add_2763527041166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376330;
     Object term376412;

    public Fraction_add_2763527041166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376330 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term376330, term376330.getClass(), "numerator", 262144);
        setIntField(term376330, term376330.getClass(), "denominator", 676988);
        term376412 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term376412, term376412.getClass(), "numerator", 4);
        setIntField(term376412, term376412.getClass(), "denominator", -1126914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term376412;
        try {
            callMethod(klass, "add", argTypes, term376330, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


