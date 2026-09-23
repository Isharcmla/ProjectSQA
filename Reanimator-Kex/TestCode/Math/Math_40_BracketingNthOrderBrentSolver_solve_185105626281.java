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
import java.lang.String;
import java.lang.Object;

public class BracketingNthOrderBrentSolver_solve_185105626281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76768;
     Object term77076;
     Object enum41;

    public BracketingNthOrderBrentSolver_solve_185105626281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78188 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term78187 = ((Class) term78188).getDeclaredField((String) "ANY_SIDE");
        ((Field) term78187).setAccessible(true);
        Object enum40 = ((Field) term78187).get((Object) null);
        term76768 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term76972 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        setField(term76768, term76768.getClass(), "allowed", enum40);
        setDoubleField(term76768, term76768.getClass(), "searchMin", 0.0);
        setDoubleField(term76768, term76768.getClass(), "searchMax", 0.0);
        setDoubleField(term76768, term76768.getClass(), "searchStart", 0.0);
        setField(term76768, term76768.getClass(), "function", null);
        setIntField(term76972, term76972.getClass(), "maximalCount", 0);
        setIntField(term76972, term76972.getClass(), "count", 0);
        setField(term76768, term76768.getClass(), "evaluations", term76972);
        setIntField(term76768, term76768.getClass(), "maximalOrder", 1);
        term77076 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Atanh$1"));
        Class<? extends Object> term78499 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term78498 = ((Class) term78499).getDeclaredField((String) "ANY_SIDE");
        ((Field) term78498).setAccessible(true);
        enum41 = ((Field) term78498).get((Object) null);
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
        args[1] = term77076;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = 0.0;
        args[5] = enum41;
        try {
            callMethod(klass, "solve", argTypes, term76768, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


