package org.apache.commons.math.analysis;

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
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class BrentSolver_solve_74974203873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15562;

    public BrentSolver_solve_74974203873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15562 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term15670 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term14893 = (double[]) newDoubleArray(489);
        setIntField(term15562, term15562.getClass(), "maximalIterationCount", 1);
        setDoubleField(term15562, term15562.getClass(), "functionValueAccuracy", -9.2228438137832397E18);
        setDoubleField(term15562, term15562.getClass(), "relativeAccuracy", 9.2191614571433165E18);
        setDoubleField(term15562, term15562.getClass(), "absoluteAccuracy", 4.7558012065032438E18);
        setField(term15670, term15670.getClass(), "coefficients", term14893);
        setField(term15562, term15562.getClass(), "f", term15670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        Object[] args = new Object[6];
        args[0] = -4.450147717030592E-308;
        args[1] = 0.0;
        args[2] = -4.0;
        args[3] = 1.8219900867781276E-77;
        args[4] = Double.NaN;
        args[5] = -2.896516361533936E154;
        try {
            callMethod(klass, "solve", argTypes, term15562, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


