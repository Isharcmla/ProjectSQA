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

public class Flat3Map_get_229621781553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105259;
     Object term105611;
     Object term106186;
     Object term106191;

    public Flat3Map_get_229621781553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105259 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term105351 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term105389 = newInstance(Class.forName("java.lang.Object"));
        Object term105481 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term105519 = newInstance(Class.forName("java.lang.Object"));
        setField(term105259, term105259.getClass(), "delegateMap", null);
        setIntField(term105259, term105259.getClass(), "size", 2);
        setIntField(term105259, term105259.getClass(), "hash2", 0);
        setField(term105351, term105351.getClass(), "delegateMap", null);
        setIntField(term105351, term105351.getClass(), "size", 2);
        setField(term105351, term105351.getClass(), "key2", term105389);
        setField(term105351, term105351.getClass(), "key1", null);
        setField(term105351, term105351.getClass(), "value1", null);
        setField(term105259, term105259.getClass(), "key2", term105351);
        setIntField(term105259, term105259.getClass(), "hash1", 0);
        setField(term105481, term105481.getClass(), "delegateMap", null);
        setIntField(term105481, term105481.getClass(), "size", 2);
        setField(term105481, term105481.getClass(), "key2", term105519);
        setField(term105481, term105481.getClass(), "key1", null);
        setField(term105481, term105481.getClass(), "value1", term105481);
        setField(term105259, term105259.getClass(), "key1", term105481);
        term105611 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term105721 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term105611, term105611.getClass(), "delegateMap", null);
        setIntField(term105611, term105611.getClass(), "size", 2);
        setIntField(term105611, term105611.getClass(), "hash2", 0);
        setIntField(term105721, term105721.getClass(), "size", 0);
        setField(term105611, term105611.getClass(), "value2", term105721);
        setIntField(term105611, term105611.getClass(), "hash1", 0);
        setField(term105611, term105611.getClass(), "value1", null);
        setField(term105611, term105611.getClass(), "key2", null);
        term106186 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106187 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106188 = newInstance(Class.forName("java.lang.Object"));
        Object term106189 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106190 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term106186, term106186.getClass(), "size", 2);
        setIntField(term106186, term106186.getClass(), "hash1", 0);
        setIntField(term106186, term106186.getClass(), "hash2", 0);
        setIntField(term106186, term106186.getClass(), "hash3", 0);
        setIntField(term106187, term106187.getClass(), "size", 2);
        setIntField(term106187, term106187.getClass(), "hash1", 0);
        setIntField(term106187, term106187.getClass(), "hash2", 0);
        setIntField(term106187, term106187.getClass(), "hash3", 0);
        setField(term106187, term106187.getClass(), "key1", null);
        setField(term106187, term106187.getClass(), "key2", term106188);
        setField(term106187, term106187.getClass(), "key3", null);
        setField(term106187, term106187.getClass(), "value1", term106187);
        setField(term106187, term106187.getClass(), "value2", null);
        setField(term106187, term106187.getClass(), "value3", null);
        setField(term106187, term106187.getClass(), "delegateMap", null);
        setField(term106186, term106186.getClass(), "key1", term106187);
        setIntField(term106189, term106189.getClass(), "size", 2);
        setIntField(term106189, term106189.getClass(), "hash1", 0);
        setIntField(term106189, term106189.getClass(), "hash2", 0);
        setIntField(term106189, term106189.getClass(), "hash3", 0);
        setField(term106189, term106189.getClass(), "key1", null);
        setField(term106189, term106189.getClass(), "key2", term106190);
        setField(term106189, term106189.getClass(), "key3", null);
        setField(term106189, term106189.getClass(), "value1", null);
        setField(term106189, term106189.getClass(), "value2", null);
        setField(term106189, term106189.getClass(), "value3", null);
        setField(term106189, term106189.getClass(), "delegateMap", null);
        setField(term106186, term106186.getClass(), "key2", term106189);
        setField(term106186, term106186.getClass(), "key3", null);
        setField(term106186, term106186.getClass(), "value1", null);
        setField(term106186, term106186.getClass(), "value2", null);
        setField(term106186, term106186.getClass(), "value3", null);
        setField(term106186, term106186.getClass(), "delegateMap", null);
        term106191 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106192 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term106191, term106191.getClass(), "size", 2);
        setIntField(term106191, term106191.getClass(), "hash1", 0);
        setIntField(term106191, term106191.getClass(), "hash2", 0);
        setIntField(term106191, term106191.getClass(), "hash3", 0);
        setField(term106191, term106191.getClass(), "key1", null);
        setField(term106191, term106191.getClass(), "key2", null);
        setField(term106191, term106191.getClass(), "key3", null);
        setField(term106191, term106191.getClass(), "value1", null);
        setFloatField(term106192, term106192.getClass(), "loadFactor", 0.0F);
        setIntField(term106192, term106192.getClass(), "size", 0);
        setField(term106192, term106192.getClass(), "data", null);
        setIntField(term106192, term106192.getClass(), "threshold", 0);
        setIntField(term106192, term106192.getClass(), "modCount", 0);
        setField(term106192, term106192.getClass(), "entrySet", null);
        setField(term106192, term106192.getClass(), "keySet", null);
        setField(term106192, term106192.getClass(), "values", null);
        setField(term106192, term106192.getClass(), "keySet", null);
        setField(term106192, term106192.getClass(), "values", null);
        setField(term106191, term106191.getClass(), "value2", term106192);
        setField(term106191, term106191.getClass(), "value3", null);
        setField(term106191, term106191.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term105611;
        Object retValue = callMethod(klass, "get", argTypes, term105259, args);
        assertTrue(recursiveEquals(term105259, term106186));
        assertTrue(recursiveEquals(term105611, term106191));
        assertTrue(recursiveEquals(retValue, null));
    }

};
