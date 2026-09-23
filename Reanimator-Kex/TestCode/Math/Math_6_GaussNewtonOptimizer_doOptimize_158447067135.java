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
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GaussNewtonOptimizer_doOptimize_158447067135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23683;

    public GaussNewtonOptimizer_doOptimize_158447067135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23683 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term23829 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        double[] term23486 = (double[]) newDoubleArray(0);
        Object term23929 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term23683, term23683.getClass(), "lowerBound", null);
        setField(term23683, term23683.getClass(), "upperBound", null);
        setField(term23683, term23683.getClass(), "checker", term23829);
        setField(term23683, term23683.getClass(), "target", term23486);
        setIntField(term23929, term23929.getClass(), "rows", 1);
        setIntField(term23929, term23929.getClass(), "columns", 0);
        setField(term23683, term23683.getClass(), "weightMatrix", term23929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term23683, args);
            assertTrue(false);
        }
        catch (NotStrictlyPositiveException e) {
        }

    }

};


