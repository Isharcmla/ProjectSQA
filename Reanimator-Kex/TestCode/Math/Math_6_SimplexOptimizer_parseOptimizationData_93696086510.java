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

public class SimplexOptimizer_parseOptimizationData_93696086510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term742;
     Object term780;

    public SimplexOptimizer_parseOptimizationData_93696086510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5178 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term5177 = ((Class) term5178).getDeclaredField((String) "MAXIMIZE");
        ((Field) term5177).setAccessible(true);
        Object enum7 = ((Field) term5177).get((Object) null);
        term742 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term755 = (double[]) newDoubleArray(6);
        double[] term762 = (double[]) newDoubleArray(7);
        double[] term770 = (double[]) newDoubleArray(1);
        Object term772 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term775 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term776 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term779 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setField(term742, term742.getClass(), "simplex", null);
        setField(term742, term742.getClass(), "function", null);
        setField(term742, term742.getClass(), "goal", enum7);
        setDoubleElement(term755, 0, 0.7633268466829064);
        setDoubleElement(term755, 1, 0.13481025392611334);
        setDoubleElement(term755, 2, 0.3800088629986428);
        setDoubleElement(term755, 3, 0.5840714198152577);
        setDoubleElement(term755, 4, 0.7559240768573477);
        setDoubleElement(term755, 5, 0.10667076642995188);
        setField(term742, term742.getClass(), "start", term755);
        setDoubleElement(term762, 0, 0.11493000848982304);
        setDoubleElement(term762, 1, 0.37161417339133307);
        setDoubleElement(term762, 2, 0.6805867182029153);
        setDoubleElement(term762, 3, 0.2852810965221698);
        setDoubleElement(term762, 4, 0.6300849762307866);
        setDoubleElement(term762, 5, 0.9737083944266686);
        setDoubleElement(term762, 6, 0.0668892744806211);
        setField(term742, term742.getClass(), "lowerBound", term762);
        setDoubleElement(term770, 0, 0.3587267442738795);
        setField(term742, term742.getClass(), "upperBound", term770);
        setIntField(term772, term772.getClass(), "maximalCount", 1227103734);
        setIntField(term772, term772.getClass(), "count", -1339778481);
        setField(term772, term772.getClass(), "maxCountCallback", term775);
        setField(term742, term742.getClass(), "evaluations", term772);
        setIntField(term776, term776.getClass(), "maximalCount", 1725571209);
        setIntField(term776, term776.getClass(), "count", -522618178);
        setField(term776, term776.getClass(), "maxCountCallback", term779);
        setField(term742, term742.getClass(), "iterations", term776);
        setField(term742, term742.getClass(), "checker", null);
        term780 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term780;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term742, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


