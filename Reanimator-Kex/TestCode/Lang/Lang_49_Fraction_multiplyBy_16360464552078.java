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

public class Fraction_multiplyBy_16360464552078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612110;
     Object term612190;

    public Fraction_multiplyBy_16360464552078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term612110 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term612110, term612110.getClass(), "numerator", 639053202);
        setIntField(term612110, term612110.getClass(), "denominator", 1501877595);
        term612190 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term612190, term612190.getClass(), "numerator", 426107818);
        setIntField(term612190, term612190.getClass(), "denominator", 1182437029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term612190;
        try {
            callMethod(klass, "multiplyBy", argTypes, term612110, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


