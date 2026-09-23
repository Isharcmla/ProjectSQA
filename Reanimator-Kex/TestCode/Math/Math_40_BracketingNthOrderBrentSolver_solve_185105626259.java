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
import java.lang.String;

public class BracketingNthOrderBrentSolver_solve_185105626259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54932;
     Object term55148;
     Object enum26;

    public BracketingNthOrderBrentSolver_solve_185105626259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54932 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term55018 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term54932, term54932.getClass(), "allowed", null);
        setDoubleField(term54932, term54932.getClass(), "searchMin", 0.0);
        setDoubleField(term54932, term54932.getClass(), "searchMax", 0.0);
        setDoubleField(term54932, term54932.getClass(), "searchStart", 0.0);
        setField(term54932, term54932.getClass(), "function", null);
        setField(term54932, term54932.getClass(), "evaluations", term55018);
        term55148 = newInstance(Class.forName("org.apache.commons.math.analysis.function.HarmonicOscillator$1"));
        Class<? extends Object> term55948 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term55947 = ((Class) term55948).getDeclaredField((String) "ANY_SIDE");
        ((Field) term55947).setAccessible(true);
        enum26 = ((Field) term55947).get((Object) null);
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
        args[1] = term55148;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = 0.0;
        args[5] = enum26;
        try {
            callMethod(klass, "solve", argTypes, term54932, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


