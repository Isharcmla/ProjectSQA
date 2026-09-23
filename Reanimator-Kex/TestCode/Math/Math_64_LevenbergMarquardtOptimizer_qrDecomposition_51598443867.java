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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1135208;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1135208 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term1038181 = (int[]) newIntArray(489);
        Object[] term1038672 = (Object[]) newArray("[D", 191);
        double[] term1038673 = (double[]) newDoubleArray(489);
        setIntField(term1135208, term1135208.getClass(), "cols", 1);
        setField(term1135208, term1135208.getClass(), "permutation", term1038181);
        setElement(term1038672, 0, term1038673);
        setElement(term1038672, 1, term1038673);
        setElement(term1038672, 2, term1038673);
        setElement(term1038672, 3, term1038673);
        setElement(term1038672, 4, term1038673);
        setElement(term1038672, 5, term1038673);
        setElement(term1038672, 6, term1038673);
        setElement(term1038672, 7, term1038673);
        setElement(term1038672, 8, term1038673);
        setElement(term1038672, 9, term1038673);
        setElement(term1038672, 10, term1038673);
        setElement(term1038672, 11, term1038673);
        setElement(term1038672, 12, term1038673);
        setElement(term1038672, 13, term1038673);
        setElement(term1038672, 14, term1038673);
        setElement(term1038672, 15, term1038673);
        setElement(term1038672, 16, term1038673);
        setElement(term1038672, 17, term1038673);
        setElement(term1038672, 18, term1038673);
        setElement(term1038672, 19, term1038673);
        setElement(term1038672, 20, term1038673);
        setElement(term1038672, 21, term1038673);
        setElement(term1038672, 22, term1038673);
        setElement(term1038672, 23, term1038673);
        setElement(term1038672, 24, term1038673);
        setElement(term1038672, 25, term1038673);
        setElement(term1038672, 26, term1038673);
        setElement(term1038672, 27, term1038673);
        setElement(term1038672, 28, term1038673);
        setElement(term1038672, 29, term1038673);
        setElement(term1038672, 30, term1038673);
        setElement(term1038672, 31, term1038673);
        setElement(term1038672, 32, term1038673);
        setElement(term1038672, 33, term1038673);
        setElement(term1038672, 34, term1038673);
        setElement(term1038672, 35, term1038673);
        setElement(term1038672, 36, term1038673);
        setElement(term1038672, 37, term1038673);
        setElement(term1038672, 38, term1038673);
        setElement(term1038672, 39, term1038673);
        setElement(term1038672, 40, term1038673);
        setElement(term1038672, 41, term1038673);
        setElement(term1038672, 42, term1038673);
        setElement(term1038672, 43, term1038673);
        setElement(term1038672, 44, term1038673);
        setElement(term1038672, 45, term1038673);
        setElement(term1038672, 46, term1038673);
        setElement(term1038672, 47, term1038673);
        setElement(term1038672, 48, term1038673);
        setElement(term1038672, 49, term1038673);
        setElement(term1038672, 50, term1038673);
        setElement(term1038672, 51, term1038673);
        setElement(term1038672, 52, term1038673);
        setElement(term1038672, 53, term1038673);
        setElement(term1038672, 54, term1038673);
        setElement(term1038672, 55, term1038673);
        setElement(term1038672, 56, term1038673);
        setElement(term1038672, 57, term1038673);
        setElement(term1038672, 58, term1038673);
        setElement(term1038672, 59, term1038673);
        setElement(term1038672, 60, term1038673);
        setElement(term1038672, 61, term1038673);
        setElement(term1038672, 62, term1038673);
        setElement(term1038672, 63, term1038673);
        setElement(term1038672, 64, term1038673);
        setElement(term1038672, 65, term1038673);
        setElement(term1038672, 66, term1038673);
        setElement(term1038672, 67, term1038673);
        setElement(term1038672, 68, term1038673);
        setElement(term1038672, 69, term1038673);
        setElement(term1038672, 70, term1038673);
        setElement(term1038672, 71, term1038673);
        setElement(term1038672, 72, term1038673);
        setElement(term1038672, 73, term1038673);
        setElement(term1038672, 74, term1038673);
        setElement(term1038672, 75, term1038673);
        setElement(term1038672, 76, term1038673);
        setElement(term1038672, 77, term1038673);
        setElement(term1038672, 78, term1038673);
        setElement(term1038672, 79, term1038673);
        setElement(term1038672, 80, term1038673);
        setElement(term1038672, 81, term1038673);
        setElement(term1038672, 82, term1038673);
        setElement(term1038672, 83, term1038673);
        setElement(term1038672, 84, term1038673);
        setElement(term1038672, 85, term1038673);
        setElement(term1038672, 86, term1038673);
        setElement(term1038672, 87, term1038673);
        setElement(term1038672, 88, term1038673);
        setElement(term1038672, 89, term1038673);
        setElement(term1038672, 90, term1038673);
        setElement(term1038672, 91, term1038673);
        setElement(term1038672, 92, term1038673);
        setElement(term1038672, 93, term1038673);
        setElement(term1038672, 94, term1038673);
        setElement(term1038672, 95, term1038673);
        setElement(term1038672, 96, term1038673);
        setElement(term1038672, 97, term1038673);
        setElement(term1038672, 98, term1038673);
        setElement(term1038672, 99, term1038673);
        setElement(term1038672, 100, term1038673);
        setElement(term1038672, 101, term1038673);
        setElement(term1038672, 102, term1038673);
        setElement(term1038672, 103, term1038673);
        setElement(term1038672, 104, term1038673);
        setElement(term1038672, 105, term1038673);
        setElement(term1038672, 106, term1038673);
        setElement(term1038672, 107, term1038673);
        setElement(term1038672, 108, term1038673);
        setElement(term1038672, 109, term1038673);
        setElement(term1038672, 110, term1038673);
        setElement(term1038672, 111, term1038673);
        setElement(term1038672, 112, term1038673);
        setElement(term1038672, 113, term1038673);
        setElement(term1038672, 114, term1038673);
        setElement(term1038672, 115, term1038673);
        setElement(term1038672, 116, term1038673);
        setElement(term1038672, 117, term1038673);
        setElement(term1038672, 118, term1038673);
        setElement(term1038672, 119, term1038673);
        setElement(term1038672, 120, term1038673);
        setElement(term1038672, 121, term1038673);
        setElement(term1038672, 122, term1038673);
        setElement(term1038672, 123, term1038673);
        setElement(term1038672, 124, term1038673);
        setElement(term1038672, 125, term1038673);
        setElement(term1038672, 126, term1038673);
        setElement(term1038672, 127, term1038673);
        setElement(term1038672, 128, term1038673);
        setElement(term1038672, 129, term1038673);
        setElement(term1038672, 130, term1038673);
        setElement(term1038672, 131, term1038673);
        setElement(term1038672, 132, term1038673);
        setElement(term1038672, 133, term1038673);
        setElement(term1038672, 134, term1038673);
        setElement(term1038672, 135, term1038673);
        setElement(term1038672, 136, term1038673);
        setElement(term1038672, 137, term1038673);
        setElement(term1038672, 138, term1038673);
        setElement(term1038672, 139, term1038673);
        setElement(term1038672, 140, term1038673);
        setElement(term1038672, 141, term1038673);
        setElement(term1038672, 142, term1038673);
        setElement(term1038672, 143, term1038673);
        setElement(term1038672, 144, term1038673);
        setElement(term1038672, 145, term1038673);
        setElement(term1038672, 146, term1038673);
        setElement(term1038672, 147, term1038673);
        setElement(term1038672, 148, term1038673);
        setElement(term1038672, 149, term1038673);
        setElement(term1038672, 150, term1038673);
        setElement(term1038672, 151, term1038673);
        setElement(term1038672, 152, term1038673);
        setElement(term1038672, 153, term1038673);
        setElement(term1038672, 154, term1038673);
        setElement(term1038672, 155, term1038673);
        setElement(term1038672, 156, term1038673);
        setElement(term1038672, 157, term1038673);
        setElement(term1038672, 158, term1038673);
        setElement(term1038672, 159, term1038673);
        setElement(term1038672, 160, term1038673);
        setElement(term1038672, 161, term1038673);
        setElement(term1038672, 162, term1038673);
        setElement(term1038672, 163, term1038673);
        setElement(term1038672, 164, term1038673);
        setElement(term1038672, 165, term1038673);
        setElement(term1038672, 166, term1038673);
        setElement(term1038672, 167, term1038673);
        setElement(term1038672, 168, term1038673);
        setElement(term1038672, 169, term1038673);
        setElement(term1038672, 170, term1038673);
        setElement(term1038672, 171, term1038673);
        setElement(term1038672, 172, term1038673);
        setElement(term1038672, 173, term1038673);
        setElement(term1038672, 174, term1038673);
        setElement(term1038672, 175, term1038673);
        setElement(term1038672, 176, term1038673);
        setElement(term1038672, 177, term1038673);
        setElement(term1038672, 178, term1038673);
        setElement(term1038672, 179, term1038673);
        setElement(term1038672, 180, term1038673);
        setElement(term1038672, 181, term1038673);
        setElement(term1038672, 182, term1038673);
        setElement(term1038672, 183, term1038673);
        setElement(term1038672, 184, term1038673);
        setElement(term1038672, 185, term1038673);
        setElement(term1038672, 186, term1038673);
        setElement(term1038672, 187, term1038673);
        setElement(term1038672, 188, term1038673);
        setElement(term1038672, 189, term1038673);
        setElement(term1038672, 190, term1038673);
        setField(term1135208, term1135208.getClass(), "jacobian", term1038672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term1135208, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


