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

public class BracketingNthOrderBrentSolver_guessX_206918791851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43022;
     Object term41856;
     Object term44522;
     Object term44523;
     Object term44524;

    public BracketingNthOrderBrentSolver_guessX_206918791851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43022 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        term41856 = (double[]) newDoubleArray(491);
        term44522 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setIntField(term44522, term44522.getClass(), "maximalOrder", 0);
        setField(term44522, term44522.getClass(), "allowed", null);
        setDoubleField(term44522, term44522.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term44522, term44522.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term44522, term44522.getClass(), "relativeAccuracy", 0.0);
        setField(term44522, term44522.getClass(), "evaluations", null);
        setDoubleField(term44522, term44522.getClass(), "searchMin", 0.0);
        setDoubleField(term44522, term44522.getClass(), "searchMax", 0.0);
        setDoubleField(term44522, term44522.getClass(), "searchStart", 0.0);
        setField(term44522, term44522.getClass(), "function", null);
        term44523 = (double[]) newDoubleArray(491);
        setDoubleElement(term44523, 1, Double.NaN);
        setDoubleElement(term44523, 2, Double.NaN);
        term44524 = (double[]) newDoubleArray(491);
        setDoubleElement(term44524, 1, Double.NaN);
        setDoubleElement(term44524, 2, Double.NaN);
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
        args[1] = term41856;
        args[2] = term41856;
        args[3] = 0;
        args[4] = 3;
        callMethod(klass, "guessX", argTypes, term43022, args);
        assertTrue(recursiveEquals(term43022, term44522));
        assertTrue(recursiveEquals(term41856, term44523));
        assertTrue(recursiveEquals(term41856, term44524));
    }

};


