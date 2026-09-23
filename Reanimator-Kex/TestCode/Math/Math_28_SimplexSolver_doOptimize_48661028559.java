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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexSolver_doOptimize_48661028559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48480;

    public SimplexSolver_doOptimize_48661028559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term48778 = new ArrayList();
        Class<? extends Object> term49052 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term49051 = ((Class) term49052).getDeclaredField((String) "MINIMIZE");
        ((Field) term49051).setAccessible(true);
        Object enum50 = ((Field) term49051).get((Object) null);
        term48480 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        Object term48622 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term48726 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setIntField(term48726, term48726.getClass(), "virtualSize", 253);
        setField(term48622, term48622.getClass(), "coefficients", term48726);
        setField(term48480, term48480.getClass(), "function", term48622);
        setField(term48480, term48480.getClass(), "linearConstraints", term48778);
        setField(term48480, term48480.getClass(), "goal", enum50);
        setBooleanField(term48480, term48480.getClass(), "nonNegative", false);
        setDoubleField(term48480, term48480.getClass(), "epsilon", 0.0);
        setIntField(term48480, term48480.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doOptimize", argTypes, term48480, args);
    }

};


