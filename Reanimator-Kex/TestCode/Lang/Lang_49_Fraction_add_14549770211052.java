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

public class Fraction_add_14549770211052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303079;
     Object term303159;

    public Fraction_add_14549770211052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303079 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term303079, term303079.getClass(), "numerator", 268435456);
        setIntField(term303079, term303079.getClass(), "denominator", 72081180);
        term303159 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term303159, term303159.getClass(), "numerator", 2);
        setIntField(term303159, term303159.getClass(), "denominator", -82423426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term303159;
        try {
            callMethod(klass, "add", argTypes, term303079, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


