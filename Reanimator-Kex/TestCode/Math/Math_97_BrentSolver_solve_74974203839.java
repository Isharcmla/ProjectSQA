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

public class BrentSolver_solve_74974203839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7969;
     Object term7998;

    public BrentSolver_solve_74974203839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7969 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setIntField(term7969, term7969.getClass(), "maximalIterationCount", 1);
        setDoubleField(term7969, term7969.getClass(), "functionValueAccuracy", -6.7550283333299067E18);
        setDoubleField(term7969, term7969.getClass(), "relativeAccuracy", 4.6088718051841853E18);
        setDoubleField(term7969, term7969.getClass(), "absoluteAccuracy", 4.6142192760379146E18);
        term7998 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term7998, term7998.getClass(), "absoluteAccuracy", 4.6142192760379146E18);
        setDoubleField(term7998, term7998.getClass(), "relativeAccuracy", 4.6088718051841853E18);
        setDoubleField(term7998, term7998.getClass(), "functionValueAccuracy", -6.7550283333299067E18);
        setIntField(term7998, term7998.getClass(), "maximalIterationCount", 1);
        setDoubleField(term7998, term7998.getClass(), "defaultAbsoluteAccuracy", 0.0);
        setDoubleField(term7998, term7998.getClass(), "defaultRelativeAccuracy", 0.0);
        setDoubleField(term7998, term7998.getClass(), "defaultFunctionValueAccuracy", 0.0);
        setIntField(term7998, term7998.getClass(), "defaultMaximalIterationCount", 0);
        setBooleanField(term7998, term7998.getClass(), "resultComputed", true);
        setDoubleField(term7998, term7998.getClass(), "result", 2.000015374408264);
        setIntField(term7998, term7998.getClass(), "iterationCount", 0);
        setField(term7998, term7998.getClass(), "f", null);
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
        args[0] = 1.008071892954879;
        args[1] = 0.0;
        args[2] = 2.000015374408264;
        args[3] = -5.119024296214217E-265;
        args[4] = -2.500000000000001;
        args[5] = -1.3767027564060327E-134;
        Object retValue = callMethod(klass, "solve", argTypes, term7969, args);
        assertTrue(recursiveEquals(term7969, term7998));
        assertTrue(recursiveEquals(retValue, 2.000015374408264));
    }

};


