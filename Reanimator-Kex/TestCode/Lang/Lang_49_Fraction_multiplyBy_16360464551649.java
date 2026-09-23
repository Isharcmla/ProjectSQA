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

public class Fraction_multiplyBy_16360464551649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484798;
     Object term484878;

    public Fraction_multiplyBy_16360464551649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term484798 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term484798, term484798.getClass(), "numerator", 22861546);
        setIntField(term484798, term484798.getClass(), "denominator", 1074020103);
        term484878 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term484878, term484878.getClass(), "numerator", 2147319562);
        setIntField(term484878, term484878.getClass(), "denominator", 1121192457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term484878;
        try {
            callMethod(klass, "multiplyBy", argTypes, term484798, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


