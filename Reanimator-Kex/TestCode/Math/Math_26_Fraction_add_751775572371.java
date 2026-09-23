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

public class Fraction_add_751775572371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162370;
     Object term162460;

    public Fraction_add_751775572371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162370 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term162370, term162370.getClass(), "numerator", 256);
        setIntField(term162370, term162370.getClass(), "denominator", -2013264910);
        term162460 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term162460, term162460.getClass(), "numerator", 256);
        setIntField(term162460, term162460.getClass(), "denominator", -1749477887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term162460;
        try {
            callMethod(klass, "add", argTypes, term162370, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


