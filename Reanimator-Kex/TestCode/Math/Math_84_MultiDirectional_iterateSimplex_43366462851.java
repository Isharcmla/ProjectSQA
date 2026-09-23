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

public class MultiDirectional_iterateSimplex_43366462851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48234;

    public MultiDirectional_iterateSimplex_43366462851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48234 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term47112 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 8);
        Object term48350 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term47115 = (double[]) newDoubleArray(26);
        Object term48466 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term47143 = (double[]) newDoubleArray(512);
        setIntField(term48234, term48234.getClass(), "iterations", 2147483646);
        setIntField(term48234, term48234.getClass(), "maxIterations", 2147483647);
        setField(term48350, term48350.getClass(), "point", term47115);
        setElement(term47112, 0, term48350);
        setField(term48466, term48466.getClass(), "point", term47143);
        setElement(term47112, 1, term48466);
        setField(term48234, term48234.getClass(), "simplex", term47112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term48234, args);
    }

};


