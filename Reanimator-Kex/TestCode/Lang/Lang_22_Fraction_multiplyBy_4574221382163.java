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

public class Fraction_multiplyBy_4574221382163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705134;
     Object term705216;

    public Fraction_multiplyBy_4574221382163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term705134 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term705134, term705134.getClass(), "numerator", 1266802818);
        setIntField(term705134, term705134.getClass(), "denominator", 456654831);
        term705216 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term705216, term705216.getClass(), "numerator", 718274570);
        setIntField(term705216, term705216.getClass(), "denominator", 1166395357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term705216;
        try {
            callMethod(klass, "multiplyBy", argTypes, term705134, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


