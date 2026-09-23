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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.String;

public class BracketingNthOrderBrentSolver_solve_102747071383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79477;
     Object term79661;
     Object enum44;

    public BracketingNthOrderBrentSolver_solve_102747071383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79477 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term79563 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term79477, term79477.getClass(), "allowed", null);
        setDoubleField(term79477, term79477.getClass(), "searchMin", 0.0);
        setDoubleField(term79477, term79477.getClass(), "searchMax", 0.0);
        setDoubleField(term79477, term79477.getClass(), "searchStart", 0.0);
        setField(term79477, term79477.getClass(), "function", null);
        setIntField(term79563, term79563.getClass(), "maximalCount", 0);
        setIntField(term79563, term79563.getClass(), "count", 0);
        setField(term79477, term79477.getClass(), "evaluations", term79563);
        setIntField(term79477, term79477.getClass(), "maximalOrder", 1073741823);
        term79661 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Asin"));
        Class<? extends Object> term80554 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term80553 = ((Class) term80554).getDeclaredField((String) "LEFT_SIDE");
        ((Field) term80553).setAccessible(true);
        enum44 = ((Field) term80553).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math.analysis.UnivariateFunction");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = Class.forName("org.apache.commons.math.analysis.solvers.AllowedSolution");
        Object[] args = new Object[5];
        args[0] = 0;
        args[1] = term79661;
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        args[4] = enum44;
        try {
            callMethod(klass, "solve", argTypes, term79477, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


