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

public class MultiDirectional_evaluateNewSimplex_1676370308239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306207;
     Object term305666;

    public MultiDirectional_evaluateNewSimplex_1676370308239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306207 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term305693 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 0);
        setField(term306207, term306207.getClass(), "simplex", term305693);
        term305666 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 128);
        Object term306323 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term305670 = (double[]) newDoubleArray(21);
        Object term306439 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        setField(term306323, term306323.getClass(), "point", term305670);
        setElement(term305666, 0, term306323);
        setField(term306439, term306439.getClass(), "point", term305670);
        setElement(term305666, 1, term306439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"), 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.util.Comparator");
        Object[] args = new Object[3];
        args[0] = term305666;
        args[1] = Double.NaN;
        args[2] = null;
        callMethod(klass, "evaluateNewSimplex", argTypes, term306207, args);
    }

};


