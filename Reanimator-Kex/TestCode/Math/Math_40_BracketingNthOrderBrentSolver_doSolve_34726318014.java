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

public class BracketingNthOrderBrentSolver_doSolve_34726318014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421;

    public BracketingNthOrderBrentSolver_doSolve_34726318014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7057 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term7056 = ((Class) term7057).getDeclaredField((String) "ANY_SIDE");
        ((Field) term7056).setAccessible(true);
        Object enum10 = ((Field) term7056).get((Object) null);
        term421 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term438 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term441 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        setIntField(term421, term421.getClass(), "maximalOrder", 5);
        setField(term421, term421.getClass(), "allowed", enum10);
        setDoubleField(term421, term421.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term421, term421.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term421, term421.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term438, term438.getClass(), "maximalCount", 0);
        setIntField(term438, term438.getClass(), "count", 0);
        setField(term438, term438.getClass(), "maxCountCallback", term441);
        setField(term421, term421.getClass(), "evaluations", term438);
        setDoubleField(term421, term421.getClass(), "searchMin", 0.37773193782763337);
        setDoubleField(term421, term421.getClass(), "searchMax", 0.8474802076607362);
        setDoubleField(term421, term421.getClass(), "searchStart", 0.5183269973490326);
        setField(term421, term421.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doSolve", argTypes, term421, args);
            assertTrue(false);
        }
        catch (TooManyEvaluationsException e) {
        }

    }

};


