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

public class GaussNewtonOptimizer_doOptimize_158447067198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418420;

    public GaussNewtonOptimizer_doOptimize_158447067198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418420 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term418524 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleValueChecker"));
        double[] term413541 = (double[]) newDoubleArray(504);
        Object term418622 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term418420, term418420.getClass(), "lowerBound", null);
        setField(term418420, term418420.getClass(), "upperBound", null);
        setField(term418420, term418420.getClass(), "checker", term418524);
        setField(term418420, term418420.getClass(), "target", term413541);
        setField(term418622, term418622.getClass(), "data", term413541);
        setField(term418420, term418420.getClass(), "weightMatrix", term418622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term418420, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


