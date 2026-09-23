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

public class MultiDirectional_iterateSimplex_433664628149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185275;

    public MultiDirectional_iterateSimplex_433664628149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185275 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term184765 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 4);
        Object term185391 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term184768 = (double[]) newDoubleArray(18);
        Object term185507 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term184788 = (double[]) newDoubleArray(36);
        setIntField(term185275, term185275.getClass(), "iterations", 2147483646);
        setIntField(term185275, term185275.getClass(), "maxIterations", 2147483647);
        setField(term185391, term185391.getClass(), "point", term184768);
        setElement(term184765, 0, term185391);
        setField(term185507, term185507.getClass(), "point", term184788);
        setElement(term184765, 1, term185507);
        setElement(term184765, 2, term185391);
        setElement(term184765, 3, term185391);
        setField(term185275, term185275.getClass(), "simplex", term184765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term185275, args);
    }

};


