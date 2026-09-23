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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BracketingNthOrderBrentSolver_solve_185105626288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83083;
     Object term83429;
     Object enum54;

    public BracketingNthOrderBrentSolver_solve_185105626288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86861 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term86860 = ((Class) term86861).getDeclaredField((String) "ANY_SIDE");
        ((Field) term86860).setAccessible(true);
        enum54 = ((Field) term86860).get((Object) null);
        term83083 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term83325 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term83083, term83083.getClass(), "allowed", enum54);
        setDoubleField(term83083, term83083.getClass(), "searchMin", 0.0);
        setDoubleField(term83083, term83083.getClass(), "searchMax", 0.0);
        setDoubleField(term83083, term83083.getClass(), "searchStart", 0.0);
        setField(term83083, term83083.getClass(), "function", null);
        setIntField(term83325, term83325.getClass(), "maximalCount", 0);
        setIntField(term83325, term83325.getClass(), "count", 0);
        setField(term83083, term83083.getClass(), "evaluations", term83325);
        setIntField(term83083, term83083.getClass(), "maximalOrder", 1073741823);
        term83429 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Log10$1"));
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
        args[1] = term83429;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = 0.0;
        args[5] = enum54;
        try {
            callMethod(klass, "solve", argTypes, term83083, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


