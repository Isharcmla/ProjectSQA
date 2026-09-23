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

public class Flat3Map_put_1944740725695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165748;
     Object term166476;

    public Flat3Map_put_1944740725695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165748 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term165840 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term165932 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term166026 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term166140 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyIterator"));
        Object term166254 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyIterator"));
        Object term166384 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term165748, term165748.getClass(), "delegateMap", null);
        setIntField(term165748, term165748.getClass(), "size", 3);
        setIntField(term165748, term165748.getClass(), "hash3", -560726015);
        setField(term165840, term165840.getClass(), "delegateMap", null);
        setIntField(term165840, term165840.getClass(), "size", 3);
        setField(term165932, term165932.getClass(), "delegateMap", null);
        setIntField(term165932, term165932.getClass(), "size", 0);
        setField(term165840, term165840.getClass(), "key3", term165932);
        setField(term165840, term165840.getClass(), "key2", null);
        setField(term165840, term165840.getClass(), "value2", null);
        setIntField(term165840, term165840.getClass(), "hash3", -1008992256);
        setIntField(term166026, term166026.getClass(), "size", 0);
        setField(term165840, term165840.getClass(), "value3", term166026);
        setIntField(term165840, term165840.getClass(), "hash2", 327155736);
        setIntField(term165840, term165840.getClass(), "hash1", -1170711520);
        setField(term165840, term165840.getClass(), "value1", null);
        setField(term165748, term165748.getClass(), "key3", term165840);
        setIntField(term165748, term165748.getClass(), "hash2", -560726015);
        setField(term165748, term165748.getClass(), "key2", null);
        setIntField(term165748, term165748.getClass(), "hash1", -560726015);
        setField(term165748, term165748.getClass(), "key1", null);
        setField(term165748, term165748.getClass(), "value3", term166140);
        setField(term165748, term165748.getClass(), "value2", term166254);
        setField(term165748, term165748.getClass(), "value1", term166384);
        term166476 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term166568 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term166476, term166476.getClass(), "delegateMap", null);
        setIntField(term166476, term166476.getClass(), "size", 3);
        setIntField(term166476, term166476.getClass(), "hash3", 378798081);
        setField(term166476, term166476.getClass(), "value3", null);
        setIntField(term166476, term166476.getClass(), "hash2", -1946157056);
        setField(term166476, term166476.getClass(), "value2", null);
        setIntField(term166476, term166476.getClass(), "hash1", 1006632960);
        setField(term166476, term166476.getClass(), "value1", null);
        setField(term166476, term166476.getClass(), "key3", null);
        setField(term166568, term166568.getClass(), "delegateMap", null);
        setIntField(term166568, term166568.getClass(), "size", 0);
        setField(term166476, term166476.getClass(), "key2", term166568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term166476;
        args[1] = null;
        callMethod(klass, "put", argTypes, term165748, args);
    }

};


