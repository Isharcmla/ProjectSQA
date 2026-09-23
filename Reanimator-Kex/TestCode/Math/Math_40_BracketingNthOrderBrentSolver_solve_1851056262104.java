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

public class BracketingNthOrderBrentSolver_solve_1851056262104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110369;
     Object term110555;
     Object enum79;

    public BracketingNthOrderBrentSolver_solve_1851056262104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110369 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term110455 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term110369, term110369.getClass(), "allowed", null);
        setDoubleField(term110369, term110369.getClass(), "searchMin", 0.0);
        setDoubleField(term110369, term110369.getClass(), "searchMax", 0.0);
        setDoubleField(term110369, term110369.getClass(), "searchStart", 0.0);
        setField(term110369, term110369.getClass(), "function", null);
        setIntField(term110455, term110455.getClass(), "maximalCount", 0);
        setIntField(term110455, term110455.getClass(), "count", 0);
        setField(term110369, term110369.getClass(), "evaluations", term110455);
        setIntField(term110369, term110369.getClass(), "maximalOrder", 255);
        term110555 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Floor"));
        Class<? extends Object> term111939 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term111938 = ((Class) term111939).getDeclaredField((String) "ABOVE_SIDE");
        ((Field) term111938).setAccessible(true);
        enum79 = ((Field) term111938).get((Object) null);
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
        args[1] = term110555;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = 0.0;
        args[5] = enum79;
        try {
            callMethod(klass, "solve", argTypes, term110369, args);
            assertTrue(false);
        }
        catch (NumberIsTooLargeException e) {
        }

    }

};


