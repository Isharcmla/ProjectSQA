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

public class Fraction_add_1454977021657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182611;
     Object term182691;

    public Fraction_add_1454977021657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182611 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term182611, term182611.getClass(), "numerator", 1);
        setIntField(term182611, term182611.getClass(), "denominator", 1090957500);
        term182691 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term182691, term182691.getClass(), "numerator", 131072);
        setIntField(term182691, term182691.getClass(), "denominator", -1619386290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term182691;
        try {
            callMethod(klass, "add", argTypes, term182611, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


