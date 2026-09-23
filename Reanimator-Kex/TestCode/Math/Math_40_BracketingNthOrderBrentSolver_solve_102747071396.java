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
import java.lang.Object;
import java.lang.Double;
import java.lang.String;

public class BracketingNthOrderBrentSolver_solve_102747071396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101935;
     Object term102125;
     Object enum70;

    public BracketingNthOrderBrentSolver_solve_102747071396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101935 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term102021 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term101935, term101935.getClass(), "allowed", null);
        setDoubleField(term101935, term101935.getClass(), "searchMin", 0.0);
        setDoubleField(term101935, term101935.getClass(), "searchMax", 0.0);
        setDoubleField(term101935, term101935.getClass(), "searchStart", 0.0);
        setField(term101935, term101935.getClass(), "function", null);
        setIntField(term102021, term102021.getClass(), "maximalCount", 0);
        setIntField(term102021, term102021.getClass(), "count", 0);
        setField(term101935, term101935.getClass(), "evaluations", term102021);
        setIntField(term101935, term101935.getClass(), "maximalOrder", 2);
        term102125 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Expm1$1"));
        Class<? extends Object> term103916 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term103915 = ((Class) term103916).getDeclaredField((String) "LEFT_SIDE");
        ((Field) term103915).setAccessible(true);
        enum70 = ((Field) term103915).get((Object) null);
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
        args[1] = term102125;
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        args[4] = enum70;
        try {
            callMethod(klass, "solve", argTypes, term101935, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


