package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.linear.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class RectangularCholeskyDecomposition_init_90631705032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46765;
     Object term48182;
     Object term48190;

    public RectangularCholeskyDecomposition_init_90631705032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46665 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        term46765 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setIntField(term46765, term46765.getClass(), "rows", 5);
        setIntField(term46765, term46765.getClass(), "columns", 9);
        setIntField(term46765, term46765.getClass(), "blockColumns", 0);
        setIntField(term46765, term46765.getClass(), "blockRows", 0);
        term48182 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        Object term48183 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term48184 = (Object[]) newArray("[D", 5);
        double[] term48185 = (double[]) newDoubleArray(5);
        double[] term48186 = (double[]) newDoubleArray(5);
        double[] term48187 = (double[]) newDoubleArray(5);
        double[] term48188 = (double[]) newDoubleArray(5);
        double[] term48189 = (double[]) newDoubleArray(5);
        setElement(term48184, 0, term48185);
        setDoubleElement(term48186, 0, Double.NaN);
        setDoubleElement(term48186, 1, Double.NaN);
        setElement(term48184, 1, term48186);
        setDoubleElement(term48187, 0, Double.NaN);
        setDoubleElement(term48187, 1, Double.NaN);
        setDoubleElement(term48187, 2, Double.NaN);
        setElement(term48184, 2, term48187);
        setDoubleElement(term48188, 0, Double.NaN);
        setDoubleElement(term48188, 1, Double.NaN);
        setDoubleElement(term48188, 2, Double.NaN);
        setDoubleElement(term48188, 3, Double.NaN);
        setElement(term48184, 3, term48188);
        setDoubleElement(term48189, 0, Double.NaN);
        setDoubleElement(term48189, 1, Double.NaN);
        setDoubleElement(term48189, 2, Double.NaN);
        setDoubleElement(term48189, 3, Double.NaN);
        setDoubleElement(term48189, 4, Double.NaN);
        setElement(term48184, 4, term48189);
        setField(term48183, term48183.getClass(), "data", term48184);
        setField(term48182, term48182.getClass(), "root", term48183);
        setIntField(term48182, term48182.getClass(), "rank", 5);
        term48190 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term48190, term48190.getClass(), "blocks", null);
        setIntField(term48190, term48190.getClass(), "rows", 5);
        setIntField(term48190, term48190.getClass(), "columns", 9);
        setIntField(term48190, term48190.getClass(), "blockRows", 0);
        setIntField(term48190, term48190.getClass(), "blockColumns", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term46765;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term48182));
        assertTrue(recursiveEquals(term46765, term48190));
    }

};


