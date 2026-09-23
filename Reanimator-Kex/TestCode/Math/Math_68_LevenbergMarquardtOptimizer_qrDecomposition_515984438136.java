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

public class LevenbergMarquardtOptimizer_qrDecomposition_515984438136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1738031;

    public LevenbergMarquardtOptimizer_qrDecomposition_515984438136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1738031 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term1645020 = (int[]) newIntArray(489);
        Object[] term1645511 = (Object[]) newArray("[D", 183);
        double[] term1645512 = (double[]) newDoubleArray(489);
        setIntField(term1738031, term1738031.getClass(), "cols", 1);
        setField(term1738031, term1738031.getClass(), "permutation", term1645020);
        setElement(term1645511, 0, term1645512);
        setElement(term1645511, 1, term1645512);
        setElement(term1645511, 2, term1645512);
        setElement(term1645511, 3, term1645512);
        setElement(term1645511, 4, term1645512);
        setElement(term1645511, 5, term1645512);
        setElement(term1645511, 6, term1645512);
        setElement(term1645511, 7, term1645512);
        setElement(term1645511, 8, term1645512);
        setElement(term1645511, 9, term1645512);
        setElement(term1645511, 10, term1645512);
        setElement(term1645511, 11, term1645512);
        setElement(term1645511, 12, term1645512);
        setElement(term1645511, 13, term1645512);
        setElement(term1645511, 14, term1645512);
        setElement(term1645511, 15, term1645512);
        setElement(term1645511, 16, term1645512);
        setElement(term1645511, 17, term1645512);
        setElement(term1645511, 18, term1645512);
        setElement(term1645511, 19, term1645512);
        setElement(term1645511, 20, term1645512);
        setElement(term1645511, 21, term1645512);
        setElement(term1645511, 22, term1645512);
        setElement(term1645511, 23, term1645512);
        setElement(term1645511, 24, term1645512);
        setElement(term1645511, 25, term1645512);
        setElement(term1645511, 26, term1645512);
        setElement(term1645511, 27, term1645512);
        setElement(term1645511, 28, term1645512);
        setElement(term1645511, 29, term1645512);
        setElement(term1645511, 30, term1645512);
        setElement(term1645511, 31, term1645512);
        setElement(term1645511, 32, term1645512);
        setElement(term1645511, 33, term1645512);
        setElement(term1645511, 34, term1645512);
        setElement(term1645511, 35, term1645512);
        setElement(term1645511, 36, term1645512);
        setElement(term1645511, 37, term1645512);
        setElement(term1645511, 38, term1645512);
        setElement(term1645511, 39, term1645512);
        setElement(term1645511, 40, term1645512);
        setElement(term1645511, 41, term1645512);
        setElement(term1645511, 42, term1645512);
        setElement(term1645511, 43, term1645512);
        setElement(term1645511, 44, term1645512);
        setElement(term1645511, 45, term1645512);
        setElement(term1645511, 46, term1645512);
        setElement(term1645511, 47, term1645512);
        setElement(term1645511, 48, term1645512);
        setElement(term1645511, 49, term1645512);
        setElement(term1645511, 50, term1645512);
        setElement(term1645511, 51, term1645512);
        setElement(term1645511, 52, term1645512);
        setElement(term1645511, 53, term1645512);
        setElement(term1645511, 54, term1645512);
        setElement(term1645511, 55, term1645512);
        setElement(term1645511, 56, term1645512);
        setElement(term1645511, 57, term1645512);
        setElement(term1645511, 58, term1645512);
        setElement(term1645511, 59, term1645512);
        setElement(term1645511, 60, term1645512);
        setElement(term1645511, 61, term1645512);
        setElement(term1645511, 62, term1645512);
        setElement(term1645511, 63, term1645512);
        setElement(term1645511, 64, term1645512);
        setElement(term1645511, 65, term1645512);
        setElement(term1645511, 66, term1645512);
        setElement(term1645511, 67, term1645512);
        setElement(term1645511, 68, term1645512);
        setElement(term1645511, 69, term1645512);
        setElement(term1645511, 70, term1645512);
        setElement(term1645511, 71, term1645512);
        setElement(term1645511, 72, term1645512);
        setElement(term1645511, 73, term1645512);
        setElement(term1645511, 74, term1645512);
        setElement(term1645511, 75, term1645512);
        setElement(term1645511, 76, term1645512);
        setElement(term1645511, 77, term1645512);
        setElement(term1645511, 78, term1645512);
        setElement(term1645511, 79, term1645512);
        setElement(term1645511, 80, term1645512);
        setElement(term1645511, 81, term1645512);
        setElement(term1645511, 82, term1645512);
        setElement(term1645511, 83, term1645512);
        setElement(term1645511, 84, term1645512);
        setElement(term1645511, 85, term1645512);
        setElement(term1645511, 86, term1645512);
        setElement(term1645511, 87, term1645512);
        setElement(term1645511, 88, term1645512);
        setElement(term1645511, 89, term1645512);
        setElement(term1645511, 90, term1645512);
        setElement(term1645511, 91, term1645512);
        setElement(term1645511, 92, term1645512);
        setElement(term1645511, 93, term1645512);
        setElement(term1645511, 94, term1645512);
        setElement(term1645511, 95, term1645512);
        setElement(term1645511, 96, term1645512);
        setElement(term1645511, 97, term1645512);
        setElement(term1645511, 98, term1645512);
        setElement(term1645511, 99, term1645512);
        setElement(term1645511, 100, term1645512);
        setElement(term1645511, 101, term1645512);
        setElement(term1645511, 102, term1645512);
        setElement(term1645511, 103, term1645512);
        setElement(term1645511, 104, term1645512);
        setElement(term1645511, 105, term1645512);
        setElement(term1645511, 106, term1645512);
        setElement(term1645511, 107, term1645512);
        setElement(term1645511, 108, term1645512);
        setElement(term1645511, 109, term1645512);
        setElement(term1645511, 110, term1645512);
        setElement(term1645511, 111, term1645512);
        setElement(term1645511, 112, term1645512);
        setElement(term1645511, 113, term1645512);
        setElement(term1645511, 114, term1645512);
        setElement(term1645511, 115, term1645512);
        setElement(term1645511, 116, term1645512);
        setElement(term1645511, 117, term1645512);
        setElement(term1645511, 118, term1645512);
        setElement(term1645511, 119, term1645512);
        setElement(term1645511, 120, term1645512);
        setElement(term1645511, 121, term1645512);
        setElement(term1645511, 122, term1645512);
        setElement(term1645511, 123, term1645512);
        setElement(term1645511, 124, term1645512);
        setElement(term1645511, 125, term1645512);
        setElement(term1645511, 126, term1645512);
        setElement(term1645511, 127, term1645512);
        setElement(term1645511, 128, term1645512);
        setElement(term1645511, 129, term1645512);
        setElement(term1645511, 130, term1645512);
        setElement(term1645511, 131, term1645512);
        setElement(term1645511, 132, term1645512);
        setElement(term1645511, 133, term1645512);
        setElement(term1645511, 134, term1645512);
        setElement(term1645511, 135, term1645512);
        setElement(term1645511, 136, term1645512);
        setElement(term1645511, 137, term1645512);
        setElement(term1645511, 138, term1645512);
        setElement(term1645511, 139, term1645512);
        setElement(term1645511, 140, term1645512);
        setElement(term1645511, 141, term1645512);
        setElement(term1645511, 142, term1645512);
        setElement(term1645511, 143, term1645512);
        setElement(term1645511, 144, term1645512);
        setElement(term1645511, 145, term1645512);
        setElement(term1645511, 146, term1645512);
        setElement(term1645511, 147, term1645512);
        setElement(term1645511, 148, term1645512);
        setElement(term1645511, 149, term1645512);
        setElement(term1645511, 150, term1645512);
        setElement(term1645511, 151, term1645512);
        setElement(term1645511, 152, term1645512);
        setElement(term1645511, 153, term1645512);
        setElement(term1645511, 154, term1645512);
        setElement(term1645511, 155, term1645512);
        setElement(term1645511, 156, term1645512);
        setElement(term1645511, 157, term1645512);
        setElement(term1645511, 158, term1645512);
        setElement(term1645511, 159, term1645512);
        setElement(term1645511, 160, term1645512);
        setElement(term1645511, 161, term1645512);
        setElement(term1645511, 162, term1645512);
        setElement(term1645511, 163, term1645512);
        setElement(term1645511, 164, term1645512);
        setElement(term1645511, 165, term1645512);
        setElement(term1645511, 166, term1645512);
        setElement(term1645511, 167, term1645512);
        setElement(term1645511, 168, term1645512);
        setElement(term1645511, 169, term1645512);
        setElement(term1645511, 170, term1645512);
        setElement(term1645511, 171, term1645512);
        setElement(term1645511, 172, term1645512);
        setElement(term1645511, 173, term1645512);
        setElement(term1645511, 174, term1645512);
        setElement(term1645511, 175, term1645512);
        setElement(term1645511, 176, term1645512);
        setElement(term1645511, 177, term1645512);
        setElement(term1645511, 178, term1645512);
        setElement(term1645511, 179, term1645512);
        setElement(term1645511, 180, term1645512);
        setElement(term1645511, 181, term1645512);
        setElement(term1645511, 182, term1645512);
        setField(term1738031, term1738031.getClass(), "jacobian", term1645511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term1738031, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


