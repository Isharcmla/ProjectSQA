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
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import static org.apache.commons.math3.optim.nonlinear.scalar.gradient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NonLinearConjugateGradientOptimizer_checkParameters_209151556015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5478;

    public NonLinearConjugateGradientOptimizer_checkParameters_209151556015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20037 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        Field term20036 = ((Class) term20037).getDeclaredField((String) "POLAK_RIBIERE");
        ((Field) term20036).setAccessible(true);
        Object enum33 = ((Field) term20036).get((Object) null);
        Class<? extends Object> term20583 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term20582 = ((Class) term20583).getDeclaredField((String) "MINIMIZE");
        ((Field) term20582).setAccessible(true);
        Object enum34 = ((Field) term20582).get((Object) null);
        term5478 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] term5509 = (double[]) newDoubleArray(3);
        double[] term5513 = (double[]) newDoubleArray(1);
        double[] term5515 = (double[]) newDoubleArray(0);
        Object term5516 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term5519 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term5520 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term5523 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setField(term5478, term5478.getClass(), "updateFormula", enum33);
        setField(term5478, term5478.getClass(), "preconditioner", null);
        setField(term5478, term5478.getClass(), "solver", null);
        setDoubleField(term5478, term5478.getClass(), "initialStep", 0.8454723071922143);
        setField(term5478, term5478.getClass(), "gradient", null);
        setField(term5478, term5478.getClass(), "function", null);
        setField(term5478, term5478.getClass(), "goal", enum34);
        setDoubleElement(term5509, 0, 0.8566567697571895);
        setDoubleElement(term5509, 1, 0.9203805380592256);
        setDoubleElement(term5509, 2, 0.5804948995371725);
        setField(term5478, term5478.getClass(), "start", term5509);
        setDoubleElement(term5513, 0, 0.20737514139742264);
        setField(term5478, term5478.getClass(), "lowerBound", term5513);
        setField(term5478, term5478.getClass(), "upperBound", term5515);
        setIntField(term5516, term5516.getClass(), "maximalCount", -1685132342);
        setIntField(term5516, term5516.getClass(), "count", -1456670397);
        setField(term5516, term5516.getClass(), "maxCountCallback", term5519);
        setField(term5478, term5478.getClass(), "evaluations", term5516);
        setIntField(term5520, term5520.getClass(), "maximalCount", 1622346318);
        setIntField(term5520, term5520.getClass(), "count", 1048535127);
        setField(term5520, term5520.getClass(), "maxCountCallback", term5523);
        setField(term5478, term5478.getClass(), "iterations", term5520);
        setField(term5478, term5478.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "checkParameters", argTypes, term5478, args);
            assertTrue(false);
        }
        catch (MathUnsupportedOperationException e) {
        }

    }

};


