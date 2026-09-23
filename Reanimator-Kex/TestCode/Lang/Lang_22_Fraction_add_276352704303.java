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

public class Fraction_add_276352704303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84976;
     Object term85058;

    public Fraction_add_276352704303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84976 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term84976, term84976.getClass(), "numerator", 1073741824);
        setIntField(term84976, term84976.getClass(), "denominator", 936109012);
        term85058 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term85058, term85058.getClass(), "numerator", 1073741824);
        setIntField(term85058, term85058.getClass(), "denominator", -1395740742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term85058;
        try {
            callMethod(klass, "add", argTypes, term84976, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


