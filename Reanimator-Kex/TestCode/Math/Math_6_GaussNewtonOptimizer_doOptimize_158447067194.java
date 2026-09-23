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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GaussNewtonOptimizer_doOptimize_158447067194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413324;

    public GaussNewtonOptimizer_doOptimize_158447067194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413324 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term413440 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        double[] term386670 = (double[]) newDoubleArray(0);
        Object term413538 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term413324, term413324.getClass(), "lowerBound", null);
        setField(term413324, term413324.getClass(), "upperBound", null);
        setField(term413324, term413324.getClass(), "checker", term413440);
        setField(term413324, term413324.getClass(), "target", term386670);
        setField(term413538, term413538.getClass(), "data", term386670);
        setField(term413324, term413324.getClass(), "weightMatrix", term413538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term413324, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


