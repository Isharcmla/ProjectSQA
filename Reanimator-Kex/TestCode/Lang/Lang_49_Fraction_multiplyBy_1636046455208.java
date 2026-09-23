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

public class Fraction_multiplyBy_1636046455208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49165;
     Object term49245;

    public Fraction_multiplyBy_1636046455208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49165 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term49165, term49165.getClass(), "numerator", 1131905090);
        term49245 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term49245, term49245.getClass(), "numerator", 1078231106);
        setIntField(term49245, term49245.getClass(), "denominator", 604286429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term49245;
        try {
            callMethod(klass, "multiplyBy", argTypes, term49165, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


