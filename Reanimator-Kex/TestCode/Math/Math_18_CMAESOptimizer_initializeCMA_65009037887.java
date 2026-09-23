package org.apache.commons.math3.optimization.direct;

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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CMAESOptimizer_initializeCMA_65009037887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54558;
     Object term54154;

    public CMAESOptimizer_initializeCMA_65009037887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54558 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object[] term54166 = (Object[]) newArray("[D", 12);
        double[] term54167 = (double[]) newDoubleArray(116);
        setIntField(term54558, term54558.getClass(), "lambda", 0);
        setIntField(term54558, term54558.getClass(), "dimension", 0);
        setElement(term54166, 1, term54167);
        setField(term54558, term54558.getClass(), "boundaries", term54166);
        term54154 = (double[]) newDoubleArray(8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term54154;
        try {
            callMethod(klass, "initializeCMA", argTypes, term54558, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


