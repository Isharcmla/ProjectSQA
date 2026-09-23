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

public class GaussNewtonOptimizer_doOptimize_158447067191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385849;

    public GaussNewtonOptimizer_doOptimize_158447067191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385849 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term385995 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        double[] term340499 = (double[]) newDoubleArray(0);
        Object term386093 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term385849, term385849.getClass(), "lowerBound", null);
        setField(term385849, term385849.getClass(), "upperBound", null);
        setField(term385849, term385849.getClass(), "checker", term385995);
        setField(term385849, term385849.getClass(), "target", term340499);
        setField(term386093, term386093.getClass(), "data", term340499);
        setField(term385849, term385849.getClass(), "weightMatrix", term386093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term385849, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


