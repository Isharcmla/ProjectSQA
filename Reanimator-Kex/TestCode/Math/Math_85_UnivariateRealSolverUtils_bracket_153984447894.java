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
import static org.apache.commons.math.analysis.solvers.EqualityUtils.*;
import java.lang.Double;

public class UnivariateRealSolverUtils_bracket_153984447894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131157;
     Object term144795;
     Object term144792;

    public UnivariateRealSolverUtils_bracket_153984447894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131157 = newInstance(Class.forName("org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm"));
        double[] term126072 = (double[]) newDoubleArray(349);
        double[] term126422 = (double[]) newDoubleArray(348);
        setField(term131157, term131157.getClass(), "a", term126072);
        setField(term131157, term131157.getClass(), "c", term126422);
        term144795 = newInstance(Class.forName("org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm"));
        double[] term144796 = (double[]) newDoubleArray(349);
        double[] term144797 = (double[]) newDoubleArray(348);
        setField(term144795, term144795.getClass(), "coefficients", null);
        setField(term144795, term144795.getClass(), "a", term144796);
        setField(term144795, term144795.getClass(), "c", term144797);
        setBooleanField(term144795, term144795.getClass(), "coefficientsComputed", false);
        term144792 = (double[]) newDoubleArray(2);
        setDoubleElement(term144792, 0, Double.NaN);
        setDoubleElement(term144792, 1, 0.9990234363358471);
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
        args[0] = term131157;
        args[1] = -9.76563664152776E-4;
        args[2] = Double.NaN;
        args[3] = 0.9990234363358471;
        Object retValue = callMethod(klass, "bracket", argTypes, null, args);
        assertTrue(recursiveEquals(term131157, term144795));
        assertTrue(recursiveEquals(retValue, term144792));
    }

};


