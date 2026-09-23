package org.apache.commons.math3.optimization.general;

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
import static org.apache.commons.math3.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class AbstractLeastSquaresOptimizer_optimize_202002966435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;
     Object term70;
     Object term77;
     Object term85;

    public AbstractLeastSquaresOptimizer_optimize_202002966435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68 = new Integer(1162663216);
        term70 = (double[]) newDoubleArray(6);
        setDoubleElement(term70, 0, 0.11493000848982304);
        setDoubleElement(term70, 1, 0.37161417339133307);
        setDoubleElement(term70, 2, 0.6805867182029153);
        setDoubleElement(term70, 3, 0.2852810965221698);
        setDoubleElement(term70, 4, 0.6300849762307866);
        setDoubleElement(term70, 5, 0.9737083944266686);
        term77 = (double[]) newDoubleArray(7);
        setDoubleElement(term77, 0, 0.0668892744806211);
        setDoubleElement(term77, 1, 0.3587267442738795);
        setDoubleElement(term77, 2, 0.07802449704920456);
        setDoubleElement(term77, 3, 0.5279279537140873);
        setDoubleElement(term77, 4, 0.3202192021706908);
        setDoubleElement(term77, 5, 0.22651340641904605);
        setDoubleElement(term77, 6, 0.8878841294187743);
        term85 = (double[]) newDoubleArray(1);
        setDoubleElement(term85, 0, 0.6588948704887806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction");
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[5];
        args[0] = term68;
        args[1] = null;
        args[2] = term70;
        args[3] = term77;
        args[4] = term85;
        try {
            callMethod(klass, "optimize", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


