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
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class BracketingNthOrderBrentSolver_init_202687674212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;
     Object term13;
     Object term15;
     Object term17;
     Object term3587;

    public BracketingNthOrderBrentSolver_init_202687674212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = new Double(0.544608645520025);
        term13 = new Double(0.28570734989730284);
        term15 = new Double(0.40176586625454525);
        term17 = new Integer(1484323161);
        Class<? extends Object> term3594 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term3593 = ((Class) term3594).getDeclaredField((String) "ANY_SIDE");
        ((Field) term3593).setAccessible(true);
        Object enum7 = ((Field) term3593).get((Object) null);
        term3587 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term3591 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term3592 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        setIntField(term3587, term3587.getClass(), "maximalOrder", 1484323161);
        setField(term3587, term3587.getClass(), "allowed", enum7);
        setDoubleField(term3587, term3587.getClass(), "functionValueAccuracy", 0.40176586625454525);
        setDoubleField(term3587, term3587.getClass(), "absoluteAccuracy", 0.28570734989730284);
        setDoubleField(term3587, term3587.getClass(), "relativeAccuracy", 0.544608645520025);
        setIntField(term3591, term3591.getClass(), "maximalCount", 0);
        setIntField(term3591, term3591.getClass(), "count", 0);
        setField(term3591, term3591.getClass(), "maxCountCallback", term3592);
        setField(term3587, term3587.getClass(), "evaluations", term3591);
        setDoubleField(term3587, term3587.getClass(), "searchMin", 0.0);
        setDoubleField(term3587, term3587.getClass(), "searchMax", 0.0);
        setDoubleField(term3587, term3587.getClass(), "searchStart", 0.0);
        setField(term3587, term3587.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term11;
        args[1] = term13;
        args[2] = term15;
        args[3] = term17;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3587));
        assertTrue(recursiveEquals(term11, 0.544608645520025));
        assertTrue(recursiveEquals(term13, 0.28570734989730284));
        assertTrue(recursiveEquals(term15, 0.40176586625454525));
        assertTrue(recursiveEquals(term17, 1484323161));
    }

};


