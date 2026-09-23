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

public class Fraction_add_1454977021363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96167;
     Object term96247;

    public Fraction_add_1454977021363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96167 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term96167, term96167.getClass(), "numerator", 33554432);
        setIntField(term96167, term96167.getClass(), "denominator", 1121917084);
        term96247 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term96247, term96247.getClass(), "numerator", 2);
        setIntField(term96247, term96247.getClass(), "denominator", -1665121602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term96247;
        try {
            callMethod(klass, "add", argTypes, term96167, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


