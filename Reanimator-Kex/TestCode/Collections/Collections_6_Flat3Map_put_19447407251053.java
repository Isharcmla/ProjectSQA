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

public class Flat3Map_put_19447407251053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302859;
     Object term303215;
     Object term304201;
     Object term304211;

    public Flat3Map_put_19447407251053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302859 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term303261 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term303307 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term303123 = newInstance(Class.forName("java.util.stream.ReduceOps$ReduceTask"));
        setField(term302859, term302859.getClass(), "delegateMap", null);
        setIntField(term302859, term302859.getClass(), "size", 3);
        setIntField(term302859, term302859.getClass(), "hash3", 0);
        setField(term303261, term303261.getClass(), "delegateMap", null);
        setIntField(term303261, term303261.getClass(), "size", 0);
        setField(term303307, term303307.getClass(), "delegateMap", null);
        setIntField(term303307, term303307.getClass(), "size", 0);
        setField(term303261, term303261.getClass(), "key3", term303307);
        setField(term303261, term303261.getClass(), "key2", null);
        setField(term303261, term303261.getClass(), "value2", null);
        setIntField(term303261, term303261.getClass(), "hash3", 0);
        setField(term303261, term303261.getClass(), "value3", null);
        setIntField(term303261, term303261.getClass(), "hash2", 0);
        setIntField(term303261, term303261.getClass(), "hash1", 0);
        setField(term302859, term302859.getClass(), "key3", term303261);
        setIntField(term302859, term302859.getClass(), "hash2", 0);
        setField(term302859, term302859.getClass(), "key2", term303123);
        setIntField(term302859, term302859.getClass(), "hash1", -1);
        term303215 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term303387 = newInstance(Class.forName("java.util.stream.ReduceOps$ReduceTask"));
        setField(term303215, term303215.getClass(), "delegateMap", null);
        setIntField(term303215, term303215.getClass(), "size", 3);
        setIntField(term303215, term303215.getClass(), "hash3", 0);
        setField(term303215, term303215.getClass(), "value3", null);
        setIntField(term303215, term303215.getClass(), "hash2", 0);
        setField(term303215, term303215.getClass(), "value2", null);
        setIntField(term303215, term303215.getClass(), "hash1", 0);
        setField(term303215, term303215.getClass(), "value1", null);
        setField(term303215, term303215.getClass(), "key3", null);
        setField(term303215, term303215.getClass(), "key2", term303261);
        setField(term303215, term303215.getClass(), "key1", term303387);
        term304201 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term304202 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term304203 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term304204 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term304205 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term304206 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term304207 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term304208 = newInstance(Class.forName("java.lang.Object"));
        Object term304209 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term304210 = newInstance(Class.forName("java.util.stream.ReduceOps$ReduceTask"));
        setIntField(term304201, term304201.getClass(), "size", 0);
        setIntField(term304201, term304201.getClass(), "hash1", 0);
        setIntField(term304201, term304201.getClass(), "hash2", 0);
        setIntField(term304201, term304201.getClass(), "hash3", 0);
        setField(term304201, term304201.getClass(), "key1", null);
        setField(term304201, term304201.getClass(), "key2", null);
        setField(term304201, term304201.getClass(), "key3", null);
        setField(term304201, term304201.getClass(), "value1", null);
        setField(term304201, term304201.getClass(), "value2", null);
        setField(term304201, term304201.getClass(), "value3", null);
        setFloatField(term304202, term304202.getClass(), "loadFactor", 0.75F);
        setIntField(term304202, term304202.getClass(), "size", 4);
        setField(term304205, term304205.getClass(), "next", null);
        setField(term304205, term304205.getClass(), "key", null);
        setField(term304205, term304205.getClass(), "value", null);
        setField(term304204, term304204.getClass(), "next", term304205);
        setIntField(term304206, term304206.getClass(), "size", 3);
        setIntField(term304206, term304206.getClass(), "hash1", 0);
        setIntField(term304206, term304206.getClass(), "hash2", 0);
        setIntField(term304206, term304206.getClass(), "hash3", 0);
        setField(term304206, term304206.getClass(), "key1", null);
        setField(term304206, term304206.getClass(), "key2", null);
        setField(term304206, term304206.getClass(), "key3", null);
        setField(term304206, term304206.getClass(), "value1", null);
        setField(term304206, term304206.getClass(), "value2", null);
        setField(term304206, term304206.getClass(), "value3", null);
        setField(term304206, term304206.getClass(), "delegateMap", null);
        setField(term304204, term304204.getClass(), "key", term304206);
        setField(term304204, term304204.getClass(), "value", null);
        setElement(term304203, 0, term304204);
        setField(term304207, term304207.getClass(), "next", null);
        setField(term304207, term304207.getClass(), "key", term304208);
        setField(term304207, term304207.getClass(), "value", null);
        setElement(term304203, 6, term304207);
        setField(term304209, term304209.getClass(), "next", null);
        setField(term304210, term304210.getClass(), "op", null);
        setField(term304210, term304210.getClass(), "helper", null);
        setField(term304210, term304210.getClass(), "spliterator", null);
        setLongField(term304210, term304210.getClass(), "targetSize", 0L);
        setField(term304210, term304210.getClass(), "leftChild", null);
        setField(term304210, term304210.getClass(), "rightChild", null);
        setField(term304210, term304210.getClass(), "localResult", null);
        setField(term304210, term304210.getClass(), "completer", null);
        setIntField(term304210, term304210.getClass(), "pending", 0);
        setIntField(term304210, term304210.getClass(), "status", 0);
        setField(term304209, term304209.getClass(), "key", term304210);
        setField(term304209, term304209.getClass(), "value", null);
        setElement(term304203, 7, term304209);
        setField(term304202, term304202.getClass(), "data", term304203);
        setIntField(term304202, term304202.getClass(), "threshold", 12);
        setIntField(term304202, term304202.getClass(), "modCount", 4);
        setField(term304202, term304202.getClass(), "entrySet", null);
        setField(term304202, term304202.getClass(), "keySet", null);
        setField(term304202, term304202.getClass(), "values", null);
        setField(term304202, term304202.getClass(), "keySet", null);
        setField(term304202, term304202.getClass(), "values", null);
        setField(term304201, term304201.getClass(), "delegateMap", term304202);
        term304211 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term304211, term304211.getClass(), "size", 3);
        setIntField(term304211, term304211.getClass(), "hash1", 0);
        setIntField(term304211, term304211.getClass(), "hash2", 0);
        setIntField(term304211, term304211.getClass(), "hash3", 0);
        setField(term304211, term304211.getClass(), "key1", null);
        setField(term304211, term304211.getClass(), "key2", null);
        setField(term304211, term304211.getClass(), "key3", null);
        setField(term304211, term304211.getClass(), "value1", null);
        setField(term304211, term304211.getClass(), "value2", null);
        setField(term304211, term304211.getClass(), "value3", null);
        setField(term304211, term304211.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term303215;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term302859, args);
        assertTrue(recursiveEquals(term302859, term304201));
        assertTrue(recursiveEquals(term303215, term304211));
        assertTrue(recursiveEquals(retValue, null));
    }

};


