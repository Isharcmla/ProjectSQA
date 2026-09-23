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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1394642;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1394642 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term1382453 = (int[]) newIntArray(489);
        Object[] term1382944 = (Object[]) newArray("[D", 22);
        double[] term1382945 = (double[]) newDoubleArray(489);
        setIntField(term1394642, term1394642.getClass(), "cols", 1);
        setField(term1394642, term1394642.getClass(), "permutation", term1382453);
        setElement(term1382944, 0, term1382945);
        setElement(term1382944, 1, term1382945);
        setElement(term1382944, 2, term1382945);
        setElement(term1382944, 3, term1382945);
        setElement(term1382944, 4, term1382945);
        setElement(term1382944, 5, term1382945);
        setElement(term1382944, 6, term1382945);
        setElement(term1382944, 7, term1382945);
        setElement(term1382944, 8, term1382945);
        setElement(term1382944, 9, term1382945);
        setElement(term1382944, 10, term1382945);
        setElement(term1382944, 11, term1382945);
        setElement(term1382944, 12, term1382945);
        setElement(term1382944, 13, term1382945);
        setElement(term1382944, 14, term1382945);
        setElement(term1382944, 15, term1382945);
        setElement(term1382944, 16, term1382945);
        setElement(term1382944, 17, term1382945);
        setElement(term1382944, 18, term1382945);
        setElement(term1382944, 19, term1382945);
        setElement(term1382944, 20, term1382945);
        setElement(term1382944, 21, term1382945);
        setField(term1394642, term1394642.getClass(), "jacobian", term1382944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term1394642, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


