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

public class Fraction_multiplyBy_16360464551111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321826;
     Object term321906;

    public Fraction_multiplyBy_16360464551111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321826 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term321826, term321826.getClass(), "numerator", 536872202);
        setIntField(term321826, term321826.getClass(), "denominator", 1879005135);
        term321906 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term321906, term321906.getClass(), "numerator", 536858610);
        setIntField(term321906, term321906.getClass(), "denominator", 1090519305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term321906;
        try {
            callMethod(klass, "multiplyBy", argTypes, term321826, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


