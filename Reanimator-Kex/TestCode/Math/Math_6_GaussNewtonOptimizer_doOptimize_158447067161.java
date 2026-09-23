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

public class GaussNewtonOptimizer_doOptimize_158447067161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173495;

    public GaussNewtonOptimizer_doOptimize_158447067161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173495 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term173599 = newInstance(Class.forName("org.apache.commons.math3.optim.SimplePointChecker"));
        double[] term140609 = (double[]) newDoubleArray(0);
        Object term173697 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term173495, term173495.getClass(), "lowerBound", null);
        setField(term173495, term173495.getClass(), "upperBound", null);
        setField(term173495, term173495.getClass(), "checker", term173599);
        setField(term173495, term173495.getClass(), "target", term140609);
        setField(term173697, term173697.getClass(), "data", term140609);
        setField(term173495, term173495.getClass(), "weightMatrix", term173697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term173495, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


