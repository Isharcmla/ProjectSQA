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

public class Flat3Map_put_1944740725168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27947;
     Object term28039;
     Object term28262;
     Object term28264;

    public Flat3Map_put_1944740725168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27947 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term27947, term27947.getClass(), "delegateMap", null);
        setIntField(term27947, term27947.getClass(), "size", 1);
        term28039 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term28262 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term28263 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term28262, term28262.getClass(), "size", 2);
        setIntField(term28262, term28262.getClass(), "hash1", 0);
        setIntField(term28262, term28262.getClass(), "hash2", 0);
        setIntField(term28262, term28262.getClass(), "hash3", 0);
        setField(term28262, term28262.getClass(), "key1", null);
        setIntField(term28263, term28263.getClass(), "size", 0);
        setIntField(term28263, term28263.getClass(), "hash1", 0);
        setIntField(term28263, term28263.getClass(), "hash2", 0);
        setIntField(term28263, term28263.getClass(), "hash3", 0);
        setField(term28263, term28263.getClass(), "key1", null);
        setField(term28263, term28263.getClass(), "key2", null);
        setField(term28263, term28263.getClass(), "key3", null);
        setField(term28263, term28263.getClass(), "value1", null);
        setField(term28263, term28263.getClass(), "value2", null);
        setField(term28263, term28263.getClass(), "value3", null);
        setField(term28263, term28263.getClass(), "delegateMap", null);
        setField(term28262, term28262.getClass(), "key2", term28263);
        setField(term28262, term28262.getClass(), "key3", null);
        setField(term28262, term28262.getClass(), "value1", null);
        setField(term28262, term28262.getClass(), "value2", null);
        setField(term28262, term28262.getClass(), "value3", null);
        setField(term28262, term28262.getClass(), "delegateMap", null);
        term28264 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term28264, term28264.getClass(), "size", 0);
        setIntField(term28264, term28264.getClass(), "hash1", 0);
        setIntField(term28264, term28264.getClass(), "hash2", 0);
        setIntField(term28264, term28264.getClass(), "hash3", 0);
        setField(term28264, term28264.getClass(), "key1", null);
        setField(term28264, term28264.getClass(), "key2", null);
        setField(term28264, term28264.getClass(), "key3", null);
        setField(term28264, term28264.getClass(), "value1", null);
        setField(term28264, term28264.getClass(), "value2", null);
        setField(term28264, term28264.getClass(), "value3", null);
        setField(term28264, term28264.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term28039;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term27947, args);
        assertTrue(recursiveEquals(term27947, term28262));
        assertTrue(recursiveEquals(term28039, term28264));
        assertTrue(recursiveEquals(retValue, null));
    }

};


