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
import java.lang.Object;

public class Flat3Map_put_1944740725946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259083;
     Object term259727;

    public Flat3Map_put_1944740725946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259083 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term259175 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term259269 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term258573 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term259399 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term259491 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term259635 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$EntrySetIterator"));
        setField(term259083, term259083.getClass(), "delegateMap", null);
        setIntField(term259083, term259083.getClass(), "size", 3);
        setIntField(term259083, term259083.getClass(), "hash3", 1823021328);
        setField(term259083, term259083.getClass(), "key3", null);
        setIntField(term259083, term259083.getClass(), "hash2", 1823021328);
        setIntField(term259269, term259269.getClass(), "size", 32);
        setField(term259399, term259399.getClass(), "next", null);
        setField(term259491, term259491.getClass(), "delegateMap", null);
        setField(term259399, term259399.getClass(), "key", term259491);
        setField(term259399, term259399.getClass(), "value", null);
        setElement(term258573, 6, term259399);
        setField(term259269, term259269.getClass(), "data", term258573);
        setIntField(term259269, term259269.getClass(), "modCount", 0);
        setField(term259175, term259175.getClass(), "delegateMap", term259269);
        setIntField(term259175, term259175.getClass(), "size", 3);
        setField(term259175, term259175.getClass(), "key3", null);
        setField(term259175, term259175.getClass(), "value3", null);
        setField(term259083, term259083.getClass(), "key2", term259175);
        setIntField(term259083, term259083.getClass(), "hash1", 1823021328);
        setField(term259083, term259083.getClass(), "key1", null);
        setField(term259083, term259083.getClass(), "value3", null);
        setField(term259083, term259083.getClass(), "value2", term259635);
        setField(term259083, term259083.getClass(), "value1", null);
        term259727 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term259837 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term259727, term259727.getClass(), "delegateMap", null);
        setIntField(term259727, term259727.getClass(), "size", 3);
        setIntField(term259727, term259727.getClass(), "hash3", 1211570176);
        setField(term259727, term259727.getClass(), "value3", null);
        setIntField(term259727, term259727.getClass(), "hash2", 74580224);
        setField(term259727, term259727.getClass(), "value2", null);
        setIntField(term259727, term259727.getClass(), "hash1", 536870928);
        setIntField(term259837, term259837.getClass(), "size", 0);
        setField(term259727, term259727.getClass(), "value1", term259837);
        setField(term259727, term259727.getClass(), "key3", null);
        setField(term259727, term259727.getClass(), "key2", null);
        setField(term259727, term259727.getClass(), "key1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term259727;
        args[1] = null;
        callMethod(klass, "put", argTypes, term259083, args);
    }

};


