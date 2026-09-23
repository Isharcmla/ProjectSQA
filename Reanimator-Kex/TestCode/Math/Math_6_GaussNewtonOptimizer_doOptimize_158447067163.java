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

public class GaussNewtonOptimizer_doOptimize_158447067163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199083;

    public GaussNewtonOptimizer_doOptimize_158447067163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199083 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term199229 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        double[] term173987 = (double[]) newDoubleArray(0);
        Object term199327 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term199083, term199083.getClass(), "lowerBound", null);
        setField(term199083, term199083.getClass(), "upperBound", null);
        setField(term199083, term199083.getClass(), "checker", term199229);
        setField(term199083, term199083.getClass(), "target", term173987);
        setField(term199327, term199327.getClass(), "data", term173987);
        setField(term199083, term199083.getClass(), "weightMatrix", term199327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term199083, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


