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

public class BracketingNthOrderBrentSolver_guessX_206918791839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29904;
     Object term28756;
     Object term31389;
     Object term31390;
     Object term31391;

    public BracketingNthOrderBrentSolver_guessX_206918791839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29904 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        term28756 = (double[]) newDoubleArray(489);
        term31389 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setIntField(term31389, term31389.getClass(), "maximalOrder", 0);
        setField(term31389, term31389.getClass(), "allowed", null);
        setDoubleField(term31389, term31389.getClass(), "functionValueAccuracy", 0.0);
        setDoubleField(term31389, term31389.getClass(), "absoluteAccuracy", 0.0);
        setDoubleField(term31389, term31389.getClass(), "relativeAccuracy", 0.0);
        setField(term31389, term31389.getClass(), "evaluations", null);
        setDoubleField(term31389, term31389.getClass(), "searchMin", 0.0);
        setDoubleField(term31389, term31389.getClass(), "searchMax", 0.0);
        setDoubleField(term31389, term31389.getClass(), "searchStart", 0.0);
        setField(term31389, term31389.getClass(), "function", null);
        term31390 = (double[]) newDoubleArray(489);
        term31391 = (double[]) newDoubleArray(489);
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
        args[1] = term28756;
        args[2] = term28756;
        args[3] = 456;
        args[4] = 457;
        callMethod(klass, "guessX", argTypes, term29904, args);
        assertTrue(recursiveEquals(term29904, term31389));
        assertTrue(recursiveEquals(term28756, term31390));
        assertTrue(recursiveEquals(term28756, term31391));
    }

};


