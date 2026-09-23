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

public class OpenMapRealVector_isNaN_4915458684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6159;
     Object term78856;

    public OpenMapRealVector_isNaN_4915458684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6159 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term6160 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term6161 = (int[]) newIntArray(32);
        double[] term6194 = (double[]) newDoubleArray(32);
        byte[] term6227 = (byte[]) newByteArray(32);
        setField(term6160, term6160.getClass(), "keys", term6161);
        setField(term6160, term6160.getClass(), "values", term6194);
        setField(term6160, term6160.getClass(), "states", term6227);
        setDoubleField(term6160, term6160.getClass(), "missingEntries", 0.0);
        setIntField(term6160, term6160.getClass(), "size", 0);
        setIntField(term6160, term6160.getClass(), "mask", 31);
        setIntField(term6160, term6160.getClass(), "count", 0);
        setField(term6159, term6159.getClass(), "entries", term6160);
        setIntField(term6159, term6159.getClass(), "virtualSize", 1962444399);
        setDoubleField(term6159, term6159.getClass(), "epsilon", 1.0E-12);
        term78856 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term78857 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term78858 = (int[]) newIntArray(32);
        double[] term78859 = (double[]) newDoubleArray(32);
        byte[] term78860 = (byte[]) newByteArray(32);
        setField(term78857, term78857.getClass(), "keys", term78858);
        setField(term78857, term78857.getClass(), "values", term78859);
        setField(term78857, term78857.getClass(), "states", term78860);
        setDoubleField(term78857, term78857.getClass(), "missingEntries", 0.0);
        setIntField(term78857, term78857.getClass(), "size", 0);
        setIntField(term78857, term78857.getClass(), "mask", 31);
        setIntField(term78857, term78857.getClass(), "count", 0);
        setField(term78856, term78856.getClass(), "entries", term78857);
        setIntField(term78856, term78856.getClass(), "virtualSize", 1962444399);
        setDoubleField(term78856, term78856.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNaN", argTypes, term6159, args);
        assertTrue(recursiveEquals(term6159, term78856));
        assertTrue(recursiveEquals(retValue, false));
    }

};


