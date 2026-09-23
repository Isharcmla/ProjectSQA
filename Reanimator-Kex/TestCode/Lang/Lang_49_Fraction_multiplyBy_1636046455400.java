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

public class Fraction_multiplyBy_1636046455400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108714;
     Object term108794;

    public Fraction_multiplyBy_1636046455400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108714 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term108714, term108714.getClass(), "numerator", 4186);
        term108794 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term108794, term108794.getClass(), "numerator", 82);
        setIntField(term108794, term108794.getClass(), "denominator", 2147481601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term108794;
        try {
            callMethod(klass, "multiplyBy", argTypes, term108714, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


