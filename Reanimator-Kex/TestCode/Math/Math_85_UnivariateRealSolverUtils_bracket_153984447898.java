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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UnivariateRealSolverUtils_bracket_153984447898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160348;

    public UnivariateRealSolverUtils_bracket_153984447898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160348 = newInstance(Class.forName("org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm"));
        double[] term155891 = (double[]) newDoubleArray(304);
        double[] term156196 = (double[]) newDoubleArray(303);
        setField(term160348, term160348.getClass(), "a", term155891);
        setField(term160348, term160348.getClass(), "c", term156196);
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
        args[0] = term160348;
        args[1] = -14.625122428175475;
        args[2] = -3.281614448586369E36;
        args[3] = 2.0165275531317375E-308;
        callMethod(klass, "bracket", argTypes, null, args);
    }

};


