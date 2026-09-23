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

public class SimplexOptimizer_parseOptimizationData_93696086545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19403;
     Object term19185;
     Object term20028;
     Object term20033;

    public SimplexOptimizer_parseOptimizationData_93696086545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19403 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term19403, term19403.getClass(), "start", null);
        Class<? extends Object> term20039 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term20038 = ((Class) term20039).getDeclaredField((String) "MAXIMIZE");
        ((Field) term20038).setAccessible(true);
        Object enum14 = ((Field) term20038).get((Object) null);
        term19185 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 2);
        Object term19555 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setElement(term19185, 0, term19555);
        setElement(term19185, 1, enum14);
        Class<? extends Object> term20350 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term20349 = ((Class) term20350).getDeclaredField((String) "MAXIMIZE");
        ((Field) term20349).setAccessible(true);
        Object enum15 = ((Field) term20349).get((Object) null);
        term20028 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term20029 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setDoubleField(term20029, term20029.getClass(), "rho", 0.0);
        setDoubleField(term20029, term20029.getClass(), "khi", 0.0);
        setDoubleField(term20029, term20029.getClass(), "gamma", 0.0);
        setDoubleField(term20029, term20029.getClass(), "sigma", 0.0);
        setField(term20029, term20029.getClass(), "simplex", null);
        setField(term20029, term20029.getClass(), "startConfiguration", null);
        setIntField(term20029, term20029.getClass(), "dimension", 0);
        setField(term20028, term20028.getClass(), "simplex", term20029);
        setField(term20028, term20028.getClass(), "function", null);
        setField(term20028, term20028.getClass(), "goal", enum15);
        setField(term20028, term20028.getClass(), "start", null);
        setField(term20028, term20028.getClass(), "lowerBound", null);
        setField(term20028, term20028.getClass(), "upperBound", null);
        setField(term20028, term20028.getClass(), "evaluations", null);
        setField(term20028, term20028.getClass(), "iterations", null);
        setField(term20028, term20028.getClass(), "checker", null);
        Class<? extends Object> term20661 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term20660 = ((Class) term20661).getDeclaredField((String) "MAXIMIZE");
        ((Field) term20660).setAccessible(true);
        Object enum16 = ((Field) term20660).get((Object) null);
        term20033 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 2);
        Object term20034 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setDoubleField(term20034, term20034.getClass(), "rho", 0.0);
        setDoubleField(term20034, term20034.getClass(), "khi", 0.0);
        setDoubleField(term20034, term20034.getClass(), "gamma", 0.0);
        setDoubleField(term20034, term20034.getClass(), "sigma", 0.0);
        setField(term20034, term20034.getClass(), "simplex", null);
        setField(term20034, term20034.getClass(), "startConfiguration", null);
        setIntField(term20034, term20034.getClass(), "dimension", 0);
        setElement(term20033, 0, term20034);
        setElement(term20033, 1, enum16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term19185;
        callMethod(klass, "parseOptimizationData", argTypes, term19403, args);
        assertTrue(recursiveEquals(term19403, term20028));
        assertTrue(recursiveEquals(term19185, term20033));
    }

};


