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
import java.lang.String;
import java.lang.Object;
import java.lang.Double;

public class BracketingNthOrderBrentSolver_solve_102747071386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81728;
     Object term82034;
     Object enum50;

    public BracketingNthOrderBrentSolver_solve_102747071386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84130 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term84129 = ((Class) term84130).getDeclaredField((String) "ANY_SIDE");
        ((Field) term84129).setAccessible(true);
        Object enum49 = ((Field) term84129).get((Object) null);
        term81728 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term81932 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term81728, term81728.getClass(), "allowed", enum49);
        setDoubleField(term81728, term81728.getClass(), "searchMin", 0.0);
        setDoubleField(term81728, term81728.getClass(), "searchMax", 0.0);
        setDoubleField(term81728, term81728.getClass(), "searchStart", 0.0);
        setField(term81728, term81728.getClass(), "function", null);
        setIntField(term81932, term81932.getClass(), "maximalCount", 0);
        setIntField(term81932, term81932.getClass(), "count", 0);
        setField(term81728, term81728.getClass(), "evaluations", term81932);
        setIntField(term81728, term81728.getClass(), "maximalOrder", 127);
        term82034 = newInstance(Class.forName("org.apache.commons.math.analysis.FunctionUtils$9"));
        Class<? extends Object> term84441 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term84440 = ((Class) term84441).getDeclaredField((String) "BELOW_SIDE");
        ((Field) term84440).setAccessible(true);
        enum50 = ((Field) term84440).get((Object) null);
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
        args[1] = term82034;
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        args[4] = enum50;
        try {
            callMethod(klass, "solve", argTypes, term81728, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


