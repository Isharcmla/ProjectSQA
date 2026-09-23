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
import java.lang.Double;

public class BrentSolver_solve_74974203821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4745;
     Object term4772;

    public BrentSolver_solve_74974203821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4745 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term4745, term4745.getClass(), "maximalIterationCount", 1);
        setDoubleField(term4745, term4745.getClass(), "functionValueAccuracy", 2.3061244841904046E18);
        setDoubleField(term4745, term4745.getClass(), "relativeAccuracy", 1.65282106324497203E18);
        setDoubleField(term4745, term4745.getClass(), "absoluteAccuracy", 2.251799813701503E15);
        term4772 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term4772, term4772.getClass(), "absoluteAccuracy", 2.251799813701503E15);
        setDoubleField(term4772, term4772.getClass(), "relativeAccuracy", 1.65282106324497203E18);
        setDoubleField(term4772, term4772.getClass(), "functionValueAccuracy", 2.3061244841904046E18);
        setIntField(term4772, term4772.getClass(), "maximalIterationCount", 1);
        setDoubleField(term4772, term4772.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term4772, term4772.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term4772, term4772.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term4772, term4772.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term4772, term4772.getClass(), "resultComputed", true);
        setDoubleField(term4772, term4772.getClass(), "result", Double.NaN);
        setIntField(term4772, term4772.getClass(), "iterationCount", 0);
        setField(term4772, term4772.getClass(), "f", null);
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
        args[0] = 1.599271856532763E-308;
        args[1] = 0.0;
        args[2] = 6.60568822466943E-309;
        args[3] = 8.000000000000014;
        args[4] = Double.NaN;
        args[5] = -2.9833362924800827E-154;
        Object retValue = callMethod(klass, "solve", argTypes, term4745, args);
        assertTrue(recursiveEquals(term4745, term4772));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


