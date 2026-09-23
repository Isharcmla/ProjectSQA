package org.apache.commons.math.optimization.general;

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
import static org.apache.commons.math.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11342;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11342 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term10296 = (int[]) newIntArray(105);
        Object[] term10403 = (Object[]) newArray("[D", 5);
        double[] term10404 = (double[]) newDoubleArray(10);
        double[] term10415 = (double[]) newDoubleArray(32);
        double[] term10448 = (double[]) newDoubleArray(2);
        double[] term10451 = (double[]) newDoubleArray(256);
        double[] term10708 = (double[]) newDoubleArray(42);
        double[] term11098 = (double[]) newDoubleArray(2);
        setIntField(term11342, term11342.getClass(), "cols", 1);
        setField(term11342, term11342.getClass(), "permutation", term10296);
        setElement(term10403, 0, term10404);
        setElement(term10403, 1, term10415);
        setElement(term10403, 2, term10448);
        setElement(term10403, 3, term10451);
        setElement(term10403, 4, term10708);
        setField(term11342, term11342.getClass(), "jacobian", term10403);
        setField(term11342, term11342.getClass(), "jacNorm", term11098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "qrDecomposition", argTypes, term11342, args);
    }

};


