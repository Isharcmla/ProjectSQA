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
import java.lang.Object;
import java.util.HashMap;

public class Flat3Map_put_1944740725987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275364;
     Object term275784;

    public Flat3Map_put_1944740725987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term275596 = new HashMap();
        HashMap term275644 = new HashMap();
        HashMap term275692 = new HashMap();
        term275364 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term275456 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term275548 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term274765 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term275364, term275364.getClass(), "delegateMap", null);
        setIntField(term275364, term275364.getClass(), "size", 3);
        setIntField(term275364, term275364.getClass(), "hash3", -2074443968);
        setField(term275456, term275456.getClass(), "delegateMap", null);
        setIntField(term275456, term275456.getClass(), "size", 3);
        setField(term275548, term275548.getClass(), "delegateMap", null);
        setIntField(term275548, term275548.getClass(), "size", 0);
        setField(term275456, term275456.getClass(), "key3", term275548);
        setField(term275456, term275456.getClass(), "key2", null);
        setField(term275456, term275456.getClass(), "value2", null);
        setIntField(term275456, term275456.getClass(), "hash3", 2034761984);
        setField(term275456, term275456.getClass(), "value3", null);
        setIntField(term275456, term275456.getClass(), "hash2", 1835681);
        setIntField(term275456, term275456.getClass(), "hash1", -1070813952);
        setField(term275456, term275456.getClass(), "key1", term274765);
        setField(term275456, term275456.getClass(), "value1", null);
        setField(term275364, term275364.getClass(), "key3", term275456);
        setIntField(term275364, term275364.getClass(), "hash2", -2074443968);
        setField(term275364, term275364.getClass(), "key2", null);
        setIntField(term275364, term275364.getClass(), "hash1", -2074443968);
        setField(term275364, term275364.getClass(), "key1", null);
        setField(term275364, term275364.getClass(), "value3", term275596);
        setField(term275364, term275364.getClass(), "value2", term275644);
        setField(term275364, term275364.getClass(), "value1", term275692);
        term275784 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term275876 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term275968 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term275784, term275784.getClass(), "delegateMap", null);
        setIntField(term275784, term275784.getClass(), "size", 3);
        setIntField(term275784, term275784.getClass(), "hash3", 74602240);
        setField(term275784, term275784.getClass(), "value3", null);
        setIntField(term275784, term275784.getClass(), "hash2", 744499264);
        setField(term275784, term275784.getClass(), "value2", null);
        setIntField(term275784, term275784.getClass(), "hash1", 1401421824);
        setField(term275784, term275784.getClass(), "value1", null);
        setField(term275784, term275784.getClass(), "key3", null);
        setField(term275876, term275876.getClass(), "delegateMap", null);
        setIntField(term275876, term275876.getClass(), "size", 0);
        setField(term275784, term275784.getClass(), "key2", term275876);
        setField(term275968, term275968.getClass(), "delegateMap", null);
        setIntField(term275968, term275968.getClass(), "size", 1);
        setIntField(term275968, term275968.getClass(), "hash1", 0);
        setField(term275968, term275968.getClass(), "value1", null);
        setField(term275784, term275784.getClass(), "key1", term275968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term275784;
        args[1] = null;
        callMethod(klass, "put", argTypes, term275364, args);
    }

};


