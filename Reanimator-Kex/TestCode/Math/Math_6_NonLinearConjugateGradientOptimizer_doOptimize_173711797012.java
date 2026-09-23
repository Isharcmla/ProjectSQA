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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optim.nonlinear.scalar.gradient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NonLinearConjugateGradientOptimizer_doOptimize_173711797012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2706;

    public NonLinearConjugateGradientOptimizer_doOptimize_173711797012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13615 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        Field term13614 = ((Class) term13615).getDeclaredField((String) "POLAK_RIBIERE");
        ((Field) term13614).setAccessible(true);
        Object enum23 = ((Field) term13614).get((Object) null);
        Class<? extends Object> term14161 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term14160 = ((Class) term14161).getDeclaredField((String) "MAXIMIZE");
        ((Field) term14160).setAccessible(true);
        Object enum24 = ((Field) term14160).get((Object) null);
        term2706 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] term2737 = (double[]) newDoubleArray(1);
        double[] term2739 = (double[]) newDoubleArray(6);
        double[] term2746 = (double[]) newDoubleArray(2);
        Object term2749 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term2752 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term2753 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term2756 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setField(term2706, term2706.getClass(), "updateFormula", enum23);
        setField(term2706, term2706.getClass(), "preconditioner", null);
        setField(term2706, term2706.getClass(), "solver", null);
        setDoubleField(term2706, term2706.getClass(), "initialStep", 0.1374549299694151);
        setField(term2706, term2706.getClass(), "gradient", null);
        setField(term2706, term2706.getClass(), "function", null);
        setField(term2706, term2706.getClass(), "goal", enum24);
        setDoubleElement(term2737, 0, 0.7031006357544823);
        setField(term2706, term2706.getClass(), "start", term2737);
        setDoubleElement(term2739, 0, 0.9527281779865117);
        setDoubleElement(term2739, 1, 0.9828442029246764);
        setDoubleElement(term2739, 2, 0.2779719046761513);
        setDoubleElement(term2739, 3, 0.6436713023569729);
        setDoubleElement(term2739, 4, 0.7332741045694002);
        setDoubleElement(term2739, 5, 0.4569171842750229);
        setField(term2706, term2706.getClass(), "lowerBound", term2739);
        setDoubleElement(term2746, 0, 0.8598297828918529);
        setDoubleElement(term2746, 1, 0.43692187681405226);
        setField(term2706, term2706.getClass(), "upperBound", term2746);
        setIntField(term2749, term2749.getClass(), "maximalCount", -1922583790);
        setIntField(term2749, term2749.getClass(), "count", -616727354);
        setField(term2749, term2749.getClass(), "maxCountCallback", term2752);
        setField(term2706, term2706.getClass(), "evaluations", term2749);
        setIntField(term2753, term2753.getClass(), "maximalCount", -1955890973);
        setIntField(term2753, term2753.getClass(), "count", -2038273078);
        setField(term2753, term2753.getClass(), "maxCountCallback", term2756);
        setField(term2706, term2706.getClass(), "iterations", term2753);
        setField(term2706, term2706.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term2706, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


