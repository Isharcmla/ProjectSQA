package org.apache.commons.math3.optimization.linear;

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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class SimplexSolver_doOptimize_48661028525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18749;

    public SimplexSolver_doOptimize_48661028525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18801 = new ArrayList();
        Class<? extends Object> term19517 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term19516 = ((Class) term19517).getDeclaredField((String) "MINIMIZE");
        ((Field) term19516).setAccessible(true);
        Object enum39 = ((Field) term19516).get((Object) null);
        term18749 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(term18749, term18749.getClass(), "function", null);
        setField(term18749, term18749.getClass(), "linearConstraints", term18801);
        setField(term18749, term18749.getClass(), "goal", enum39);
        setBooleanField(term18749, term18749.getClass(), "nonNegative", false);
        setDoubleField(term18749, term18749.getClass(), "epsilon", 0.0);
        setIntField(term18749, term18749.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term18749, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


