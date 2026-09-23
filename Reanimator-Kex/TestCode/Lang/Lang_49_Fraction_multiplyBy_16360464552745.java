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

public class Fraction_multiplyBy_16360464552745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term818064;
     Object term818144;

    public Fraction_multiplyBy_16360464552745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term818064 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term818064, term818064.getClass(), "numerator", 293203250);
        term818144 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term818144, term818144.getClass(), "numerator", 293203250);
        setIntField(term818144, term818144.getClass(), "denominator", 269563653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term818144;
        try {
            callMethod(klass, "multiplyBy", argTypes, term818064, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


