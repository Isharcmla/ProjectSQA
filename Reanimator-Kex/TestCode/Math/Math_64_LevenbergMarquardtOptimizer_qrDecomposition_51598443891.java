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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2151327;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2151327 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term2073878 = (int[]) newIntArray(489);
        Object[] term2074369 = (Object[]) newArray("[D", 152);
        double[] term2074370 = (double[]) newDoubleArray(489);
        setIntField(term2151327, term2151327.getClass(), "cols", 1);
        setField(term2151327, term2151327.getClass(), "permutation", term2073878);
        setElement(term2074369, 0, term2074370);
        setElement(term2074369, 1, term2074370);
        setElement(term2074369, 2, term2074370);
        setElement(term2074369, 3, term2074370);
        setElement(term2074369, 4, term2074370);
        setElement(term2074369, 5, term2074370);
        setElement(term2074369, 6, term2074370);
        setElement(term2074369, 7, term2074370);
        setElement(term2074369, 8, term2074370);
        setElement(term2074369, 9, term2074370);
        setElement(term2074369, 10, term2074370);
        setElement(term2074369, 11, term2074370);
        setElement(term2074369, 12, term2074370);
        setElement(term2074369, 13, term2074370);
        setElement(term2074369, 14, term2074370);
        setElement(term2074369, 15, term2074370);
        setElement(term2074369, 16, term2074370);
        setElement(term2074369, 17, term2074370);
        setElement(term2074369, 18, term2074370);
        setElement(term2074369, 19, term2074370);
        setElement(term2074369, 20, term2074370);
        setElement(term2074369, 21, term2074370);
        setElement(term2074369, 22, term2074370);
        setElement(term2074369, 23, term2074370);
        setElement(term2074369, 24, term2074370);
        setElement(term2074369, 25, term2074370);
        setElement(term2074369, 26, term2074370);
        setElement(term2074369, 27, term2074370);
        setElement(term2074369, 28, term2074370);
        setElement(term2074369, 29, term2074370);
        setElement(term2074369, 30, term2074370);
        setElement(term2074369, 31, term2074370);
        setElement(term2074369, 32, term2074370);
        setElement(term2074369, 33, term2074370);
        setElement(term2074369, 34, term2074370);
        setElement(term2074369, 35, term2074370);
        setElement(term2074369, 36, term2074370);
        setElement(term2074369, 37, term2074370);
        setElement(term2074369, 38, term2074370);
        setElement(term2074369, 39, term2074370);
        setElement(term2074369, 40, term2074370);
        setElement(term2074369, 41, term2074370);
        setElement(term2074369, 42, term2074370);
        setElement(term2074369, 43, term2074370);
        setElement(term2074369, 44, term2074370);
        setElement(term2074369, 45, term2074370);
        setElement(term2074369, 46, term2074370);
        setElement(term2074369, 47, term2074370);
        setElement(term2074369, 48, term2074370);
        setElement(term2074369, 49, term2074370);
        setElement(term2074369, 50, term2074370);
        setElement(term2074369, 51, term2074370);
        setElement(term2074369, 52, term2074370);
        setElement(term2074369, 53, term2074370);
        setElement(term2074369, 54, term2074370);
        setElement(term2074369, 55, term2074370);
        setElement(term2074369, 56, term2074370);
        setElement(term2074369, 57, term2074370);
        setElement(term2074369, 58, term2074370);
        setElement(term2074369, 59, term2074370);
        setElement(term2074369, 60, term2074370);
        setElement(term2074369, 61, term2074370);
        setElement(term2074369, 62, term2074370);
        setElement(term2074369, 63, term2074370);
        setElement(term2074369, 64, term2074370);
        setElement(term2074369, 65, term2074370);
        setElement(term2074369, 66, term2074370);
        setElement(term2074369, 67, term2074370);
        setElement(term2074369, 68, term2074370);
        setElement(term2074369, 69, term2074370);
        setElement(term2074369, 70, term2074370);
        setElement(term2074369, 71, term2074370);
        setElement(term2074369, 72, term2074370);
        setElement(term2074369, 73, term2074370);
        setElement(term2074369, 74, term2074370);
        setElement(term2074369, 75, term2074370);
        setElement(term2074369, 76, term2074370);
        setElement(term2074369, 77, term2074370);
        setElement(term2074369, 78, term2074370);
        setElement(term2074369, 79, term2074370);
        setElement(term2074369, 80, term2074370);
        setElement(term2074369, 81, term2074370);
        setElement(term2074369, 82, term2074370);
        setElement(term2074369, 83, term2074370);
        setElement(term2074369, 84, term2074370);
        setElement(term2074369, 85, term2074370);
        setElement(term2074369, 86, term2074370);
        setElement(term2074369, 87, term2074370);
        setElement(term2074369, 88, term2074370);
        setElement(term2074369, 89, term2074370);
        setElement(term2074369, 90, term2074370);
        setElement(term2074369, 91, term2074370);
        setElement(term2074369, 92, term2074370);
        setElement(term2074369, 93, term2074370);
        setElement(term2074369, 94, term2074370);
        setElement(term2074369, 95, term2074370);
        setElement(term2074369, 96, term2074370);
        setElement(term2074369, 97, term2074370);
        setElement(term2074369, 98, term2074370);
        setElement(term2074369, 99, term2074370);
        setElement(term2074369, 100, term2074370);
        setElement(term2074369, 101, term2074370);
        setElement(term2074369, 102, term2074370);
        setElement(term2074369, 103, term2074370);
        setElement(term2074369, 104, term2074370);
        setElement(term2074369, 105, term2074370);
        setElement(term2074369, 106, term2074370);
        setElement(term2074369, 107, term2074370);
        setElement(term2074369, 108, term2074370);
        setElement(term2074369, 109, term2074370);
        setElement(term2074369, 110, term2074370);
        setElement(term2074369, 111, term2074370);
        setElement(term2074369, 112, term2074370);
        setElement(term2074369, 113, term2074370);
        setElement(term2074369, 114, term2074370);
        setElement(term2074369, 115, term2074370);
        setElement(term2074369, 116, term2074370);
        setElement(term2074369, 117, term2074370);
        setElement(term2074369, 118, term2074370);
        setElement(term2074369, 119, term2074370);
        setElement(term2074369, 120, term2074370);
        setElement(term2074369, 121, term2074370);
        setElement(term2074369, 122, term2074370);
        setElement(term2074369, 123, term2074370);
        setElement(term2074369, 124, term2074370);
        setElement(term2074369, 125, term2074370);
        setElement(term2074369, 126, term2074370);
        setElement(term2074369, 127, term2074370);
        setElement(term2074369, 128, term2074370);
        setElement(term2074369, 129, term2074370);
        setElement(term2074369, 130, term2074370);
        setElement(term2074369, 131, term2074370);
        setElement(term2074369, 132, term2074370);
        setElement(term2074369, 133, term2074370);
        setElement(term2074369, 134, term2074370);
        setElement(term2074369, 135, term2074370);
        setElement(term2074369, 136, term2074370);
        setElement(term2074369, 137, term2074370);
        setElement(term2074369, 138, term2074370);
        setElement(term2074369, 139, term2074370);
        setElement(term2074369, 140, term2074370);
        setElement(term2074369, 141, term2074370);
        setElement(term2074369, 142, term2074370);
        setElement(term2074369, 143, term2074370);
        setElement(term2074369, 144, term2074370);
        setElement(term2074369, 145, term2074370);
        setElement(term2074369, 146, term2074370);
        setElement(term2074369, 147, term2074370);
        setElement(term2074369, 148, term2074370);
        setElement(term2074369, 149, term2074370);
        setElement(term2074369, 150, term2074370);
        setElement(term2074369, 151, term2074370);
        setField(term2151327, term2151327.getClass(), "jacobian", term2074369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term2151327, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


