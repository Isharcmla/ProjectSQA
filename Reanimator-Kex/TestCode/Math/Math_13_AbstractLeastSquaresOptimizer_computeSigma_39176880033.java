package org.apache.commons.math3.optimization.general;

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
import static org.apache.commons.math3.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class AbstractLeastSquaresOptimizer_computeSigma_39176880033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term39;

    public AbstractLeastSquaresOptimizer_computeSigma_39176880033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = (double[]) newDoubleArray(4);
        setDoubleElement(term34, 0, 0.9527281779865117);
        setDoubleElement(term34, 1, 0.9828442029246764);
        setDoubleElement(term34, 2, 0.2779719046761513);
        setDoubleElement(term34, 3, 0.6436713023569729);
        term39 = new Double(0.7332741045694002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term34;
        args[1] = term39;
        try {
            callMethod(klass, "computeSigma", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


