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

public class Flat3Map_get_229621781355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64610;
     Object term64823;
     Object term64826;

    public Flat3Map_get_229621781355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64610 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64656 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64711 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term64610, term64610.getClass(), "delegateMap", null);
        setIntField(term64610, term64610.getClass(), "size", 2);
        setIntField(term64610, term64610.getClass(), "hash2", 0);
        setField(term64610, term64610.getClass(), "value2", null);
        setIntField(term64610, term64610.getClass(), "hash1", 0);
        setField(term64610, term64610.getClass(), "value1", null);
        setField(term64610, term64610.getClass(), "key2", null);
        setField(term64656, term64656.getClass(), "delegateMap", term64711);
        setField(term64610, term64610.getClass(), "key1", term64656);
        term64823 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64824 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64825 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term64823, term64823.getClass(), "size", 2);
        setIntField(term64823, term64823.getClass(), "hash1", 0);
        setIntField(term64823, term64823.getClass(), "hash2", 0);
        setIntField(term64823, term64823.getClass(), "hash3", 0);
        setIntField(term64824, term64824.getClass(), "size", 0);
        setIntField(term64824, term64824.getClass(), "hash1", 0);
        setIntField(term64824, term64824.getClass(), "hash2", 0);
        setIntField(term64824, term64824.getClass(), "hash3", 0);
        setField(term64824, term64824.getClass(), "key1", null);
        setField(term64824, term64824.getClass(), "key2", null);
        setField(term64824, term64824.getClass(), "key3", null);
        setField(term64824, term64824.getClass(), "value1", null);
        setField(term64824, term64824.getClass(), "value2", null);
        setField(term64824, term64824.getClass(), "value3", null);
        setFloatField(term64825, term64825.getClass(), "loadFactor", 0.0F);
        setIntField(term64825, term64825.getClass(), "size", 0);
        setField(term64825, term64825.getClass(), "data", null);
        setIntField(term64825, term64825.getClass(), "threshold", 0);
        setIntField(term64825, term64825.getClass(), "modCount", 0);
        setField(term64825, term64825.getClass(), "entrySet", null);
        setField(term64825, term64825.getClass(), "keySet", null);
        setField(term64825, term64825.getClass(), "values", null);
        setField(term64825, term64825.getClass(), "keySet", null);
        setField(term64825, term64825.getClass(), "values", null);
        setField(term64824, term64824.getClass(), "delegateMap", term64825);
        setField(term64823, term64823.getClass(), "key1", term64824);
        setField(term64823, term64823.getClass(), "key2", null);
        setField(term64823, term64823.getClass(), "key3", null);
        setField(term64823, term64823.getClass(), "value1", null);
        setField(term64823, term64823.getClass(), "value2", null);
        setField(term64823, term64823.getClass(), "value3", null);
        setField(term64823, term64823.getClass(), "delegateMap", null);
        term64826 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64827 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64828 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term64826, term64826.getClass(), "size", 2);
        setIntField(term64826, term64826.getClass(), "hash1", 0);
        setIntField(term64826, term64826.getClass(), "hash2", 0);
        setIntField(term64826, term64826.getClass(), "hash3", 0);
        setIntField(term64827, term64827.getClass(), "size", 0);
        setIntField(term64827, term64827.getClass(), "hash1", 0);
        setIntField(term64827, term64827.getClass(), "hash2", 0);
        setIntField(term64827, term64827.getClass(), "hash3", 0);
        setField(term64827, term64827.getClass(), "key1", null);
        setField(term64827, term64827.getClass(), "key2", null);
        setField(term64827, term64827.getClass(), "key3", null);
        setField(term64827, term64827.getClass(), "value1", null);
        setField(term64827, term64827.getClass(), "value2", null);
        setField(term64827, term64827.getClass(), "value3", null);
        setFloatField(term64828, term64828.getClass(), "loadFactor", 0.0F);
        setIntField(term64828, term64828.getClass(), "size", 0);
        setField(term64828, term64828.getClass(), "data", null);
        setIntField(term64828, term64828.getClass(), "threshold", 0);
        setIntField(term64828, term64828.getClass(), "modCount", 0);
        setField(term64828, term64828.getClass(), "entrySet", null);
        setField(term64828, term64828.getClass(), "keySet", null);
        setField(term64828, term64828.getClass(), "values", null);
        setField(term64828, term64828.getClass(), "keySet", null);
        setField(term64828, term64828.getClass(), "values", null);
        setField(term64827, term64827.getClass(), "delegateMap", term64828);
        setField(term64826, term64826.getClass(), "key1", term64827);
        setField(term64826, term64826.getClass(), "key2", null);
        setField(term64826, term64826.getClass(), "key3", null);
        setField(term64826, term64826.getClass(), "value1", null);
        setField(term64826, term64826.getClass(), "value2", null);
        setField(term64826, term64826.getClass(), "value3", null);
        setField(term64826, term64826.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term64610;
        Object retValue = callMethod(klass, "get", argTypes, term64610, args);
        assertTrue(recursiveEquals(term64610, term64823));
        assertTrue(recursiveEquals(term64610, term64826));
        assertTrue(recursiveEquals(retValue, null));
    }

};
