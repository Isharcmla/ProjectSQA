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

public class GaussNewtonOptimizer_doOptimize_158447067165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199865;

    public GaussNewtonOptimizer_doOptimize_158447067165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199865 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term199969 = newInstance(Class.forName("org.apache.commons.math3.optim.SimplePointChecker"));
        double[] term199617 = (double[]) newDoubleArray(0);
        Object term200067 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        double[] term199623 = (double[]) newDoubleArray(0);
        setField(term199865, term199865.getClass(), "lowerBound", null);
        setField(term199865, term199865.getClass(), "upperBound", null);
        setField(term199865, term199865.getClass(), "checker", term199969);
        setField(term199865, term199865.getClass(), "target", term199617);
        setField(term200067, term200067.getClass(), "data", term199623);
        setField(term199865, term199865.getClass(), "weightMatrix", term200067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term199865, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


