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

public class CMAESOptimizer_initializeCMA_65009037892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54911;
     Object term54507;

    public CMAESOptimizer_initializeCMA_65009037892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54911 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object[] term54519 = (Object[]) newArray("[D", 12);
        double[] term54520 = (double[]) newDoubleArray(116);
        setIntField(term54911, term54911.getClass(), "lambda", 0);
        setIntField(term54911, term54911.getClass(), "dimension", 0);
        setElement(term54519, 1, term54520);
        setField(term54911, term54911.getClass(), "boundaries", term54519);
        term54507 = (double[]) newDoubleArray(8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term54507;
        try {
            callMethod(klass, "initializeCMA", argTypes, term54911, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


