package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_751775572485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192273;
     Object term192363;

    public Fraction_add_751775572485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192273 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term192273, term192273.getClass(), "numerator", 33554432);
        setIntField(term192273, term192273.getClass(), "denominator", -1803534110);
        term192363 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term192363, term192363.getClass(), "numerator", -2147483648);
        setIntField(term192363, term192363.getClass(), "denominator", -2099396807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term192363;
        try {
            callMethod(klass, "add", argTypes, term192273, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


