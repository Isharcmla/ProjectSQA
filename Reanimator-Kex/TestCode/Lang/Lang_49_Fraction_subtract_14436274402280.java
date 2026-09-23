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

public class Fraction_subtract_14436274402280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674434;
     Object term674514;

    public Fraction_subtract_14436274402280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674434 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term674434, term674434.getClass(), "numerator", 1024);
        setIntField(term674434, term674434.getClass(), "denominator", -1059272);
        term674514 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term674514, term674514.getClass(), "numerator", 1048576);
        setIntField(term674514, term674514.getClass(), "denominator", 719868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term674514;
        try {
            callMethod(klass, "subtract", argTypes, term674434, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


