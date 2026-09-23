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

public class Flat3Map_put_1944740725903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239453;
     Object term239826;
     Object term239833;

    public Flat3Map_put_1944740725903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239453 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term239508 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term239554 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term239619 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term239453, term239453.getClass(), "delegateMap", null);
        setIntField(term239453, term239453.getClass(), "size", 3);
        setIntField(term239453, term239453.getClass(), "hash3", -1180979584);
        setField(term239453, term239453.getClass(), "value3", term239508);
        setIntField(term239453, term239453.getClass(), "hash2", -1180979584);
        setField(term239453, term239453.getClass(), "value2", term239554);
        setIntField(term239453, term239453.getClass(), "hash1", -1180979584);
        setField(term239453, term239453.getClass(), "value1", term239619);
        setField(term239453, term239453.getClass(), "key3", null);
        setField(term239453, term239453.getClass(), "key2", null);
        setField(term239453, term239453.getClass(), "key1", null);
        term239826 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term239827 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term239828 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term239829 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term239830 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term239831 = newInstance(Class.forName("java.lang.Object"));
        Object term239832 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term239826, term239826.getClass(), "size", -8130816);
        setIntField(term239826, term239826.getClass(), "hash1", 0);
        setIntField(term239826, term239826.getClass(), "hash2", 0);
        setIntField(term239826, term239826.getClass(), "hash3", 0);
        setField(term239826, term239826.getClass(), "key1", null);
        setField(term239826, term239826.getClass(), "key2", null);
        setField(term239826, term239826.getClass(), "key3", null);
        setField(term239826, term239826.getClass(), "value1", null);
        setField(term239826, term239826.getClass(), "value2", null);
        setField(term239826, term239826.getClass(), "value3", null);
        setFloatField(term239827, term239827.getClass(), "loadFactor", 0.75F);
        setIntField(term239827, term239827.getClass(), "size", 2);
        setField(term239829, term239829.getClass(), "next", null);
        setField(term239829, term239829.getClass(), "key", term239826);
        setField(term239829, term239829.getClass(), "value", null);
        setElement(term239828, 0, term239829);
        setField(term239830, term239830.getClass(), "next", null);
        setField(term239830, term239830.getClass(), "key", term239831);
        setField(term239832, term239832.getClass(), "next", null);
        setField(term239832, term239832.getClass(), "key", null);
        setField(term239832, term239832.getClass(), "value", null);
        setField(term239830, term239830.getClass(), "value", term239832);
        setElement(term239828, 6, term239830);
        setField(term239827, term239827.getClass(), "data", term239828);
        setIntField(term239827, term239827.getClass(), "threshold", 12);
        setIntField(term239827, term239827.getClass(), "modCount", 2);
        setField(term239827, term239827.getClass(), "entrySet", null);
        setField(term239827, term239827.getClass(), "keySet", null);
        setField(term239827, term239827.getClass(), "values", null);
        setField(term239827, term239827.getClass(), "keySet", null);
        setField(term239827, term239827.getClass(), "values", null);
        setField(term239826, term239826.getClass(), "delegateMap", term239827);
        term239833 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term239834 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term239835 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term239836 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term239837 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term239838 = newInstance(Class.forName("java.lang.Object"));
        Object term239839 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term239833, term239833.getClass(), "size", -8130816);
        setIntField(term239833, term239833.getClass(), "hash1", 0);
        setIntField(term239833, term239833.getClass(), "hash2", 0);
        setIntField(term239833, term239833.getClass(), "hash3", 0);
        setField(term239833, term239833.getClass(), "key1", null);
        setField(term239833, term239833.getClass(), "key2", null);
        setField(term239833, term239833.getClass(), "key3", null);
        setField(term239833, term239833.getClass(), "value1", null);
        setField(term239833, term239833.getClass(), "value2", null);
        setField(term239833, term239833.getClass(), "value3", null);
        setFloatField(term239834, term239834.getClass(), "loadFactor", 0.75F);
        setIntField(term239834, term239834.getClass(), "size", 2);
        setField(term239836, term239836.getClass(), "next", null);
        setField(term239836, term239836.getClass(), "key", term239833);
        setField(term239836, term239836.getClass(), "value", null);
        setElement(term239835, 0, term239836);
        setField(term239837, term239837.getClass(), "next", null);
        setField(term239837, term239837.getClass(), "key", term239838);
        setField(term239839, term239839.getClass(), "next", null);
        setField(term239839, term239839.getClass(), "key", null);
        setField(term239839, term239839.getClass(), "value", null);
        setField(term239837, term239837.getClass(), "value", term239839);
        setElement(term239835, 6, term239837);
        setField(term239834, term239834.getClass(), "data", term239835);
        setIntField(term239834, term239834.getClass(), "threshold", 12);
        setIntField(term239834, term239834.getClass(), "modCount", 2);
        setField(term239834, term239834.getClass(), "entrySet", null);
        setField(term239834, term239834.getClass(), "keySet", null);
        setField(term239834, term239834.getClass(), "values", null);
        setField(term239834, term239834.getClass(), "keySet", null);
        setField(term239834, term239834.getClass(), "values", null);
        setField(term239833, term239833.getClass(), "delegateMap", term239834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term239453;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term239453, args);
        assertTrue(recursiveEquals(term239453, term239826));
        assertTrue(recursiveEquals(term239453, term239833));
        assertTrue(recursiveEquals(retValue, null));
    }

};


