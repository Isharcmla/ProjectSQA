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

public class Fraction_multiplyBy_1636046455720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200149;
     Object term200229;

    public Fraction_multiplyBy_1636046455720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200149 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term200149, term200149.getClass(), "numerator", 1560153786);
        setIntField(term200149, term200149.getClass(), "denominator", 1024);
        term200229 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term200229, term200229.getClass(), "numerator", 1073741825);
        setIntField(term200229, term200229.getClass(), "denominator", 813724585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term200229;
        try {
            callMethod(klass, "multiplyBy", argTypes, term200149, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


