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

public class Fraction_add_2763527042518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term825060;
     Object term825142;

    public Fraction_add_2763527042518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term825060 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term825060, term825060.getClass(), "numerator", 134217728);
        setIntField(term825060, term825060.getClass(), "denominator", 1034257404);
        term825142 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term825142, term825142.getClass(), "numerator", 16777216);
        setIntField(term825142, term825142.getClass(), "denominator", -1746074178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term825142;
        try {
            callMethod(klass, "add", argTypes, term825060, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


