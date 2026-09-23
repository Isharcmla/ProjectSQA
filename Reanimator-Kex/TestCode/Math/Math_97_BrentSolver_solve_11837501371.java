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

public class BrentSolver_solve_11837501371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14721;
     Object term14864;

    public BrentSolver_solve_11837501371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14721 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term14829 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term14596 = (double[]) newDoubleArray(1);
        setField(term14829, term14829.getClass(), "coefficients", term14596);
        setField(term14721, term14721.getClass(), "f", term14829);
        term14864 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        Object term14865 = newInstance(Class.forName("org.apache.commons.math.analysis.PolynomialFunction"));
        double[] term14866 = (double[]) newDoubleArray(1);
        setDoubleField(term14864, term14864.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term14864, term14864.getClass(), "relativeAccuracy", 0.0);
        setDoubleField(term14864, term14864.getClass(), "functionValueAccuracy", 0.0);
        setIntField(term14864, term14864.getClass(), "maximalIterationCount", 0);
        setDoubleField(term14864, term14864.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term14864, term14864.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term14864, term14864.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term14864, term14864.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term14864, term14864.getClass(), "resultComputed", true);
        setDoubleField(term14864, term14864.getClass(), "result", Double.NEGATIVE_INFINITY);
        setIntField(term14864, term14864.getClass(), "iterationCount", 0);
        setField(term14865, term14865.getClass(), "coefficients", term14866);
        setField(term14864, term14864.getClass(), "f", term14865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -4.008336720019768E-292;
        args[1] = Double.NEGATIVE_INFINITY;
        args[2] = Double.NEGATIVE_INFINITY;
        Object retValue = callMethod(klass, "solve", argTypes, term14721, args);
        assertTrue(recursiveEquals(term14721, term14864));
        assertTrue(recursiveEquals(retValue, Double.NEGATIVE_INFINITY));
    }

};


