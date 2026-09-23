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

public class GaussNewtonOptimizer_doOptimize_158447067185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324664;

    public GaussNewtonOptimizer_doOptimize_158447067185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324664 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term324780 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        double[] term323419 = (double[]) newDoubleArray(0);
        Object term324878 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term324664, term324664.getClass(), "lowerBound", null);
        setField(term324664, term324664.getClass(), "upperBound", null);
        setField(term324664, term324664.getClass(), "checker", term324780);
        setField(term324664, term324664.getClass(), "target", term323419);
        setField(term324878, term324878.getClass(), "data", term323419);
        setField(term324664, term324664.getClass(), "weightMatrix", term324878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term324664, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


