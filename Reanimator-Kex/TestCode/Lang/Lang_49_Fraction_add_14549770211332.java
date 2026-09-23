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

public class Fraction_add_14549770211332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389695;
     Object term389775;

    public Fraction_add_14549770211332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389695 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term389695, term389695.getClass(), "numerator", 134217728);
        setIntField(term389695, term389695.getClass(), "denominator", 1801031516);
        term389775 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term389775, term389775.getClass(), "numerator", 1073741824);
        setIntField(term389775, term389775.getClass(), "denominator", -1556653282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term389775;
        try {
            callMethod(klass, "add", argTypes, term389695, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


