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

public class Flat3Map_containsValue_2053071372637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124046;
     Object term124226;
     Object term124416;
     Object term124418;

    public Flat3Map_containsValue_2053071372637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124046 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124134 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term124046, term124046.getClass(), "delegateMap", null);
        setIntField(term124046, term124046.getClass(), "size", 3);
        setIntField(term124134, term124134.getClass(), "size", -1);
        setField(term124046, term124046.getClass(), "value3", term124134);
        term124226 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124314 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term124314, term124314.getClass(), "size", 0);
        setField(term124226, term124226.getClass(), "delegateMap", term124314);
        term124416 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124417 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term124416, term124416.getClass(), "size", 3);
        setIntField(term124416, term124416.getClass(), "hash1", 0);
        setIntField(term124416, term124416.getClass(), "hash2", 0);
        setIntField(term124416, term124416.getClass(), "hash3", 0);
        setField(term124416, term124416.getClass(), "key1", null);
        setField(term124416, term124416.getClass(), "key2", null);
        setField(term124416, term124416.getClass(), "key3", null);
        setField(term124416, term124416.getClass(), "value1", null);
        setField(term124416, term124416.getClass(), "value2", null);
        setIntField(term124417, term124417.getClass(), "maxSize", 0);
        setBooleanField(term124417, term124417.getClass(), "scanUntilRemovable", false);
        setField(term124417, term124417.getClass(), "header", null);
        setFloatField(term124417, term124417.getClass(), "loadFactor", 0.0F);
        setIntField(term124417, term124417.getClass(), "size", -1);
        setField(term124417, term124417.getClass(), "data", null);
        setIntField(term124417, term124417.getClass(), "threshold", 0);
        setIntField(term124417, term124417.getClass(), "modCount", 0);
        setField(term124417, term124417.getClass(), "entrySet", null);
        setField(term124417, term124417.getClass(), "keySet", null);
        setField(term124417, term124417.getClass(), "values", null);
        setField(term124417, term124417.getClass(), "keySet", null);
        setField(term124417, term124417.getClass(), "values", null);
        setField(term124416, term124416.getClass(), "value3", term124417);
        setField(term124416, term124416.getClass(), "delegateMap", null);
        term124418 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124419 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term124418, term124418.getClass(), "size", 0);
        setIntField(term124418, term124418.getClass(), "hash1", 0);
        setIntField(term124418, term124418.getClass(), "hash2", 0);
        setIntField(term124418, term124418.getClass(), "hash3", 0);
        setField(term124418, term124418.getClass(), "key1", null);
        setField(term124418, term124418.getClass(), "key2", null);
        setField(term124418, term124418.getClass(), "key3", null);
        setField(term124418, term124418.getClass(), "value1", null);
        setField(term124418, term124418.getClass(), "value2", null);
        setField(term124418, term124418.getClass(), "value3", null);
        setIntField(term124419, term124419.getClass(), "maxSize", 0);
        setBooleanField(term124419, term124419.getClass(), "scanUntilRemovable", false);
        setField(term124419, term124419.getClass(), "header", null);
        setFloatField(term124419, term124419.getClass(), "loadFactor", 0.0F);
        setIntField(term124419, term124419.getClass(), "size", 0);
        setField(term124419, term124419.getClass(), "data", null);
        setIntField(term124419, term124419.getClass(), "threshold", 0);
        setIntField(term124419, term124419.getClass(), "modCount", 0);
        setField(term124419, term124419.getClass(), "entrySet", null);
        setField(term124419, term124419.getClass(), "keySet", null);
        setField(term124419, term124419.getClass(), "values", null);
        setField(term124419, term124419.getClass(), "keySet", null);
        setField(term124419, term124419.getClass(), "values", null);
        setField(term124418, term124418.getClass(), "delegateMap", term124419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term124226;
        callMethod(klass, "containsValue", argTypes, term124046, args);
        assertTrue(recursiveEquals(term124046, term124416));
        assertTrue(recursiveEquals(term124226, term124418));
    }

};
