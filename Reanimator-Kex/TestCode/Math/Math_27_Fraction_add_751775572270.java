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

public class Fraction_add_751775572270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104803;
     Object term104893;

    public Fraction_add_751775572270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104803 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term104803, term104803.getClass(), "numerator", -2147483648);
        setIntField(term104803, term104803.getClass(), "denominator", -2134892542);
        term104893 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term104893, term104893.getClass(), "numerator", -2147483648);
        setIntField(term104893, term104893.getClass(), "denominator", -1613704471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term104893;
        try {
            callMethod(klass, "add", argTypes, term104803, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


