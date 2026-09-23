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
import java.lang.NullPointerException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class BrentSolver_solve_108921612413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;
     Object term86;
     Object term88;
     Object term90;
     Object term92;
     Object term94;
     Object term96;

    public BrentSolver_solve_108921612413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setDoubleField(term73, term73.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term73, term73.getClass(), "defaultFunctionValueAccuracy", 1.0E-15);
        setBooleanField(term73, term73.getClass(), "resultComputed", true);
        setDoubleField(term73, term73.getClass(), "result", 0.6436713023569729);
        setDoubleField(term73, term73.getClass(), "functionValue", 0.7332741045694002);
        setField(term73, term73.getClass(), "f", null);
        setDoubleField(term73, term73.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term73, term73.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term73, term73.getClass(), "maximalIterationCount", 100);
        setDoubleField(term73, term73.getClass(), "defaultAbsoluteAccuracy", 1.0E-6);
        setDoubleField(term73, term73.getClass(), "defaultRelativeAccuracy", 1.0E-14);
        setIntField(term73, term73.getClass(), "defaultMaximalIterationCount", 100);
        setIntField(term73, term73.getClass(), "iterationCount", -1922583790);
        term86 = new Double(0.4569171842750229);
        term88 = new Double(0.8598297828918529);
        term90 = new Double(0.43692187681405226);
        term92 = new Double(0.7633268466829064);
        term94 = new Double(0.13481025392611334);
        term96 = new Double(0.3800088629986428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = term86;
        args[2] = term88;
        args[3] = term90;
        args[4] = term92;
        args[5] = term94;
        args[6] = term96;
        try {
            callMethod(klass, "solve", argTypes, term73, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


