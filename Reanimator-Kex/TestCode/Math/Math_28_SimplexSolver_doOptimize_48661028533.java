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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexSolver_doOptimize_48661028533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27003;

    public SimplexSolver_doOptimize_48661028533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27197 = new ArrayList();
        Class<? extends Object> term27922 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term27921 = ((Class) term27922).getDeclaredField((String) "MINIMIZE");
        ((Field) term27921).setAccessible(true);
        Object enum48 = ((Field) term27921).get((Object) null);
        term27003 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        Object term27145 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term27003, term27003.getClass(), "function", term27145);
        setField(term27003, term27003.getClass(), "linearConstraints", term27197);
        setField(term27003, term27003.getClass(), "goal", enum48);
        setBooleanField(term27003, term27003.getClass(), "nonNegative", false);
        setDoubleField(term27003, term27003.getClass(), "epsilon", 0.0);
        setIntField(term27003, term27003.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term27003, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


