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
import java.lang.Object;

public class BisectionSolver_solve_180397218291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30752;
     Object term31183;

    public BisectionSolver_solve_180397218291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30752 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term30864 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$5"));
        setField(term30752, term30752.getClass(), "f", term30864);
        setIntField(term30752, term30752.getClass(), "iterationCount", 0);
        setBooleanField(term30752, term30752.getClass(), "resultComputed", false);
        setIntField(term30752, term30752.getClass(), "maximalIterationCount", 9);
        setDoubleField(term30752, term30752.getClass(), "absoluteAccuracy", 4.3369675406694154E18);
        term31183 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term31184 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$5"));
        setDoubleField(term31183, term31183.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term31183, term31183.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setBooleanField(term31183, term31183.getClass(), "resultComputed", true);
        setDoubleField(term31183, term31183.getClass(), "result", 0.7968750000436557);
        setDoubleField(term31183, term31183.getClass(), "functionValue", 0.0);
        setField(term31183, term31183.getClass(), "f", term31184);
        setDoubleField(term31183, term31183.getClass(), "absoluteAccuracy", 4.3369675406694154E18);
        setDoubleField(term31183, term31183.getClass(), "relativeAccuracy", 0.0);
        setIntField(term31183, term31183.getClass(), "maximalIterationCount", 9);
        setDoubleField(term31183, term31183.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term31183, term31183.getClass(), "defaultRelativeAccuracy", 0.0);
        setIntField(term31183, term31183.getClass(), "defaultMaximalIterationCount", 0);
        setIntField(term31183, term31183.getClass(), "iterationCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = 8.900295434028806E-308;
        args[1] = 1.0625000000582077;
        Object retValue = callMethod(klass, "solve", argTypes, term30752, args);
        assertTrue(recursiveEquals(term30752, term31183));
        assertTrue(recursiveEquals(retValue, 0.7968750000436557));
    }

};


