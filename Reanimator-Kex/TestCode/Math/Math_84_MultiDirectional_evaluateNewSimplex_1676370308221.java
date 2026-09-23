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

public class MultiDirectional_evaluateNewSimplex_1676370308221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285159;
     Object term284729;

    public MultiDirectional_evaluateNewSimplex_1676370308221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285159 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        setField(term285159, term285159.getClass(), "simplex", null);
        term284729 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 18);
        Object term285275 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term284733 = (double[]) newDoubleArray(1);
        Object term285391 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term284736 = (double[]) newDoubleArray(244);
        setField(term285275, term285275.getClass(), "point", term284733);
        setElement(term284729, 0, term285275);
        setField(term285391, term285391.getClass(), "point", term284736);
        setElement(term284729, 1, term285391);
        setElement(term284729, 2, term285275);
        setElement(term284729, 3, term285275);
        setElement(term284729, 5, term285275);
        setElement(term284729, 6, term285275);
        setElement(term284729, 7, term285275);
        setElement(term284729, 8, term285275);
        setElement(term284729, 9, term285275);
        setElement(term284729, 10, term285275);
        setElement(term284729, 11, term285275);
        setElement(term284729, 12, term285275);
        setElement(term284729, 13, term285275);
        setElement(term284729, 14, term285275);
        setElement(term284729, 15, term285275);
        setElement(term284729, 16, term285275);
        setElement(term284729, 17, term285275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term284729;
        args[1] = Double.NaN;
        args[2] = null;
        callMethod(klass, "evaluateNewSimplex", argTypes, term285159, args);
    }

};


