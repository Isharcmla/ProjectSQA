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

public class Fraction_multiplyBy_16360464552168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640443;
     Object term640523;

    public Fraction_multiplyBy_16360464552168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term640443 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term640443, term640443.getClass(), "numerator", 910177566);
        setIntField(term640443, term640443.getClass(), "denominator", -536870912);
        term640523 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term640523, term640523.getClass(), "numerator", 65);
        setIntField(term640523, term640523.getClass(), "denominator", 2144832619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term640523;
        try {
            callMethod(klass, "multiplyBy", argTypes, term640443, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


