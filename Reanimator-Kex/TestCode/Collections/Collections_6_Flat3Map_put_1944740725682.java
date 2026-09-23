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

public class Flat3Map_put_1944740725682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157703;
     Object term157979;
     Object term158617;
     Object term158625;

    public Flat3Map_put_1944740725682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157703 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term157795 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term157887 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term157703, term157703.getClass(), "delegateMap", null);
        setIntField(term157703, term157703.getClass(), "size", 3);
        setIntField(term157703, term157703.getClass(), "hash3", 0);
        setField(term157795, term157795.getClass(), "delegateMap", null);
        setIntField(term157795, term157795.getClass(), "size", 3);
        setField(term157795, term157795.getClass(), "key3", term157887);
        setField(term157795, term157795.getClass(), "key2", null);
        setField(term157795, term157795.getClass(), "value2", null);
        setIntField(term157795, term157795.getClass(), "hash3", -1);
        setIntField(term157795, term157795.getClass(), "hash2", -1);
        setIntField(term157795, term157795.getClass(), "hash1", -1);
        setField(term157703, term157703.getClass(), "key3", term157795);
        setIntField(term157703, term157703.getClass(), "hash2", -1);
        term157979 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term158019 = newInstance(Class.forName("java.io.Console$1"));
        setField(term157979, term157979.getClass(), "delegateMap", null);
        setIntField(term157979, term157979.getClass(), "size", 3);
        setIntField(term157979, term157979.getClass(), "hash3", 0);
        setField(term157979, term157979.getClass(), "value3", null);
        setIntField(term157979, term157979.getClass(), "hash2", 0);
        setField(term157979, term157979.getClass(), "value2", null);
        setIntField(term157979, term157979.getClass(), "hash1", 0);
        setField(term157979, term157979.getClass(), "value1", null);
        setField(term157979, term157979.getClass(), "key3", null);
        setField(term157979, term157979.getClass(), "key2", term158019);
        term158617 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term158618 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term158619 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term158620 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term158621 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term158622 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term158623 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term158624 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term158617, term158617.getClass(), "size", 0);
        setIntField(term158617, term158617.getClass(), "hash1", 0);
        setIntField(term158617, term158617.getClass(), "hash2", 0);
        setIntField(term158617, term158617.getClass(), "hash3", 0);
        setField(term158617, term158617.getClass(), "key1", null);
        setField(term158617, term158617.getClass(), "key2", null);
        setField(term158617, term158617.getClass(), "key3", null);
        setField(term158617, term158617.getClass(), "value1", null);
        setField(term158617, term158617.getClass(), "value2", null);
        setField(term158617, term158617.getClass(), "value3", null);
        setFloatField(term158618, term158618.getClass(), "loadFactor", 0.75F);
        setIntField(term158618, term158618.getClass(), "size", 3);
        setField(term158620, term158620.getClass(), "next", null);
        setIntField(term158621, term158621.getClass(), "size", 3);
        setIntField(term158621, term158621.getClass(), "hash1", 0);
        setIntField(term158621, term158621.getClass(), "hash2", 0);
        setIntField(term158621, term158621.getClass(), "hash3", 0);
        setField(term158621, term158621.getClass(), "key1", null);
        setField(term158621, term158621.getClass(), "key2", null);
        setField(term158621, term158621.getClass(), "key3", null);
        setField(term158621, term158621.getClass(), "value1", null);
        setField(term158621, term158621.getClass(), "value2", null);
        setField(term158621, term158621.getClass(), "value3", null);
        setField(term158621, term158621.getClass(), "delegateMap", null);
        setField(term158620, term158620.getClass(), "key", term158621);
        setField(term158620, term158620.getClass(), "value", null);
        setElement(term158619, 0, term158620);
        setField(term158623, term158623.getClass(), "next", null);
        setField(term158623, term158623.getClass(), "key", null);
        setField(term158623, term158623.getClass(), "value", null);
        setField(term158622, term158622.getClass(), "next", term158623);
        setField(term158622, term158622.getClass(), "key", term158624);
        setField(term158622, term158622.getClass(), "value", null);
        setElement(term158619, 5, term158622);
        setField(term158618, term158618.getClass(), "data", term158619);
        setIntField(term158618, term158618.getClass(), "threshold", 12);
        setIntField(term158618, term158618.getClass(), "modCount", 3);
        setField(term158618, term158618.getClass(), "entrySet", null);
        setField(term158618, term158618.getClass(), "keySet", null);
        setField(term158618, term158618.getClass(), "values", null);
        setField(term158618, term158618.getClass(), "keySet", null);
        setField(term158618, term158618.getClass(), "values", null);
        setField(term158617, term158617.getClass(), "delegateMap", term158618);
        term158625 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term158625, term158625.getClass(), "size", 3);
        setIntField(term158625, term158625.getClass(), "hash1", 0);
        setIntField(term158625, term158625.getClass(), "hash2", 0);
        setIntField(term158625, term158625.getClass(), "hash3", 0);
        setField(term158625, term158625.getClass(), "key1", null);
        setField(term158625, term158625.getClass(), "key2", null);
        setField(term158625, term158625.getClass(), "key3", null);
        setField(term158625, term158625.getClass(), "value1", null);
        setField(term158625, term158625.getClass(), "value2", null);
        setField(term158625, term158625.getClass(), "value3", null);
        setField(term158625, term158625.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term157979;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term157703, args);
        assertTrue(recursiveEquals(term157703, term158617));
        assertTrue(recursiveEquals(term157979, term158625));
        assertTrue(recursiveEquals(retValue, null));
    }

};


