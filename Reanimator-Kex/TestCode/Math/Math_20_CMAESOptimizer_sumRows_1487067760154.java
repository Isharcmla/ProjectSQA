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

public class CMAESOptimizer_sumRows_1487067760154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96085;
     Object term96984;
     Object term96971;

    public CMAESOptimizer_sumRows_1487067760154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96085 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setIntField(term96085, term96085.getClass(), "columns", 1);
        term96984 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setIntField(term96984, term96984.getClass(), "rows", 0);
        setIntField(term96984, term96984.getClass(), "columns", 1);
        setField(term96984, term96984.getClass(), "entries", null);
        term96971 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term96972 = (Object[]) newArray("[D", 1);
        double[] term96973 = (double[]) newDoubleArray(1);
        setElement(term96972, 0, term96973);
        setField(term96971, term96971.getClass(), "data", term96972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term96085;
        Object retValue = callMethod(klass, "sumRows", argTypes, null, args);
        assertTrue(recursiveEquals(term96085, term96984));
        assertTrue(recursiveEquals(retValue, term96971));
    }

};


