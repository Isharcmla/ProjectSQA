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

public class GaussNewtonOptimizer_doOptimize_158447067153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59163;

    public GaussNewtonOptimizer_doOptimize_158447067153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59163 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term59267 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleValueChecker"));
        double[] term58669 = (double[]) newDoubleArray(0);
        Object term59365 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term59163, term59163.getClass(), "lowerBound", null);
        setField(term59163, term59163.getClass(), "upperBound", null);
        setField(term59163, term59163.getClass(), "checker", term59267);
        setField(term59163, term59163.getClass(), "target", term58669);
        setField(term59365, term59365.getClass(), "data", term58669);
        setField(term59163, term59163.getClass(), "weightMatrix", term59365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term59163, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


