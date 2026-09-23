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

public class Flat3Map_put_1944740725245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39941;
     Object term41040;
     Object term41047;

    public Flat3Map_put_1944740725245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39941 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term39987 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term39941, term39941.getClass(), "delegateMap", null);
        setIntField(term39941, term39941.getClass(), "size", 3);
        setIntField(term39941, term39941.getClass(), "hash3", 0);
        setField(term39941, term39941.getClass(), "value3", null);
        setIntField(term39941, term39941.getClass(), "hash2", 0);
        setField(term39941, term39941.getClass(), "value2", null);
        setIntField(term39941, term39941.getClass(), "hash1", 0);
        setField(term39941, term39941.getClass(), "value1", null);
        setField(term39941, term39941.getClass(), "key3", term39987);
        term41040 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term41041 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term41042 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term41043 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term41044 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term41045 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term41046 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term41040, term41040.getClass(), "size", 0);
        setIntField(term41040, term41040.getClass(), "hash1", 0);
        setIntField(term41040, term41040.getClass(), "hash2", 0);
        setIntField(term41040, term41040.getClass(), "hash3", 0);
        setField(term41040, term41040.getClass(), "key1", null);
        setField(term41040, term41040.getClass(), "key2", null);
        setField(term41040, term41040.getClass(), "key3", null);
        setField(term41040, term41040.getClass(), "value1", null);
        setField(term41040, term41040.getClass(), "value2", null);
        setField(term41040, term41040.getClass(), "value3", null);
        setFloatField(term41041, term41041.getClass(), "loadFactor", 0.75F);
        setIntField(term41041, term41041.getClass(), "size", 3);
        setField(term41044, term41044.getClass(), "next", null);
        setField(term41044, term41044.getClass(), "key", null);
        setField(term41044, term41044.getClass(), "value", null);
        setField(term41043, term41043.getClass(), "next", term41044);
        setField(term41043, term41043.getClass(), "key", term41040);
        setField(term41043, term41043.getClass(), "value", null);
        setElement(term41042, 0, term41043);
        setField(term41045, term41045.getClass(), "next", null);
        setField(term41045, term41045.getClass(), "key", term41046);
        setField(term41045, term41045.getClass(), "value", null);
        setElement(term41042, 5, term41045);
        setField(term41041, term41041.getClass(), "data", term41042);
        setIntField(term41041, term41041.getClass(), "threshold", 12);
        setIntField(term41041, term41041.getClass(), "modCount", 3);
        setField(term41041, term41041.getClass(), "entrySet", null);
        setField(term41041, term41041.getClass(), "keySet", null);
        setField(term41041, term41041.getClass(), "values", null);
        setField(term41041, term41041.getClass(), "keySet", null);
        setField(term41041, term41041.getClass(), "values", null);
        setField(term41040, term41040.getClass(), "delegateMap", term41041);
        term41047 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term41048 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term41049 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term41050 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term41051 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term41052 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term41053 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term41047, term41047.getClass(), "size", 0);
        setIntField(term41047, term41047.getClass(), "hash1", 0);
        setIntField(term41047, term41047.getClass(), "hash2", 0);
        setIntField(term41047, term41047.getClass(), "hash3", 0);
        setField(term41047, term41047.getClass(), "key1", null);
        setField(term41047, term41047.getClass(), "key2", null);
        setField(term41047, term41047.getClass(), "key3", null);
        setField(term41047, term41047.getClass(), "value1", null);
        setField(term41047, term41047.getClass(), "value2", null);
        setField(term41047, term41047.getClass(), "value3", null);
        setFloatField(term41048, term41048.getClass(), "loadFactor", 0.75F);
        setIntField(term41048, term41048.getClass(), "size", 3);
        setField(term41051, term41051.getClass(), "next", null);
        setField(term41051, term41051.getClass(), "key", null);
        setField(term41051, term41051.getClass(), "value", null);
        setField(term41050, term41050.getClass(), "next", term41051);
        setField(term41050, term41050.getClass(), "key", term41047);
        setField(term41050, term41050.getClass(), "value", null);
        setElement(term41049, 0, term41050);
        setField(term41052, term41052.getClass(), "next", null);
        setField(term41052, term41052.getClass(), "key", term41053);
        setField(term41052, term41052.getClass(), "value", null);
        setElement(term41049, 5, term41052);
        setField(term41048, term41048.getClass(), "data", term41049);
        setIntField(term41048, term41048.getClass(), "threshold", 12);
        setIntField(term41048, term41048.getClass(), "modCount", 3);
        setField(term41048, term41048.getClass(), "entrySet", null);
        setField(term41048, term41048.getClass(), "keySet", null);
        setField(term41048, term41048.getClass(), "values", null);
        setField(term41048, term41048.getClass(), "keySet", null);
        setField(term41048, term41048.getClass(), "values", null);
        setField(term41047, term41047.getClass(), "delegateMap", term41048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term39941;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term39941, args);
        assertTrue(recursiveEquals(term39941, term41040));
        assertTrue(recursiveEquals(term39941, term41047));
        assertTrue(recursiveEquals(retValue, null));
    }

};


