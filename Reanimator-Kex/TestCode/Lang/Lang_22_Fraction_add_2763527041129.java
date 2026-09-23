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

public class Fraction_add_2763527041129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363673;
     Object term363755;

    public Fraction_add_2763527041129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363673 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term363673, term363673.getClass(), "numerator", 134217728);
        setIntField(term363673, term363673.getClass(), "denominator", 1112527724);
        term363755 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term363755, term363755.getClass(), "numerator", 8388608);
        setIntField(term363755, term363755.getClass(), "denominator", -1616352538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term363755;
        try {
            callMethod(klass, "add", argTypes, term363673, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


