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

public class LevenbergMarquardtOptimizer_checkParameters_156607760925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5631;

    public LevenbergMarquardtOptimizer_checkParameters_156607760925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5631 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] term5445 = (double[]) newDoubleArray(0);
        setField(term5631, term5631.getClass(), "lowerBound", term5445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "checkParameters", argTypes, term5631, args);
            assertTrue(false);
        }
        catch (MathUnsupportedOperationException e) {
        }

    }

};


