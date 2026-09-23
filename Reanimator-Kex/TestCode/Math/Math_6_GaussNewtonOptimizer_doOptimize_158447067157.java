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

public class GaussNewtonOptimizer_doOptimize_158447067157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105169;

    public GaussNewtonOptimizer_doOptimize_158447067157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105169 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term105273 = newInstance(Class.forName("org.apache.commons.math3.optim.SimplePointChecker"));
        double[] term61377 = (double[]) newDoubleArray(0);
        Object term105371 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term105169, term105169.getClass(), "lowerBound", null);
        setField(term105169, term105169.getClass(), "upperBound", null);
        setField(term105169, term105169.getClass(), "checker", term105273);
        setField(term105169, term105169.getClass(), "target", term61377);
        setField(term105371, term105371.getClass(), "data", term61377);
        setField(term105169, term105169.getClass(), "weightMatrix", term105371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term105169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


