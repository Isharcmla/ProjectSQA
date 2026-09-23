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
import static org.apache.commons.math.analysis.solvers.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class BracketingNthOrderBrentSolver_getMaximalOrder_159446947213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;
     Object term3929;

    public BracketingNthOrderBrentSolver_getMaximalOrder_159446947213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3936 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term3935 = ((Class) term3936).getDeclaredField((String) "ANY_SIDE");
        ((Field) term3935).setAccessible(true);
        Object enum8 = ((Field) term3935).get((Object) null);
        term19 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term36 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term39 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        setIntField(term19, term19.getClass(), "maximalOrder", 5);
        setField(term19, term19.getClass(), "allowed", enum8);
        setDoubleField(term19, term19.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term19, term19.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term19, term19.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term36, term36.getClass(), "maximalCount", 0);
        setIntField(term36, term36.getClass(), "count", 0);
        setField(term36, term36.getClass(), "maxCountCallback", term39);
        setField(term19, term19.getClass(), "evaluations", term36);
        setDoubleField(term19, term19.getClass(), "searchMin", 0.2641345529914265);
        setDoubleField(term19, term19.getClass(), "searchMax", 0.36923381893433327);
        setDoubleField(term19, term19.getClass(), "searchStart", 0.6076495596892013);
        setField(term19, term19.getClass(), "function", null);
        Class<? extends Object> term4247 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term4246 = ((Class) term4247).getDeclaredField((String) "ANY_SIDE");
        ((Field) term4246).setAccessible(true);
        Object enum9 = ((Field) term4246).get((Object) null);
        term3929 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term3933 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term3934 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        setIntField(term3929, term3929.getClass(), "maximalOrder", 5);
        setField(term3929, term3929.getClass(), "allowed", enum9);
        setDoubleField(term3929, term3929.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term3929, term3929.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term3929, term3929.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term3933, term3933.getClass(), "maximalCount", 0);
        setIntField(term3933, term3933.getClass(), "count", 0);
        setField(term3933, term3933.getClass(), "maxCountCallback", term3934);
        setField(term3929, term3929.getClass(), "evaluations", term3933);
        setDoubleField(term3929, term3929.getClass(), "searchMin", 0.2641345529914265);
        setDoubleField(term3929, term3929.getClass(), "searchMax", 0.36923381893433327);
        setDoubleField(term3929, term3929.getClass(), "searchStart", 0.6076495596892013);
        setField(term3929, term3929.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaximalOrder", argTypes, term19, args);
        assertTrue(recursiveEquals(term19, term3929));
        assertTrue(recursiveEquals(retValue, 5));
    }

};


