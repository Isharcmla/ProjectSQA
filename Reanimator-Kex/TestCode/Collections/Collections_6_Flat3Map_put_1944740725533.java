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

public class Flat3Map_put_1944740725533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103772;
     Object term103864;
     Object term105053;
     Object term105061;

    public Flat3Map_put_1944740725533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103772 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term103772, term103772.getClass(), "delegateMap", null);
        setIntField(term103772, term103772.getClass(), "size", 3);
        setIntField(term103772, term103772.getClass(), "hash3", 0);
        setField(term103772, term103772.getClass(), "key3", null);
        setIntField(term103772, term103772.getClass(), "hash2", 0);
        setField(term103772, term103772.getClass(), "key2", null);
        setIntField(term103772, term103772.getClass(), "hash1", 0);
        setField(term103772, term103772.getClass(), "key1", term103772);
        setField(term103772, term103772.getClass(), "value3", null);
        term103864 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term103974 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term104012 = newInstance(Class.forName("java.lang.Object"));
        setField(term103864, term103864.getClass(), "delegateMap", null);
        setIntField(term103864, term103864.getClass(), "size", 3);
        setIntField(term103864, term103864.getClass(), "hash3", 0);
        setField(term103864, term103864.getClass(), "value3", null);
        setIntField(term103864, term103864.getClass(), "hash2", 0);
        setField(term103864, term103864.getClass(), "value2", null);
        setIntField(term103864, term103864.getClass(), "hash1", 0);
        setIntField(term103974, term103974.getClass(), "size", 0);
        setField(term103864, term103864.getClass(), "value1", term103974);
        setField(term103864, term103864.getClass(), "key3", null);
        setField(term103864, term103864.getClass(), "key2", null);
        setField(term103864, term103864.getClass(), "key1", term104012);
        term105053 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term105054 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term105055 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term105056 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term105057 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term105058 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term105059 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term105060 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term105053, term105053.getClass(), "size", 0);
        setIntField(term105053, term105053.getClass(), "hash1", 0);
        setIntField(term105053, term105053.getClass(), "hash2", 0);
        setIntField(term105053, term105053.getClass(), "hash3", 0);
        setField(term105053, term105053.getClass(), "key1", null);
        setField(term105053, term105053.getClass(), "key2", null);
        setField(term105053, term105053.getClass(), "key3", null);
        setField(term105053, term105053.getClass(), "value1", null);
        setField(term105053, term105053.getClass(), "value2", null);
        setField(term105053, term105053.getClass(), "value3", null);
        setFloatField(term105054, term105054.getClass(), "loadFactor", 0.75F);
        setIntField(term105054, term105054.getClass(), "size", 3);
        setField(term105057, term105057.getClass(), "next", null);
        setField(term105057, term105057.getClass(), "key", term105053);
        setField(term105057, term105057.getClass(), "value", null);
        setField(term105056, term105056.getClass(), "next", term105057);
        setIntField(term105058, term105058.getClass(), "size", 3);
        setIntField(term105058, term105058.getClass(), "hash1", 0);
        setIntField(term105058, term105058.getClass(), "hash2", 0);
        setIntField(term105058, term105058.getClass(), "hash3", 0);
        setField(term105058, term105058.getClass(), "key1", null);
        setField(term105058, term105058.getClass(), "key2", null);
        setField(term105058, term105058.getClass(), "key3", null);
        setField(term105058, term105058.getClass(), "value1", null);
        setField(term105058, term105058.getClass(), "value2", null);
        setField(term105058, term105058.getClass(), "value3", null);
        setField(term105058, term105058.getClass(), "delegateMap", null);
        setField(term105056, term105056.getClass(), "key", term105058);
        setField(term105056, term105056.getClass(), "value", null);
        setElement(term105055, 0, term105056);
        setField(term105059, term105059.getClass(), "next", null);
        setField(term105059, term105059.getClass(), "key", term105060);
        setField(term105059, term105059.getClass(), "value", null);
        setElement(term105055, 5, term105059);
        setField(term105054, term105054.getClass(), "data", term105055);
        setIntField(term105054, term105054.getClass(), "threshold", 12);
        setIntField(term105054, term105054.getClass(), "modCount", 3);
        setField(term105054, term105054.getClass(), "entrySet", null);
        setField(term105054, term105054.getClass(), "keySet", null);
        setField(term105054, term105054.getClass(), "values", null);
        setField(term105054, term105054.getClass(), "keySet", null);
        setField(term105054, term105054.getClass(), "values", null);
        setField(term105053, term105053.getClass(), "delegateMap", term105054);
        term105061 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term105061, term105061.getClass(), "size", 3);
        setIntField(term105061, term105061.getClass(), "hash1", 0);
        setIntField(term105061, term105061.getClass(), "hash2", 0);
        setIntField(term105061, term105061.getClass(), "hash3", 0);
        setField(term105061, term105061.getClass(), "key1", null);
        setField(term105061, term105061.getClass(), "key2", null);
        setField(term105061, term105061.getClass(), "key3", null);
        setField(term105061, term105061.getClass(), "value1", null);
        setField(term105061, term105061.getClass(), "value2", null);
        setField(term105061, term105061.getClass(), "value3", null);
        setField(term105061, term105061.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term103864;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term103772, args);
        assertTrue(recursiveEquals(term103772, term105053));
        assertTrue(recursiveEquals(term103864, term105061));
        assertTrue(recursiveEquals(retValue, null));
    }

};


