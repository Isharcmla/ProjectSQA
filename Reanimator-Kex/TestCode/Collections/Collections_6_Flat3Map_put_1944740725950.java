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

public class Flat3Map_put_1944740725950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260378;
     Object term261118;
     Object term262734;

    public Flat3Map_put_1944740725950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260378 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term260470 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term260564 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term259874 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term260694 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term260786 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term260896 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        Object term261026 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term260378, term260378.getClass(), "delegateMap", null);
        setIntField(term260378, term260378.getClass(), "size", 3);
        setIntField(term260378, term260378.getClass(), "hash3", 1056931840);
        setField(term260378, term260378.getClass(), "key3", null);
        setIntField(term260378, term260378.getClass(), "hash2", 1056931840);
        setField(term260378, term260378.getClass(), "key2", null);
        setIntField(term260378, term260378.getClass(), "hash1", 1056931840);
        setIntField(term260564, term260564.getClass(), "size", 32768);
        setField(term260694, term260694.getClass(), "next", null);
        setField(term260786, term260786.getClass(), "delegateMap", term260896);
        setField(term260694, term260694.getClass(), "key", term260786);
        setField(term260694, term260694.getClass(), "value", null);
        setElement(term259874, 6, term260694);
        setField(term260564, term260564.getClass(), "data", term259874);
        setIntField(term260564, term260564.getClass(), "modCount", 0);
        setField(term260470, term260470.getClass(), "delegateMap", term260564);
        setIntField(term260470, term260470.getClass(), "size", 3);
        setField(term260470, term260470.getClass(), "key3", null);
        setField(term260470, term260470.getClass(), "value3", null);
        setField(term260378, term260378.getClass(), "key1", term260470);
        setField(term260378, term260378.getClass(), "value3", term261026);
        setField(term260378, term260378.getClass(), "value2", null);
        setField(term260378, term260378.getClass(), "value1", null);
        term261118 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term261212 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term261118, term261118.getClass(), "delegateMap", null);
        setIntField(term261118, term261118.getClass(), "size", 3);
        setIntField(term261118, term261118.getClass(), "hash3", 1115635264);
        setField(term261118, term261118.getClass(), "value3", null);
        setIntField(term261118, term261118.getClass(), "hash2", 2021654937);
        setIntField(term261212, term261212.getClass(), "size", 0);
        setField(term261118, term261118.getClass(), "value2", term261212);
        setIntField(term261118, term261118.getClass(), "hash1", -2080358361);
        setField(term261118, term261118.getClass(), "value1", null);
        setField(term261118, term261118.getClass(), "key3", null);
        setField(term261118, term261118.getClass(), "key2", null);
        term262734 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term262734, term262734.getClass(), "size", 3);
        setIntField(term262734, term262734.getClass(), "hash1", -2080358361);
        setIntField(term262734, term262734.getClass(), "hash2", 2021654937);
        setIntField(term262734, term262734.getClass(), "hash3", 1115635264);
        setField(term262734, term262734.getClass(), "key1", null);
        setField(term262734, term262734.getClass(), "key2", null);
        setField(term262734, term262734.getClass(), "key3", null);
        setField(term262734, term262734.getClass(), "value1", null);
        setField(term262734, term262734.getClass(), "value2", null);
        setField(term262734, term262734.getClass(), "value3", null);
        setField(term262734, term262734.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term261118;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term260378, args);
        assertTrue(recursiveEquals(term261118, term262734));
        assertTrue(recursiveEquals(retValue, null));
    }

};


