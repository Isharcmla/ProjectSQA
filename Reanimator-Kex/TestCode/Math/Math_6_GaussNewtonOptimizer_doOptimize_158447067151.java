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
import org.apache.commons.math3.exception.OutOfRangeException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GaussNewtonOptimizer_doOptimize_158447067151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51085;

    public GaussNewtonOptimizer_doOptimize_158447067151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51085 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term51189 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleValueChecker"));
        double[] term46881 = (double[]) newDoubleArray(995);
        Object term51287 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        double[] term49870 = (double[]) newDoubleArray(28);
        setField(term51085, term51085.getClass(), "lowerBound", null);
        setField(term51085, term51085.getClass(), "upperBound", null);
        setField(term51085, term51085.getClass(), "checker", term51189);
        setField(term51085, term51085.getClass(), "target", term46881);
        setField(term51287, term51287.getClass(), "data", term49870);
        setField(term51085, term51085.getClass(), "weightMatrix", term51287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term51085, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


