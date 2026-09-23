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

public class GaussNewtonOptimizer_doOptimize_158447067178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282370;

    public GaussNewtonOptimizer_doOptimize_158447067178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282370 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term282486 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        double[] term281786 = (double[]) newDoubleArray(0);
        Object term282584 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term282370, term282370.getClass(), "lowerBound", null);
        setField(term282370, term282370.getClass(), "upperBound", null);
        setField(term282370, term282370.getClass(), "checker", term282486);
        setField(term282370, term282370.getClass(), "target", term281786);
        setField(term282584, term282584.getClass(), "data", term281786);
        setField(term282370, term282370.getClass(), "weightMatrix", term282584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term282370, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


