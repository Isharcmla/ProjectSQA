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

public class MultiDirectional_iterateSimplex_433664628146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180963;

    public MultiDirectional_iterateSimplex_433664628146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180963 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term179049 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 20);
        Object term181079 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term179052 = (double[]) newDoubleArray(97);
        Object term181195 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term179151 = (double[]) newDoubleArray(97);
        setIntField(term180963, term180963.getClass(), "iterations", 2147483646);
        setIntField(term180963, term180963.getClass(), "maxIterations", 2147483647);
        setField(term181079, term181079.getClass(), "point", term179052);
        setElement(term179049, 0, term181079);
        setField(term181195, term181195.getClass(), "point", term179151);
        setElement(term179049, 1, term181195);
        setField(term180963, term180963.getClass(), "simplex", term179049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "iterateSimplex", argTypes, term180963, args);
    }

};


