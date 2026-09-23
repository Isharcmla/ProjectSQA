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

public class CMAESOptimizer_sumRows_1487067760153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84276;
     Object term96802;
     Object term96789;

    public CMAESOptimizer_sumRows_1487067760153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84276 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setIntField(term84276, term84276.getClass(), "columns", 1);
        term96802 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setIntField(term96802, term96802.getClass(), "rows", 0);
        setIntField(term96802, term96802.getClass(), "columns", 1);
        setField(term96802, term96802.getClass(), "entries", null);
        term96789 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term96790 = (Object[]) newArray("[D", 1);
        double[] term96791 = (double[]) newDoubleArray(1);
        setElement(term96790, 0, term96791);
        setField(term96789, term96789.getClass(), "data", term96790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term84276;
        Object retValue = callMethod(klass, "sumRows", argTypes, null, args);
        assertTrue(recursiveEquals(term84276, term96802));
        assertTrue(recursiveEquals(retValue, term96789));
    }

};


