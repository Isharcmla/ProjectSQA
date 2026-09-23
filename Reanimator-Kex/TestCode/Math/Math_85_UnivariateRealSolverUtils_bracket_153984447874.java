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
import org.apache.commons.math.ConvergenceException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UnivariateRealSolverUtils_bracket_153984447874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56447;

    public UnivariateRealSolverUtils_bracket_153984447874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56447 = newInstance(Class.forName("org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm"));
        double[] term55211 = (double[]) newDoubleArray(511);
        double[] term55723 = (double[]) newDoubleArray(510);
        setField(term56447, term56447.getClass(), "a", term55211);
        setField(term56447, term56447.getClass(), "c", term55723);
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
        args[0] = term56447;
        args[1] = -4.000000000000001;
        args[2] = -8.218750000000004;
        args[3] = 2.4893153843771523E-307;
        try {
            callMethod(klass, "bracket", argTypes, null, args);
            assertTrue(false);
        }
        catch (ConvergenceException e) {
        }

    }

};


