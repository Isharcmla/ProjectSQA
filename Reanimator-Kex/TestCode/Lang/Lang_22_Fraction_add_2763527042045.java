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

public class Fraction_add_2763527042045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665777;
     Object term665859;

    public Fraction_add_2763527042045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665777 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term665777, term665777.getClass(), "numerator", 536870912);
        setIntField(term665777, term665777.getClass(), "denominator", 1422557484);
        term665859 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term665859, term665859.getClass(), "numerator", 16384);
        setIntField(term665859, term665859.getClass(), "denominator", -1837383866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term665859;
        try {
            callMethod(klass, "add", argTypes, term665777, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


