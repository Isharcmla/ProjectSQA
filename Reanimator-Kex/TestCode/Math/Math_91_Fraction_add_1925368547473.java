package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173147;
     Object term173235;

    public Fraction_add_1925368547473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173147 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term173147, term173147.getClass(), "numerator", 4096);
        setIntField(term173147, term173147.getClass(), "denominator", -233764191);
        term173235 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term173235, term173235.getClass(), "numerator", 2097152);
        setIntField(term173235, term173235.getClass(), "denominator", 2116914925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term173235;
        try {
            callMethod(klass, "add", argTypes, term173147, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


