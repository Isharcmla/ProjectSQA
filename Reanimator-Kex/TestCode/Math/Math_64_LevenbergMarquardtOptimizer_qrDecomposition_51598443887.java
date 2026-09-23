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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2006726;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2006726 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term1919237 = (int[]) newIntArray(489);
        Object[] term1919728 = (Object[]) newArray("[D", 172);
        double[] term1919729 = (double[]) newDoubleArray(489);
        setIntField(term2006726, term2006726.getClass(), "cols", 1);
        setField(term2006726, term2006726.getClass(), "permutation", term1919237);
        setElement(term1919728, 0, term1919729);
        setElement(term1919728, 1, term1919729);
        setElement(term1919728, 2, term1919729);
        setElement(term1919728, 3, term1919729);
        setElement(term1919728, 4, term1919729);
        setElement(term1919728, 5, term1919729);
        setElement(term1919728, 6, term1919729);
        setElement(term1919728, 7, term1919729);
        setElement(term1919728, 8, term1919729);
        setElement(term1919728, 9, term1919729);
        setElement(term1919728, 10, term1919729);
        setElement(term1919728, 11, term1919729);
        setElement(term1919728, 12, term1919729);
        setElement(term1919728, 13, term1919729);
        setElement(term1919728, 14, term1919729);
        setElement(term1919728, 15, term1919729);
        setElement(term1919728, 16, term1919729);
        setElement(term1919728, 17, term1919729);
        setElement(term1919728, 18, term1919729);
        setElement(term1919728, 19, term1919729);
        setElement(term1919728, 20, term1919729);
        setElement(term1919728, 21, term1919729);
        setElement(term1919728, 22, term1919729);
        setElement(term1919728, 23, term1919729);
        setElement(term1919728, 24, term1919729);
        setElement(term1919728, 25, term1919729);
        setElement(term1919728, 26, term1919729);
        setElement(term1919728, 27, term1919729);
        setElement(term1919728, 28, term1919729);
        setElement(term1919728, 29, term1919729);
        setElement(term1919728, 30, term1919729);
        setElement(term1919728, 31, term1919729);
        setElement(term1919728, 32, term1919729);
        setElement(term1919728, 33, term1919729);
        setElement(term1919728, 34, term1919729);
        setElement(term1919728, 35, term1919729);
        setElement(term1919728, 36, term1919729);
        setElement(term1919728, 37, term1919729);
        setElement(term1919728, 38, term1919729);
        setElement(term1919728, 39, term1919729);
        setElement(term1919728, 40, term1919729);
        setElement(term1919728, 41, term1919729);
        setElement(term1919728, 42, term1919729);
        setElement(term1919728, 43, term1919729);
        setElement(term1919728, 44, term1919729);
        setElement(term1919728, 45, term1919729);
        setElement(term1919728, 46, term1919729);
        setElement(term1919728, 47, term1919729);
        setElement(term1919728, 48, term1919729);
        setElement(term1919728, 49, term1919729);
        setElement(term1919728, 50, term1919729);
        setElement(term1919728, 51, term1919729);
        setElement(term1919728, 52, term1919729);
        setElement(term1919728, 53, term1919729);
        setElement(term1919728, 54, term1919729);
        setElement(term1919728, 55, term1919729);
        setElement(term1919728, 56, term1919729);
        setElement(term1919728, 57, term1919729);
        setElement(term1919728, 58, term1919729);
        setElement(term1919728, 59, term1919729);
        setElement(term1919728, 60, term1919729);
        setElement(term1919728, 61, term1919729);
        setElement(term1919728, 62, term1919729);
        setElement(term1919728, 63, term1919729);
        setElement(term1919728, 64, term1919729);
        setElement(term1919728, 65, term1919729);
        setElement(term1919728, 66, term1919729);
        setElement(term1919728, 67, term1919729);
        setElement(term1919728, 68, term1919729);
        setElement(term1919728, 69, term1919729);
        setElement(term1919728, 70, term1919729);
        setElement(term1919728, 71, term1919729);
        setElement(term1919728, 72, term1919729);
        setElement(term1919728, 73, term1919729);
        setElement(term1919728, 74, term1919729);
        setElement(term1919728, 75, term1919729);
        setElement(term1919728, 76, term1919729);
        setElement(term1919728, 77, term1919729);
        setElement(term1919728, 78, term1919729);
        setElement(term1919728, 79, term1919729);
        setElement(term1919728, 80, term1919729);
        setElement(term1919728, 81, term1919729);
        setElement(term1919728, 82, term1919729);
        setElement(term1919728, 83, term1919729);
        setElement(term1919728, 84, term1919729);
        setElement(term1919728, 85, term1919729);
        setElement(term1919728, 86, term1919729);
        setElement(term1919728, 87, term1919729);
        setElement(term1919728, 88, term1919729);
        setElement(term1919728, 89, term1919729);
        setElement(term1919728, 90, term1919729);
        setElement(term1919728, 91, term1919729);
        setElement(term1919728, 92, term1919729);
        setElement(term1919728, 93, term1919729);
        setElement(term1919728, 94, term1919729);
        setElement(term1919728, 95, term1919729);
        setElement(term1919728, 96, term1919729);
        setElement(term1919728, 97, term1919729);
        setElement(term1919728, 98, term1919729);
        setElement(term1919728, 99, term1919729);
        setElement(term1919728, 100, term1919729);
        setElement(term1919728, 101, term1919729);
        setElement(term1919728, 102, term1919729);
        setElement(term1919728, 103, term1919729);
        setElement(term1919728, 104, term1919729);
        setElement(term1919728, 105, term1919729);
        setElement(term1919728, 106, term1919729);
        setElement(term1919728, 107, term1919729);
        setElement(term1919728, 108, term1919729);
        setElement(term1919728, 109, term1919729);
        setElement(term1919728, 110, term1919729);
        setElement(term1919728, 111, term1919729);
        setElement(term1919728, 112, term1919729);
        setElement(term1919728, 113, term1919729);
        setElement(term1919728, 114, term1919729);
        setElement(term1919728, 115, term1919729);
        setElement(term1919728, 116, term1919729);
        setElement(term1919728, 117, term1919729);
        setElement(term1919728, 118, term1919729);
        setElement(term1919728, 119, term1919729);
        setElement(term1919728, 120, term1919729);
        setElement(term1919728, 121, term1919729);
        setElement(term1919728, 122, term1919729);
        setElement(term1919728, 123, term1919729);
        setElement(term1919728, 124, term1919729);
        setElement(term1919728, 125, term1919729);
        setElement(term1919728, 126, term1919729);
        setElement(term1919728, 127, term1919729);
        setElement(term1919728, 128, term1919729);
        setElement(term1919728, 129, term1919729);
        setElement(term1919728, 130, term1919729);
        setElement(term1919728, 131, term1919729);
        setElement(term1919728, 132, term1919729);
        setElement(term1919728, 133, term1919729);
        setElement(term1919728, 134, term1919729);
        setElement(term1919728, 135, term1919729);
        setElement(term1919728, 136, term1919729);
        setElement(term1919728, 137, term1919729);
        setElement(term1919728, 138, term1919729);
        setElement(term1919728, 139, term1919729);
        setElement(term1919728, 140, term1919729);
        setElement(term1919728, 141, term1919729);
        setElement(term1919728, 142, term1919729);
        setElement(term1919728, 143, term1919729);
        setElement(term1919728, 144, term1919729);
        setElement(term1919728, 145, term1919729);
        setElement(term1919728, 146, term1919729);
        setElement(term1919728, 147, term1919729);
        setElement(term1919728, 148, term1919729);
        setElement(term1919728, 149, term1919729);
        setElement(term1919728, 150, term1919729);
        setElement(term1919728, 151, term1919729);
        setElement(term1919728, 152, term1919729);
        setElement(term1919728, 153, term1919729);
        setElement(term1919728, 154, term1919729);
        setElement(term1919728, 155, term1919729);
        setElement(term1919728, 156, term1919729);
        setElement(term1919728, 157, term1919729);
        setElement(term1919728, 158, term1919729);
        setElement(term1919728, 159, term1919729);
        setElement(term1919728, 160, term1919729);
        setElement(term1919728, 161, term1919729);
        setElement(term1919728, 162, term1919729);
        setElement(term1919728, 163, term1919729);
        setElement(term1919728, 164, term1919729);
        setElement(term1919728, 165, term1919729);
        setElement(term1919728, 166, term1919729);
        setElement(term1919728, 167, term1919729);
        setElement(term1919728, 168, term1919729);
        setElement(term1919728, 169, term1919729);
        setElement(term1919728, 170, term1919729);
        setElement(term1919728, 171, term1919729);
        setField(term2006726, term2006726.getClass(), "jacobian", term1919728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term2006726, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


