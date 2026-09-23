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

public class Fraction_add_2763527041726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559984;
     Object term560066;

    public Fraction_add_2763527041726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559984 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term559984, term559984.getClass(), "numerator", 67108864);
        setIntField(term559984, term559984.getClass(), "denominator", 614691964);
        term560066 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term560066, term560066.getClass(), "numerator", 134217728);
        setIntField(term560066, term560066.getClass(), "denominator", -1075396610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term560066;
        try {
            callMethod(klass, "add", argTypes, term559984, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


