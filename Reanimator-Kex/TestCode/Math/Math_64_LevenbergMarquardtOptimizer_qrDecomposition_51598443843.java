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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27283;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27283 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term23883 = (int[]) newIntArray(115);
        Object[] term24000 = (Object[]) newArray("[D", 5);
        double[] term24001 = (double[]) newDoubleArray(106);
        double[] term24108 = (double[]) newDoubleArray(240);
        double[] term24349 = (double[]) newDoubleArray(24);
        double[] term24374 = (double[]) newDoubleArray(44);
        double[] term25078 = (double[]) newDoubleArray(500);
        setIntField(term27283, term27283.getClass(), "cols", 10);
        setIntElement(term23883, 1, 471378486);
        setField(term27283, term27283.getClass(), "permutation", term23883);
        setElement(term24000, 0, term24001);
        setElement(term24000, 1, term24108);
        setElement(term24000, 2, term24349);
        setElement(term24000, 3, term24374);
        setElement(term24000, 4, term24108);
        setField(term27283, term27283.getClass(), "jacobian", term24000);
        setDoubleElement(term25078, 1, 6.6843479688768502E18);
        setField(term27283, term27283.getClass(), "jacNorm", term25078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "qrDecomposition", argTypes, term27283, args);
    }

};


