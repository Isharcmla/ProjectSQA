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

public class CMAESOptimizer_initializeCMA_65009037885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52621;
     Object term52217;

    public CMAESOptimizer_initializeCMA_65009037885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52621 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object[] term52229 = (Object[]) newArray("[D", 12);
        double[] term52230 = (double[]) newDoubleArray(116);
        setIntField(term52621, term52621.getClass(), "lambda", 0);
        setIntField(term52621, term52621.getClass(), "dimension", 0);
        setElement(term52229, 1, term52230);
        setField(term52621, term52621.getClass(), "boundaries", term52229);
        term52217 = (double[]) newDoubleArray(8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term52217;
        try {
            callMethod(klass, "initializeCMA", argTypes, term52621, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


