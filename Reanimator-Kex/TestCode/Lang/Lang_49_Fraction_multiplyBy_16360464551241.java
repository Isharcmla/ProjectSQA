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

public class Fraction_multiplyBy_16360464551241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363345;
     Object term363425;

    public Fraction_multiplyBy_16360464551241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363345 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term363345, term363345.getClass(), "numerator", 16646138);
        setIntField(term363345, term363345.getClass(), "denominator", -2147483648);
        term363425 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term363425, term363425.getClass(), "numerator", -16646144);
        setIntField(term363425, term363425.getClass(), "denominator", 16440497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term363425;
        try {
            callMethod(klass, "multiplyBy", argTypes, term363345, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


