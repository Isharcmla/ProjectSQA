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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;

public class BracketingNthOrderBrentSolver_solve_102747071387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85466;
     Object term85766;
     Object enum53;

    public BracketingNthOrderBrentSolver_solve_102747071387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85924 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term85923 = ((Class) term85924).getDeclaredField((String) "ANY_SIDE");
        ((Field) term85923).setAccessible(true);
        Object enum52 = ((Field) term85923).get((Object) null);
        term85466 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term85670 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term85466, term85466.getClass(), "allowed", enum52);
        setDoubleField(term85466, term85466.getClass(), "searchMin", 0.0);
        setDoubleField(term85466, term85466.getClass(), "searchMax", 0.0);
        setDoubleField(term85466, term85466.getClass(), "searchStart", 0.0);
        setField(term85466, term85466.getClass(), "function", null);
        setIntField(term85670, term85670.getClass(), "maximalCount", 0);
        setIntField(term85670, term85670.getClass(), "count", 0);
        setField(term85466, term85466.getClass(), "evaluations", term85670);
        setIntField(term85466, term85466.getClass(), "maximalOrder", 20);
        term85766 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Cos"));
        Class<? extends Object> term86235 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term86234 = ((Class) term86235).getDeclaredField((String) "ABOVE_SIDE");
        ((Field) term86234).setAccessible(true);
        enum53 = ((Field) term86234).get((Object) null);
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
        args[0] = 1;
        args[1] = term85766;
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        args[4] = enum53;
        callMethod(klass, "solve", argTypes, term85466, args);
    }

};


