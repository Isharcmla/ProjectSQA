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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.String;

public class BracketingNthOrderBrentSolver_solve_102747071398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105072;
     Object term105256;
     Object enum73;

    public BracketingNthOrderBrentSolver_solve_102747071398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105072 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term105158 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term105072, term105072.getClass(), "allowed", null);
        setDoubleField(term105072, term105072.getClass(), "searchMin", 0.0);
        setDoubleField(term105072, term105072.getClass(), "searchMax", 0.0);
        setDoubleField(term105072, term105072.getClass(), "searchStart", 0.0);
        setField(term105072, term105072.getClass(), "function", null);
        setIntField(term105158, term105158.getClass(), "maximalCount", 0);
        setIntField(term105158, term105158.getClass(), "count", 0);
        setField(term105072, term105072.getClass(), "evaluations", term105158);
        setIntField(term105072, term105072.getClass(), "maximalOrder", -1);
        term105256 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Cosh"));
        Class<? extends Object> term106063 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term106062 = ((Class) term106063).getDeclaredField((String) "ABOVE_SIDE");
        ((Field) term106062).setAccessible(true);
        enum73 = ((Field) term106062).get((Object) null);
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
        args[1] = term105256;
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        args[4] = enum73;
        try {
            callMethod(klass, "solve", argTypes, term105072, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


