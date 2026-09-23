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

public class BracketingNthOrderBrentSolver_solve_1851056262100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107144;
     Object term107336;
     Object enum76;

    public BracketingNthOrderBrentSolver_solve_1851056262100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107144 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term107230 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term107144, term107144.getClass(), "allowed", null);
        setDoubleField(term107144, term107144.getClass(), "searchMin", 0.0);
        setDoubleField(term107144, term107144.getClass(), "searchMax", 0.0);
        setDoubleField(term107144, term107144.getClass(), "searchStart", 0.0);
        setField(term107144, term107144.getClass(), "function", null);
        setIntField(term107230, term107230.getClass(), "maximalCount", 0);
        setIntField(term107230, term107230.getClass(), "count", 0);
        setField(term107144, term107144.getClass(), "evaluations", term107230);
        setIntField(term107144, term107144.getClass(), "maximalOrder", -1);
        term107336 = newInstance(Class.forName("org.apache.commons.math.analysis.FunctionUtils$6$1"));
        Class<? extends Object> term108139 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term108138 = ((Class) term108139).getDeclaredField((String) "LEFT_SIDE");
        ((Field) term108138).setAccessible(true);
        enum76 = ((Field) term108138).get((Object) null);
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
        args[1] = term107336;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = 0.0;
        args[5] = enum76;
        try {
            callMethod(klass, "solve", argTypes, term107144, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


