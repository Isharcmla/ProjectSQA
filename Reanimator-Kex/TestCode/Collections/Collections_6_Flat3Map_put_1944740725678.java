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

public class Flat3Map_put_1944740725678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156111;
     Object term156553;
     Object term157393;
     Object term157404;

    public Flat3Map_put_1944740725678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156111 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term156203 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term156313 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object[] term155655 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object[] term155666 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term156423 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term156461 = newInstance(Class.forName("java.lang.Object"));
        setField(term156111, term156111.getClass(), "delegateMap", null);
        setIntField(term156111, term156111.getClass(), "size", 3);
        setIntField(term156111, term156111.getClass(), "hash3", 754843648);
        setField(term156203, term156203.getClass(), "delegateMap", null);
        setIntField(term156203, term156203.getClass(), "size", 3);
        setIntField(term156313, term156313.getClass(), "size", 0);
        setField(term156203, term156203.getClass(), "key3", term156313);
        setField(term156203, term156203.getClass(), "key2", null);
        setField(term156203, term156203.getClass(), "value2", null);
        setIntField(term156203, term156203.getClass(), "hash3", 14680064);
        setIntField(term156203, term156203.getClass(), "hash2", -1476001792);
        setIntField(term156203, term156203.getClass(), "hash1", 68357376);
        setField(term156203, term156203.getClass(), "key1", term155655);
        setField(term156203, term156203.getClass(), "value3", null);
        setField(term156203, term156203.getClass(), "value1", null);
        setField(term156111, term156111.getClass(), "key3", term156203);
        setIntField(term156111, term156111.getClass(), "hash2", 754843648);
        setField(term156111, term156111.getClass(), "key2", null);
        setIntField(term156111, term156111.getClass(), "hash1", 754843648);
        setField(term156111, term156111.getClass(), "key1", null);
        setField(term156111, term156111.getClass(), "value3", term155666);
        setField(term156111, term156111.getClass(), "value2", term156423);
        setField(term156111, term156111.getClass(), "value1", term156461);
        term156553 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term156645 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term156553, term156553.getClass(), "delegateMap", null);
        setIntField(term156553, term156553.getClass(), "size", 3);
        setIntField(term156553, term156553.getClass(), "hash3", -208928768);
        setField(term156553, term156553.getClass(), "value3", null);
        setIntField(term156553, term156553.getClass(), "hash2", 1176174592);
        setField(term156553, term156553.getClass(), "value2", null);
        setIntField(term156553, term156553.getClass(), "hash1", -212402176);
        setField(term156553, term156553.getClass(), "value1", null);
        setField(term156553, term156553.getClass(), "key3", null);
        setField(term156645, term156645.getClass(), "delegateMap", null);
        setIntField(term156645, term156645.getClass(), "size", 2);
        setIntField(term156645, term156645.getClass(), "hash2", 128);
        setField(term156645, term156645.getClass(), "value2", null);
        setIntField(term156645, term156645.getClass(), "hash1", 16);
        setField(term156645, term156645.getClass(), "value1", null);
        setField(term156553, term156553.getClass(), "key2", term156645);
        term157393 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term157394 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term157395 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term157396 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term157397 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term157398 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term157399 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term157400 = newInstance(Class.forName("java.lang.Object"));
        Object term157401 = newInstance(Class.forName("java.lang.Object"));
        Object term157402 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term157403 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term157393, term157393.getClass(), "size", 0);
        setIntField(term157393, term157393.getClass(), "hash1", 0);
        setIntField(term157393, term157393.getClass(), "hash2", 0);
        setIntField(term157393, term157393.getClass(), "hash3", 0);
        setField(term157393, term157393.getClass(), "key1", null);
        setField(term157393, term157393.getClass(), "key2", null);
        setField(term157393, term157393.getClass(), "key3", null);
        setField(term157393, term157393.getClass(), "value1", null);
        setField(term157393, term157393.getClass(), "value2", null);
        setField(term157393, term157393.getClass(), "value3", null);
        setFloatField(term157394, term157394.getClass(), "loadFactor", 0.75F);
        setIntField(term157394, term157394.getClass(), "size", 3);
        setField(term157396, term157396.getClass(), "next", null);
        setIntField(term157397, term157397.getClass(), "size", 3);
        setIntField(term157397, term157397.getClass(), "hash1", 68357376);
        setIntField(term157397, term157397.getClass(), "hash2", -1476001792);
        setIntField(term157397, term157397.getClass(), "hash3", 14680064);
        setField(term157397, term157397.getClass(), "key1", null);
        setField(term157397, term157397.getClass(), "key2", null);
        setField(term157397, term157397.getClass(), "key3", null);
        setField(term157397, term157397.getClass(), "value1", null);
        setField(term157397, term157397.getClass(), "value2", null);
        setField(term157397, term157397.getClass(), "value3", null);
        setField(term157397, term157397.getClass(), "delegateMap", null);
        setField(term157396, term157396.getClass(), "key", term157397);
        setField(term157396, term157396.getClass(), "value", term157398);
        setElement(term157395, 4, term157396);
        setField(term157399, term157399.getClass(), "next", null);
        setField(term157399, term157399.getClass(), "key", term157400);
        setField(term157399, term157399.getClass(), "value", term157401);
        setElement(term157395, 5, term157399);
        setField(term157402, term157402.getClass(), "next", null);
        setIntField(term157403, term157403.getClass(), "size", 3);
        setIntField(term157403, term157403.getClass(), "hash1", -212402176);
        setIntField(term157403, term157403.getClass(), "hash2", 1176174592);
        setIntField(term157403, term157403.getClass(), "hash3", -208928768);
        setField(term157403, term157403.getClass(), "key1", null);
        setField(term157403, term157403.getClass(), "key2", null);
        setField(term157403, term157403.getClass(), "key3", null);
        setField(term157403, term157403.getClass(), "value1", null);
        setField(term157403, term157403.getClass(), "value2", null);
        setField(term157403, term157403.getClass(), "value3", null);
        setField(term157403, term157403.getClass(), "delegateMap", null);
        setField(term157402, term157402.getClass(), "key", term157403);
        setField(term157402, term157402.getClass(), "value", null);
        setElement(term157395, 7, term157402);
        setField(term157394, term157394.getClass(), "data", term157395);
        setIntField(term157394, term157394.getClass(), "threshold", 12);
        setIntField(term157394, term157394.getClass(), "modCount", 3);
        setField(term157394, term157394.getClass(), "entrySet", null);
        setField(term157394, term157394.getClass(), "keySet", null);
        setField(term157394, term157394.getClass(), "values", null);
        setField(term157394, term157394.getClass(), "keySet", null);
        setField(term157394, term157394.getClass(), "values", null);
        setField(term157393, term157393.getClass(), "delegateMap", term157394);
        term157404 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term157404, term157404.getClass(), "size", 3);
        setIntField(term157404, term157404.getClass(), "hash1", -212402176);
        setIntField(term157404, term157404.getClass(), "hash2", 1176174592);
        setIntField(term157404, term157404.getClass(), "hash3", -208928768);
        setField(term157404, term157404.getClass(), "key1", null);
        setField(term157404, term157404.getClass(), "key2", null);
        setField(term157404, term157404.getClass(), "key3", null);
        setField(term157404, term157404.getClass(), "value1", null);
        setField(term157404, term157404.getClass(), "value2", null);
        setField(term157404, term157404.getClass(), "value3", null);
        setField(term157404, term157404.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term156553;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term156111, args);
        assertTrue(recursiveEquals(term156111, term157393));
        assertTrue(recursiveEquals(term156553, term157404));
        assertTrue(recursiveEquals(retValue, null));
    }

};


