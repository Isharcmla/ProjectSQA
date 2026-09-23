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

public class BracketingNthOrderBrentSolver_solve_185105626247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38788;
     Object term38886;
     Object enum21;

    public BracketingNthOrderBrentSolver_solve_185105626247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38788 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(term38788, term38788.getClass(), "allowed", null);
        term38886 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Ceil"));
        Class<? extends Object> term39614 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term39613 = ((Class) term39614).getDeclaredField((String) "ABOVE_SIDE");
        ((Field) term39613).setAccessible(true);
        enum21 = ((Field) term39613).get((Object) null);
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
        args[1] = term38886;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = 0.0;
        args[5] = enum21;
        try {
            callMethod(klass, "solve", argTypes, term38788, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


