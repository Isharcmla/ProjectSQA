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

public class Fraction_addSub_1779294476786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378133;
     Object term378223;

    public Fraction_addSub_1779294476786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378133 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term378133, term378133.getClass(), "numerator", 16384);
        setIntField(term378133, term378133.getClass(), "denominator", -1409284735);
        term378223 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term378223, term378223.getClass(), "numerator", 2097152);
        setIntField(term378223, term378223.getClass(), "denominator", -1108641727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term378223;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term378133, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


