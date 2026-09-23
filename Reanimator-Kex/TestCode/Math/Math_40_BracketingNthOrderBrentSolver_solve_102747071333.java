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
import java.lang.Double;
import java.lang.String;
import java.lang.Object;

public class BracketingNthOrderBrentSolver_solve_102747071333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18994;
     Object term19098;
     Object enum19;

    public BracketingNthOrderBrentSolver_solve_102747071333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18994 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        setField(term18994, term18994.getClass(), "allowed", null);
        term19098 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Logit$1"));
        Class<? extends Object> term19826 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term19825 = ((Class) term19826).getDeclaredField((String) "ABOVE_SIDE");
        ((Field) term19825).setAccessible(true);
        enum19 = ((Field) term19825).get((Object) null);
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
        args[1] = term19098;
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        args[4] = enum19;
        try {
            callMethod(klass, "solve", argTypes, term18994, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


