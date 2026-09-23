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

public class GaussNewtonOptimizer_doOptimize_158447067190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340252;

    public GaussNewtonOptimizer_doOptimize_158447067190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340252 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term340398 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        double[] term338583 = (double[]) newDoubleArray(0);
        Object term340496 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        double[] term338587 = (double[]) newDoubleArray(0);
        setField(term340252, term340252.getClass(), "lowerBound", null);
        setField(term340252, term340252.getClass(), "upperBound", null);
        setField(term340252, term340252.getClass(), "checker", term340398);
        setField(term340252, term340252.getClass(), "target", term338583);
        setField(term340496, term340496.getClass(), "data", term338587);
        setField(term340252, term340252.getClass(), "weightMatrix", term340496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term340252, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


