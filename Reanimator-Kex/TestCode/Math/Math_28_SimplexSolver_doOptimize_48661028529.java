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
import java.lang.String;

public class SimplexSolver_doOptimize_48661028529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21416;

    public SimplexSolver_doOptimize_48661028529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22202 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term22201 = ((Class) term22202).getDeclaredField((String) "MAXIMIZE");
        ((Field) term22201).setAccessible(true);
        Object enum42 = ((Field) term22201).get((Object) null);
        term21416 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        Object term21498 = newInstance(Class.forName("java.util.Collections$UnmodifiableList"));
        setField(term21416, term21416.getClass(), "function", null);
        setField(term21498, term21498.getClass(), "c", null);
        setField(term21416, term21416.getClass(), "linearConstraints", term21498);
        setField(term21416, term21416.getClass(), "goal", enum42);
        setBooleanField(term21416, term21416.getClass(), "nonNegative", false);
        setDoubleField(term21416, term21416.getClass(), "epsilon", 0.0);
        setIntField(term21416, term21416.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term21416, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


