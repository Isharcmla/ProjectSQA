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

public class BracketingNthOrderBrentSolver_solve_102747071391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87789;
     Object term88095;
     Object enum61;

    public BracketingNthOrderBrentSolver_solve_102747071391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91171 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term91170 = ((Class) term91171).getDeclaredField((String) "ANY_SIDE");
        ((Field) term91170).setAccessible(true);
        Object enum60 = ((Field) term91170).get((Object) null);
        term87789 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term87993 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term87789, term87789.getClass(), "allowed", enum60);
        setDoubleField(term87789, term87789.getClass(), "searchMin", 0.0);
        setDoubleField(term87789, term87789.getClass(), "searchMax", 0.0);
        setDoubleField(term87789, term87789.getClass(), "searchStart", 0.0);
        setField(term87789, term87789.getClass(), "function", null);
        setIntField(term87993, term87993.getClass(), "maximalCount", 0);
        setIntField(term87993, term87993.getClass(), "count", 0);
        setField(term87789, term87789.getClass(), "evaluations", term87993);
        setIntField(term87789, term87789.getClass(), "maximalOrder", 2);
        term88095 = newInstance(Class.forName("org.apache.commons.math.analysis.FunctionUtils$5"));
        Class<? extends Object> term91482 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term91481 = ((Class) term91482).getDeclaredField((String) "ABOVE_SIDE");
        ((Field) term91481).setAccessible(true);
        enum61 = ((Field) term91481).get((Object) null);
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
        args[1] = term88095;
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        args[4] = enum61;
        try {
            callMethod(klass, "solve", argTypes, term87789, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


