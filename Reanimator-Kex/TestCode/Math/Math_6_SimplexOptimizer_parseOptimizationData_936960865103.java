package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class SimplexOptimizer_parseOptimizationData_936960865103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60593;
     Object term60240;
     Object term61618;
     Object term61623;

    public SimplexOptimizer_parseOptimizationData_936960865103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60593 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term60593, term60593.getClass(), "start", null);
        setField(term60593, term60593.getClass(), "goal", null);
        Class<? extends Object> term61631 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term61630 = ((Class) term61631).getDeclaredField((String) "MINIMIZE");
        ((Field) term61630).setAccessible(true);
        Object enum33 = ((Field) term61630).get((Object) null);
        term60240 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term60757 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        Object term61065 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        Object term61217 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setElement(term60240, 0, term60757);
        setElement(term60240, 3, enum33);
        setElement(term60240, 4, term61065);
        setElement(term60240, 5, term61217);
        Class<? extends Object> term61942 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term61941 = ((Class) term61942).getDeclaredField((String) "MINIMIZE");
        ((Field) term61941).setAccessible(true);
        Object enum34 = ((Field) term61941).get((Object) null);
        term61618 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term61619 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        setDoubleField(term61619, term61619.getClass(), "khi", 0.0);
        setDoubleField(term61619, term61619.getClass(), "gamma", 0.0);
        setField(term61619, term61619.getClass(), "simplex", null);
        setField(term61619, term61619.getClass(), "startConfiguration", null);
        setIntField(term61619, term61619.getClass(), "dimension", 0);
        setField(term61618, term61618.getClass(), "simplex", term61619);
        setField(term61618, term61618.getClass(), "function", null);
        setField(term61618, term61618.getClass(), "goal", enum34);
        setField(term61618, term61618.getClass(), "start", null);
        setField(term61618, term61618.getClass(), "lowerBound", null);
        setField(term61618, term61618.getClass(), "upperBound", null);
        setField(term61618, term61618.getClass(), "evaluations", null);
        setField(term61618, term61618.getClass(), "iterations", null);
        setField(term61618, term61618.getClass(), "checker", null);
        Class<? extends Object> term62253 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term62252 = ((Class) term62253).getDeclaredField((String) "MINIMIZE");
        ((Field) term62252).setAccessible(true);
        Object enum35 = ((Field) term62252).get((Object) null);
        term61623 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term61624 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        Object term61628 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        Object term61629 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setDoubleField(term61624, term61624.getClass(), "khi", 0.0);
        setDoubleField(term61624, term61624.getClass(), "gamma", 0.0);
        setField(term61624, term61624.getClass(), "simplex", null);
        setField(term61624, term61624.getClass(), "startConfiguration", null);
        setIntField(term61624, term61624.getClass(), "dimension", 0);
        setElement(term61623, 0, term61624);
        setElement(term61623, 3, enum35);
        setDoubleField(term61628, term61628.getClass(), "rho", 0.0);
        setDoubleField(term61628, term61628.getClass(), "khi", 0.0);
        setDoubleField(term61628, term61628.getClass(), "gamma", 0.0);
        setDoubleField(term61628, term61628.getClass(), "sigma", 0.0);
        setField(term61628, term61628.getClass(), "simplex", null);
        setField(term61628, term61628.getClass(), "startConfiguration", null);
        setIntField(term61628, term61628.getClass(), "dimension", 0);
        setElement(term61623, 4, term61628);
        setDoubleField(term61629, term61629.getClass(), "rho", 0.0);
        setDoubleField(term61629, term61629.getClass(), "khi", 0.0);
        setDoubleField(term61629, term61629.getClass(), "gamma", 0.0);
        setDoubleField(term61629, term61629.getClass(), "sigma", 0.0);
        setField(term61629, term61629.getClass(), "simplex", null);
        setField(term61629, term61629.getClass(), "startConfiguration", null);
        setIntField(term61629, term61629.getClass(), "dimension", 0);
        setElement(term61623, 5, term61629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term60240;
        callMethod(klass, "parseOptimizationData", argTypes, term60593, args);
        assertTrue(recursiveEquals(term60593, term61618));
        assertTrue(recursiveEquals(term60240, term61623));
    }

};


