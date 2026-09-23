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
import org.apache.commons.math.exception.NumberIsTooLargeException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BracketingNthOrderBrentSolver_solve_1851056262106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113434;
     Object term113722;
     Object enum82;

    public BracketingNthOrderBrentSolver_solve_1851056262106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113434 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term113534 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Log$1"));
        Object term113620 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term113434, term113434.getClass(), "allowed", null);
        setDoubleField(term113434, term113434.getClass(), "searchMin", 0.0);
        setDoubleField(term113434, term113434.getClass(), "searchMax", 0.0);
        setDoubleField(term113434, term113434.getClass(), "searchStart", 0.0);
        setField(term113434, term113434.getClass(), "function", term113534);
        setIntField(term113620, term113620.getClass(), "maximalCount", 0);
        setIntField(term113620, term113620.getClass(), "count", 0);
        setField(term113434, term113434.getClass(), "evaluations", term113620);
        setIntField(term113434, term113434.getClass(), "maximalOrder", 2);
        term113722 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Signum"));
        Class<? extends Object> term115106 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term115105 = ((Class) term115106).getDeclaredField((String) "ABOVE_SIDE");
        ((Field) term115105).setAccessible(true);
        enum82 = ((Field) term115105).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math.analysis.UnivariateFunction");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = Class.forName("org.apache.commons.math.analysis.solvers.AllowedSolution");
        Object[] args = new Object[6];
        args[0] = 0;
        args[1] = term113722;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = 0.0;
        args[5] = enum82;
        try {
            callMethod(klass, "solve", argTypes, term113434, args);
            assertTrue(false);
        }
        catch (NumberIsTooLargeException e) {
        }

    }

};


