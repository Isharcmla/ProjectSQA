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

public class Flat3Map_put_1944740725862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225175;
     Object term225469;
     Object term226180;
     Object term226188;

    public Flat3Map_put_1944740725862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225175 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term225267 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term225377 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term225175, term225175.getClass(), "delegateMap", null);
        setIntField(term225175, term225175.getClass(), "size", 3);
        setIntField(term225175, term225175.getClass(), "hash3", 0);
        setField(term225267, term225267.getClass(), "delegateMap", null);
        setIntField(term225267, term225267.getClass(), "size", 3);
        setField(term225267, term225267.getClass(), "key3", term225377);
        setField(term225267, term225267.getClass(), "key2", null);
        setField(term225267, term225267.getClass(), "value2", null);
        setField(term225175, term225175.getClass(), "key3", term225267);
        term225469 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term225561 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term225469, term225469.getClass(), "delegateMap", null);
        setIntField(term225469, term225469.getClass(), "size", 3);
        setIntField(term225469, term225469.getClass(), "hash3", 0);
        setField(term225469, term225469.getClass(), "value3", null);
        setIntField(term225469, term225469.getClass(), "hash2", 0);
        setField(term225469, term225469.getClass(), "value2", null);
        setIntField(term225469, term225469.getClass(), "hash1", 0);
        setField(term225469, term225469.getClass(), "value1", null);
        setField(term225469, term225469.getClass(), "key3", null);
        setField(term225469, term225469.getClass(), "key2", null);
        setField(term225561, term225561.getClass(), "delegateMap", null);
        setIntField(term225561, term225561.getClass(), "size", 2);
        setField(term225469, term225469.getClass(), "key1", term225561);
        term226180 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term226181 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term226182 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term226183 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term226184 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term226185 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term226186 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term226187 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term226180, term226180.getClass(), "size", 0);
        setIntField(term226180, term226180.getClass(), "hash1", 0);
        setIntField(term226180, term226180.getClass(), "hash2", 0);
        setIntField(term226180, term226180.getClass(), "hash3", 0);
        setField(term226180, term226180.getClass(), "key1", null);
        setField(term226180, term226180.getClass(), "key2", null);
        setField(term226180, term226180.getClass(), "key3", null);
        setField(term226180, term226180.getClass(), "value1", null);
        setField(term226180, term226180.getClass(), "value2", null);
        setField(term226180, term226180.getClass(), "value3", null);
        setFloatField(term226181, term226181.getClass(), "loadFactor", -8130816);
        setIntField(term226181, term226181.getClass(), "size", 3);
        setField(term226184, term226184.getClass(), "next", null);
        setField(term226184, term226184.getClass(), "key", null);
        setField(term226184, term226184.getClass(), "value", null);
        setField(term226183, term226183.getClass(), "next", term226184);
        setIntField(term226185, term226185.getClass(), "size", 3);
        setIntField(term226185, term226185.getClass(), "hash1", 0);
        setIntField(term226185, term226185.getClass(), "hash2", 0);
        setIntField(term226185, term226185.getClass(), "hash3", 0);
        setField(term226185, term226185.getClass(), "key1", null);
        setField(term226185, term226185.getClass(), "key2", null);
        setField(term226185, term226185.getClass(), "key3", null);
        setField(term226185, term226185.getClass(), "value1", null);
        setField(term226185, term226185.getClass(), "value2", null);
        setField(term226185, term226185.getClass(), "value3", null);
        setField(term226185, term226185.getClass(), "delegateMap", null);
        setField(term226183, term226183.getClass(), "key", term226185);
        setField(term226183, term226183.getClass(), "value", null);
        setElement(term226182, 0, term226183);
        setField(term226186, term226186.getClass(), "next", null);
        setField(term226186, term226186.getClass(), "key", term226187);
        setField(term226186, term226186.getClass(), "value", null);
        setElement(term226182, 6, term226186);
        setField(term226181, term226181.getClass(), "data", term226182);
        setIntField(term226181, term226181.getClass(), "threshold", 12);
        setIntField(term226181, term226181.getClass(), "modCount", 0);
        setField(term226181, term226181.getClass(), "entrySet", null);
        setField(term226181, term226181.getClass(), "keySet", null);
        setField(term226181, term226181.getClass(), "values", null);
        setField(term226181, term226181.getClass(), "keySet", null);
        setField(term226181, term226181.getClass(), "values", null);
        setField(term226180, term226180.getClass(), "delegateMap", term226181);
        term226188 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term226188, term226188.getClass(), "size", 3);
        setIntField(term226188, term226188.getClass(), "hash1", 0);
        setIntField(term226188, term226188.getClass(), "hash2", 0);
        setIntField(term226188, term226188.getClass(), "hash3", 0);
        setField(term226188, term226188.getClass(), "key1", null);
        setField(term226188, term226188.getClass(), "key2", null);
        setField(term226188, term226188.getClass(), "key3", null);
        setField(term226188, term226188.getClass(), "value1", null);
        setField(term226188, term226188.getClass(), "value2", null);
        setField(term226188, term226188.getClass(), "value3", null);
        setField(term226188, term226188.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term225469;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term225175, args);
        assertTrue(recursiveEquals(term225175, term226180));
        assertTrue(recursiveEquals(term225469, term226188));
        assertTrue(recursiveEquals(retValue, null));
    }

};


