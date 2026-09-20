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

public class Flat3Map_get_229621781536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101930;
     Object term102481;
     Object term102484;

    public Flat3Map_get_229621781536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101930 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term101976 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102031 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term101930, term101930.getClass(), "delegateMap", null);
        setIntField(term101930, term101930.getClass(), "size", 3);
        setIntField(term101930, term101930.getClass(), "hash3", 0);
        setField(term101930, term101930.getClass(), "value3", null);
        setIntField(term101930, term101930.getClass(), "hash2", 0);
        setField(term101930, term101930.getClass(), "value2", null);
        setIntField(term101930, term101930.getClass(), "hash1", 0);
        setField(term101930, term101930.getClass(), "value1", null);
        setField(term101976, term101976.getClass(), "delegateMap", term102031);
        setField(term101930, term101930.getClass(), "key3", term101976);
        term102481 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102482 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102483 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setIntField(term102481, term102481.getClass(), "size", 3);
        setIntField(term102481, term102481.getClass(), "hash1", 0);
        setIntField(term102481, term102481.getClass(), "hash2", 0);
        setIntField(term102481, term102481.getClass(), "hash3", 0);
        setField(term102481, term102481.getClass(), "key1", null);
        setField(term102481, term102481.getClass(), "key2", null);
        setIntField(term102482, term102482.getClass(), "size", 0);
        setIntField(term102482, term102482.getClass(), "hash1", 0);
        setIntField(term102482, term102482.getClass(), "hash2", 0);
        setIntField(term102482, term102482.getClass(), "hash3", 0);
        setField(term102482, term102482.getClass(), "key1", null);
        setField(term102482, term102482.getClass(), "key2", null);
        setField(term102482, term102482.getClass(), "key3", null);
        setField(term102482, term102482.getClass(), "value1", null);
        setField(term102482, term102482.getClass(), "value2", null);
        setField(term102482, term102482.getClass(), "value3", null);
        setField(term102483, term102483.getClass(), "header", null);
        setFloatField(term102483, term102483.getClass(), "loadFactor", 0.0F);
        setIntField(term102483, term102483.getClass(), "size", 0);
        setField(term102483, term102483.getClass(), "data", null);
        setIntField(term102483, term102483.getClass(), "threshold", 0);
        setIntField(term102483, term102483.getClass(), "modCount", 0);
        setField(term102483, term102483.getClass(), "entrySet", null);
        setField(term102483, term102483.getClass(), "keySet", null);
        setField(term102483, term102483.getClass(), "values", null);
        setField(term102483, term102483.getClass(), "keySet", null);
        setField(term102483, term102483.getClass(), "values", null);
        setField(term102482, term102482.getClass(), "delegateMap", term102483);
        setField(term102481, term102481.getClass(), "key3", term102482);
        setField(term102481, term102481.getClass(), "value1", null);
        setField(term102481, term102481.getClass(), "value2", null);
        setField(term102481, term102481.getClass(), "value3", null);
        setField(term102481, term102481.getClass(), "delegateMap", null);
        term102484 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102485 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term102486 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setIntField(term102484, term102484.getClass(), "size", 3);
        setIntField(term102484, term102484.getClass(), "hash1", 0);
        setIntField(term102484, term102484.getClass(), "hash2", 0);
        setIntField(term102484, term102484.getClass(), "hash3", 0);
        setField(term102484, term102484.getClass(), "key1", null);
        setField(term102484, term102484.getClass(), "key2", null);
        setIntField(term102485, term102485.getClass(), "size", 0);
        setIntField(term102485, term102485.getClass(), "hash1", 0);
        setIntField(term102485, term102485.getClass(), "hash2", 0);
        setIntField(term102485, term102485.getClass(), "hash3", 0);
        setField(term102485, term102485.getClass(), "key1", null);
        setField(term102485, term102485.getClass(), "key2", null);
        setField(term102485, term102485.getClass(), "key3", null);
        setField(term102485, term102485.getClass(), "value1", null);
        setField(term102485, term102485.getClass(), "value2", null);
        setField(term102485, term102485.getClass(), "value3", null);
        setField(term102486, term102486.getClass(), "header", null);
        setFloatField(term102486, term102486.getClass(), "loadFactor", 0.0F);
        setIntField(term102486, term102486.getClass(), "size", 0);
        setField(term102486, term102486.getClass(), "data", null);
        setIntField(term102486, term102486.getClass(), "threshold", 0);
        setIntField(term102486, term102486.getClass(), "modCount", 0);
        setField(term102486, term102486.getClass(), "entrySet", null);
        setField(term102486, term102486.getClass(), "keySet", null);
        setField(term102486, term102486.getClass(), "values", null);
        setField(term102486, term102486.getClass(), "keySet", null);
        setField(term102486, term102486.getClass(), "values", null);
        setField(term102485, term102485.getClass(), "delegateMap", term102486);
        setField(term102484, term102484.getClass(), "key3", term102485);
        setField(term102484, term102484.getClass(), "value1", null);
        setField(term102484, term102484.getClass(), "value2", null);
        setField(term102484, term102484.getClass(), "value3", null);
        setField(term102484, term102484.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term101930;
        Object retValue = callMethod(klass, "get", argTypes, term101930, args);
        assertTrue(recursiveEquals(term101930, term102481));
        assertTrue(recursiveEquals(term101930, term102484));
        assertTrue(recursiveEquals(retValue, null));
    }

};
