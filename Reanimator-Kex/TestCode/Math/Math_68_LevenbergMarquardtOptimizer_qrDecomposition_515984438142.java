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

public class LevenbergMarquardtOptimizer_qrDecomposition_515984438142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2169926;

    public LevenbergMarquardtOptimizer_qrDecomposition_515984438142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2169926 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term2072899 = (int[]) newIntArray(489);
        Object[] term2073390 = (Object[]) newArray("[D", 191);
        double[] term2073391 = (double[]) newDoubleArray(489);
        setIntField(term2169926, term2169926.getClass(), "cols", 1);
        setField(term2169926, term2169926.getClass(), "permutation", term2072899);
        setElement(term2073390, 0, term2073391);
        setElement(term2073390, 1, term2073391);
        setElement(term2073390, 2, term2073391);
        setElement(term2073390, 3, term2073391);
        setElement(term2073390, 4, term2073391);
        setElement(term2073390, 5, term2073391);
        setElement(term2073390, 6, term2073391);
        setElement(term2073390, 7, term2073391);
        setElement(term2073390, 8, term2073391);
        setElement(term2073390, 9, term2073391);
        setElement(term2073390, 10, term2073391);
        setElement(term2073390, 11, term2073391);
        setElement(term2073390, 12, term2073391);
        setElement(term2073390, 13, term2073391);
        setElement(term2073390, 14, term2073391);
        setElement(term2073390, 15, term2073391);
        setElement(term2073390, 16, term2073391);
        setElement(term2073390, 17, term2073391);
        setElement(term2073390, 18, term2073391);
        setElement(term2073390, 19, term2073391);
        setElement(term2073390, 20, term2073391);
        setElement(term2073390, 21, term2073391);
        setElement(term2073390, 22, term2073391);
        setElement(term2073390, 23, term2073391);
        setElement(term2073390, 24, term2073391);
        setElement(term2073390, 25, term2073391);
        setElement(term2073390, 26, term2073391);
        setElement(term2073390, 27, term2073391);
        setElement(term2073390, 28, term2073391);
        setElement(term2073390, 29, term2073391);
        setElement(term2073390, 30, term2073391);
        setElement(term2073390, 31, term2073391);
        setElement(term2073390, 32, term2073391);
        setElement(term2073390, 33, term2073391);
        setElement(term2073390, 34, term2073391);
        setElement(term2073390, 35, term2073391);
        setElement(term2073390, 36, term2073391);
        setElement(term2073390, 37, term2073391);
        setElement(term2073390, 38, term2073391);
        setElement(term2073390, 39, term2073391);
        setElement(term2073390, 40, term2073391);
        setElement(term2073390, 41, term2073391);
        setElement(term2073390, 42, term2073391);
        setElement(term2073390, 43, term2073391);
        setElement(term2073390, 44, term2073391);
        setElement(term2073390, 45, term2073391);
        setElement(term2073390, 46, term2073391);
        setElement(term2073390, 47, term2073391);
        setElement(term2073390, 48, term2073391);
        setElement(term2073390, 49, term2073391);
        setElement(term2073390, 50, term2073391);
        setElement(term2073390, 51, term2073391);
        setElement(term2073390, 52, term2073391);
        setElement(term2073390, 53, term2073391);
        setElement(term2073390, 54, term2073391);
        setElement(term2073390, 55, term2073391);
        setElement(term2073390, 56, term2073391);
        setElement(term2073390, 57, term2073391);
        setElement(term2073390, 58, term2073391);
        setElement(term2073390, 59, term2073391);
        setElement(term2073390, 60, term2073391);
        setElement(term2073390, 61, term2073391);
        setElement(term2073390, 62, term2073391);
        setElement(term2073390, 63, term2073391);
        setElement(term2073390, 64, term2073391);
        setElement(term2073390, 65, term2073391);
        setElement(term2073390, 66, term2073391);
        setElement(term2073390, 67, term2073391);
        setElement(term2073390, 68, term2073391);
        setElement(term2073390, 69, term2073391);
        setElement(term2073390, 70, term2073391);
        setElement(term2073390, 71, term2073391);
        setElement(term2073390, 72, term2073391);
        setElement(term2073390, 73, term2073391);
        setElement(term2073390, 74, term2073391);
        setElement(term2073390, 75, term2073391);
        setElement(term2073390, 76, term2073391);
        setElement(term2073390, 77, term2073391);
        setElement(term2073390, 78, term2073391);
        setElement(term2073390, 79, term2073391);
        setElement(term2073390, 80, term2073391);
        setElement(term2073390, 81, term2073391);
        setElement(term2073390, 82, term2073391);
        setElement(term2073390, 83, term2073391);
        setElement(term2073390, 84, term2073391);
        setElement(term2073390, 85, term2073391);
        setElement(term2073390, 86, term2073391);
        setElement(term2073390, 87, term2073391);
        setElement(term2073390, 88, term2073391);
        setElement(term2073390, 89, term2073391);
        setElement(term2073390, 90, term2073391);
        setElement(term2073390, 91, term2073391);
        setElement(term2073390, 92, term2073391);
        setElement(term2073390, 93, term2073391);
        setElement(term2073390, 94, term2073391);
        setElement(term2073390, 95, term2073391);
        setElement(term2073390, 96, term2073391);
        setElement(term2073390, 97, term2073391);
        setElement(term2073390, 98, term2073391);
        setElement(term2073390, 99, term2073391);
        setElement(term2073390, 100, term2073391);
        setElement(term2073390, 101, term2073391);
        setElement(term2073390, 102, term2073391);
        setElement(term2073390, 103, term2073391);
        setElement(term2073390, 104, term2073391);
        setElement(term2073390, 105, term2073391);
        setElement(term2073390, 106, term2073391);
        setElement(term2073390, 107, term2073391);
        setElement(term2073390, 108, term2073391);
        setElement(term2073390, 109, term2073391);
        setElement(term2073390, 110, term2073391);
        setElement(term2073390, 111, term2073391);
        setElement(term2073390, 112, term2073391);
        setElement(term2073390, 113, term2073391);
        setElement(term2073390, 114, term2073391);
        setElement(term2073390, 115, term2073391);
        setElement(term2073390, 116, term2073391);
        setElement(term2073390, 117, term2073391);
        setElement(term2073390, 118, term2073391);
        setElement(term2073390, 119, term2073391);
        setElement(term2073390, 120, term2073391);
        setElement(term2073390, 121, term2073391);
        setElement(term2073390, 122, term2073391);
        setElement(term2073390, 123, term2073391);
        setElement(term2073390, 124, term2073391);
        setElement(term2073390, 125, term2073391);
        setElement(term2073390, 126, term2073391);
        setElement(term2073390, 127, term2073391);
        setElement(term2073390, 128, term2073391);
        setElement(term2073390, 129, term2073391);
        setElement(term2073390, 130, term2073391);
        setElement(term2073390, 131, term2073391);
        setElement(term2073390, 132, term2073391);
        setElement(term2073390, 133, term2073391);
        setElement(term2073390, 134, term2073391);
        setElement(term2073390, 135, term2073391);
        setElement(term2073390, 136, term2073391);
        setElement(term2073390, 137, term2073391);
        setElement(term2073390, 138, term2073391);
        setElement(term2073390, 139, term2073391);
        setElement(term2073390, 140, term2073391);
        setElement(term2073390, 141, term2073391);
        setElement(term2073390, 142, term2073391);
        setElement(term2073390, 143, term2073391);
        setElement(term2073390, 144, term2073391);
        setElement(term2073390, 145, term2073391);
        setElement(term2073390, 146, term2073391);
        setElement(term2073390, 147, term2073391);
        setElement(term2073390, 148, term2073391);
        setElement(term2073390, 149, term2073391);
        setElement(term2073390, 150, term2073391);
        setElement(term2073390, 151, term2073391);
        setElement(term2073390, 152, term2073391);
        setElement(term2073390, 153, term2073391);
        setElement(term2073390, 154, term2073391);
        setElement(term2073390, 155, term2073391);
        setElement(term2073390, 156, term2073391);
        setElement(term2073390, 157, term2073391);
        setElement(term2073390, 158, term2073391);
        setElement(term2073390, 159, term2073391);
        setElement(term2073390, 160, term2073391);
        setElement(term2073390, 161, term2073391);
        setElement(term2073390, 162, term2073391);
        setElement(term2073390, 163, term2073391);
        setElement(term2073390, 164, term2073391);
        setElement(term2073390, 165, term2073391);
        setElement(term2073390, 166, term2073391);
        setElement(term2073390, 167, term2073391);
        setElement(term2073390, 168, term2073391);
        setElement(term2073390, 169, term2073391);
        setElement(term2073390, 170, term2073391);
        setElement(term2073390, 171, term2073391);
        setElement(term2073390, 172, term2073391);
        setElement(term2073390, 173, term2073391);
        setElement(term2073390, 174, term2073391);
        setElement(term2073390, 175, term2073391);
        setElement(term2073390, 176, term2073391);
        setElement(term2073390, 177, term2073391);
        setElement(term2073390, 178, term2073391);
        setElement(term2073390, 179, term2073391);
        setElement(term2073390, 180, term2073391);
        setElement(term2073390, 181, term2073391);
        setElement(term2073390, 182, term2073391);
        setElement(term2073390, 183, term2073391);
        setElement(term2073390, 184, term2073391);
        setElement(term2073390, 185, term2073391);
        setElement(term2073390, 186, term2073391);
        setElement(term2073390, 187, term2073391);
        setElement(term2073390, 188, term2073391);
        setElement(term2073390, 189, term2073391);
        setElement(term2073390, 190, term2073391);
        setField(term2169926, term2169926.getClass(), "jacobian", term2073390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term2169926, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


