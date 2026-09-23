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

public class BrentSolver_solve_74974203883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33288;

    public BrentSolver_solve_74974203883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33288 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term33396 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term31935 = (double[]) newDoubleArray(131);
        setIntField(term33288, term33288.getClass(), "maximalIterationCount", 1);
        setDoubleField(term33288, term33288.getClass(), "functionValueAccuracy", 4.933729950546005E18);
        setDoubleField(term33288, term33288.getClass(), "relativeAccuracy", -9.2218228158811177E18);
        setDoubleField(term33288, term33288.getClass(), "absoluteAccuracy", 8.6288968860418867E18);
        setField(term33396, term33396.getClass(), "coefficients", term31935);
        setField(term33288, term33288.getClass(), "f", term33396);
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
        args[0] = -2.8480945388892178E-306;
        args[1] = 0.0;
        args[2] = -5.696276069039928E-306;
        args[3] = -2.786477288307346E39;
        args[4] = Double.NaN;
        args[5] = -1.2240901100306199E60;
        try {
            callMethod(klass, "solve", argTypes, term33288, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


