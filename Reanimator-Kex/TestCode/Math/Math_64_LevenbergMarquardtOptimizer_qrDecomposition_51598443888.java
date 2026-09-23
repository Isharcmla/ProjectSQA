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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2022948;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2022948 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term2010257 = (int[]) newIntArray(489);
        Object[] term2010748 = (Object[]) newArray("[D", 23);
        double[] term2010749 = (double[]) newDoubleArray(489);
        setIntField(term2022948, term2022948.getClass(), "cols", 1);
        setField(term2022948, term2022948.getClass(), "permutation", term2010257);
        setElement(term2010748, 0, term2010749);
        setElement(term2010748, 1, term2010749);
        setElement(term2010748, 2, term2010749);
        setElement(term2010748, 3, term2010749);
        setElement(term2010748, 4, term2010749);
        setElement(term2010748, 5, term2010749);
        setElement(term2010748, 6, term2010749);
        setElement(term2010748, 7, term2010749);
        setElement(term2010748, 8, term2010749);
        setElement(term2010748, 9, term2010749);
        setElement(term2010748, 10, term2010749);
        setElement(term2010748, 11, term2010749);
        setElement(term2010748, 12, term2010749);
        setElement(term2010748, 13, term2010749);
        setElement(term2010748, 14, term2010749);
        setElement(term2010748, 15, term2010749);
        setElement(term2010748, 16, term2010749);
        setElement(term2010748, 17, term2010749);
        setElement(term2010748, 18, term2010749);
        setElement(term2010748, 19, term2010749);
        setElement(term2010748, 20, term2010749);
        setElement(term2010748, 21, term2010749);
        setElement(term2010748, 22, term2010749);
        setField(term2022948, term2022948.getClass(), "jacobian", term2010748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term2022948, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


