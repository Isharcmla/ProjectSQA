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

public class Fraction_add_751775572809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391170;
     Object term391260;

    public Fraction_add_751775572809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term391170 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term391170, term391170.getClass(), "numerator", 4096);
        setIntField(term391170, term391170.getClass(), "denominator", -1182177838);
        term391260 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term391260, term391260.getClass(), "numerator", 512);
        setIntField(term391260, term391260.getClass(), "denominator", -1718504575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term391260;
        try {
            callMethod(klass, "add", argTypes, term391170, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


