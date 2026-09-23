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

public class Fraction_multiplyBy_457422138591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182875;
     Object term182957;

    public Fraction_multiplyBy_457422138591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182875 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term182875, term182875.getClass(), "numerator", 473646754);
        setIntField(term182875, term182875.getClass(), "denominator", 0);
        term182957 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term182957, term182957.getClass(), "numerator", 532498);
        setIntField(term182957, term182957.getClass(), "denominator", 1632355157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term182957;
        try {
            callMethod(klass, "multiplyBy", argTypes, term182875, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


