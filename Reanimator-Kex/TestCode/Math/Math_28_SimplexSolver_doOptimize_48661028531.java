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

public class SimplexSolver_doOptimize_48661028531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23033;

    public SimplexSolver_doOptimize_48661028531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23331 = new ArrayList();
        Class<? extends Object> term25507 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term25506 = ((Class) term25507).getDeclaredField((String) "MAXIMIZE");
        ((Field) term25506).setAccessible(true);
        Object enum45 = ((Field) term25506).get((Object) null);
        term23033 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        Object term23175 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term23279 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(term23175, term23175.getClass(), "coefficients", term23279);
        setField(term23033, term23033.getClass(), "function", term23175);
        setField(term23033, term23033.getClass(), "linearConstraints", term23331);
        setField(term23033, term23033.getClass(), "goal", enum45);
        setBooleanField(term23033, term23033.getClass(), "nonNegative", false);
        setDoubleField(term23033, term23033.getClass(), "epsilon", 0.0);
        setIntField(term23033, term23033.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term23033, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


