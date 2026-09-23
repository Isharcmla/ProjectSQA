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

public class Fraction_add_14549770212401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term712760;
     Object term712840;

    public Fraction_add_14549770212401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term712760 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term712760, term712760.getClass(), "numerator", 1073741824);
        setIntField(term712760, term712760.getClass(), "denominator", 1119685764);
        term712840 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term712840, term712840.getClass(), "numerator", 1073741824);
        setIntField(term712840, term712840.getClass(), "denominator", -1665630766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term712840;
        try {
            callMethod(klass, "add", argTypes, term712760, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


