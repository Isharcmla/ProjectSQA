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

public class OpenMapRealVector_toArray_103468866757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11137;

    public OpenMapRealVector_toArray_103468866757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11137 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term11138 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term11139 = (int[]) newIntArray(32);
        double[] term11172 = (double[]) newDoubleArray(32);
        byte[] term11205 = (byte[]) newByteArray(32);
        setField(term11138, term11138.getClass(), "keys", term11139);
        setField(term11138, term11138.getClass(), "values", term11172);
        setField(term11138, term11138.getClass(), "states", term11205);
        setDoubleField(term11138, term11138.getClass(), "missingEntries", 0.0);
        setIntField(term11138, term11138.getClass(), "size", 0);
        setIntField(term11138, term11138.getClass(), "mask", 31);
        setIntField(term11138, term11138.getClass(), "count", 0);
        setField(term11137, term11137.getClass(), "entries", term11138);
        setIntField(term11137, term11137.getClass(), "virtualSize", -93135961);
        setDoubleField(term11137, term11137.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toArray", argTypes, term11137, args);
    }

};


