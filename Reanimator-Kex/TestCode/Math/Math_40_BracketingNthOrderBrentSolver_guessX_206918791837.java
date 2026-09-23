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

public class BracketingNthOrderBrentSolver_guessX_206918791837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24807;
     Object term23652;
     Object term24144;
     Object term26789;
     Object term26790;
     Object term26791;

    public BracketingNthOrderBrentSolver_guessX_206918791837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24807 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        term23652 = (double[]) newDoubleArray(491);
        term24144 = (double[]) newDoubleArray(489);
        term26789 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setIntField(term26789, term26789.getClass(), "maximalOrder", 0);
        setField(term26789, term26789.getClass(), "allowed", null);
        setDoubleField(term26789, term26789.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term26789, term26789.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term26789, term26789.getClass(), "relativeAccuracy", 0.0);
        setField(term26789, term26789.getClass(), "evaluations", null);
        setDoubleField(term26789, term26789.getClass(), "searchMin", 0.0);
        setDoubleField(term26789, term26789.getClass(), "searchMax", 0.0);
        setDoubleField(term26789, term26789.getClass(), "searchStart", 0.0);
        setField(term26789, term26789.getClass(), "function", null);
        term26790 = (double[]) newDoubleArray(491);
        setDoubleElement(term26790, 1, Double.NaN);
        term26791 = (double[]) newDoubleArray(489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = 0.0;
        args[1] = term23652;
        args[2] = term24144;
        args[3] = 0;
        args[4] = 2;
        callMethod(klass, "guessX", argTypes, term24807, args);
        assertTrue(recursiveEquals(term24807, term26789));
        assertTrue(recursiveEquals(term23652, term26790));
        assertTrue(recursiveEquals(term24144, term26791));
    }

};


