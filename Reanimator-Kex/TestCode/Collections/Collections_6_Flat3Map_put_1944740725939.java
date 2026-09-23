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

public class Flat3Map_put_1944740725939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253914;
     Object term254338;
     Object term254854;
     Object term254861;

    public Flat3Map_put_1944740725939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253914 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term254006 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term254116 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term254154 = newInstance(Class.forName("java.lang.Object"));
        Object term254246 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term253914, term253914.getClass(), "delegateMap", null);
        setIntField(term253914, term253914.getClass(), "size", 3);
        setIntField(term253914, term253914.getClass(), "hash3", -477755628);
        setField(term254006, term254006.getClass(), "delegateMap", null);
        setIntField(term254006, term254006.getClass(), "size", 3);
        setIntField(term254116, term254116.getClass(), "size", 0);
        setField(term254006, term254006.getClass(), "key3", term254116);
        setField(term254006, term254006.getClass(), "key2", null);
        setField(term254006, term254006.getClass(), "value2", null);
        setIntField(term254006, term254006.getClass(), "hash3", 1909461008);
        setIntField(term254006, term254006.getClass(), "hash2", 557645829);
        setIntField(term254006, term254006.getClass(), "hash1", 540743808);
        setField(term254006, term254006.getClass(), "key1", term254154);
        setField(term254006, term254006.getClass(), "value3", null);
        setField(term254006, term254006.getClass(), "value1", null);
        setField(term253914, term253914.getClass(), "key3", term254006);
        setIntField(term253914, term253914.getClass(), "hash2", -477755628);
        setField(term253914, term253914.getClass(), "key2", null);
        setIntField(term253914, term253914.getClass(), "hash1", -477755628);
        setField(term253914, term253914.getClass(), "key1", null);
        setField(term253914, term253914.getClass(), "value3", null);
        setField(term253914, term253914.getClass(), "value2", term254246);
        setField(term253914, term253914.getClass(), "value1", null);
        term254338 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term254430 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term254338, term254338.getClass(), "delegateMap", null);
        setIntField(term254338, term254338.getClass(), "size", 3);
        setIntField(term254338, term254338.getClass(), "hash3", -1283129228);
        setField(term254338, term254338.getClass(), "value3", null);
        setIntField(term254338, term254338.getClass(), "hash2", 134217728);
        setField(term254338, term254338.getClass(), "value2", null);
        setIntField(term254338, term254338.getClass(), "hash1", 671155872);
        setField(term254338, term254338.getClass(), "value1", null);
        setField(term254338, term254338.getClass(), "key3", null);
        setField(term254338, term254338.getClass(), "key2", null);
        setField(term254430, term254430.getClass(), "delegateMap", null);
        setIntField(term254430, term254430.getClass(), "size", 2);
        setIntField(term254430, term254430.getClass(), "hash2", 2048);
        setField(term254430, term254430.getClass(), "value2", null);
        setIntField(term254430, term254430.getClass(), "hash1", 2048);
        setField(term254430, term254430.getClass(), "value1", null);
        setField(term254338, term254338.getClass(), "key1", term254430);
        term254854 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term254855 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term254856 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term254857 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term254858 = newInstance(Class.forName("java.lang.Object"));
        Object term254859 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term254860 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term254854, term254854.getClass(), "size", 0);
        setIntField(term254854, term254854.getClass(), "hash1", 0);
        setIntField(term254854, term254854.getClass(), "hash2", 0);
        setIntField(term254854, term254854.getClass(), "hash3", 0);
        setField(term254854, term254854.getClass(), "key1", null);
        setField(term254854, term254854.getClass(), "key2", null);
        setField(term254854, term254854.getClass(), "key3", null);
        setField(term254854, term254854.getClass(), "value1", null);
        setField(term254854, term254854.getClass(), "value2", null);
        setField(term254854, term254854.getClass(), "value3", null);
        setFloatField(term254855, term254855.getClass(), "loadFactor", 0.75F);
        setIntField(term254855, term254855.getClass(), "size", 3);
        setField(term254857, term254857.getClass(), "next", null);
        setField(term254857, term254857.getClass(), "key", term254858);
        setField(term254857, term254857.getClass(), "value", null);
        setElement(term254856, 6, term254857);
        setIntElement(term254856, 7, -8130816);
        setField(term254859, term254859.getClass(), "next", null);
        setIntField(term254860, term254860.getClass(), "size", 3);
        setIntField(term254860, term254860.getClass(), "hash1", 540743808);
        setIntField(term254860, term254860.getClass(), "hash2", 557645829);
        setIntField(term254860, term254860.getClass(), "hash3", 1909461008);
        setField(term254860, term254860.getClass(), "key1", null);
        setField(term254860, term254860.getClass(), "key2", null);
        setField(term254860, term254860.getClass(), "key3", null);
        setField(term254860, term254860.getClass(), "value1", null);
        setField(term254860, term254860.getClass(), "value2", null);
        setField(term254860, term254860.getClass(), "value3", null);
        setField(term254860, term254860.getClass(), "delegateMap", null);
        setField(term254859, term254859.getClass(), "key", term254860);
        setField(term254859, term254859.getClass(), "value", null);
        setElement(term254856, 13, term254859);
        setField(term254855, term254855.getClass(), "data", term254856);
        setIntField(term254855, term254855.getClass(), "threshold", 12);
        setIntField(term254855, term254855.getClass(), "modCount", 3);
        setField(term254855, term254855.getClass(), "entrySet", null);
        setField(term254855, term254855.getClass(), "keySet", null);
        setField(term254855, term254855.getClass(), "values", null);
        setField(term254855, term254855.getClass(), "keySet", null);
        setField(term254855, term254855.getClass(), "values", null);
        setField(term254854, term254854.getClass(), "delegateMap", term254855);
        term254861 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term254861, term254861.getClass(), "size", 3);
        setIntField(term254861, term254861.getClass(), "hash1", 671155872);
        setIntField(term254861, term254861.getClass(), "hash2", 134217728);
        setIntField(term254861, term254861.getClass(), "hash3", -1283129228);
        setField(term254861, term254861.getClass(), "key1", null);
        setField(term254861, term254861.getClass(), "key2", null);
        setField(term254861, term254861.getClass(), "key3", null);
        setField(term254861, term254861.getClass(), "value1", null);
        setField(term254861, term254861.getClass(), "value2", null);
        setField(term254861, term254861.getClass(), "value3", null);
        setField(term254861, term254861.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term254338;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term253914, args);
        assertTrue(recursiveEquals(term253914, term254854));
        assertTrue(recursiveEquals(term254338, term254861));
        assertTrue(recursiveEquals(retValue, null));
    }

};


