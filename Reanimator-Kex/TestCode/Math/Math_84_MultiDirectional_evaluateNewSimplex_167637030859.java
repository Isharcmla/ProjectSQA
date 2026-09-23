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
import java.lang.Double;

public class MultiDirectional_evaluateNewSimplex_167637030859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59408;
     Object term59154;

    public MultiDirectional_evaluateNewSimplex_167637030859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59408 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term59165 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 0);
        setField(term59408, term59408.getClass(), "simplex", term59165);
        term59154 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 8);
        Object term59524 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term59158 = (double[]) newDoubleArray(5);
        Object term59640 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(term59524, term59524.getClass(), "point", term59158);
        setElement(term59154, 0, term59524);
        setField(term59640, term59640.getClass(), "point", term59158);
        setElement(term59154, 1, term59640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term59154;
        args[1] = Double.NaN;
        args[2] = null;
        callMethod(klass, "evaluateNewSimplex", argTypes, term59408, args);
    }

};


