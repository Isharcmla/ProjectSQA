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

public class Fraction_add_14549770211426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416251;
     Object term416331;

    public Fraction_add_14549770211426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term416251 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term416251, term416251.getClass(), "numerator", -2147483648);
        setIntField(term416251, term416251.getClass(), "denominator", 946740252);
        term416331 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term416331, term416331.getClass(), "numerator", 2048);
        setIntField(term416331, term416331.getClass(), "denominator", -1362217474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term416331;
        try {
            callMethod(klass, "add", argTypes, term416251, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


