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

public class GaussNewtonOptimizer_doOptimize_1584470671101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495389;

    public GaussNewtonOptimizer_doOptimize_1584470671101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495389 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term495505 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        double[] term456271 = (double[]) newDoubleArray(0);
        Object term495603 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term495389, term495389.getClass(), "lowerBound", null);
        setField(term495389, term495389.getClass(), "upperBound", null);
        setField(term495389, term495389.getClass(), "checker", term495505);
        setField(term495389, term495389.getClass(), "target", term456271);
        setField(term495603, term495603.getClass(), "data", term456271);
        setField(term495389, term495389.getClass(), "weightMatrix", term495603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term495389, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


