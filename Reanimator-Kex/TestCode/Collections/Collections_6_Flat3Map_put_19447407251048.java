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
import java.util.HashMap;

public class Flat3Map_put_19447407251048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300886;
     Object term301212;
     Object term301981;
     Object term301991;

    public Flat3Map_put_19447407251048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term301120 = new HashMap();
        term300886 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term300978 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term301072 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term300515 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term300886, term300886.getClass(), "delegateMap", null);
        setIntField(term300886, term300886.getClass(), "size", 3);
        setIntField(term300886, term300886.getClass(), "hash3", -1906218942);
        setField(term300886, term300886.getClass(), "key3", null);
        setIntField(term300886, term300886.getClass(), "hash2", -1906218942);
        setField(term300886, term300886.getClass(), "key2", null);
        setIntField(term300886, term300886.getClass(), "hash1", -1906218942);
        setIntField(term301072, term301072.getClass(), "size", 0);
        setField(term300978, term300978.getClass(), "delegateMap", term301072);
        setField(term300886, term300886.getClass(), "key1", term300978);
        setField(term300886, term300886.getClass(), "value3", term301120);
        setField(term300886, term300886.getClass(), "value2", null);
        setField(term300886, term300886.getClass(), "value1", term300515);
        term301212 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term301322 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term301212, term301212.getClass(), "delegateMap", null);
        setIntField(term301212, term301212.getClass(), "size", 3);
        setIntField(term301212, term301212.getClass(), "hash3", 815556674);
        setField(term301212, term301212.getClass(), "value3", null);
        setIntField(term301212, term301212.getClass(), "hash2", -536576000);
        setField(term301212, term301212.getClass(), "value2", null);
        setIntField(term301212, term301212.getClass(), "hash1", 2109767680);
        setIntField(term301322, term301322.getClass(), "size", 0);
        setField(term301212, term301212.getClass(), "value1", term301322);
        term301981 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term301982 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term301983 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term301984 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term301985 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term301986 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term301987 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term301988 = newInstance(Class.forName("java.lang.Object"));
        Object term301989 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term301990 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term301981, term301981.getClass(), "size", 0);
        setIntField(term301981, term301981.getClass(), "hash1", 0);
        setIntField(term301981, term301981.getClass(), "hash2", 0);
        setIntField(term301981, term301981.getClass(), "hash3", 0);
        setField(term301981, term301981.getClass(), "key1", null);
        setField(term301981, term301981.getClass(), "key2", null);
        setField(term301981, term301981.getClass(), "key3", null);
        setField(term301981, term301981.getClass(), "value1", null);
        setField(term301981, term301981.getClass(), "value2", null);
        setField(term301981, term301981.getClass(), "value3", null);
        setFloatField(term301982, term301982.getClass(), "loadFactor", 0.75F);
        setIntField(term301982, term301982.getClass(), "size", 3);
        setField(term301984, term301984.getClass(), "next", null);
        setIntField(term301985, term301985.getClass(), "size", 0);
        setIntField(term301985, term301985.getClass(), "hash1", 0);
        setIntField(term301985, term301985.getClass(), "hash2", 0);
        setIntField(term301985, term301985.getClass(), "hash3", 0);
        setField(term301985, term301985.getClass(), "key1", null);
        setField(term301985, term301985.getClass(), "key2", null);
        setField(term301985, term301985.getClass(), "key3", null);
        setField(term301985, term301985.getClass(), "value1", null);
        setField(term301985, term301985.getClass(), "value2", null);
        setField(term301985, term301985.getClass(), "value3", null);
        setField(term301985, term301985.getClass(), "delegateMap", null);
        setField(term301984, term301984.getClass(), "key", term301985);
        setField(term301984, term301984.getClass(), "value", term301986);
        setElement(term301983, 0, term301984);
        setField(term301987, term301987.getClass(), "next", null);
        setField(term301987, term301987.getClass(), "key", term301988);
        setField(term301987, term301987.getClass(), "value", null);
        setElement(term301983, 6, term301987);
        setField(term301989, term301989.getClass(), "next", null);
        setIntField(term301990, term301990.getClass(), "size", 3);
        setIntField(term301990, term301990.getClass(), "hash1", 2109767680);
        setIntField(term301990, term301990.getClass(), "hash2", -536576000);
        setIntField(term301990, term301990.getClass(), "hash3", 815556674);
        setField(term301990, term301990.getClass(), "key1", null);
        setField(term301990, term301990.getClass(), "key2", null);
        setField(term301990, term301990.getClass(), "key3", null);
        setField(term301990, term301990.getClass(), "value1", null);
        setField(term301990, term301990.getClass(), "value2", null);
        setField(term301990, term301990.getClass(), "value3", null);
        setField(term301990, term301990.getClass(), "delegateMap", null);
        setField(term301989, term301989.getClass(), "key", term301990);
        setField(term301989, term301989.getClass(), "value", null);
        setElement(term301983, 8, term301989);
        setField(term301982, term301982.getClass(), "data", term301983);
        setIntField(term301982, term301982.getClass(), "threshold", 12);
        setIntField(term301982, term301982.getClass(), "modCount", 3);
        setField(term301982, term301982.getClass(), "entrySet", null);
        setField(term301982, term301982.getClass(), "keySet", null);
        setField(term301982, term301982.getClass(), "values", null);
        setField(term301982, term301982.getClass(), "keySet", null);
        setField(term301982, term301982.getClass(), "values", null);
        setField(term301981, term301981.getClass(), "delegateMap", term301982);
        term301991 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term301991, term301991.getClass(), "size", 3);
        setIntField(term301991, term301991.getClass(), "hash1", 2109767680);
        setIntField(term301991, term301991.getClass(), "hash2", -536576000);
        setIntField(term301991, term301991.getClass(), "hash3", 815556674);
        setField(term301991, term301991.getClass(), "key1", null);
        setField(term301991, term301991.getClass(), "key2", null);
        setField(term301991, term301991.getClass(), "key3", null);
        setField(term301991, term301991.getClass(), "value1", null);
        setField(term301991, term301991.getClass(), "value2", null);
        setField(term301991, term301991.getClass(), "value3", null);
        setField(term301991, term301991.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term301212;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term300886, args);
        assertTrue(recursiveEquals(term300886, term301981));
        assertTrue(recursiveEquals(term301212, term301991));
        assertTrue(recursiveEquals(retValue, null));
    }

};


