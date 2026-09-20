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

public class Flat3Map_put_1944740725926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185872;
     Object term185964;
     Object term186490;
     Object term186496;

    public Flat3Map_put_1944740725926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185872 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term185872, term185872.getClass(), "delegateMap", null);
        setIntField(term185872, term185872.getClass(), "size", 3);
        setIntField(term185872, term185872.getClass(), "hash3", 0);
        setField(term185872, term185872.getClass(), "key3", null);
        setIntField(term185872, term185872.getClass(), "hash2", -1);
        term185964 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term185964, term185964.getClass(), "delegateMap", null);
        setIntField(term185964, term185964.getClass(), "size", 3);
        setIntField(term185964, term185964.getClass(), "hash3", 0);
        setField(term185964, term185964.getClass(), "value3", null);
        setIntField(term185964, term185964.getClass(), "hash2", 0);
        setField(term185964, term185964.getClass(), "value2", null);
        setIntField(term185964, term185964.getClass(), "hash1", 0);
        setField(term185964, term185964.getClass(), "value1", null);
        term186490 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term186491 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term186492 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term186493 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term186494 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term186495 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term186490, term186490.getClass(), "size", 0);
        setIntField(term186490, term186490.getClass(), "hash1", 0);
        setIntField(term186490, term186490.getClass(), "hash2", 0);
        setIntField(term186490, term186490.getClass(), "hash3", 0);
        setField(term186490, term186490.getClass(), "key1", null);
        setField(term186490, term186490.getClass(), "key2", null);
        setField(term186490, term186490.getClass(), "key3", null);
        setField(term186490, term186490.getClass(), "value1", null);
        setField(term186490, term186490.getClass(), "value2", null);
        setField(term186490, term186490.getClass(), "value3", null);
        setFloatField(term186491, term186491.getClass(), "loadFactor", 0.75F);
        setIntField(term186491, term186491.getClass(), "size", 2);
        setField(term186494, term186494.getClass(), "next", null);
        setField(term186494, term186494.getClass(), "key", null);
        setField(term186494, term186494.getClass(), "value", null);
        setField(term186493, term186493.getClass(), "next", term186494);
        setIntField(term186495, term186495.getClass(), "size", 3);
        setIntField(term186495, term186495.getClass(), "hash1", 0);
        setIntField(term186495, term186495.getClass(), "hash2", 0);
        setIntField(term186495, term186495.getClass(), "hash3", 0);
        setField(term186495, term186495.getClass(), "key1", null);
        setField(term186495, term186495.getClass(), "key2", null);
        setField(term186495, term186495.getClass(), "key3", null);
        setField(term186495, term186495.getClass(), "value1", null);
        setField(term186495, term186495.getClass(), "value2", null);
        setField(term186495, term186495.getClass(), "value3", null);
        setField(term186495, term186495.getClass(), "delegateMap", null);
        setField(term186493, term186493.getClass(), "key", term186495);
        setField(term186493, term186493.getClass(), "value", null);
        setElement(term186492, 0, term186493);
        setField(term186491, term186491.getClass(), "data", term186492);
        setIntField(term186491, term186491.getClass(), "threshold", 12);
        setIntField(term186491, term186491.getClass(), "modCount", 2);
        setField(term186491, term186491.getClass(), "entrySet", null);
        setField(term186491, term186491.getClass(), "keySet", null);
        setField(term186491, term186491.getClass(), "values", null);
        setField(term186491, term186491.getClass(), "keySet", null);
        setField(term186491, term186491.getClass(), "values", null);
        setField(term186490, term186490.getClass(), "delegateMap", term186491);
        term186496 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term186496, term186496.getClass(), "size", 3);
        setIntField(term186496, term186496.getClass(), "hash1", 0);
        setIntField(term186496, term186496.getClass(), "hash2", 0);
        setIntField(term186496, term186496.getClass(), "hash3", 0);
        setField(term186496, term186496.getClass(), "key1", null);
        setField(term186496, term186496.getClass(), "key2", null);
        setField(term186496, term186496.getClass(), "key3", null);
        setField(term186496, term186496.getClass(), "value1", null);
        setField(term186496, term186496.getClass(), "value2", null);
        setField(term186496, term186496.getClass(), "value3", null);
        setField(term186496, term186496.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term185964;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term185872, args);
        assertTrue(recursiveEquals(term185872, term186490));
        assertTrue(recursiveEquals(term185964, term186496));
        assertTrue(recursiveEquals(retValue, null));
    }

};
