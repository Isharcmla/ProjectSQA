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

public class LevenbergMarquardtOptimizer_qrDecomposition_515984438119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307490;

    public LevenbergMarquardtOptimizer_qrDecomposition_515984438119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307490 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term209459 = (int[]) newIntArray(489);
        Object[] term209950 = (Object[]) newArray("[D", 193);
        double[] term209951 = (double[]) newDoubleArray(489);
        setIntField(term307490, term307490.getClass(), "cols", 1);
        setField(term307490, term307490.getClass(), "permutation", term209459);
        setElement(term209950, 0, term209951);
        setElement(term209950, 1, term209951);
        setElement(term209950, 2, term209951);
        setElement(term209950, 3, term209951);
        setElement(term209950, 4, term209951);
        setElement(term209950, 5, term209951);
        setElement(term209950, 6, term209951);
        setElement(term209950, 7, term209951);
        setElement(term209950, 8, term209951);
        setElement(term209950, 9, term209951);
        setElement(term209950, 10, term209951);
        setElement(term209950, 11, term209951);
        setElement(term209950, 12, term209951);
        setElement(term209950, 13, term209951);
        setElement(term209950, 14, term209951);
        setElement(term209950, 15, term209951);
        setElement(term209950, 16, term209951);
        setElement(term209950, 17, term209951);
        setElement(term209950, 18, term209951);
        setElement(term209950, 19, term209951);
        setElement(term209950, 20, term209951);
        setElement(term209950, 21, term209951);
        setElement(term209950, 22, term209951);
        setElement(term209950, 23, term209951);
        setElement(term209950, 24, term209951);
        setElement(term209950, 25, term209951);
        setElement(term209950, 26, term209951);
        setElement(term209950, 27, term209951);
        setElement(term209950, 28, term209951);
        setElement(term209950, 29, term209951);
        setElement(term209950, 30, term209951);
        setElement(term209950, 31, term209951);
        setElement(term209950, 32, term209951);
        setElement(term209950, 33, term209951);
        setElement(term209950, 34, term209951);
        setElement(term209950, 35, term209951);
        setElement(term209950, 36, term209951);
        setElement(term209950, 37, term209951);
        setElement(term209950, 38, term209951);
        setElement(term209950, 39, term209951);
        setElement(term209950, 40, term209951);
        setElement(term209950, 41, term209951);
        setElement(term209950, 42, term209951);
        setElement(term209950, 43, term209951);
        setElement(term209950, 44, term209951);
        setElement(term209950, 45, term209951);
        setElement(term209950, 46, term209951);
        setElement(term209950, 47, term209951);
        setElement(term209950, 48, term209951);
        setElement(term209950, 49, term209951);
        setElement(term209950, 50, term209951);
        setElement(term209950, 51, term209951);
        setElement(term209950, 52, term209951);
        setElement(term209950, 53, term209951);
        setElement(term209950, 54, term209951);
        setElement(term209950, 55, term209951);
        setElement(term209950, 56, term209951);
        setElement(term209950, 57, term209951);
        setElement(term209950, 58, term209951);
        setElement(term209950, 59, term209951);
        setElement(term209950, 60, term209951);
        setElement(term209950, 61, term209951);
        setElement(term209950, 62, term209951);
        setElement(term209950, 63, term209951);
        setElement(term209950, 64, term209951);
        setElement(term209950, 65, term209951);
        setElement(term209950, 66, term209951);
        setElement(term209950, 67, term209951);
        setElement(term209950, 68, term209951);
        setElement(term209950, 69, term209951);
        setElement(term209950, 70, term209951);
        setElement(term209950, 71, term209951);
        setElement(term209950, 72, term209951);
        setElement(term209950, 73, term209951);
        setElement(term209950, 74, term209951);
        setElement(term209950, 75, term209951);
        setElement(term209950, 76, term209951);
        setElement(term209950, 77, term209951);
        setElement(term209950, 78, term209951);
        setElement(term209950, 79, term209951);
        setElement(term209950, 80, term209951);
        setElement(term209950, 81, term209951);
        setElement(term209950, 82, term209951);
        setElement(term209950, 83, term209951);
        setElement(term209950, 84, term209951);
        setElement(term209950, 85, term209951);
        setElement(term209950, 86, term209951);
        setElement(term209950, 87, term209951);
        setElement(term209950, 88, term209951);
        setElement(term209950, 89, term209951);
        setElement(term209950, 90, term209951);
        setElement(term209950, 91, term209951);
        setElement(term209950, 92, term209951);
        setElement(term209950, 93, term209951);
        setElement(term209950, 94, term209951);
        setElement(term209950, 95, term209951);
        setElement(term209950, 96, term209951);
        setElement(term209950, 97, term209951);
        setElement(term209950, 98, term209951);
        setElement(term209950, 99, term209951);
        setElement(term209950, 100, term209951);
        setElement(term209950, 101, term209951);
        setElement(term209950, 102, term209951);
        setElement(term209950, 103, term209951);
        setElement(term209950, 104, term209951);
        setElement(term209950, 105, term209951);
        setElement(term209950, 106, term209951);
        setElement(term209950, 107, term209951);
        setElement(term209950, 108, term209951);
        setElement(term209950, 109, term209951);
        setElement(term209950, 110, term209951);
        setElement(term209950, 111, term209951);
        setElement(term209950, 112, term209951);
        setElement(term209950, 113, term209951);
        setElement(term209950, 114, term209951);
        setElement(term209950, 115, term209951);
        setElement(term209950, 116, term209951);
        setElement(term209950, 117, term209951);
        setElement(term209950, 118, term209951);
        setElement(term209950, 119, term209951);
        setElement(term209950, 120, term209951);
        setElement(term209950, 121, term209951);
        setElement(term209950, 122, term209951);
        setElement(term209950, 123, term209951);
        setElement(term209950, 124, term209951);
        setElement(term209950, 125, term209951);
        setElement(term209950, 126, term209951);
        setElement(term209950, 127, term209951);
        setElement(term209950, 128, term209951);
        setElement(term209950, 129, term209951);
        setElement(term209950, 130, term209951);
        setElement(term209950, 131, term209951);
        setElement(term209950, 132, term209951);
        setElement(term209950, 133, term209951);
        setElement(term209950, 134, term209951);
        setElement(term209950, 135, term209951);
        setElement(term209950, 136, term209951);
        setElement(term209950, 137, term209951);
        setElement(term209950, 138, term209951);
        setElement(term209950, 139, term209951);
        setElement(term209950, 140, term209951);
        setElement(term209950, 141, term209951);
        setElement(term209950, 142, term209951);
        setElement(term209950, 143, term209951);
        setElement(term209950, 144, term209951);
        setElement(term209950, 145, term209951);
        setElement(term209950, 146, term209951);
        setElement(term209950, 147, term209951);
        setElement(term209950, 148, term209951);
        setElement(term209950, 149, term209951);
        setElement(term209950, 150, term209951);
        setElement(term209950, 151, term209951);
        setElement(term209950, 152, term209951);
        setElement(term209950, 153, term209951);
        setElement(term209950, 154, term209951);
        setElement(term209950, 155, term209951);
        setElement(term209950, 156, term209951);
        setElement(term209950, 157, term209951);
        setElement(term209950, 158, term209951);
        setElement(term209950, 159, term209951);
        setElement(term209950, 160, term209951);
        setElement(term209950, 161, term209951);
        setElement(term209950, 162, term209951);
        setElement(term209950, 163, term209951);
        setElement(term209950, 164, term209951);
        setElement(term209950, 165, term209951);
        setElement(term209950, 166, term209951);
        setElement(term209950, 167, term209951);
        setElement(term209950, 168, term209951);
        setElement(term209950, 169, term209951);
        setElement(term209950, 170, term209951);
        setElement(term209950, 171, term209951);
        setElement(term209950, 172, term209951);
        setElement(term209950, 173, term209951);
        setElement(term209950, 174, term209951);
        setElement(term209950, 175, term209951);
        setElement(term209950, 176, term209951);
        setElement(term209950, 177, term209951);
        setElement(term209950, 178, term209951);
        setElement(term209950, 179, term209951);
        setElement(term209950, 180, term209951);
        setElement(term209950, 181, term209951);
        setElement(term209950, 182, term209951);
        setElement(term209950, 183, term209951);
        setElement(term209950, 184, term209951);
        setElement(term209950, 185, term209951);
        setElement(term209950, 186, term209951);
        setElement(term209950, 187, term209951);
        setElement(term209950, 188, term209951);
        setElement(term209950, 189, term209951);
        setElement(term209950, 190, term209951);
        setElement(term209950, 191, term209951);
        setElement(term209950, 192, term209951);
        setField(term307490, term307490.getClass(), "jacobian", term209950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term307490, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


