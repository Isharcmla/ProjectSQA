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

public class Fraction_addSub_1779294476590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269962;
     Object term270052;

    public Fraction_addSub_1779294476590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269962 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term269962, term269962.getClass(), "numerator", 33554432);
        setIntField(term269962, term269962.getClass(), "denominator", -1809067903);
        term270052 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term270052, term270052.getClass(), "numerator", 33554432);
        setIntField(term270052, term270052.getClass(), "denominator", -472635455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term270052;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term269962, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


