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

public class Fraction_multiplyBy_1636046455115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20701;
     Object term20781;

    public Fraction_multiplyBy_1636046455115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20701 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term20701, term20701.getClass(), "numerator", 148955234);
        term20781 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term20781, term20781.getClass(), "numerator", 12623970);
        setIntField(term20781, term20781.getClass(), "denominator", 1882473181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term20781;
        try {
            callMethod(klass, "multiplyBy", argTypes, term20701, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


