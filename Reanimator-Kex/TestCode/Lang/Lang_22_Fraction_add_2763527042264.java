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

public class Fraction_add_2763527042264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term738225;
     Object term738307;

    public Fraction_add_2763527042264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term738225 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term738225, term738225.getClass(), "numerator", 1073741824);
        setIntField(term738225, term738225.getClass(), "denominator", 1396499500);
        term738307 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term738307, term738307.getClass(), "numerator", 1073741824);
        setIntField(term738307, term738307.getClass(), "denominator", -1352699962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term738307;
        try {
            callMethod(klass, "add", argTypes, term738225, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


