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

public class GaussNewtonOptimizer_doOptimize_158447067150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46674;

    public GaussNewtonOptimizer_doOptimize_158447067150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46674 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term46778 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleValueChecker"));
        double[] term46476 = (double[]) newDoubleArray(0);
        Object term46878 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term46674, term46674.getClass(), "lowerBound", null);
        setField(term46674, term46674.getClass(), "upperBound", null);
        setField(term46674, term46674.getClass(), "checker", term46778);
        setField(term46674, term46674.getClass(), "target", term46476);
        setIntField(term46878, term46878.getClass(), "rows", 1);
        setIntField(term46878, term46878.getClass(), "columns", 1);
        setField(term46674, term46674.getClass(), "weightMatrix", term46878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term46674, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


