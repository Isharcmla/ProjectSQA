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

public class GaussNewtonOptimizer_doOptimize_158447067184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323202;

    public GaussNewtonOptimizer_doOptimize_158447067184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323202 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term323318 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        double[] term302468 = (double[]) newDoubleArray(0);
        Object term323416 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term323202, term323202.getClass(), "lowerBound", null);
        setField(term323202, term323202.getClass(), "upperBound", null);
        setField(term323202, term323202.getClass(), "checker", term323318);
        setField(term323202, term323202.getClass(), "target", term302468);
        setField(term323416, term323416.getClass(), "data", term302468);
        setField(term323202, term323202.getClass(), "weightMatrix", term323416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term323202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


