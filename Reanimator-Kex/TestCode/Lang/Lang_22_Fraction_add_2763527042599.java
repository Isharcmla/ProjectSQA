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

public class Fraction_add_2763527042599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term851658;
     Object term851740;

    public Fraction_add_2763527042599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term851658 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term851658, term851658.getClass(), "numerator", -2147483648);
        setIntField(term851658, term851658.getClass(), "denominator", 1595968196);
        term851740 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term851740, term851740.getClass(), "numerator", -2147483648);
        setIntField(term851740, term851740.getClass(), "denominator", -1575557006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term851740;
        try {
            callMethod(klass, "add", argTypes, term851658, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


