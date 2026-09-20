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

public class Flat3Map_get_229621781475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89484;
     Object term89752;
     Object term89812;
     Object term89816;

    public Flat3Map_get_229621781475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89484 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term89576 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term89614 = newInstance(Class.forName("java.lang.Object"));
        term89752 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term89484, term89484.getClass(), "delegateMap", null);
        setIntField(term89484, term89484.getClass(), "size", 3);
        setIntField(term89484, term89484.getClass(), "hash3", 0);
        setField(term89576, term89576.getClass(), "delegateMap", null);
        setIntField(term89576, term89576.getClass(), "size", -4);
        setField(term89484, term89484.getClass(), "key3", term89576);
        setIntField(term89484, term89484.getClass(), "hash2", 0);
        setField(term89484, term89484.getClass(), "key2", term89614);
        setIntField(term89484, term89484.getClass(), "hash1", 0);
        setField(term89752, term89752.getClass(), "delegateMap", null);
        setIntField(term89752, term89752.getClass(), "size", 3);
        setIntField(term89752, term89752.getClass(), "hash3", 0);
        setField(term89752, term89752.getClass(), "value3", null);
        setIntField(term89752, term89752.getClass(), "hash2", 0);
        setField(term89752, term89752.getClass(), "value2", null);
        setIntField(term89752, term89752.getClass(), "hash1", 0);
        setField(term89752, term89752.getClass(), "value1", null);
        setField(term89484, term89484.getClass(), "key1", term89752);
        term89812 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term89813 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term89814 = newInstance(Class.forName("java.lang.Object"));
        Object term89815 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term89812, term89812.getClass(), "size", 3);
        setIntField(term89812, term89812.getClass(), "hash1", 0);
        setIntField(term89812, term89812.getClass(), "hash2", 0);
        setIntField(term89812, term89812.getClass(), "hash3", 0);
        setIntField(term89813, term89813.getClass(), "size", 3);
        setIntField(term89813, term89813.getClass(), "hash1", 0);
        setIntField(term89813, term89813.getClass(), "hash2", 0);
        setIntField(term89813, term89813.getClass(), "hash3", 0);
        setField(term89813, term89813.getClass(), "key1", null);
        setField(term89813, term89813.getClass(), "key2", null);
        setField(term89813, term89813.getClass(), "key3", null);
        setField(term89813, term89813.getClass(), "value1", null);
        setField(term89813, term89813.getClass(), "value2", null);
        setField(term89813, term89813.getClass(), "value3", null);
        setField(term89813, term89813.getClass(), "delegateMap", null);
        setField(term89812, term89812.getClass(), "key1", term89813);
        setField(term89812, term89812.getClass(), "key2", term89814);
        setIntField(term89815, term89815.getClass(), "size", -4);
        setIntField(term89815, term89815.getClass(), "hash1", 0);
        setIntField(term89815, term89815.getClass(), "hash2", 0);
        setIntField(term89815, term89815.getClass(), "hash3", 0);
        setField(term89815, term89815.getClass(), "key1", null);
        setField(term89815, term89815.getClass(), "key2", null);
        setField(term89815, term89815.getClass(), "key3", null);
        setField(term89815, term89815.getClass(), "value1", null);
        setField(term89815, term89815.getClass(), "value2", null);
        setField(term89815, term89815.getClass(), "value3", null);
        setField(term89815, term89815.getClass(), "delegateMap", null);
        setField(term89812, term89812.getClass(), "key3", term89815);
        setField(term89812, term89812.getClass(), "value1", null);
        setField(term89812, term89812.getClass(), "value2", null);
        setField(term89812, term89812.getClass(), "value3", null);
        setField(term89812, term89812.getClass(), "delegateMap", null);
        term89816 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term89816, term89816.getClass(), "size", 3);
        setIntField(term89816, term89816.getClass(), "hash1", 0);
        setIntField(term89816, term89816.getClass(), "hash2", 0);
        setIntField(term89816, term89816.getClass(), "hash3", 0);
        setField(term89816, term89816.getClass(), "key1", null);
        setField(term89816, term89816.getClass(), "key2", null);
        setField(term89816, term89816.getClass(), "key3", null);
        setField(term89816, term89816.getClass(), "value1", null);
        setField(term89816, term89816.getClass(), "value2", null);
        setField(term89816, term89816.getClass(), "value3", null);
        setField(term89816, term89816.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term89752;
        Object retValue = callMethod(klass, "get", argTypes, term89484, args);
        assertTrue(recursiveEquals(term89484, term89812));
        assertTrue(recursiveEquals(term89752, term89816));
        assertTrue(recursiveEquals(retValue, null));
    }

};
