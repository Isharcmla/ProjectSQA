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

public class Fraction_multiplyBy_16360464552462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732278;
     Object term732358;

    public Fraction_multiplyBy_16360464552462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732278 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term732278, term732278.getClass(), "numerator", 238824770);
        term732358 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term732358, term732358.getClass(), "numerator", 238824770);
        setIntField(term732358, term732358.getClass(), "denominator", 798032557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term732358;
        try {
            callMethod(klass, "multiplyBy", argTypes, term732278, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


