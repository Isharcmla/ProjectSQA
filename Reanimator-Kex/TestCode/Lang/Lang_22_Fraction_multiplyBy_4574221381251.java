package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_4574221381251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405201;
     Object term405283;

    public Fraction_multiplyBy_4574221381251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405201 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term405201, term405201.getClass(), "numerator", 624953806);
        setIntField(term405201, term405201.getClass(), "denominator", 2063532301);
        term405283 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term405283, term405283.getClass(), "numerator", 1375688206);
        setIntField(term405283, term405283.getClass(), "denominator", 1157693171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term405283;
        try {
            callMethod(klass, "multiplyBy", argTypes, term405201, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


