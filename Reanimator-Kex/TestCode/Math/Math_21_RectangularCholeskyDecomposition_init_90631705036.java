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

public class RectangularCholeskyDecomposition_init_90631705036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49271;
     Object term52456;
     Object term52465;

    public RectangularCholeskyDecomposition_init_90631705036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49171 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        term49271 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setIntField(term49271, term49271.getClass(), "rows", 6);
        setIntField(term49271, term49271.getClass(), "columns", 116);
        setIntField(term49271, term49271.getClass(), "blockColumns", 0);
        setIntField(term49271, term49271.getClass(), "blockRows", 0);
        term52456 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        Object term52457 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term52458 = (Object[]) newArray("[D", 6);
        double[] term52459 = (double[]) newDoubleArray(6);
        double[] term52460 = (double[]) newDoubleArray(6);
        double[] term52461 = (double[]) newDoubleArray(6);
        double[] term52462 = (double[]) newDoubleArray(6);
        double[] term52463 = (double[]) newDoubleArray(6);
        double[] term52464 = (double[]) newDoubleArray(6);
        setElement(term52458, 0, term52459);
        setDoubleElement(term52460, 0, Double.NaN);
        setDoubleElement(term52460, 1, Double.NaN);
        setElement(term52458, 1, term52460);
        setDoubleElement(term52461, 0, Double.NaN);
        setDoubleElement(term52461, 1, Double.NaN);
        setDoubleElement(term52461, 2, Double.NaN);
        setElement(term52458, 2, term52461);
        setDoubleElement(term52462, 0, Double.NaN);
        setDoubleElement(term52462, 1, Double.NaN);
        setDoubleElement(term52462, 2, Double.NaN);
        setDoubleElement(term52462, 3, Double.NaN);
        setElement(term52458, 3, term52462);
        setDoubleElement(term52463, 0, Double.NaN);
        setDoubleElement(term52463, 1, Double.NaN);
        setDoubleElement(term52463, 2, Double.NaN);
        setDoubleElement(term52463, 3, Double.NaN);
        setDoubleElement(term52463, 4, Double.NaN);
        setElement(term52458, 4, term52463);
        setDoubleElement(term52464, 0, Double.NaN);
        setDoubleElement(term52464, 1, Double.NaN);
        setDoubleElement(term52464, 2, Double.NaN);
        setDoubleElement(term52464, 3, Double.NaN);
        setDoubleElement(term52464, 4, Double.NaN);
        setDoubleElement(term52464, 5, Double.NaN);
        setElement(term52458, 5, term52464);
        setField(term52457, term52457.getClass(), "data", term52458);
        setField(term52456, term52456.getClass(), "root", term52457);
        setIntField(term52456, term52456.getClass(), "rank", 6);
        term52465 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term52465, term52465.getClass(), "blocks", null);
        setIntField(term52465, term52465.getClass(), "rows", 6);
        setIntField(term52465, term52465.getClass(), "columns", 116);
        setIntField(term52465, term52465.getClass(), "blockRows", 0);
        setIntField(term52465, term52465.getClass(), "blockColumns", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term49271;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term52456));
        assertTrue(recursiveEquals(term49271, term52465));
    }

};


