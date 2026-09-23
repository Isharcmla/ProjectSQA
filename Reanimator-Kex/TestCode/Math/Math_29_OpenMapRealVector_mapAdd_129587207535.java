package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class OpenMapRealVector_mapAdd_129587207535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6362;
     Object term6469;

    public OpenMapRealVector_mapAdd_129587207535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6362 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term6363 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term6364 = (int[]) newIntArray(32);
        double[] term6397 = (double[]) newDoubleArray(32);
        byte[] term6430 = (byte[]) newByteArray(32);
        setField(term6363, term6363.getClass(), "keys", term6364);
        setField(term6363, term6363.getClass(), "values", term6397);
        setField(term6363, term6363.getClass(), "states", term6430);
        setDoubleField(term6363, term6363.getClass(), "missingEntries", 0.0);
        setIntField(term6363, term6363.getClass(), "size", 0);
        setIntField(term6363, term6363.getClass(), "mask", 31);
        setIntField(term6363, term6363.getClass(), "count", 0);
        setField(term6362, term6362.getClass(), "entries", term6363);
        setIntField(term6362, term6362.getClass(), "virtualSize", 767834723);
        setDoubleField(term6362, term6362.getClass(), "epsilon", 1.0E-12);
        term6469 = new Double(0.9527281779865117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term6469;
        callMethod(klass, "mapAdd", argTypes, term6362, args);
    }

};


