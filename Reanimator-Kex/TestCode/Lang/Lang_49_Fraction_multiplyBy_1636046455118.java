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

public class Fraction_multiplyBy_1636046455118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21735;
     Object term21815;

    public Fraction_multiplyBy_1636046455118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21735 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term21735, term21735.getClass(), "numerator", 1129053850);
        setIntField(term21735, term21735.getClass(), "denominator", 7);
        term21815 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term21815, term21815.getClass(), "numerator", 10);
        setIntField(term21815, term21815.getClass(), "denominator", 1610612409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term21815;
        try {
            callMethod(klass, "multiplyBy", argTypes, term21735, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


