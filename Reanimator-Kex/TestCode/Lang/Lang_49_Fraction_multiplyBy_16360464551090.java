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

public class Fraction_multiplyBy_16360464551090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314555;
     Object term314635;

    public Fraction_multiplyBy_16360464551090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314555 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term314555, term314555.getClass(), "numerator", 718542030);
        setIntField(term314555, term314555.getClass(), "denominator", 1231924877);
        term314635 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term314635, term314635.getClass(), "numerator", 1386128494);
        setIntField(term314635, term314635.getClass(), "denominator", 1249683411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term314635;
        try {
            callMethod(klass, "multiplyBy", argTypes, term314555, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


