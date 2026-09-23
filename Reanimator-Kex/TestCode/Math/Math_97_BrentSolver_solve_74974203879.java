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

public class BrentSolver_solve_74974203879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25663;

    public BrentSolver_solve_74974203879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25663 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term25771 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term24574 = (double[]) newDoubleArray(102);
        setIntField(term25663, term25663.getClass(), "maximalIterationCount", 1);
        setDoubleField(term25663, term25663.getClass(), "functionValueAccuracy", -8.9323269109359575E18);
        setDoubleField(term25663, term25663.getClass(), "relativeAccuracy", -2.29680608420822989E18);
        setDoubleField(term25663, term25663.getClass(), "absoluteAccuracy", 9.035674887913474E15);
        setField(term25771, term25771.getClass(), "coefficients", term24574);
        setField(term25663, term25663.getClass(), "f", term25771);
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
        args[0] = 2.238648265582006E-308;
        args[1] = 0.0;
        args[2] = 0.0;
        args[3] = 4.925444161558052E-288;
        args[4] = Double.NaN;
        args[5] = -8.00390625;
        try {
            callMethod(klass, "solve", argTypes, term25663, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


