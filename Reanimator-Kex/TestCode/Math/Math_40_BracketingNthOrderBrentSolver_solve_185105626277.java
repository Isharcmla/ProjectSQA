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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BracketingNthOrderBrentSolver_solve_185105626277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73537;
     Object term73883;
     Object enum36;

    public BracketingNthOrderBrentSolver_solve_185105626277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74963 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term74962 = ((Class) term74963).getDeclaredField((String) "ANY_SIDE");
        ((Field) term74962).setAccessible(true);
        Object enum35 = ((Field) term74962).get((Object) null);
        term73537 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term73779 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term73537, term73537.getClass(), "allowed", enum35);
        setDoubleField(term73537, term73537.getClass(), "searchMin", 0.0);
        setDoubleField(term73537, term73537.getClass(), "searchMax", 0.0);
        setDoubleField(term73537, term73537.getClass(), "searchStart", 0.0);
        setField(term73537, term73537.getClass(), "function", null);
        setIntField(term73779, term73779.getClass(), "maximalCount", 0);
        setIntField(term73779, term73779.getClass(), "count", 0);
        setField(term73537, term73537.getClass(), "evaluations", term73779);
        setIntField(term73537, term73537.getClass(), "maximalOrder", -2);
        term73883 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Log1p$1"));
        Class<? extends Object> term75274 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term75273 = ((Class) term75274).getDeclaredField((String) "LEFT_SIDE");
        ((Field) term75273).setAccessible(true);
        enum36 = ((Field) term75273).get((Object) null);
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
        args[1] = term73883;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = 0.0;
        args[5] = enum36;
        try {
            callMethod(klass, "solve", argTypes, term73537, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


