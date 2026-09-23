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

public class Fraction_multiplyBy_4574221381209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392205;
     Object term392287;

    public Fraction_multiplyBy_4574221381209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392205 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term392205, term392205.getClass(), "numerator", 1350180730);
        setIntField(term392205, term392205.getClass(), "denominator", -4);
        term392287 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term392287, term392287.getClass(), "numerator", 1073741825);
        setIntField(term392287, term392287.getClass(), "denominator", 1193705513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term392287;
        try {
            callMethod(klass, "multiplyBy", argTypes, term392205, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


