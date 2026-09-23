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

public class BrentSolver_solve_74974203847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9419;
     Object term9448;

    public BrentSolver_solve_74974203847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9419 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term9419, term9419.getClass(), "maximalIterationCount", 1);
        setDoubleField(term9419, term9419.getClass(), "functionValueAccuracy", -6.9168566589498235E18);
        setDoubleField(term9419, term9419.getClass(), "relativeAccuracy", 2.2677564275154088E16);
        setDoubleField(term9419, term9419.getClass(), "absoluteAccuracy", 4.6229450174958141E18);
        term9448 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term9448, term9448.getClass(), "absoluteAccuracy", 4.6229450174958141E18);
        setDoubleField(term9448, term9448.getClass(), "relativeAccuracy", 2.2677564275154088E16);
        setDoubleField(term9448, term9448.getClass(), "functionValueAccuracy", -6.9168566589498235E18);
        setIntField(term9448, term9448.getClass(), "maximalIterationCount", 1);
        setDoubleField(term9448, term9448.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term9448, term9448.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term9448, term9448.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term9448, term9448.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term9448, term9448.getClass(), "resultComputed", true);
        setDoubleField(term9448, term9448.getClass(), "result", -4.0);
        setIntField(term9448, term9448.getClass(), "iterationCount", 0);
        setField(term9448, term9448.getClass(), "f", null);
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
        args[0] = -2.4545467326488633E-91;
        args[1] = 0.0;
        args[2] = -4.0;
        args[3] = -2.0768875185438756E-307;
        args[4] = -18.187549502108595;
        args[5] = 1.7395629167662924E-303;
        Object retValue = callMethod(klass, "solve", argTypes, term9419, args);
        assertTrue(recursiveEquals(term9419, term9448));
        assertTrue(recursiveEquals(retValue, -4.0));
    }

};


