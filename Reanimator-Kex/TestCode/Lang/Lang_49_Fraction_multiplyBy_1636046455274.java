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

public class Fraction_multiplyBy_1636046455274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68024;
     Object term68104;

    public Fraction_multiplyBy_1636046455274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68024 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term68024, term68024.getClass(), "numerator", 143315162);
        term68104 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term68104, term68104.getClass(), "numerator", 672474);
        setIntField(term68104, term68104.getClass(), "denominator", 1730503553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term68104;
        try {
            callMethod(klass, "multiplyBy", argTypes, term68024, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


