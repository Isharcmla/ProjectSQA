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

public class Fraction_add_14549770212395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710799;
     Object term710879;

    public Fraction_add_14549770212395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term710799 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term710799, term710799.getClass(), "numerator", 536870912);
        setIntField(term710799, term710799.getClass(), "denominator", 407179852);
        term710879 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term710879, term710879.getClass(), "numerator", 134217728);
        setIntField(term710879, term710879.getClass(), "denominator", -543808170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term710879;
        try {
            callMethod(klass, "add", argTypes, term710799, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


