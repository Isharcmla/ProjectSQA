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
import static org.apache.commons.math3.linear.EqualityUtils.*;
import java.lang.Object;

public class OpenMapRealVector_getL1Distance_69951870679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4738;
     Object term4845;
     Object term53616;
     Object term53621;

    public OpenMapRealVector_getL1Distance_69951870679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4738 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term4739 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term4740 = (int[]) newIntArray(32);
        double[] term4773 = (double[]) newDoubleArray(32);
        byte[] term4806 = (byte[]) newByteArray(32);
        setField(term4739, term4739.getClass(), "keys", term4740);
        setField(term4739, term4739.getClass(), "values", term4773);
        setField(term4739, term4739.getClass(), "states", term4806);
        setDoubleField(term4739, term4739.getClass(), "missingEntries", 0.0);
        setIntField(term4739, term4739.getClass(), "size", 0);
        setIntField(term4739, term4739.getClass(), "mask", 31);
        setIntField(term4739, term4739.getClass(), "count", 0);
        setField(term4738, term4738.getClass(), "entries", term4739);
        setIntField(term4738, term4738.getClass(), "virtualSize", -226514366);
        setDoubleField(term4738, term4738.getClass(), "epsilon", 1.0E-12);
        term4845 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term4846 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term4847 = (int[]) newIntArray(32);
        double[] term4880 = (double[]) newDoubleArray(32);
        byte[] term4913 = (byte[]) newByteArray(32);
        setField(term4846, term4846.getClass(), "keys", term4847);
        setField(term4846, term4846.getClass(), "values", term4880);
        setField(term4846, term4846.getClass(), "states", term4913);
        setDoubleField(term4846, term4846.getClass(), "missingEntries", 0.0);
        setIntField(term4846, term4846.getClass(), "size", 0);
        setIntField(term4846, term4846.getClass(), "mask", 31);
        setIntField(term4846, term4846.getClass(), "count", 0);
        setField(term4845, term4845.getClass(), "entries", term4846);
        setIntField(term4845, term4845.getClass(), "virtualSize", 1193880199);
        setDoubleField(term4845, term4845.getClass(), "epsilon", 1.0E-12);
        term53616 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term53617 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term53618 = (int[]) newIntArray(32);
        double[] term53619 = (double[]) newDoubleArray(32);
        byte[] term53620 = (byte[]) newByteArray(32);
        setField(term53617, term53617.getClass(), "keys", term53618);
        setField(term53617, term53617.getClass(), "values", term53619);
        setField(term53617, term53617.getClass(), "states", term53620);
        setDoubleField(term53617, term53617.getClass(), "missingEntries", 0.0);
        setIntField(term53617, term53617.getClass(), "size", 0);
        setIntField(term53617, term53617.getClass(), "mask", 31);
        setIntField(term53617, term53617.getClass(), "count", 0);
        setField(term53616, term53616.getClass(), "entries", term53617);
        setIntField(term53616, term53616.getClass(), "virtualSize", -226514366);
        setDoubleField(term53616, term53616.getClass(), "epsilon", 1.0E-12);
        term53621 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term53622 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term53623 = (int[]) newIntArray(32);
        double[] term53624 = (double[]) newDoubleArray(32);
        byte[] term53625 = (byte[]) newByteArray(32);
        setField(term53622, term53622.getClass(), "keys", term53623);
        setField(term53622, term53622.getClass(), "values", term53624);
        setField(term53622, term53622.getClass(), "states", term53625);
        setDoubleField(term53622, term53622.getClass(), "missingEntries", 0.0);
        setIntField(term53622, term53622.getClass(), "size", 0);
        setIntField(term53622, term53622.getClass(), "mask", 31);
        setIntField(term53622, term53622.getClass(), "count", 0);
        setField(term53621, term53621.getClass(), "entries", term53622);
        setIntField(term53621, term53621.getClass(), "virtualSize", 1193880199);
        setDoubleField(term53621, term53621.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term4845;
        Object retValue = callMethod(klass, "getL1Distance", argTypes, term4738, args);
        assertTrue(recursiveEquals(term4738, term53616));
        assertTrue(recursiveEquals(term4845, term53621));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


