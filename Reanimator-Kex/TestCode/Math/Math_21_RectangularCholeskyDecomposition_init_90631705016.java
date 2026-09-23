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

public class RectangularCholeskyDecomposition_init_90631705016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5216;
     Object term5283;
     Object term5287;

    public RectangularCholeskyDecomposition_init_90631705016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5116 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        term5216 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setIntField(term5216, term5216.getClass(), "rows", 1);
        setIntField(term5216, term5216.getClass(), "columns", 2);
        setIntField(term5216, term5216.getClass(), "blockColumns", 0);
        setIntField(term5216, term5216.getClass(), "blockRows", 0);
        term5283 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        Object term5284 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term5285 = (Object[]) newArray("[D", 1);
        double[] term5286 = (double[]) newDoubleArray(1);
        setElement(term5285, 0, term5286);
        setField(term5284, term5284.getClass(), "data", term5285);
        setField(term5283, term5283.getClass(), "root", term5284);
        setIntField(term5283, term5283.getClass(), "rank", 1);
        term5287 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term5287, term5287.getClass(), "blocks", null);
        setIntField(term5287, term5287.getClass(), "rows", 1);
        setIntField(term5287, term5287.getClass(), "columns", 2);
        setIntField(term5287, term5287.getClass(), "blockRows", 0);
        setIntField(term5287, term5287.getClass(), "blockColumns", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term5216;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5283));
        assertTrue(recursiveEquals(term5216, term5287));
    }

};


