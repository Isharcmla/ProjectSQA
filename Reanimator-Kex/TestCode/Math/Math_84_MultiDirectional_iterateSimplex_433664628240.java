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

public class MultiDirectional_iterateSimplex_433664628240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309134;

    public MultiDirectional_iterateSimplex_433664628240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309134 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term306465 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 64);
        Object term309250 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term306468 = (double[]) newDoubleArray(117);
        Object term309366 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term306587 = (double[]) newDoubleArray(512);
        setIntField(term309134, term309134.getClass(), "iterations", 2147483646);
        setIntField(term309134, term309134.getClass(), "maxIterations", 2147483647);
        setField(term309250, term309250.getClass(), "point", term306468);
        setElement(term306465, 0, term309250);
        setField(term309366, term309366.getClass(), "point", term306587);
        setElement(term306465, 1, term309366);
        setField(term309134, term309134.getClass(), "simplex", term306465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term309134, args);
    }

};


