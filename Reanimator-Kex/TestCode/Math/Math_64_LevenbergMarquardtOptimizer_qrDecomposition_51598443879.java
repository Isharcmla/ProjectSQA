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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1487046;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1487046 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term1400561 = (int[]) newIntArray(489);
        Object[] term1401052 = (Object[]) newArray("[D", 170);
        double[] term1401053 = (double[]) newDoubleArray(489);
        setIntField(term1487046, term1487046.getClass(), "cols", 1);
        setField(term1487046, term1487046.getClass(), "permutation", term1400561);
        setElement(term1401052, 0, term1401053);
        setElement(term1401052, 1, term1401053);
        setElement(term1401052, 2, term1401053);
        setElement(term1401052, 3, term1401053);
        setElement(term1401052, 4, term1401053);
        setElement(term1401052, 5, term1401053);
        setElement(term1401052, 6, term1401053);
        setElement(term1401052, 7, term1401053);
        setElement(term1401052, 8, term1401053);
        setElement(term1401052, 9, term1401053);
        setElement(term1401052, 10, term1401053);
        setElement(term1401052, 11, term1401053);
        setElement(term1401052, 12, term1401053);
        setElement(term1401052, 13, term1401053);
        setElement(term1401052, 14, term1401053);
        setElement(term1401052, 15, term1401053);
        setElement(term1401052, 16, term1401053);
        setElement(term1401052, 17, term1401053);
        setElement(term1401052, 18, term1401053);
        setElement(term1401052, 19, term1401053);
        setElement(term1401052, 20, term1401053);
        setElement(term1401052, 21, term1401053);
        setElement(term1401052, 22, term1401053);
        setElement(term1401052, 23, term1401053);
        setElement(term1401052, 24, term1401053);
        setElement(term1401052, 25, term1401053);
        setElement(term1401052, 26, term1401053);
        setElement(term1401052, 27, term1401053);
        setElement(term1401052, 28, term1401053);
        setElement(term1401052, 29, term1401053);
        setElement(term1401052, 30, term1401053);
        setElement(term1401052, 31, term1401053);
        setElement(term1401052, 32, term1401053);
        setElement(term1401052, 33, term1401053);
        setElement(term1401052, 34, term1401053);
        setElement(term1401052, 35, term1401053);
        setElement(term1401052, 36, term1401053);
        setElement(term1401052, 37, term1401053);
        setElement(term1401052, 38, term1401053);
        setElement(term1401052, 39, term1401053);
        setElement(term1401052, 40, term1401053);
        setElement(term1401052, 41, term1401053);
        setElement(term1401052, 42, term1401053);
        setElement(term1401052, 43, term1401053);
        setElement(term1401052, 44, term1401053);
        setElement(term1401052, 45, term1401053);
        setElement(term1401052, 46, term1401053);
        setElement(term1401052, 47, term1401053);
        setElement(term1401052, 48, term1401053);
        setElement(term1401052, 49, term1401053);
        setElement(term1401052, 50, term1401053);
        setElement(term1401052, 51, term1401053);
        setElement(term1401052, 52, term1401053);
        setElement(term1401052, 53, term1401053);
        setElement(term1401052, 54, term1401053);
        setElement(term1401052, 55, term1401053);
        setElement(term1401052, 56, term1401053);
        setElement(term1401052, 57, term1401053);
        setElement(term1401052, 58, term1401053);
        setElement(term1401052, 59, term1401053);
        setElement(term1401052, 60, term1401053);
        setElement(term1401052, 61, term1401053);
        setElement(term1401052, 62, term1401053);
        setElement(term1401052, 63, term1401053);
        setElement(term1401052, 64, term1401053);
        setElement(term1401052, 65, term1401053);
        setElement(term1401052, 66, term1401053);
        setElement(term1401052, 67, term1401053);
        setElement(term1401052, 68, term1401053);
        setElement(term1401052, 69, term1401053);
        setElement(term1401052, 70, term1401053);
        setElement(term1401052, 71, term1401053);
        setElement(term1401052, 72, term1401053);
        setElement(term1401052, 73, term1401053);
        setElement(term1401052, 74, term1401053);
        setElement(term1401052, 75, term1401053);
        setElement(term1401052, 76, term1401053);
        setElement(term1401052, 77, term1401053);
        setElement(term1401052, 78, term1401053);
        setElement(term1401052, 79, term1401053);
        setElement(term1401052, 80, term1401053);
        setElement(term1401052, 81, term1401053);
        setElement(term1401052, 82, term1401053);
        setElement(term1401052, 83, term1401053);
        setElement(term1401052, 84, term1401053);
        setElement(term1401052, 85, term1401053);
        setElement(term1401052, 86, term1401053);
        setElement(term1401052, 87, term1401053);
        setElement(term1401052, 88, term1401053);
        setElement(term1401052, 89, term1401053);
        setElement(term1401052, 90, term1401053);
        setElement(term1401052, 91, term1401053);
        setElement(term1401052, 92, term1401053);
        setElement(term1401052, 93, term1401053);
        setElement(term1401052, 94, term1401053);
        setElement(term1401052, 95, term1401053);
        setElement(term1401052, 96, term1401053);
        setElement(term1401052, 97, term1401053);
        setElement(term1401052, 98, term1401053);
        setElement(term1401052, 99, term1401053);
        setElement(term1401052, 100, term1401053);
        setElement(term1401052, 101, term1401053);
        setElement(term1401052, 102, term1401053);
        setElement(term1401052, 103, term1401053);
        setElement(term1401052, 104, term1401053);
        setElement(term1401052, 105, term1401053);
        setElement(term1401052, 106, term1401053);
        setElement(term1401052, 107, term1401053);
        setElement(term1401052, 108, term1401053);
        setElement(term1401052, 109, term1401053);
        setElement(term1401052, 110, term1401053);
        setElement(term1401052, 111, term1401053);
        setElement(term1401052, 112, term1401053);
        setElement(term1401052, 113, term1401053);
        setElement(term1401052, 114, term1401053);
        setElement(term1401052, 115, term1401053);
        setElement(term1401052, 116, term1401053);
        setElement(term1401052, 117, term1401053);
        setElement(term1401052, 118, term1401053);
        setElement(term1401052, 119, term1401053);
        setElement(term1401052, 120, term1401053);
        setElement(term1401052, 121, term1401053);
        setElement(term1401052, 122, term1401053);
        setElement(term1401052, 123, term1401053);
        setElement(term1401052, 124, term1401053);
        setElement(term1401052, 125, term1401053);
        setElement(term1401052, 126, term1401053);
        setElement(term1401052, 127, term1401053);
        setElement(term1401052, 128, term1401053);
        setElement(term1401052, 129, term1401053);
        setElement(term1401052, 130, term1401053);
        setElement(term1401052, 131, term1401053);
        setElement(term1401052, 132, term1401053);
        setElement(term1401052, 133, term1401053);
        setElement(term1401052, 134, term1401053);
        setElement(term1401052, 135, term1401053);
        setElement(term1401052, 136, term1401053);
        setElement(term1401052, 137, term1401053);
        setElement(term1401052, 138, term1401053);
        setElement(term1401052, 139, term1401053);
        setElement(term1401052, 140, term1401053);
        setElement(term1401052, 141, term1401053);
        setElement(term1401052, 142, term1401053);
        setElement(term1401052, 143, term1401053);
        setElement(term1401052, 144, term1401053);
        setElement(term1401052, 145, term1401053);
        setElement(term1401052, 146, term1401053);
        setElement(term1401052, 147, term1401053);
        setElement(term1401052, 148, term1401053);
        setElement(term1401052, 149, term1401053);
        setElement(term1401052, 150, term1401053);
        setElement(term1401052, 151, term1401053);
        setElement(term1401052, 152, term1401053);
        setElement(term1401052, 153, term1401053);
        setElement(term1401052, 154, term1401053);
        setElement(term1401052, 155, term1401053);
        setElement(term1401052, 156, term1401053);
        setElement(term1401052, 157, term1401053);
        setElement(term1401052, 158, term1401053);
        setElement(term1401052, 159, term1401053);
        setElement(term1401052, 160, term1401053);
        setElement(term1401052, 161, term1401053);
        setElement(term1401052, 162, term1401053);
        setElement(term1401052, 163, term1401053);
        setElement(term1401052, 164, term1401053);
        setElement(term1401052, 165, term1401053);
        setElement(term1401052, 166, term1401053);
        setElement(term1401052, 167, term1401053);
        setElement(term1401052, 168, term1401053);
        setElement(term1401052, 169, term1401053);
        setField(term1487046, term1487046.getClass(), "jacobian", term1401052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term1487046, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


