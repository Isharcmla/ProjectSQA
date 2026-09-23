package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;

public class ArrayRealVector_mapExpm1ToSelf_141639218133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;
     Object term6988;
     Object term6986;

    public ArrayRealVector_mapExpm1ToSelf_141639218133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term177 = (double[]) newDoubleArray(0);
        setField(term176, term176.getClass(), "data", term177);
        term6988 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6989 = (double[]) newDoubleArray(0);
        setField(term6988, term6988.getClass(), "data", term6989);
        term6986 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6987 = (double[]) newDoubleArray(0);
        setField(term6986, term6986.getClass(), "data", term6987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapExpm1ToSelf", argTypes, term176, args);
        assertTrue(recursiveEquals(term176, term6988));
        assertTrue(recursiveEquals(retValue, term6986));
    }

};


