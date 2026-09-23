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
import org.apache.commons.math.exception.TooManyEvaluationsException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;

public class BracketingNthOrderBrentSolver_solve_102747071392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89199;
     Object term89735;
     Object enum64;

    public BracketingNthOrderBrentSolver_solve_102747071392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94740 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term94739 = ((Class) term94740).getDeclaredField((String) "ANY_SIDE");
        ((Field) term94739).setAccessible(true);
        Object enum63 = ((Field) term94739).get((Object) null);
        term89199 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term89441 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term89531 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        setField(term89199, term89199.getClass(), "allowed", enum63);
        setDoubleField(term89199, term89199.getClass(), "searchMin", 0.0);
        setDoubleField(term89199, term89199.getClass(), "searchMax", 0.0);
        setDoubleField(term89199, term89199.getClass(), "searchStart", 0.0);
        setField(term89199, term89199.getClass(), "function", null);
        setIntField(term89441, term89441.getClass(), "maximalCount", 0);
        setIntField(term89441, term89441.getClass(), "count", 0);
        setField(term89441, term89441.getClass(), "maxCountCallback", term89531);
        setField(term89199, term89199.getClass(), "evaluations", term89441);
        setIntField(term89199, term89199.getClass(), "maximalOrder", 2);
        term89735 = newInstance(Class.forName("org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer$LineSearchFunction"));
        Class<? extends Object> term95051 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term95050 = ((Class) term95051).getDeclaredField((String) "ABOVE_SIDE");
        ((Field) term95050).setAccessible(true);
        enum64 = ((Field) term95050).get((Object) null);
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
        args[1] = term89735;
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        args[4] = enum64;
        try {
            callMethod(klass, "solve", argTypes, term89199, args);
            assertTrue(false);
        }
        catch (TooManyEvaluationsException e) {
        }

    }

};


