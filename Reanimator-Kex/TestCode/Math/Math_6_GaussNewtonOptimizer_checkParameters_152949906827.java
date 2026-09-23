package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

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
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GaussNewtonOptimizer_checkParameters_152949906827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14108;

    public GaussNewtonOptimizer_checkParameters_152949906827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14108 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] term13935 = (double[]) newDoubleArray(0);
        setField(term14108, term14108.getClass(), "lowerBound", null);
        setField(term14108, term14108.getClass(), "upperBound", term13935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "checkParameters", argTypes, term14108, args);
            assertTrue(false);
        }
        catch (MathUnsupportedOperationException e) {
        }

    }

};


