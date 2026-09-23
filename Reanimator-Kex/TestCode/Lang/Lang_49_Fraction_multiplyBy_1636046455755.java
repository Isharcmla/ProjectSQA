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

public class Fraction_multiplyBy_1636046455755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210471;
     Object term210551;

    public Fraction_multiplyBy_1636046455755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210471 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term210471, term210471.getClass(), "numerator", 481366794);
        term210551 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term210551, term210551.getClass(), "numerator", 10556162);
        setIntField(term210551, term210551.getClass(), "denominator", 1629526529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term210551;
        try {
            callMethod(klass, "multiplyBy", argTypes, term210471, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


