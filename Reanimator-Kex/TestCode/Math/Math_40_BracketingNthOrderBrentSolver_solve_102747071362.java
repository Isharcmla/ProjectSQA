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
import java.lang.String;
import java.lang.Object;
import java.lang.Double;

public class BracketingNthOrderBrentSolver_solve_102747071362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56858;
     Object term57162;
     Object enum31;

    public BracketingNthOrderBrentSolver_solve_102747071362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60539 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term60538 = ((Class) term60539).getDeclaredField((String) "ANY_SIDE");
        ((Field) term60538).setAccessible(true);
        Object enum30 = ((Field) term60538).get((Object) null);
        term56858 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term57062 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term56858, term56858.getClass(), "allowed", enum30);
        setDoubleField(term56858, term56858.getClass(), "searchMin", 0.0);
        setDoubleField(term56858, term56858.getClass(), "searchMax", 0.0);
        setDoubleField(term56858, term56858.getClass(), "searchStart", 0.0);
        setField(term56858, term56858.getClass(), "function", null);
        setIntField(term57062, term57062.getClass(), "maximalCount", 0);
        setIntField(term57062, term57062.getClass(), "count", 0);
        setField(term56858, term56858.getClass(), "evaluations", term57062);
        setIntField(term56858, term56858.getClass(), "maximalOrder", 1);
        term57162 = newInstance(Class.forName("org.apache.commons.math.ode.events.EventState$1"));
        Class<? extends Object> term60850 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term60849 = ((Class) term60850).getDeclaredField((String) "ANY_SIDE");
        ((Field) term60849).setAccessible(true);
        enum31 = ((Field) term60849).get((Object) null);
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
        args[1] = term57162;
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        args[4] = enum31;
        try {
            callMethod(klass, "solve", argTypes, term56858, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


