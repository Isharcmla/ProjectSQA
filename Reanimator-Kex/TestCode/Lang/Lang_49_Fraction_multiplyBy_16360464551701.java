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

public class Fraction_multiplyBy_16360464551701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499261;
     Object term499341;

    public Fraction_multiplyBy_16360464551701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term499261 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term499261, term499261.getClass(), "numerator", 1608515434);
        term499341 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term499341, term499341.getClass(), "numerator", 3);
        setIntField(term499341, term499341.getClass(), "denominator", 2143289193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term499341;
        try {
            callMethod(klass, "multiplyBy", argTypes, term499261, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


