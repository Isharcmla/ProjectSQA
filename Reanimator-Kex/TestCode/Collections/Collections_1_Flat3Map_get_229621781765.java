package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class Flat3Map_get_229621781765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155149;
     Object term155241;
     Object term155653;
     Object term155654;

    public Flat3Map_get_229621781765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155149 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term155149, term155149.getClass(), "delegateMap", null);
        setIntField(term155149, term155149.getClass(), "size", 2);
        setIntField(term155149, term155149.getClass(), "hash2", 0);
        setField(term155149, term155149.getClass(), "key2", term155149);
        term155241 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term155351 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term155473 = newInstance(Class.forName("java.lang.invoke.VarHandleByteArrayAsInts$ByteBufferHandle"));
        setField(term155241, term155241.getClass(), "delegateMap", null);
        setIntField(term155241, term155241.getClass(), "size", 2);
        setIntField(term155241, term155241.getClass(), "hash2", 0);
        setIntField(term155351, term155351.getClass(), "size", 0);
        setField(term155241, term155241.getClass(), "value2", term155351);
        setIntField(term155241, term155241.getClass(), "hash1", 0);
        setField(term155241, term155241.getClass(), "value1", null);
        setField(term155241, term155241.getClass(), "key2", term155473);
        term155653 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term155653, term155653.getClass(), "size", 2);
        setIntField(term155653, term155653.getClass(), "hash1", 0);
        setIntField(term155653, term155653.getClass(), "hash2", 0);
        setIntField(term155653, term155653.getClass(), "hash3", 0);
        setField(term155653, term155653.getClass(), "key1", null);
        setField(term155653, term155653.getClass(), "key2", term155653);
        setField(term155653, term155653.getClass(), "key3", null);
        setField(term155653, term155653.getClass(), "value1", null);
        setField(term155653, term155653.getClass(), "value2", null);
        setField(term155653, term155653.getClass(), "value3", null);
        setField(term155653, term155653.getClass(), "delegateMap", null);
        term155654 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term155655 = newInstance(Class.forName("java.lang.invoke.VarHandleByteArrayAsInts$ByteBufferHandle"));
        Object term155656 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term155654, term155654.getClass(), "size", 2);
        setIntField(term155654, term155654.getClass(), "hash1", 0);
        setIntField(term155654, term155654.getClass(), "hash2", 0);
        setIntField(term155654, term155654.getClass(), "hash3", 0);
        setField(term155654, term155654.getClass(), "key1", null);
        setBooleanField(term155655, term155655.getClass(), "be", false);
        setField(term155655, term155655.getClass(), "vform", null);
        setField(term155655, term155655.getClass(), "typesAndInvokers", null);
        setField(term155654, term155654.getClass(), "key2", term155655);
        setField(term155654, term155654.getClass(), "key3", null);
        setField(term155654, term155654.getClass(), "value1", null);
        setFloatField(term155656, term155656.getClass(), "loadFactor", 0.0F);
        setIntField(term155656, term155656.getClass(), "size", 0);
        setField(term155656, term155656.getClass(), "data", null);
        setIntField(term155656, term155656.getClass(), "threshold", 0);
        setIntField(term155656, term155656.getClass(), "modCount", 0);
        setField(term155656, term155656.getClass(), "entrySet", null);
        setField(term155656, term155656.getClass(), "keySet", null);
        setField(term155656, term155656.getClass(), "values", null);
        setField(term155656, term155656.getClass(), "keySet", null);
        setField(term155656, term155656.getClass(), "values", null);
        setField(term155654, term155654.getClass(), "value2", term155656);
        setField(term155654, term155654.getClass(), "value3", null);
        setField(term155654, term155654.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term155241;
        Object retValue = callMethod(klass, "get", argTypes, term155149, args);
        assertTrue(recursiveEquals(term155149, term155653));
        assertTrue(recursiveEquals(term155241, term155654));
        assertTrue(recursiveEquals(retValue, null));
    }

};
