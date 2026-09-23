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

public class Fraction_add_14549770211473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431119;
     Object term431199;

    public Fraction_add_14549770211473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431119 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term431119, term431119.getClass(), "numerator", 67108864);
        setIntField(term431119, term431119.getClass(), "denominator", 626088348);
        term431199 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term431199, term431199.getClass(), "numerator", 268435456);
        setIntField(term431199, term431199.getClass(), "denominator", -527971650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term431199;
        try {
            callMethod(klass, "add", argTypes, term431119, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


