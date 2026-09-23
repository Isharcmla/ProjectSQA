package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.gradient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NonLinearConjugateGradientOptimizer_optimize_201200747711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1750;
     Object term1806;

    public NonLinearConjugateGradientOptimizer_optimize_201200747711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11547 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        Field term11546 = ((Class) term11547).getDeclaredField((String) "FLETCHER_REEVES");
        ((Field) term11546).setAccessible(true);
        Object enum19 = ((Field) term11546).get((Object) null);
        Class<? extends Object> term12099 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term12098 = ((Class) term12099).getDeclaredField((String) "MAXIMIZE");
        ((Field) term12098).setAccessible(true);
        Object enum20 = ((Field) term12098).get((Object) null);
        term1750 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] term1783 = (double[]) newDoubleArray(5);
        double[] term1789 = (double[]) newDoubleArray(4);
        double[] term1794 = (double[]) newDoubleArray(3);
        Object term1798 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1801 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term1802 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term1805 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setField(term1750, term1750.getClass(), "updateFormula", enum19);
        setField(term1750, term1750.getClass(), "preconditioner", null);
        setField(term1750, term1750.getClass(), "solver", null);
        setDoubleField(term1750, term1750.getClass(), "initialStep", 0.13238746331190498);
        setField(term1750, term1750.getClass(), "gradient", null);
        setField(term1750, term1750.getClass(), "function", null);
        setField(term1750, term1750.getClass(), "goal", enum20);
        setDoubleElement(term1783, 0, 0.3455959125047594);
        setDoubleElement(term1783, 1, 0.5523635872663106);
        setDoubleElement(term1783, 2, 0.544608645520025);
        setDoubleElement(term1783, 3, 0.28570734989730284);
        setDoubleElement(term1783, 4, 0.40176586625454525);
        setField(term1750, term1750.getClass(), "start", term1783);
        setDoubleElement(term1789, 0, 0.2641345529914265);
        setDoubleElement(term1789, 1, 0.36923381893433327);
        setDoubleElement(term1789, 2, 0.6076495596892013);
        setDoubleElement(term1789, 3, 0.37773193782763337);
        setField(term1750, term1750.getClass(), "lowerBound", term1789);
        setDoubleElement(term1794, 0, 0.8474802076607362);
        setDoubleElement(term1794, 1, 0.5183269973490326);
        setDoubleElement(term1794, 2, 0.7655020693602768);
        setField(term1750, term1750.getClass(), "upperBound", term1794);
        setIntField(term1798, term1798.getClass(), "maximalCount", 568599855);
        setIntField(term1798, term1798.getClass(), "count", 1162663216);
        setField(term1798, term1798.getClass(), "maxCountCallback", term1801);
        setField(term1750, term1750.getClass(), "evaluations", term1798);
        setIntField(term1802, term1802.getClass(), "maximalCount", 1484323161);
        setIntField(term1802, term1802.getClass(), "count", 391863371);
        setField(term1802, term1802.getClass(), "maxCountCallback", term1805);
        setField(term1750, term1750.getClass(), "iterations", term1802);
        setField(term1750, term1750.getClass(), "checker", null);
        term1806 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1806;
        try {
            callMethod(klass, "optimize", argTypes, term1750, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


