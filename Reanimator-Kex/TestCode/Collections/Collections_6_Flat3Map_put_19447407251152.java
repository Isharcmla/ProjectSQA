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

public class Flat3Map_put_19447407251152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351049;
     Object term351179;
     Object term352160;
     Object term352169;

    public Flat3Map_put_19447407251152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351049 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term351308 = newInstance(Class.forName("java.lang.Object"));
        setField(term351049, term351049.getClass(), "delegateMap", null);
        setIntField(term351049, term351049.getClass(), "size", 3);
        setIntField(term351049, term351049.getClass(), "hash3", -1);
        setField(term351049, term351049.getClass(), "key3", term351308);
        setIntField(term351049, term351049.getClass(), "hash2", -1);
        setField(term351049, term351049.getClass(), "key2", null);
        setIntField(term351049, term351049.getClass(), "hash1", 0);
        setField(term351049, term351049.getClass(), "key1", term351049);
        setField(term351049, term351049.getClass(), "value2", null);
        term351179 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term351289 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term351179, term351179.getClass(), "delegateMap", null);
        setIntField(term351179, term351179.getClass(), "size", 3);
        setIntField(term351179, term351179.getClass(), "hash3", 0);
        setField(term351179, term351179.getClass(), "value3", null);
        setIntField(term351179, term351179.getClass(), "hash2", 0);
        setIntField(term351289, term351289.getClass(), "size", 0);
        setField(term351179, term351179.getClass(), "value2", term351289);
        setIntField(term351179, term351179.getClass(), "hash1", 0);
        setField(term351179, term351179.getClass(), "value1", null);
        setField(term351179, term351179.getClass(), "key3", null);
        setField(term351179, term351179.getClass(), "key2", term351308);
        term352160 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term352161 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term352162 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term352163 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term352164 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term352165 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term352166 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term352167 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term352168 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term352160, term352160.getClass(), "size", 0);
        setIntField(term352160, term352160.getClass(), "hash1", 0);
        setIntField(term352160, term352160.getClass(), "hash2", 0);
        setIntField(term352160, term352160.getClass(), "hash3", 0);
        setField(term352160, term352160.getClass(), "key1", null);
        setField(term352160, term352160.getClass(), "key2", null);
        setField(term352160, term352160.getClass(), "key3", null);
        setField(term352160, term352160.getClass(), "value1", null);
        setField(term352160, term352160.getClass(), "value2", null);
        setField(term352160, term352160.getClass(), "value3", null);
        setFloatField(term352161, term352161.getClass(), "loadFactor", 0.75F);
        setIntField(term352161, term352161.getClass(), "size", 4);
        setField(term352163, term352163.getClass(), "next", null);
        setIntField(term352164, term352164.getClass(), "size", 3);
        setIntField(term352164, term352164.getClass(), "hash1", 0);
        setIntField(term352164, term352164.getClass(), "hash2", 0);
        setIntField(term352164, term352164.getClass(), "hash3", 0);
        setField(term352164, term352164.getClass(), "key1", null);
        setField(term352164, term352164.getClass(), "key2", null);
        setField(term352164, term352164.getClass(), "key3", null);
        setField(term352164, term352164.getClass(), "value1", null);
        setField(term352164, term352164.getClass(), "value2", null);
        setField(term352164, term352164.getClass(), "value3", null);
        setField(term352164, term352164.getClass(), "delegateMap", null);
        setField(term352163, term352163.getClass(), "key", term352164);
        setField(term352163, term352163.getClass(), "value", null);
        setElement(term352162, 0, term352163);
        setField(term352166, term352166.getClass(), "next", null);
        setField(term352166, term352166.getClass(), "key", null);
        setField(term352166, term352166.getClass(), "value", null);
        setField(term352165, term352165.getClass(), "next", term352166);
        setField(term352165, term352165.getClass(), "key", term352160);
        setField(term352165, term352165.getClass(), "value", null);
        setElement(term352162, 4, term352165);
        setField(term352167, term352167.getClass(), "next", null);
        setField(term352167, term352167.getClass(), "key", term352168);
        setField(term352167, term352167.getClass(), "value", null);
        setElement(term352162, 6, term352167);
        setField(term352161, term352161.getClass(), "data", term352162);
        setIntField(term352161, term352161.getClass(), "threshold", 12);
        setIntField(term352161, term352161.getClass(), "modCount", 4);
        setField(term352161, term352161.getClass(), "entrySet", null);
        setField(term352161, term352161.getClass(), "keySet", null);
        setField(term352161, term352161.getClass(), "values", null);
        setField(term352161, term352161.getClass(), "keySet", null);
        setField(term352161, term352161.getClass(), "values", null);
        setField(term352160, term352160.getClass(), "delegateMap", term352161);
        term352169 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term352169, term352169.getClass(), "size", 3);
        setIntField(term352169, term352169.getClass(), "hash1", 0);
        setIntField(term352169, term352169.getClass(), "hash2", 0);
        setIntField(term352169, term352169.getClass(), "hash3", 0);
        setField(term352169, term352169.getClass(), "key1", null);
        setField(term352169, term352169.getClass(), "key2", null);
        setField(term352169, term352169.getClass(), "key3", null);
        setField(term352169, term352169.getClass(), "value1", null);
        setField(term352169, term352169.getClass(), "value2", null);
        setField(term352169, term352169.getClass(), "value3", null);
        setField(term352169, term352169.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term351179;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term351049, args);
        assertTrue(recursiveEquals(term351049, term352160));
        assertTrue(recursiveEquals(term351179, term352169));
        assertTrue(recursiveEquals(retValue, null));
    }

};


