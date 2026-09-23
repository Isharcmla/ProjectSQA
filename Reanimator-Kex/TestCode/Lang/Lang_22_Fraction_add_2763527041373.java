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

public class Fraction_add_2763527041373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447606;
     Object term447688;

    public Fraction_add_2763527041373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term447606 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term447606, term447606.getClass(), "numerator", 8192);
        setIntField(term447606, term447606.getClass(), "denominator", 35947836);
        term447688 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term447688, term447688.getClass(), "numerator", 268435456);
        setIntField(term447688, term447688.getClass(), "denominator", -63797666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term447688;
        try {
            callMethod(klass, "add", argTypes, term447606, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


