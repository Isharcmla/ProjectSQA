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

public class LevenbergMarquardtOptimizer_qrDecomposition_515984438118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208478;

    public LevenbergMarquardtOptimizer_qrDecomposition_515984438118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208478 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term124001 = (int[]) newIntArray(489);
        Object[] term124492 = (Object[]) newArray("[D", 166);
        double[] term124493 = (double[]) newDoubleArray(489);
        setIntField(term208478, term208478.getClass(), "cols", 1);
        setField(term208478, term208478.getClass(), "permutation", term124001);
        setElement(term124492, 0, term124493);
        setElement(term124492, 1, term124493);
        setElement(term124492, 2, term124493);
        setElement(term124492, 3, term124493);
        setElement(term124492, 4, term124493);
        setElement(term124492, 5, term124493);
        setElement(term124492, 6, term124493);
        setElement(term124492, 7, term124493);
        setElement(term124492, 8, term124493);
        setElement(term124492, 9, term124493);
        setElement(term124492, 10, term124493);
        setElement(term124492, 11, term124493);
        setElement(term124492, 12, term124493);
        setElement(term124492, 13, term124493);
        setElement(term124492, 14, term124493);
        setElement(term124492, 15, term124493);
        setElement(term124492, 16, term124493);
        setElement(term124492, 17, term124493);
        setElement(term124492, 18, term124493);
        setElement(term124492, 19, term124493);
        setElement(term124492, 20, term124493);
        setElement(term124492, 21, term124493);
        setElement(term124492, 22, term124493);
        setElement(term124492, 23, term124493);
        setElement(term124492, 24, term124493);
        setElement(term124492, 25, term124493);
        setElement(term124492, 26, term124493);
        setElement(term124492, 27, term124493);
        setElement(term124492, 28, term124493);
        setElement(term124492, 29, term124493);
        setElement(term124492, 30, term124493);
        setElement(term124492, 31, term124493);
        setElement(term124492, 32, term124493);
        setElement(term124492, 33, term124493);
        setElement(term124492, 34, term124493);
        setElement(term124492, 35, term124493);
        setElement(term124492, 36, term124493);
        setElement(term124492, 37, term124493);
        setElement(term124492, 38, term124493);
        setElement(term124492, 39, term124493);
        setElement(term124492, 40, term124493);
        setElement(term124492, 41, term124493);
        setElement(term124492, 42, term124493);
        setElement(term124492, 43, term124493);
        setElement(term124492, 44, term124493);
        setElement(term124492, 45, term124493);
        setElement(term124492, 46, term124493);
        setElement(term124492, 47, term124493);
        setElement(term124492, 48, term124493);
        setElement(term124492, 49, term124493);
        setElement(term124492, 50, term124493);
        setElement(term124492, 51, term124493);
        setElement(term124492, 52, term124493);
        setElement(term124492, 53, term124493);
        setElement(term124492, 54, term124493);
        setElement(term124492, 55, term124493);
        setElement(term124492, 56, term124493);
        setElement(term124492, 57, term124493);
        setElement(term124492, 58, term124493);
        setElement(term124492, 59, term124493);
        setElement(term124492, 60, term124493);
        setElement(term124492, 61, term124493);
        setElement(term124492, 62, term124493);
        setElement(term124492, 63, term124493);
        setElement(term124492, 64, term124493);
        setElement(term124492, 65, term124493);
        setElement(term124492, 66, term124493);
        setElement(term124492, 67, term124493);
        setElement(term124492, 68, term124493);
        setElement(term124492, 69, term124493);
        setElement(term124492, 70, term124493);
        setElement(term124492, 71, term124493);
        setElement(term124492, 72, term124493);
        setElement(term124492, 73, term124493);
        setElement(term124492, 74, term124493);
        setElement(term124492, 75, term124493);
        setElement(term124492, 76, term124493);
        setElement(term124492, 77, term124493);
        setElement(term124492, 78, term124493);
        setElement(term124492, 79, term124493);
        setElement(term124492, 80, term124493);
        setElement(term124492, 81, term124493);
        setElement(term124492, 82, term124493);
        setElement(term124492, 83, term124493);
        setElement(term124492, 84, term124493);
        setElement(term124492, 85, term124493);
        setElement(term124492, 86, term124493);
        setElement(term124492, 87, term124493);
        setElement(term124492, 88, term124493);
        setElement(term124492, 89, term124493);
        setElement(term124492, 90, term124493);
        setElement(term124492, 91, term124493);
        setElement(term124492, 92, term124493);
        setElement(term124492, 93, term124493);
        setElement(term124492, 94, term124493);
        setElement(term124492, 95, term124493);
        setElement(term124492, 96, term124493);
        setElement(term124492, 97, term124493);
        setElement(term124492, 98, term124493);
        setElement(term124492, 99, term124493);
        setElement(term124492, 100, term124493);
        setElement(term124492, 101, term124493);
        setElement(term124492, 102, term124493);
        setElement(term124492, 103, term124493);
        setElement(term124492, 104, term124493);
        setElement(term124492, 105, term124493);
        setElement(term124492, 106, term124493);
        setElement(term124492, 107, term124493);
        setElement(term124492, 108, term124493);
        setElement(term124492, 109, term124493);
        setElement(term124492, 110, term124493);
        setElement(term124492, 111, term124493);
        setElement(term124492, 112, term124493);
        setElement(term124492, 113, term124493);
        setElement(term124492, 114, term124493);
        setElement(term124492, 115, term124493);
        setElement(term124492, 116, term124493);
        setElement(term124492, 117, term124493);
        setElement(term124492, 118, term124493);
        setElement(term124492, 119, term124493);
        setElement(term124492, 120, term124493);
        setElement(term124492, 121, term124493);
        setElement(term124492, 122, term124493);
        setElement(term124492, 123, term124493);
        setElement(term124492, 124, term124493);
        setElement(term124492, 125, term124493);
        setElement(term124492, 126, term124493);
        setElement(term124492, 127, term124493);
        setElement(term124492, 128, term124493);
        setElement(term124492, 129, term124493);
        setElement(term124492, 130, term124493);
        setElement(term124492, 131, term124493);
        setElement(term124492, 132, term124493);
        setElement(term124492, 133, term124493);
        setElement(term124492, 134, term124493);
        setElement(term124492, 135, term124493);
        setElement(term124492, 136, term124493);
        setElement(term124492, 137, term124493);
        setElement(term124492, 138, term124493);
        setElement(term124492, 139, term124493);
        setElement(term124492, 140, term124493);
        setElement(term124492, 141, term124493);
        setElement(term124492, 142, term124493);
        setElement(term124492, 143, term124493);
        setElement(term124492, 144, term124493);
        setElement(term124492, 145, term124493);
        setElement(term124492, 146, term124493);
        setElement(term124492, 147, term124493);
        setElement(term124492, 148, term124493);
        setElement(term124492, 149, term124493);
        setElement(term124492, 150, term124493);
        setElement(term124492, 151, term124493);
        setElement(term124492, 152, term124493);
        setElement(term124492, 153, term124493);
        setElement(term124492, 154, term124493);
        setElement(term124492, 155, term124493);
        setElement(term124492, 156, term124493);
        setElement(term124492, 157, term124493);
        setElement(term124492, 158, term124493);
        setElement(term124492, 159, term124493);
        setElement(term124492, 160, term124493);
        setElement(term124492, 161, term124493);
        setElement(term124492, 162, term124493);
        setElement(term124492, 163, term124493);
        setElement(term124492, 164, term124493);
        setElement(term124492, 165, term124493);
        setField(term208478, term208478.getClass(), "jacobian", term124492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term208478, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


