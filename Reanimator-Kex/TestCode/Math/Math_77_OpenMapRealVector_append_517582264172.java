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

public class OpenMapRealVector_append_517582264172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173000;
     Object term173210;

    public OpenMapRealVector_append_517582264172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173000 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term173108 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term170364 = (int[]) newIntArray(0);
        setIntField(term173000, term173000.getClass(), "virtualSize", 0);
        setField(term173108, term173108.getClass(), "keys", term170364);
        setField(term173108, term173108.getClass(), "values", null);
        setField(term173108, term173108.getClass(), "states", null);
        setDoubleField(term173108, term173108.getClass(), "missingEntries", 0.0);
        setIntField(term173108, term173108.getClass(), "size", 0);
        setIntField(term173108, term173108.getClass(), "mask", 0);
        setIntField(term173108, term173108.getClass(), "count", 0);
        setField(term173000, term173000.getClass(), "entries", term173108);
        setDoubleField(term173000, term173000.getClass(), "epsilon", 0.0);
        term173210 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term173318 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term170380 = (byte[]) newByteArray(487);
        setIntField(term173210, term173210.getClass(), "virtualSize", 0);
        setIntField(term173318, term173318.getClass(), "count", 0);
        setByteElement(term170380, 0, (byte) -128);
        setByteElement(term170380, 1, (byte) -128);
        setByteElement(term170380, 2, (byte) -128);
        setByteElement(term170380, 3, (byte) -128);
        setByteElement(term170380, 4, (byte) 1);
        setField(term173318, term173318.getClass(), "states", term170380);
        setField(term173210, term173210.getClass(), "entries", term173318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term173210;
        callMethod(klass, "append", argTypes, term173000, args);
    }

};


