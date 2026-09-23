package org.apache.commons.math.optimization.direct;

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
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiDirectional_iterateSimplex_433664628135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166195;

    public MultiDirectional_iterateSimplex_433664628135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166195 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term164607 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term166311 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term164610 = (double[]) newDoubleArray(76);
        Object term166427 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term164688 = (double[]) newDoubleArray(128);
        setIntField(term166195, term166195.getClass(), "iterations", 2147483646);
        setIntField(term166195, term166195.getClass(), "maxIterations", 2147483647);
        setField(term166311, term166311.getClass(), "point", term164610);
        setElement(term164607, 0, term166311);
        setField(term166427, term166427.getClass(), "point", term164688);
        setElement(term164607, 1, term166427);
        setElement(term164607, 2, term166311);
        setElement(term164607, 3, term166311);
        setElement(term164607, 5, term166311);
        setElement(term164607, 6, term166311);
        setElement(term164607, 7, term166311);
        setElement(term164607, 8, term166311);
        setElement(term164607, 9, term166311);
        setElement(term164607, 10, term166311);
        setElement(term164607, 11, term166311);
        setElement(term164607, 12, term166311);
        setElement(term164607, 13, term166311);
        setElement(term164607, 14, term166311);
        setElement(term164607, 15, term166311);
        setElement(term164607, 16, term166311);
        setElement(term164607, 17, term166311);
        setElement(term164607, 18, term166311);
        setElement(term164607, 19, term166311);
        setElement(term164607, 20, term166311);
        setElement(term164607, 21, term166311);
        setElement(term164607, 22, term166311);
        setElement(term164607, 23, term166311);
        setElement(term164607, 24, term166311);
        setElement(term164607, 25, term166311);
        setElement(term164607, 26, term166311);
        setElement(term164607, 27, term166311);
        setElement(term164607, 28, term166311);
        setElement(term164607, 29, term166311);
        setElement(term164607, 30, term166311);
        setElement(term164607, 31, term166311);
        setElement(term164607, 32, term166311);
        setElement(term164607, 33, term166311);
        setElement(term164607, 34, term166311);
        setElement(term164607, 35, term166311);
        setElement(term164607, 36, term166311);
        setElement(term164607, 37, term166311);
        setElement(term164607, 38, term166311);
        setElement(term164607, 39, term166311);
        setElement(term164607, 40, term166311);
        setElement(term164607, 41, term166311);
        setElement(term164607, 42, term166311);
        setElement(term164607, 43, term166311);
        setElement(term164607, 44, term166311);
        setElement(term164607, 45, term166311);
        setElement(term164607, 46, term166311);
        setElement(term164607, 47, term166311);
        setElement(term164607, 48, term166311);
        setElement(term164607, 49, term166311);
        setElement(term164607, 50, term166311);
        setElement(term164607, 51, term166311);
        setElement(term164607, 52, term166311);
        setElement(term164607, 53, term166311);
        setElement(term164607, 54, term166311);
        setElement(term164607, 55, term166311);
        setElement(term164607, 56, term166311);
        setElement(term164607, 57, term166311);
        setElement(term164607, 58, term166311);
        setElement(term164607, 59, term166311);
        setElement(term164607, 60, term166311);
        setElement(term164607, 61, term166311);
        setElement(term164607, 62, term166311);
        setElement(term164607, 63, term166311);
        setElement(term164607, 64, term166311);
        setElement(term164607, 65, term166311);
        setElement(term164607, 66, term166311);
        setElement(term164607, 67, term166311);
        setElement(term164607, 68, term166311);
        setElement(term164607, 69, term166311);
        setElement(term164607, 70, term166311);
        setElement(term164607, 71, term166311);
        setElement(term164607, 72, term166311);
        setElement(term164607, 73, term166311);
        setElement(term164607, 74, term166311);
        setElement(term164607, 75, term166311);
        setElement(term164607, 76, term166311);
        setElement(term164607, 77, term166311);
        setElement(term164607, 78, term166311);
        setElement(term164607, 79, term166311);
        setElement(term164607, 80, term166311);
        setElement(term164607, 81, term166311);
        setElement(term164607, 82, term166311);
        setElement(term164607, 83, term166311);
        setElement(term164607, 84, term166311);
        setElement(term164607, 85, term166311);
        setElement(term164607, 86, term166311);
        setElement(term164607, 87, term166311);
        setElement(term164607, 88, term166311);
        setElement(term164607, 89, term166311);
        setElement(term164607, 90, term166311);
        setElement(term164607, 91, term166311);
        setElement(term164607, 92, term166311);
        setElement(term164607, 93, term166311);
        setElement(term164607, 94, term166311);
        setElement(term164607, 95, term166311);
        setElement(term164607, 96, term166311);
        setElement(term164607, 97, term166311);
        setElement(term164607, 98, term166311);
        setElement(term164607, 99, term166311);
        setElement(term164607, 100, term166311);
        setElement(term164607, 101, term166311);
        setElement(term164607, 102, term166311);
        setElement(term164607, 103, term166311);
        setElement(term164607, 104, term166311);
        setElement(term164607, 105, term166311);
        setElement(term164607, 106, term166311);
        setElement(term164607, 107, term166311);
        setElement(term164607, 108, term166311);
        setElement(term164607, 109, term166311);
        setElement(term164607, 110, term166311);
        setElement(term164607, 111, term166311);
        setElement(term164607, 112, term166311);
        setElement(term164607, 113, term166311);
        setElement(term164607, 114, term166311);
        setElement(term164607, 115, term166311);
        setElement(term164607, 116, term166311);
        setElement(term164607, 117, term166311);
        setElement(term164607, 118, term166311);
        setElement(term164607, 119, term166311);
        setElement(term164607, 120, term166311);
        setElement(term164607, 121, term166311);
        setElement(term164607, 122, term166311);
        setElement(term164607, 123, term166311);
        setElement(term164607, 124, term166311);
        setElement(term164607, 125, term166311);
        setElement(term164607, 126, term166311);
        setElement(term164607, 127, term166311);
        setField(term166195, term166195.getClass(), "simplex", term164607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term166195, args);
    }

};


