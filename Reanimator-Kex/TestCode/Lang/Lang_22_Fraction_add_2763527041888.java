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

public class Fraction_add_2763527041888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616816;
     Object term616898;

    public Fraction_add_2763527041888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term616816 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term616816, term616816.getClass(), "numerator", 4096);
        setIntField(term616816, term616816.getClass(), "denominator", 659529244);
        term616898 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term616898, term616898.getClass(), "numerator", 16384);
        setIntField(term616898, term616898.getClass(), "denominator", -598780802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term616898;
        try {
            callMethod(klass, "add", argTypes, term616816, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


