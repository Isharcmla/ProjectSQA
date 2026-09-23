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
import org.apache.commons.math3.exception.NoDataException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GaussNewtonOptimizer_doOptimize_158447067137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26288;

    public GaussNewtonOptimizer_doOptimize_158447067137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26288 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term26392 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleValueChecker"));
        double[] term26098 = (double[]) newDoubleArray(0);
        Object term26502 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(term26288, term26288.getClass(), "lowerBound", null);
        setField(term26288, term26288.getClass(), "upperBound", null);
        setField(term26288, term26288.getClass(), "checker", term26392);
        setField(term26288, term26288.getClass(), "target", term26098);
        setField(term26288, term26288.getClass(), "weightMatrix", term26502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term26288, args);
            assertTrue(false);
        }
        catch (NoDataException e) {
        }

    }

};


