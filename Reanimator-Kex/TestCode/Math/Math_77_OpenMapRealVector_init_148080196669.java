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
import java.lang.Double;
import java.lang.Object;

public class OpenMapRealVector_init_148080196669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233;
     Object term238;
     Object term15640;
     Object term15645;

    public OpenMapRealVector_init_148080196669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233 = (double[]) newDoubleArray(4);
        setDoubleElement(term233, 0, 0.36923381893433327);
        setDoubleElement(term233, 1, 0.6076495596892013);
        setDoubleElement(term233, 2, 0.37773193782763337);
        setDoubleElement(term233, 3, 0.8474802076607362);
        term238 = new Double(0.5183269973490326);
        term15640 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term15641 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term15642 = (int[]) newIntArray(32);
        double[] term15643 = (double[]) newDoubleArray(32);
        byte[] term15644 = (byte[]) newByteArray(32);
        setIntElement(term15642, 1, 1);
        setIntElement(term15642, 3, 3);
        setField(term15641, term15641.getClass(), "keys", term15642);
        setDoubleElement(term15643, 1, 0.6076495596892013);
        setDoubleElement(term15643, 3, 0.8474802076607362);
        setField(term15641, term15641.getClass(), "values", term15643);
        setByteElement(term15644, 1, (byte) 1);
        setByteElement(term15644, 3, (byte) 1);
        setField(term15641, term15641.getClass(), "states", term15644);
        setDoubleField(term15641, term15641.getClass(), "missingEntries", 0.0);
        setIntField(term15641, term15641.getClass(), "size", 2);
        setIntField(term15641, term15641.getClass(), "mask", 31);
        setIntField(term15641, term15641.getClass(), "count", 2);
        setField(term15640, term15640.getClass(), "entries", term15641);
        setIntField(term15640, term15640.getClass(), "virtualSize", 4);
        setDoubleField(term15640, term15640.getClass(), "epsilon", 0.5183269973490326);
        term15645 = (double[]) newDoubleArray(4);
        setDoubleElement(term15645, 0, 0.36923381893433327);
        setDoubleElement(term15645, 1, 0.6076495596892013);
        setDoubleElement(term15645, 2, 0.37773193782763337);
        setDoubleElement(term15645, 3, 0.8474802076607362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term233;
        args[1] = term238;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15640));
        assertTrue(recursiveEquals(term233, term15645));
        assertTrue(recursiveEquals(term238, 0.5183269973490326));
    }

};


