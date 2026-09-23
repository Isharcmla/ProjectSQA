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

public class NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3623;
     Object term3679;

    public NonLinearConjugateGradientOptimizer_parseOptimizationData_214273587413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16330 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula");
        Field term16329 = ((Class) term16330).getDeclaredField((String) "POLAK_RIBIERE");
        ((Field) term16329).setAccessible(true);
        Object enum27 = ((Field) term16329).get((Object) null);
        Class<? extends Object> term16876 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term16875 = ((Class) term16876).getDeclaredField((String) "MAXIMIZE");
        ((Field) term16875).setAccessible(true);
        Object enum28 = ((Field) term16875).get((Object) null);
        term3623 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer"));
        double[] term3654 = (double[]) newDoubleArray(6);
        double[] term3661 = (double[]) newDoubleArray(7);
        double[] term3669 = (double[]) newDoubleArray(1);
        Object term3671 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term3674 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term3675 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term3678 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setField(term3623, term3623.getClass(), "updateFormula", enum27);
        setField(term3623, term3623.getClass(), "preconditioner", null);
        setField(term3623, term3623.getClass(), "solver", null);
        setDoubleField(term3623, term3623.getClass(), "initialStep", 0.7633268466829064);
        setField(term3623, term3623.getClass(), "gradient", null);
        setField(term3623, term3623.getClass(), "function", null);
        setField(term3623, term3623.getClass(), "goal", enum28);
        setDoubleElement(term3654, 0, 0.13481025392611334);
        setDoubleElement(term3654, 1, 0.3800088629986428);
        setDoubleElement(term3654, 2, 0.5840714198152577);
        setDoubleElement(term3654, 3, 0.7559240768573477);
        setDoubleElement(term3654, 4, 0.10667076642995188);
        setDoubleElement(term3654, 5, 0.11493000848982304);
        setField(term3623, term3623.getClass(), "start", term3654);
        setDoubleElement(term3661, 0, 0.37161417339133307);
        setDoubleElement(term3661, 1, 0.6805867182029153);
        setDoubleElement(term3661, 2, 0.2852810965221698);
        setDoubleElement(term3661, 3, 0.6300849762307866);
        setDoubleElement(term3661, 4, 0.9737083944266686);
        setDoubleElement(term3661, 5, 0.0668892744806211);
        setDoubleElement(term3661, 6, 0.3587267442738795);
        setField(term3623, term3623.getClass(), "lowerBound", term3661);
        setDoubleElement(term3669, 0, 0.07802449704920456);
        setField(term3623, term3623.getClass(), "upperBound", term3669);
        setIntField(term3671, term3671.getClass(), "maximalCount", 1227103734);
        setIntField(term3671, term3671.getClass(), "count", -1339778481);
        setField(term3671, term3671.getClass(), "maxCountCallback", term3674);
        setField(term3623, term3623.getClass(), "evaluations", term3671);
        setIntField(term3675, term3675.getClass(), "maximalCount", 1725571209);
        setIntField(term3675, term3675.getClass(), "count", -522618178);
        setField(term3675, term3675.getClass(), "maxCountCallback", term3678);
        setField(term3623, term3623.getClass(), "iterations", term3675);
        setField(term3623, term3623.getClass(), "checker", null);
        term3679 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3679;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term3623, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


