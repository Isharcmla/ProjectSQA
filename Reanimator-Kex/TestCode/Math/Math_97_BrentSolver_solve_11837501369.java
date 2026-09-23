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
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class BrentSolver_solve_11837501369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14366;
     Object term14578;

    public BrentSolver_solve_11837501369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14366 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term14474 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term14209 = (double[]) newDoubleArray(5);
        setField(term14474, term14474.getClass(), "coefficients", term14209);
        setField(term14366, term14366.getClass(), "f", term14474);
        term14578 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term14579 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term14580 = (double[]) newDoubleArray(5);
        setDoubleField(term14578, term14578.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term14578, term14578.getClass(), "relativeAccuracy", 0.0);
        setDoubleField(term14578, term14578.getClass(), "functionValueAccuracy", 0.0);
        setIntField(term14578, term14578.getClass(), "maximalIterationCount", 0);
        setDoubleField(term14578, term14578.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term14578, term14578.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term14578, term14578.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term14578, term14578.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term14578, term14578.getClass(), "resultComputed", true);
        setDoubleField(term14578, term14578.getClass(), "result", 0.0);
        setIntField(term14578, term14578.getClass(), "iterationCount", 0);
        setField(term14579, term14579.getClass(), "coefficients", term14580);
        setField(term14578, term14578.getClass(), "f", term14579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = Double.NaN;
        args[1] = 0.0;
        args[2] = Double.POSITIVE_INFINITY;
        Object retValue = callMethod(klass, "solve", argTypes, term14366, args);
        assertTrue(recursiveEquals(term14366, term14578));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


