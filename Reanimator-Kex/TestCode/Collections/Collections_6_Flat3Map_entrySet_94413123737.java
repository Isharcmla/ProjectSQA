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

public class Flat3Map_entrySet_94413123737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228;
     Object term7871;
     Object term7854;

    public Flat3Map_entrySet_94413123737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term233 = newInstance(Class.forName("java.lang.Object"));
        Object term234 = newInstance(Class.forName("java.lang.Object"));
        Object term235 = newInstance(Class.forName("java.lang.Object"));
        Object term236 = newInstance(Class.forName("java.lang.Object"));
        Object term237 = newInstance(Class.forName("java.lang.Object"));
        Object term238 = newInstance(Class.forName("java.lang.Object"));
        Object term239 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term228, term228.getClass(), "size", -1891015523);
        setIntField(term228, term228.getClass(), "hash1", -1560631747);
        setIntField(term228, term228.getClass(), "hash2", 1215150180);
        setIntField(term228, term228.getClass(), "hash3", -1422859977);
        setField(term228, term228.getClass(), "key1", term233);
        setField(term228, term228.getClass(), "key2", term234);
        setField(term228, term228.getClass(), "key3", term235);
        setField(term228, term228.getClass(), "value1", term236);
        setField(term228, term228.getClass(), "value2", term237);
        setField(term228, term228.getClass(), "value3", term238);
        setFloatField(term239, term239.getClass(), "loadFactor", 0.0F);
        setIntField(term239, term239.getClass(), "size", 0);
        setField(term239, term239.getClass(), "data", null);
        setIntField(term239, term239.getClass(), "threshold", 0);
        setIntField(term239, term239.getClass(), "modCount", 0);
        setField(term239, term239.getClass(), "entrySet", null);
        setField(term239, term239.getClass(), "keySet", null);
        setField(term239, term239.getClass(), "values", null);
        setField(term239, term239.getClass(), "keySet", null);
        setField(term239, term239.getClass(), "values", null);
        setField(term228, term228.getClass(), "delegateMap", term239);
        term7871 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7872 = newInstance(Class.forName("java.lang.Object"));
        Object term7873 = newInstance(Class.forName("java.lang.Object"));
        Object term7874 = newInstance(Class.forName("java.lang.Object"));
        Object term7875 = newInstance(Class.forName("java.lang.Object"));
        Object term7876 = newInstance(Class.forName("java.lang.Object"));
        Object term7877 = newInstance(Class.forName("java.lang.Object"));
        Object term7878 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term7879 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$EntrySet"));
        setIntField(term7871, term7871.getClass(), "size", -1891015523);
        setIntField(term7871, term7871.getClass(), "hash1", -1560631747);
        setIntField(term7871, term7871.getClass(), "hash2", 1215150180);
        setIntField(term7871, term7871.getClass(), "hash3", -1422859977);
        setField(term7871, term7871.getClass(), "key1", term7872);
        setField(term7871, term7871.getClass(), "key2", term7873);
        setField(term7871, term7871.getClass(), "key3", term7874);
        setField(term7871, term7871.getClass(), "value1", term7875);
        setField(term7871, term7871.getClass(), "value2", term7876);
        setField(term7871, term7871.getClass(), "value3", term7877);
        setFloatField(term7878, term7878.getClass(), "loadFactor", 0.0F);
        setIntField(term7878, term7878.getClass(), "size", 0);
        setField(term7878, term7878.getClass(), "data", null);
        setIntField(term7878, term7878.getClass(), "threshold", 0);
        setIntField(term7878, term7878.getClass(), "modCount", 0);
        setField(term7879, term7879.getClass(), "parent", term7878);
        setField(term7878, term7878.getClass(), "entrySet", term7879);
        setField(term7878, term7878.getClass(), "keySet", null);
        setField(term7878, term7878.getClass(), "values", null);
        setField(term7878, term7878.getClass(), "keySet", null);
        setField(term7878, term7878.getClass(), "values", null);
        setField(term7871, term7871.getClass(), "delegateMap", term7878);
        term7854 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$EntrySet"));
        Object term7855 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term7855, term7855.getClass(), "loadFactor", 0.0F);
        setIntField(term7855, term7855.getClass(), "size", 0);
        setField(term7855, term7855.getClass(), "data", null);
        setIntField(term7855, term7855.getClass(), "threshold", 0);
        setIntField(term7855, term7855.getClass(), "modCount", 0);
        setField(term7855, term7855.getClass(), "entrySet", term7854);
        setField(term7855, term7855.getClass(), "keySet", null);
        setField(term7855, term7855.getClass(), "values", null);
        setField(term7855, term7855.getClass(), "keySet", null);
        setField(term7855, term7855.getClass(), "values", null);
        setField(term7854, term7854.getClass(), "parent", term7855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "entrySet", argTypes, term228, args);
        assertTrue(recursiveEquals(term228, term7871));
        assertTrue(recursiveEquals(retValue, term7854));
    }

};


