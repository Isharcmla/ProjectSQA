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

public class Flat3Map_put_1944740725362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61323;
     Object term61979;
     Object term61986;

    public Flat3Map_put_1944740725362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61323 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61359 = newInstance(Class.forName("java.lang.invoke.LambdaFormEditor"));
        setField(term61323, term61323.getClass(), "delegateMap", null);
        setIntField(term61323, term61323.getClass(), "size", 3);
        setIntField(term61323, term61323.getClass(), "hash3", 0);
        setField(term61323, term61323.getClass(), "value3", null);
        setIntField(term61323, term61323.getClass(), "hash2", 0);
        setField(term61323, term61323.getClass(), "value2", null);
        setIntField(term61323, term61323.getClass(), "hash1", 0);
        setField(term61323, term61323.getClass(), "value1", term61359);
        term61979 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61980 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term61981 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term61982 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term61983 = newInstance(Class.forName("java.lang.Object"));
        Object term61984 = newInstance(Class.forName("java.lang.invoke.LambdaFormEditor"));
        Object term61985 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term61979, term61979.getClass(), "size", 0);
        setIntField(term61979, term61979.getClass(), "hash1", 0);
        setIntField(term61979, term61979.getClass(), "hash2", 0);
        setIntField(term61979, term61979.getClass(), "hash3", 0);
        setField(term61979, term61979.getClass(), "key1", null);
        setField(term61979, term61979.getClass(), "key2", null);
        setField(term61979, term61979.getClass(), "key3", null);
        setField(term61979, term61979.getClass(), "value1", null);
        setField(term61979, term61979.getClass(), "value2", null);
        setField(term61979, term61979.getClass(), "value3", null);
        setFloatField(term61980, term61980.getClass(), "loadFactor", 0.75F);
        setIntField(term61980, term61980.getClass(), "size", 2);
        setField(term61982, term61982.getClass(), "next", null);
        setField(term61982, term61982.getClass(), "key", term61983);
        setField(term61984, term61984.getClass(), "lambdaForm", null);
        setField(term61982, term61982.getClass(), "value", term61984);
        setElement(term61981, 5, term61982);
        setField(term61985, term61985.getClass(), "next", null);
        setField(term61985, term61985.getClass(), "key", term61979);
        setField(term61985, term61985.getClass(), "value", null);
        setElement(term61981, 13, term61985);
        setField(term61980, term61980.getClass(), "data", term61981);
        setIntField(term61980, term61980.getClass(), "threshold", 12);
        setIntField(term61980, term61980.getClass(), "modCount", 2);
        setField(term61980, term61980.getClass(), "entrySet", null);
        setField(term61980, term61980.getClass(), "keySet", null);
        setField(term61980, term61980.getClass(), "values", null);
        setField(term61980, term61980.getClass(), "keySet", null);
        setField(term61980, term61980.getClass(), "values", null);
        setField(term61979, term61979.getClass(), "delegateMap", term61980);
        term61986 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term61987 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term61988 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term61989 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term61990 = newInstance(Class.forName("java.lang.Object"));
        Object term61991 = newInstance(Class.forName("java.lang.invoke.LambdaFormEditor"));
        Object term61992 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term61986, term61986.getClass(), "size", 0);
        setIntField(term61986, term61986.getClass(), "hash1", 0);
        setIntField(term61986, term61986.getClass(), "hash2", 0);
        setIntField(term61986, term61986.getClass(), "hash3", 0);
        setField(term61986, term61986.getClass(), "key1", null);
        setField(term61986, term61986.getClass(), "key2", null);
        setField(term61986, term61986.getClass(), "key3", null);
        setField(term61986, term61986.getClass(), "value1", null);
        setField(term61986, term61986.getClass(), "value2", null);
        setField(term61986, term61986.getClass(), "value3", null);
        setFloatField(term61987, term61987.getClass(), "loadFactor", 0.75F);
        setIntField(term61987, term61987.getClass(), "size", 2);
        setField(term61989, term61989.getClass(), "next", null);
        setField(term61989, term61989.getClass(), "key", term61990);
        setField(term61991, term61991.getClass(), "lambdaForm", null);
        setField(term61989, term61989.getClass(), "value", term61991);
        setElement(term61988, 5, term61989);
        setField(term61992, term61992.getClass(), "next", null);
        setField(term61992, term61992.getClass(), "key", term61986);
        setField(term61992, term61992.getClass(), "value", null);
        setElement(term61988, 13, term61992);
        setField(term61987, term61987.getClass(), "data", term61988);
        setIntField(term61987, term61987.getClass(), "threshold", 12);
        setIntField(term61987, term61987.getClass(), "modCount", 2);
        setField(term61987, term61987.getClass(), "entrySet", null);
        setField(term61987, term61987.getClass(), "keySet", null);
        setField(term61987, term61987.getClass(), "values", null);
        setField(term61987, term61987.getClass(), "keySet", null);
        setField(term61987, term61987.getClass(), "values", null);
        setField(term61986, term61986.getClass(), "delegateMap", term61987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term61323;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term61323, args);
        assertTrue(recursiveEquals(term61323, term61979));
        assertTrue(recursiveEquals(term61323, term61986));
        assertTrue(recursiveEquals(retValue, null));
    }

};


