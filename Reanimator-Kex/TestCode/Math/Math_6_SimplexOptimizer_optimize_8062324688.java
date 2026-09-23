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
import org.apache.commons.math3.exception.DimensionMismatchException;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class SimplexOptimizer_optimize_8062324688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term41;

    public SimplexOptimizer_optimize_8062324688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2475 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term2474 = ((Class) term2475).getDeclaredField((String) "MAXIMIZE");
        ((Field) term2474).setAccessible(true);
        Object enum4 = ((Field) term2474).get((Object) null);
        term5 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term18 = (double[]) newDoubleArray(5);
        double[] term24 = (double[]) newDoubleArray(4);
        double[] term29 = (double[]) newDoubleArray(3);
        Object term33 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term36 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term37 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term40 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setField(term5, term5.getClass(), "simplex", null);
        setField(term5, term5.getClass(), "function", null);
        setField(term5, term5.getClass(), "goal", enum4);
        setDoubleElement(term18, 0, 0.5523635872663106);
        setDoubleElement(term18, 1, 0.544608645520025);
        setDoubleElement(term18, 2, 0.28570734989730284);
        setDoubleElement(term18, 3, 0.40176586625454525);
        setDoubleElement(term18, 4, 0.2641345529914265);
        setField(term5, term5.getClass(), "start", term18);
        setDoubleElement(term24, 0, 0.36923381893433327);
        setDoubleElement(term24, 1, 0.6076495596892013);
        setDoubleElement(term24, 2, 0.37773193782763337);
        setDoubleElement(term24, 3, 0.8474802076607362);
        setField(term5, term5.getClass(), "lowerBound", term24);
        setDoubleElement(term29, 0, 0.5183269973490326);
        setDoubleElement(term29, 1, 0.7655020693602768);
        setDoubleElement(term29, 2, 0.1374549299694151);
        setField(term5, term5.getClass(), "upperBound", term29);
        setIntField(term33, term33.getClass(), "maximalCount", 568599855);
        setIntField(term33, term33.getClass(), "count", 1162663216);
        setField(term33, term33.getClass(), "maxCountCallback", term36);
        setField(term5, term5.getClass(), "evaluations", term33);
        setIntField(term37, term37.getClass(), "maximalCount", 1484323161);
        setIntField(term37, term37.getClass(), "count", 391863371);
        setField(term37, term37.getClass(), "maxCountCallback", term40);
        setField(term5, term5.getClass(), "iterations", term37);
        setField(term5, term5.getClass(), "checker", null);
        term41 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term41;
        try {
            callMethod(klass, "optimize", argTypes, term5, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


