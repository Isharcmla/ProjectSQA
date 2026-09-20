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

public class Flat3Map_convertToMap_1229912811381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69647;
     Object term70237;

    public Flat3Map_convertToMap_1229912811381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69647 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term69757 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term69867 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term69961 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term70053 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term69423 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setField(term69647, term69647.getClass(), "delegateMap", term69757);
        setIntField(term69647, term69647.getClass(), "size", 3);
        setField(term69647, term69647.getClass(), "key3", null);
        setField(term69647, term69647.getClass(), "value3", term69867);
        setField(term69647, term69647.getClass(), "key2", null);
        setField(term69647, term69647.getClass(), "value2", term69961);
        setField(term70053, term70053.getClass(), "delegateMap", null);
        setIntField(term70053, term70053.getClass(), "size", 0);
        setField(term69647, term69647.getClass(), "key1", term70053);
        setField(term69647, term69647.getClass(), "value1", term69423);
        term70237 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term70238 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term70239 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term70240 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term70241 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term70242 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term70243 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setIntField(term70237, term70237.getClass(), "size", 0);
        setIntField(term70237, term70237.getClass(), "hash1", 0);
        setIntField(term70237, term70237.getClass(), "hash2", 0);
        setIntField(term70237, term70237.getClass(), "hash3", 0);
        setField(term70237, term70237.getClass(), "key1", null);
        setField(term70237, term70237.getClass(), "key2", null);
        setField(term70237, term70237.getClass(), "key3", null);
        setField(term70237, term70237.getClass(), "value1", null);
        setField(term70237, term70237.getClass(), "value2", null);
        setField(term70237, term70237.getClass(), "value3", null);
        setFloatField(term70238, term70238.getClass(), "loadFactor", 0.75F);
        setIntField(term70238, term70238.getClass(), "size", 2);
        setField(term70241, term70241.getClass(), "next", null);
        setField(term70241, term70241.getClass(), "key", null);
        setField(term70241, term70241.getClass(), "value", null);
        setField(term70240, term70240.getClass(), "next", term70241);
        setIntField(term70242, term70242.getClass(), "size", 0);
        setIntField(term70242, term70242.getClass(), "hash1", 0);
        setIntField(term70242, term70242.getClass(), "hash2", 0);
        setIntField(term70242, term70242.getClass(), "hash3", 0);
        setField(term70242, term70242.getClass(), "key1", null);
        setField(term70242, term70242.getClass(), "key2", null);
        setField(term70242, term70242.getClass(), "key3", null);
        setField(term70242, term70242.getClass(), "value1", null);
        setField(term70242, term70242.getClass(), "value2", null);
        setField(term70242, term70242.getClass(), "value3", null);
        setField(term70242, term70242.getClass(), "delegateMap", null);
        setField(term70240, term70240.getClass(), "key", term70242);
        setField(term70240, term70240.getClass(), "value", term70243);
        setElement(term70239, 0, term70240);
        setField(term70238, term70238.getClass(), "data", term70239);
        setIntField(term70238, term70238.getClass(), "threshold", 12);
        setIntField(term70238, term70238.getClass(), "modCount", 2);
        setField(term70238, term70238.getClass(), "entrySet", null);
        setField(term70238, term70238.getClass(), "keySet", null);
        setField(term70238, term70238.getClass(), "values", null);
        setField(term70238, term70238.getClass(), "keySet", null);
        setField(term70238, term70238.getClass(), "values", null);
        setField(term70237, term70237.getClass(), "delegateMap", term70238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term69647, args);
        assertTrue(recursiveEquals(term69647, term70237));
    }

};
