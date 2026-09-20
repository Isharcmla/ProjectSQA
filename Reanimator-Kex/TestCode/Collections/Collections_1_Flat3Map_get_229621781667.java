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

public class Flat3Map_get_229621781667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130746;
     Object term130876;
     Object term131055;
     Object term131057;

    public Flat3Map_get_229621781667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130746 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term131005 = newInstance(Class.forName("java.lang.Object"));
        setField(term130746, term130746.getClass(), "delegateMap", null);
        setIntField(term130746, term130746.getClass(), "size", 2);
        setIntField(term130746, term130746.getClass(), "hash2", 0);
        setField(term130746, term130746.getClass(), "key2", term131005);
        setField(term130746, term130746.getClass(), "key1", null);
        setField(term130746, term130746.getClass(), "value1", null);
        term130876 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term130986 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term130876, term130876.getClass(), "delegateMap", null);
        setIntField(term130876, term130876.getClass(), "size", 2);
        setIntField(term130876, term130876.getClass(), "hash2", 0);
        setField(term130876, term130876.getClass(), "value2", null);
        setIntField(term130876, term130876.getClass(), "hash1", 0);
        setIntField(term130986, term130986.getClass(), "size", 0);
        setField(term130876, term130876.getClass(), "value1", term130986);
        setField(term130876, term130876.getClass(), "key2", null);
        setField(term130876, term130876.getClass(), "key1", term131005);
        term131055 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term131056 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term131055, term131055.getClass(), "size", 2);
        setIntField(term131055, term131055.getClass(), "hash1", 0);
        setIntField(term131055, term131055.getClass(), "hash2", 0);
        setIntField(term131055, term131055.getClass(), "hash3", 0);
        setField(term131055, term131055.getClass(), "key1", null);
        setField(term131055, term131055.getClass(), "key2", term131056);
        setField(term131055, term131055.getClass(), "key3", null);
        setField(term131055, term131055.getClass(), "value1", null);
        setField(term131055, term131055.getClass(), "value2", null);
        setField(term131055, term131055.getClass(), "value3", null);
        setField(term131055, term131055.getClass(), "delegateMap", null);
        term131057 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term131058 = newInstance(Class.forName("java.lang.Object"));
        Object term131059 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term131057, term131057.getClass(), "size", 2);
        setIntField(term131057, term131057.getClass(), "hash1", 0);
        setIntField(term131057, term131057.getClass(), "hash2", 0);
        setIntField(term131057, term131057.getClass(), "hash3", 0);
        setField(term131057, term131057.getClass(), "key1", term131058);
        setField(term131057, term131057.getClass(), "key2", null);
        setField(term131057, term131057.getClass(), "key3", null);
        setFloatField(term131059, term131059.getClass(), "loadFactor", 0.0F);
        setIntField(term131059, term131059.getClass(), "size", 0);
        setField(term131059, term131059.getClass(), "data", null);
        setIntField(term131059, term131059.getClass(), "threshold", 0);
        setIntField(term131059, term131059.getClass(), "modCount", 0);
        setField(term131059, term131059.getClass(), "entrySet", null);
        setField(term131059, term131059.getClass(), "keySet", null);
        setField(term131059, term131059.getClass(), "values", null);
        setField(term131059, term131059.getClass(), "keySet", null);
        setField(term131059, term131059.getClass(), "values", null);
        setField(term131057, term131057.getClass(), "value1", term131059);
        setField(term131057, term131057.getClass(), "value2", null);
        setField(term131057, term131057.getClass(), "value3", null);
        setField(term131057, term131057.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term130876;
        Object retValue = callMethod(klass, "get", argTypes, term130746, args);
        assertTrue(recursiveEquals(term130746, term131055));
        assertTrue(recursiveEquals(term130876, term131057));
        assertTrue(recursiveEquals(retValue, null));
    }

};
