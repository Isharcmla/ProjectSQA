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

public class Fraction_multiplyBy_1636046455519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142228;
     Object term142308;

    public Fraction_multiplyBy_1636046455519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142228 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term142228, term142228.getClass(), "numerator", 558707914);
        setIntField(term142228, term142228.getClass(), "denominator", 1634213883);
        term142308 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term142308, term142308.getClass(), "numerator", 1223704578);
        setIntField(term142308, term142308.getClass(), "denominator", 2023130241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term142308;
        try {
            callMethod(klass, "multiplyBy", argTypes, term142228, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


