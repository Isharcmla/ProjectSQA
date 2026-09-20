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
     Object term230;
     Object term7873;
     Object term7856;

    public Flat3Map_entrySet_94413123737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term235 = newInstance(Class.forName("java.lang.Object"));
        Object term236 = newInstance(Class.forName("java.lang.Object"));
        Object term237 = newInstance(Class.forName("java.lang.Object"));
        Object term238 = newInstance(Class.forName("java.lang.Object"));
        Object term239 = newInstance(Class.forName("java.lang.Object"));
        Object term240 = newInstance(Class.forName("java.lang.Object"));
        Object term241 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term230, term230.getClass(), "size", -1891015523);
        setIntField(term230, term230.getClass(), "hash1", -1560631747);
        setIntField(term230, term230.getClass(), "hash2", 1215150180);
        setIntField(term230, term230.getClass(), "hash3", -1422859977);
        setField(term230, term230.getClass(), "key1", term235);
        setField(term230, term230.getClass(), "key2", term236);
        setField(term230, term230.getClass(), "key3", term237);
        setField(term230, term230.getClass(), "value1", term238);
        setField(term230, term230.getClass(), "value2", term239);
        setField(term230, term230.getClass(), "value3", term240);
        setFloatField(term241, term241.getClass(), "loadFactor", 0.0F);
        setIntField(term241, term241.getClass(), "size", 0);
        setField(term241, term241.getClass(), "data", null);
        setIntField(term241, term241.getClass(), "threshold", 0);
        setIntField(term241, term241.getClass(), "modCount", 0);
        setField(term241, term241.getClass(), "entrySet", null);
        setField(term241, term241.getClass(), "keySet", null);
        setField(term241, term241.getClass(), "values", null);
        setField(term241, term241.getClass(), "keySet", null);
        setField(term241, term241.getClass(), "values", null);
        setField(term230, term230.getClass(), "delegateMap", term241);
        term7873 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7874 = newInstance(Class.forName("java.lang.Object"));
        Object term7875 = newInstance(Class.forName("java.lang.Object"));
        Object term7876 = newInstance(Class.forName("java.lang.Object"));
        Object term7877 = newInstance(Class.forName("java.lang.Object"));
        Object term7878 = newInstance(Class.forName("java.lang.Object"));
        Object term7879 = newInstance(Class.forName("java.lang.Object"));
        Object term7880 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term7881 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$EntrySet"));
        setIntField(term7873, term7873.getClass(), "size", -1891015523);
        setIntField(term7873, term7873.getClass(), "hash1", -1560631747);
        setIntField(term7873, term7873.getClass(), "hash2", 1215150180);
        setIntField(term7873, term7873.getClass(), "hash3", -1422859977);
        setField(term7873, term7873.getClass(), "key1", term7874);
        setField(term7873, term7873.getClass(), "key2", term7875);
        setField(term7873, term7873.getClass(), "key3", term7876);
        setField(term7873, term7873.getClass(), "value1", term7877);
        setField(term7873, term7873.getClass(), "value2", term7878);
        setField(term7873, term7873.getClass(), "value3", term7879);
        setFloatField(term7880, term7880.getClass(), "loadFactor", 0.0F);
        setIntField(term7880, term7880.getClass(), "size", 0);
        setField(term7880, term7880.getClass(), "data", null);
        setIntField(term7880, term7880.getClass(), "threshold", 0);
        setIntField(term7880, term7880.getClass(), "modCount", 0);
        setField(term7881, term7881.getClass(), "parent", term7880);
        setField(term7880, term7880.getClass(), "entrySet", term7881);
        setField(term7880, term7880.getClass(), "keySet", null);
        setField(term7880, term7880.getClass(), "values", null);
        setField(term7880, term7880.getClass(), "keySet", null);
        setField(term7880, term7880.getClass(), "values", null);
        setField(term7873, term7873.getClass(), "delegateMap", term7880);
        term7856 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$EntrySet"));
        Object term7857 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term7857, term7857.getClass(), "loadFactor", 0.0F);
        setIntField(term7857, term7857.getClass(), "size", 0);
        setField(term7857, term7857.getClass(), "data", null);
        setIntField(term7857, term7857.getClass(), "threshold", 0);
        setIntField(term7857, term7857.getClass(), "modCount", 0);
        setField(term7857, term7857.getClass(), "entrySet", term7856);
        setField(term7857, term7857.getClass(), "keySet", null);
        setField(term7857, term7857.getClass(), "values", null);
        setField(term7857, term7857.getClass(), "keySet", null);
        setField(term7857, term7857.getClass(), "values", null);
        setField(term7856, term7856.getClass(), "parent", term7857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "entrySet", argTypes, term230, args);
        assertTrue(recursiveEquals(term230, term7873));
        assertTrue(recursiveEquals(retValue, term7856));
    }

};
