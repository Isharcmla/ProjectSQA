package org.apache.commons.math3.optimization.direct;

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
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.direct.EqualityUtils.*;
import java.lang.Object;

public class CMAESOptimizer_diag_721882231253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127761;
     Object term147664;
     Object term147172;

    public CMAESOptimizer_diag_721882231253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127761 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term127640 = (Object[]) newArray("[D", 489);
        setField(term127761, term127761.getClass(), "data", term127640);
        term147664 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term147665 = (Object[]) newArray("[D", 489);
        setField(term147664, term147664.getClass(), "data", term147665);
        term147172 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term147173 = (Object[]) newArray("[D", 1);
        double[] term147174 = (double[]) newDoubleArray(489);
        setElement(term147173, 0, term147174);
        setField(term147172, term147172.getClass(), "data", term147173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term127761;
        Object retValue = callMethod(klass, "diag", argTypes, null, args);
        assertTrue(recursiveEquals(term127761, term147664));
        assertTrue(recursiveEquals(retValue, term147172));
    }

};


