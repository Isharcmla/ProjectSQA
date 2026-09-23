package org.apache.commons.math.analysis.solvers;

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
import org.apache.commons.math.ArgumentOutsideDomainException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UnivariateRealSolverUtils_bracket_153984447855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30265;

    public UnivariateRealSolverUtils_bracket_153984447855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30265 = newInstance(Class.forName("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction"));
        double[] term29581 = (double[]) newDoubleArray(489);
        setField(term30265, term30265.getClass(), "knots", term29581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term30265;
        args[1] = -0.0;
        args[2] = -2.0000000000000284;
        args[3] = 1.7311155196253479E274;
        try {
            callMethod(klass, "bracket", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArgumentOutsideDomainException e) {
        }

    }

};


