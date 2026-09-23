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

public class Fraction_add_14549770211542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term453299;
     Object term453379;

    public Fraction_add_14549770211542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term453299 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term453299, term453299.getClass(), "numerator", -2147483648);
        setIntField(term453299, term453299.getClass(), "denominator", 1055388332);
        term453379 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term453379, term453379.getClass(), "numerator", -2147483648);
        setIntField(term453379, term453379.getClass(), "denominator", -1406796538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term453379;
        try {
            callMethod(klass, "add", argTypes, term453299, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


