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

public class Flat3Map_containsValue_2053071372265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46889;
     Object term47075;
     Object term47265;
     Object term47267;

    public Flat3Map_containsValue_2053071372265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46889 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46983 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term46889, term46889.getClass(), "delegateMap", null);
        setIntField(term46889, term46889.getClass(), "size", 3);
        setField(term46889, term46889.getClass(), "value3", term46983);
        term47075 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term47169 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term47075, term47075.getClass(), "delegateMap", term47169);
        term47265 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term47266 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setIntField(term47265, term47265.getClass(), "size", 3);
        setIntField(term47265, term47265.getClass(), "hash1", 0);
        setIntField(term47265, term47265.getClass(), "hash2", 0);
        setIntField(term47265, term47265.getClass(), "hash3", 0);
        setField(term47265, term47265.getClass(), "key1", null);
        setField(term47265, term47265.getClass(), "key2", null);
        setField(term47265, term47265.getClass(), "key3", null);
        setField(term47265, term47265.getClass(), "value1", null);
        setField(term47265, term47265.getClass(), "value2", null);
        setField(term47266, term47266.getClass(), "header", null);
        setFloatField(term47266, term47266.getClass(), "loadFactor", 0.0F);
        setIntField(term47266, term47266.getClass(), "size", 0);
        setField(term47266, term47266.getClass(), "data", null);
        setIntField(term47266, term47266.getClass(), "threshold", 0);
        setIntField(term47266, term47266.getClass(), "modCount", 0);
        setField(term47266, term47266.getClass(), "entrySet", null);
        setField(term47266, term47266.getClass(), "keySet", null);
        setField(term47266, term47266.getClass(), "values", null);
        setField(term47266, term47266.getClass(), "keySet", null);
        setField(term47266, term47266.getClass(), "values", null);
        setField(term47265, term47265.getClass(), "value3", term47266);
        setField(term47265, term47265.getClass(), "delegateMap", null);
        term47267 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term47268 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setIntField(term47267, term47267.getClass(), "size", 0);
        setIntField(term47267, term47267.getClass(), "hash1", 0);
        setIntField(term47267, term47267.getClass(), "hash2", 0);
        setIntField(term47267, term47267.getClass(), "hash3", 0);
        setField(term47267, term47267.getClass(), "key1", null);
        setField(term47267, term47267.getClass(), "key2", null);
        setField(term47267, term47267.getClass(), "key3", null);
        setField(term47267, term47267.getClass(), "value1", null);
        setField(term47267, term47267.getClass(), "value2", null);
        setField(term47267, term47267.getClass(), "value3", null);
        setField(term47268, term47268.getClass(), "header", null);
        setFloatField(term47268, term47268.getClass(), "loadFactor", 0.0F);
        setIntField(term47268, term47268.getClass(), "size", 0);
        setField(term47268, term47268.getClass(), "data", null);
        setIntField(term47268, term47268.getClass(), "threshold", 0);
        setIntField(term47268, term47268.getClass(), "modCount", 0);
        setField(term47268, term47268.getClass(), "entrySet", null);
        setField(term47268, term47268.getClass(), "keySet", null);
        setField(term47268, term47268.getClass(), "values", null);
        setField(term47268, term47268.getClass(), "keySet", null);
        setField(term47268, term47268.getClass(), "values", null);
        setField(term47267, term47267.getClass(), "delegateMap", term47268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term47075;
        callMethod(klass, "containsValue", argTypes, term46889, args);
        assertTrue(recursiveEquals(term46889, term47265));
        assertTrue(recursiveEquals(term47075, term47267));
    }

};
