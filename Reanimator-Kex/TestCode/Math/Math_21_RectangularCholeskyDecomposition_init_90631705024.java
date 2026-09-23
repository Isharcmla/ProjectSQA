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

public class RectangularCholeskyDecomposition_init_90631705024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7964;
     Object term8724;
     Object term8731;

    public RectangularCholeskyDecomposition_init_90631705024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7864 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        term7964 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setIntField(term7964, term7964.getClass(), "rows", 4);
        setIntField(term7964, term7964.getClass(), "columns", 6);
        setIntField(term7964, term7964.getClass(), "blockColumns", 0);
        setIntField(term7964, term7964.getClass(), "blockRows", 0);
        term8724 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        Object term8725 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term8726 = (Object[]) newArray("[D", 4);
        double[] term8727 = (double[]) newDoubleArray(4);
        double[] term8728 = (double[]) newDoubleArray(4);
        double[] term8729 = (double[]) newDoubleArray(4);
        double[] term8730 = (double[]) newDoubleArray(4);
        setElement(term8726, 0, term8727);
        setDoubleElement(term8728, 0, Double.NaN);
        setDoubleElement(term8728, 1, Double.NaN);
        setElement(term8726, 1, term8728);
        setDoubleElement(term8729, 0, Double.NaN);
        setDoubleElement(term8729, 1, Double.NaN);
        setDoubleElement(term8729, 2, Double.NaN);
        setElement(term8726, 2, term8729);
        setDoubleElement(term8730, 0, Double.NaN);
        setDoubleElement(term8730, 1, Double.NaN);
        setDoubleElement(term8730, 2, Double.NaN);
        setDoubleElement(term8730, 3, Double.NaN);
        setElement(term8726, 3, term8730);
        setField(term8725, term8725.getClass(), "data", term8726);
        setField(term8724, term8724.getClass(), "root", term8725);
        setIntField(term8724, term8724.getClass(), "rank", 4);
        term8731 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term8731, term8731.getClass(), "blocks", null);
        setIntField(term8731, term8731.getClass(), "rows", 4);
        setIntField(term8731, term8731.getClass(), "columns", 6);
        setIntField(term8731, term8731.getClass(), "blockRows", 0);
        setIntField(term8731, term8731.getClass(), "blockColumns", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term7964;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8724));
        assertTrue(recursiveEquals(term7964, term8731));
    }

};


