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

public class Flat3Map_put_1944740725406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70171;
     Object term70944;
     Object term70951;

    public Flat3Map_put_1944740725406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70171 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term70206 = newInstance(Class.forName("java.lang.Runtime$VersionPattern"));
        setField(term70171, term70171.getClass(), "delegateMap", null);
        setIntField(term70171, term70171.getClass(), "size", 3);
        setIntField(term70171, term70171.getClass(), "hash3", 0);
        setField(term70171, term70171.getClass(), "value3", null);
        setIntField(term70171, term70171.getClass(), "hash2", 0);
        setField(term70171, term70171.getClass(), "value2", null);
        setIntField(term70171, term70171.getClass(), "hash1", 0);
        setField(term70171, term70171.getClass(), "value1", term70206);
        term70944 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term70945 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term70946 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term70947 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term70948 = newInstance(Class.forName("java.lang.Object"));
        Object term70949 = newInstance(Class.forName("java.lang.Runtime$VersionPattern"));
        Object term70950 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term70944, term70944.getClass(), "size", 0);
        setIntField(term70944, term70944.getClass(), "hash1", 0);
        setIntField(term70944, term70944.getClass(), "hash2", 0);
        setIntField(term70944, term70944.getClass(), "hash3", 0);
        setField(term70944, term70944.getClass(), "key1", null);
        setField(term70944, term70944.getClass(), "key2", null);
        setField(term70944, term70944.getClass(), "key3", null);
        setField(term70944, term70944.getClass(), "value1", null);
        setField(term70944, term70944.getClass(), "value2", null);
        setField(term70944, term70944.getClass(), "value3", null);
        setFloatField(term70945, term70945.getClass(), "loadFactor", 0.75F);
        setIntField(term70945, term70945.getClass(), "size", 2);
        setField(term70947, term70947.getClass(), "next", null);
        setField(term70947, term70947.getClass(), "key", term70948);
        setField(term70947, term70947.getClass(), "value", term70949);
        setElement(term70946, 5, term70947);
        setField(term70950, term70950.getClass(), "next", null);
        setField(term70950, term70950.getClass(), "key", term70944);
        setField(term70950, term70950.getClass(), "value", null);
        setElement(term70946, 6, term70950);
        setField(term70945, term70945.getClass(), "data", term70946);
        setIntField(term70945, term70945.getClass(), "threshold", 12);
        setIntField(term70945, term70945.getClass(), "modCount", 2);
        setField(term70945, term70945.getClass(), "entrySet", null);
        setField(term70945, term70945.getClass(), "keySet", null);
        setField(term70945, term70945.getClass(), "values", null);
        setField(term70945, term70945.getClass(), "keySet", null);
        setField(term70945, term70945.getClass(), "values", null);
        setField(term70944, term70944.getClass(), "delegateMap", term70945);
        term70951 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term70952 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term70953 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term70954 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term70955 = newInstance(Class.forName("java.lang.Object"));
        Object term70956 = newInstance(Class.forName("java.lang.Runtime$VersionPattern"));
        Object term70957 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term70951, term70951.getClass(), "size", 0);
        setIntField(term70951, term70951.getClass(), "hash1", 0);
        setIntField(term70951, term70951.getClass(), "hash2", 0);
        setIntField(term70951, term70951.getClass(), "hash3", 0);
        setField(term70951, term70951.getClass(), "key1", null);
        setField(term70951, term70951.getClass(), "key2", null);
        setField(term70951, term70951.getClass(), "key3", null);
        setField(term70951, term70951.getClass(), "value1", null);
        setField(term70951, term70951.getClass(), "value2", null);
        setField(term70951, term70951.getClass(), "value3", null);
        setFloatField(term70952, term70952.getClass(), "loadFactor", 0.75F);
        setIntField(term70952, term70952.getClass(), "size", 2);
        setField(term70954, term70954.getClass(), "next", null);
        setField(term70954, term70954.getClass(), "key", term70955);
        setField(term70954, term70954.getClass(), "value", term70956);
        setElement(term70953, 5, term70954);
        setField(term70957, term70957.getClass(), "next", null);
        setField(term70957, term70957.getClass(), "key", term70951);
        setField(term70957, term70957.getClass(), "value", null);
        setElement(term70953, 6, term70957);
        setField(term70952, term70952.getClass(), "data", term70953);
        setIntField(term70952, term70952.getClass(), "threshold", 12);
        setIntField(term70952, term70952.getClass(), "modCount", 2);
        setField(term70952, term70952.getClass(), "entrySet", null);
        setField(term70952, term70952.getClass(), "keySet", null);
        setField(term70952, term70952.getClass(), "values", null);
        setField(term70952, term70952.getClass(), "keySet", null);
        setField(term70952, term70952.getClass(), "values", null);
        setField(term70951, term70951.getClass(), "delegateMap", term70952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term70171;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term70171, args);
        assertTrue(recursiveEquals(term70171, term70944));
        assertTrue(recursiveEquals(term70171, term70951));
        assertTrue(recursiveEquals(retValue, null));
    }

};


