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

public class ArrayRealVector_mapExpm1ToSelf_141639218377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125431;
     Object term126252;
     Object term126249;

    public ArrayRealVector_mapExpm1ToSelf_141639218377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125431 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term125320 = (double[]) newDoubleArray(1);
        setField(term125431, term125431.getClass(), "data", term125320);
        term126252 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term126253 = (double[]) newDoubleArray(1);
        setField(term126252, term126252.getClass(), "data", term126253);
        term126249 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term126250 = (double[]) newDoubleArray(1);
        setField(term126249, term126249.getClass(), "data", term126250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapExpm1ToSelf", argTypes, term125431, args);
        assertTrue(recursiveEquals(term125431, term126252));
        assertTrue(recursiveEquals(retValue, term126249));
    }

};


