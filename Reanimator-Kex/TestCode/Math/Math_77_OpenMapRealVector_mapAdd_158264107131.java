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
import java.lang.Object;

public class OpenMapRealVector_mapAdd_158264107131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105868;

    public OpenMapRealVector_mapAdd_158264107131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105868 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term105976 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term105721 = (int[]) newIntArray(0);
        setIntField(term105868, term105868.getClass(), "virtualSize", 1);
        setField(term105976, term105976.getClass(), "keys", term105721);
        setField(term105976, term105976.getClass(), "values", null);
        setField(term105976, term105976.getClass(), "states", null);
        setDoubleField(term105976, term105976.getClass(), "missingEntries", 0.0);
        setIntField(term105976, term105976.getClass(), "size", 0);
        setIntField(term105976, term105976.getClass(), "mask", 0);
        setIntField(term105976, term105976.getClass(), "count", 0);
        setField(term105868, term105868.getClass(), "entries", term105976);
        setDoubleField(term105868, term105868.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        callMethod(klass, "mapAdd", argTypes, term105868, args);
    }

};


