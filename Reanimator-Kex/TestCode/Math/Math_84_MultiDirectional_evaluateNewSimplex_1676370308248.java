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

public class MultiDirectional_evaluateNewSimplex_1676370308248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323557;
     Object term323160;

    public MultiDirectional_evaluateNewSimplex_1676370308248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323557 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term323179 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 0);
        setField(term323557, term323557.getClass(), "simplex", term323179);
        term323160 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 2);
        Object term323673 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term323164 = (double[]) newDoubleArray(13);
        Object term323789 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(term323673, term323673.getClass(), "point", term323164);
        setElement(term323160, 0, term323673);
        setField(term323789, term323789.getClass(), "point", term323164);
        setElement(term323160, 1, term323789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term323160;
        args[1] = Double.NaN;
        args[2] = null;
        callMethod(klass, "evaluateNewSimplex", argTypes, term323557, args);
    }

};


