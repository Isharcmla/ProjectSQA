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

public class RectangularCholeskyDecomposition_init_90631705030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10642;
     Object term46265;
     Object term46281;

    public RectangularCholeskyDecomposition_init_90631705030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10542 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        term10642 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setIntField(term10642, term10642.getClass(), "rows", 13);
        setIntField(term10642, term10642.getClass(), "columns", 66);
        setIntField(term10642, term10642.getClass(), "blockColumns", 0);
        setIntField(term10642, term10642.getClass(), "blockRows", 0);
        term46265 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        Object term46266 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term46267 = (Object[]) newArray("[D", 13);
        double[] term46268 = (double[]) newDoubleArray(13);
        double[] term46269 = (double[]) newDoubleArray(13);
        double[] term46270 = (double[]) newDoubleArray(13);
        double[] term46271 = (double[]) newDoubleArray(13);
        double[] term46272 = (double[]) newDoubleArray(13);
        double[] term46273 = (double[]) newDoubleArray(13);
        double[] term46274 = (double[]) newDoubleArray(13);
        double[] term46275 = (double[]) newDoubleArray(13);
        double[] term46276 = (double[]) newDoubleArray(13);
        double[] term46277 = (double[]) newDoubleArray(13);
        double[] term46278 = (double[]) newDoubleArray(13);
        double[] term46279 = (double[]) newDoubleArray(13);
        double[] term46280 = (double[]) newDoubleArray(13);
        setElement(term46267, 0, term46268);
        setDoubleElement(term46269, 0, Double.NaN);
        setDoubleElement(term46269, 1, Double.NaN);
        setElement(term46267, 1, term46269);
        setDoubleElement(term46270, 0, Double.NaN);
        setDoubleElement(term46270, 1, Double.NaN);
        setDoubleElement(term46270, 2, Double.NaN);
        setElement(term46267, 2, term46270);
        setDoubleElement(term46271, 0, Double.NaN);
        setDoubleElement(term46271, 1, Double.NaN);
        setDoubleElement(term46271, 2, Double.NaN);
        setDoubleElement(term46271, 3, Double.NaN);
        setElement(term46267, 3, term46271);
        setDoubleElement(term46272, 0, Double.NaN);
        setDoubleElement(term46272, 1, Double.NaN);
        setDoubleElement(term46272, 2, Double.NaN);
        setDoubleElement(term46272, 3, Double.NaN);
        setDoubleElement(term46272, 4, Double.NaN);
        setElement(term46267, 4, term46272);
        setDoubleElement(term46273, 0, Double.NaN);
        setDoubleElement(term46273, 1, Double.NaN);
        setDoubleElement(term46273, 2, Double.NaN);
        setDoubleElement(term46273, 3, Double.NaN);
        setDoubleElement(term46273, 4, Double.NaN);
        setDoubleElement(term46273, 5, Double.NaN);
        setElement(term46267, 5, term46273);
        setDoubleElement(term46274, 0, Double.NaN);
        setDoubleElement(term46274, 1, Double.NaN);
        setDoubleElement(term46274, 2, Double.NaN);
        setDoubleElement(term46274, 3, Double.NaN);
        setDoubleElement(term46274, 4, Double.NaN);
        setDoubleElement(term46274, 5, Double.NaN);
        setDoubleElement(term46274, 6, Double.NaN);
        setElement(term46267, 6, term46274);
        setDoubleElement(term46275, 0, Double.NaN);
        setDoubleElement(term46275, 1, Double.NaN);
        setDoubleElement(term46275, 2, Double.NaN);
        setDoubleElement(term46275, 3, Double.NaN);
        setDoubleElement(term46275, 4, Double.NaN);
        setDoubleElement(term46275, 5, Double.NaN);
        setDoubleElement(term46275, 6, Double.NaN);
        setDoubleElement(term46275, 7, Double.NaN);
        setElement(term46267, 7, term46275);
        setDoubleElement(term46276, 0, Double.NaN);
        setDoubleElement(term46276, 1, Double.NaN);
        setDoubleElement(term46276, 2, Double.NaN);
        setDoubleElement(term46276, 3, Double.NaN);
        setDoubleElement(term46276, 4, Double.NaN);
        setDoubleElement(term46276, 5, Double.NaN);
        setDoubleElement(term46276, 6, Double.NaN);
        setDoubleElement(term46276, 7, Double.NaN);
        setDoubleElement(term46276, 8, Double.NaN);
        setElement(term46267, 8, term46276);
        setDoubleElement(term46277, 0, Double.NaN);
        setDoubleElement(term46277, 1, Double.NaN);
        setDoubleElement(term46277, 2, Double.NaN);
        setDoubleElement(term46277, 3, Double.NaN);
        setDoubleElement(term46277, 4, Double.NaN);
        setDoubleElement(term46277, 5, Double.NaN);
        setDoubleElement(term46277, 6, Double.NaN);
        setDoubleElement(term46277, 7, Double.NaN);
        setDoubleElement(term46277, 8, Double.NaN);
        setDoubleElement(term46277, 9, Double.NaN);
        setElement(term46267, 9, term46277);
        setDoubleElement(term46278, 0, Double.NaN);
        setDoubleElement(term46278, 1, Double.NaN);
        setDoubleElement(term46278, 2, Double.NaN);
        setDoubleElement(term46278, 3, Double.NaN);
        setDoubleElement(term46278, 4, Double.NaN);
        setDoubleElement(term46278, 5, Double.NaN);
        setDoubleElement(term46278, 6, Double.NaN);
        setDoubleElement(term46278, 7, Double.NaN);
        setDoubleElement(term46278, 8, Double.NaN);
        setDoubleElement(term46278, 9, Double.NaN);
        setDoubleElement(term46278, 10, Double.NaN);
        setElement(term46267, 10, term46278);
        setDoubleElement(term46279, 0, Double.NaN);
        setDoubleElement(term46279, 1, Double.NaN);
        setDoubleElement(term46279, 2, Double.NaN);
        setDoubleElement(term46279, 3, Double.NaN);
        setDoubleElement(term46279, 4, Double.NaN);
        setDoubleElement(term46279, 5, Double.NaN);
        setDoubleElement(term46279, 6, Double.NaN);
        setDoubleElement(term46279, 7, Double.NaN);
        setDoubleElement(term46279, 8, Double.NaN);
        setDoubleElement(term46279, 9, Double.NaN);
        setDoubleElement(term46279, 10, Double.NaN);
        setDoubleElement(term46279, 11, Double.NaN);
        setElement(term46267, 11, term46279);
        setDoubleElement(term46280, 0, Double.NaN);
        setDoubleElement(term46280, 1, Double.NaN);
        setDoubleElement(term46280, 2, Double.NaN);
        setDoubleElement(term46280, 3, Double.NaN);
        setDoubleElement(term46280, 4, Double.NaN);
        setDoubleElement(term46280, 5, Double.NaN);
        setDoubleElement(term46280, 6, Double.NaN);
        setDoubleElement(term46280, 7, Double.NaN);
        setDoubleElement(term46280, 8, Double.NaN);
        setDoubleElement(term46280, 9, Double.NaN);
        setDoubleElement(term46280, 10, Double.NaN);
        setDoubleElement(term46280, 11, Double.NaN);
        setDoubleElement(term46280, 12, Double.NaN);
        setElement(term46267, 12, term46280);
        setField(term46266, term46266.getClass(), "data", term46267);
        setField(term46265, term46265.getClass(), "root", term46266);
        setIntField(term46265, term46265.getClass(), "rank", 13);
        term46281 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term46281, term46281.getClass(), "blocks", null);
        setIntField(term46281, term46281.getClass(), "rows", 13);
        setIntField(term46281, term46281.getClass(), "columns", 66);
        setIntField(term46281, term46281.getClass(), "blockRows", 0);
        setIntField(term46281, term46281.getClass(), "blockColumns", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term10642;
        args[1] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46265));
        assertTrue(recursiveEquals(term10642, term46281));
    }

};


