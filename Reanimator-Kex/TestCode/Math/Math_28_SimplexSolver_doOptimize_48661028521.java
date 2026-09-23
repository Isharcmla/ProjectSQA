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

public class SimplexSolver_doOptimize_48661028521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16557;

    public SimplexSolver_doOptimize_48661028521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16751 = new ArrayList();
        Class<? extends Object> term17476 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term17475 = ((Class) term17476).getDeclaredField((String) "MINIMIZE");
        ((Field) term17475).setAccessible(true);
        Object enum36 = ((Field) term17475).get((Object) null);
        term16557 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        Object term16699 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term16557, term16557.getClass(), "function", term16699);
        setField(term16557, term16557.getClass(), "linearConstraints", term16751);
        setField(term16557, term16557.getClass(), "goal", enum36);
        setBooleanField(term16557, term16557.getClass(), "nonNegative", false);
        setDoubleField(term16557, term16557.getClass(), "epsilon", 0.0);
        setIntField(term16557, term16557.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term16557, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


