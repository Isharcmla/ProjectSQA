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

public class RectangularCholeskyDecomposition_init_90631705022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7094;
     Object term7646;
     Object term7651;

    public RectangularCholeskyDecomposition_init_90631705022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6994 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        term7094 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setIntField(term7094, term7094.getClass(), "rows", 2);
        setIntField(term7094, term7094.getClass(), "columns", 131);
        setIntField(term7094, term7094.getClass(), "blockColumns", 0);
        setIntField(term7094, term7094.getClass(), "blockRows", 0);
        term7646 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        Object term7647 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term7648 = (Object[]) newArray("[D", 2);
        double[] term7649 = (double[]) newDoubleArray(2);
        double[] term7650 = (double[]) newDoubleArray(2);
        setElement(term7648, 0, term7649);
        setDoubleElement(term7650, 0, Double.NaN);
        setDoubleElement(term7650, 1, Double.NaN);
        setElement(term7648, 1, term7650);
        setField(term7647, term7647.getClass(), "data", term7648);
        setField(term7646, term7646.getClass(), "root", term7647);
        setIntField(term7646, term7646.getClass(), "rank", 2);
        term7651 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term7651, term7651.getClass(), "blocks", null);
        setIntField(term7651, term7651.getClass(), "rows", 2);
        setIntField(term7651, term7651.getClass(), "columns", 131);
        setIntField(term7651, term7651.getClass(), "blockRows", 0);
        setIntField(term7651, term7651.getClass(), "blockColumns", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term7094;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7646));
        assertTrue(recursiveEquals(term7094, term7651));
    }

};


