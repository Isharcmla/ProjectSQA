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
import java.lang.Object;
import java.lang.Double;
import java.lang.String;

public class BracketingNthOrderBrentSolver_solve_102747071395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100944;
     Object term101162;
     Object enum68;

    public BracketingNthOrderBrentSolver_solve_102747071395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100944 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term101030 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term100944, term100944.getClass(), "allowed", null);
        setDoubleField(term100944, term100944.getClass(), "searchMin", 0.0);
        setDoubleField(term100944, term100944.getClass(), "searchMax", 0.0);
        setDoubleField(term100944, term100944.getClass(), "searchStart", 0.0);
        setField(term100944, term100944.getClass(), "function", null);
        setIntField(term101030, term101030.getClass(), "maximalCount", 0);
        setIntField(term101030, term101030.getClass(), "count", 0);
        setField(term100944, term100944.getClass(), "evaluations", term101030);
        setIntField(term100944, term100944.getClass(), "maximalOrder", -2);
        term101162 = newInstance(Class.forName("org.apache.commons.math.analysis.polynomials.PolynomialFunction"));
        Class<? extends Object> term102895 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term102894 = ((Class) term102895).getDeclaredField((String) "ABOVE_SIDE");
        ((Field) term102894).setAccessible(true);
        enum68 = ((Field) term102894).get((Object) null);
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
        args[1] = term101162;
        args[2] = Double.NaN;
        args[3] = Double.NaN;
        args[4] = enum68;
        try {
            callMethod(klass, "solve", argTypes, term100944, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


