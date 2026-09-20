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

public class Flat3Map_get_229621781399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73610;
     Object term73785;
     Object term73788;

    public Flat3Map_get_229621781399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73610 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73656 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73700 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term73610, term73610.getClass(), "delegateMap", null);
        setIntField(term73610, term73610.getClass(), "size", 2);
        setIntField(term73610, term73610.getClass(), "hash2", 0);
        setField(term73610, term73610.getClass(), "value2", null);
        setIntField(term73610, term73610.getClass(), "hash1", 0);
        setField(term73610, term73610.getClass(), "value1", null);
        setField(term73610, term73610.getClass(), "key2", null);
        setField(term73656, term73656.getClass(), "delegateMap", term73700);
        setField(term73610, term73610.getClass(), "key1", term73656);
        term73785 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73786 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73787 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term73785, term73785.getClass(), "size", 2);
        setIntField(term73785, term73785.getClass(), "hash1", 0);
        setIntField(term73785, term73785.getClass(), "hash2", 0);
        setIntField(term73785, term73785.getClass(), "hash3", 0);
        setIntField(term73786, term73786.getClass(), "size", 0);
        setIntField(term73786, term73786.getClass(), "hash1", 0);
        setIntField(term73786, term73786.getClass(), "hash2", 0);
        setIntField(term73786, term73786.getClass(), "hash3", 0);
        setField(term73786, term73786.getClass(), "key1", null);
        setField(term73786, term73786.getClass(), "key2", null);
        setField(term73786, term73786.getClass(), "key3", null);
        setField(term73786, term73786.getClass(), "value1", null);
        setField(term73786, term73786.getClass(), "value2", null);
        setField(term73786, term73786.getClass(), "value3", null);
        setIntField(term73787, term73787.getClass(), "maxSize", 0);
        setBooleanField(term73787, term73787.getClass(), "scanUntilRemovable", false);
        setField(term73787, term73787.getClass(), "header", null);
        setFloatField(term73787, term73787.getClass(), "loadFactor", 0.0F);
        setIntField(term73787, term73787.getClass(), "size", 0);
        setField(term73787, term73787.getClass(), "data", null);
        setIntField(term73787, term73787.getClass(), "threshold", 0);
        setIntField(term73787, term73787.getClass(), "modCount", 0);
        setField(term73787, term73787.getClass(), "entrySet", null);
        setField(term73787, term73787.getClass(), "keySet", null);
        setField(term73787, term73787.getClass(), "values", null);
        setField(term73787, term73787.getClass(), "keySet", null);
        setField(term73787, term73787.getClass(), "values", null);
        setField(term73786, term73786.getClass(), "delegateMap", term73787);
        setField(term73785, term73785.getClass(), "key1", term73786);
        setField(term73785, term73785.getClass(), "key2", null);
        setField(term73785, term73785.getClass(), "key3", null);
        setField(term73785, term73785.getClass(), "value1", null);
        setField(term73785, term73785.getClass(), "value2", null);
        setField(term73785, term73785.getClass(), "value3", null);
        setField(term73785, term73785.getClass(), "delegateMap", null);
        term73788 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73789 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term73790 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setIntField(term73788, term73788.getClass(), "size", 2);
        setIntField(term73788, term73788.getClass(), "hash1", 0);
        setIntField(term73788, term73788.getClass(), "hash2", 0);
        setIntField(term73788, term73788.getClass(), "hash3", 0);
        setIntField(term73789, term73789.getClass(), "size", 0);
        setIntField(term73789, term73789.getClass(), "hash1", 0);
        setIntField(term73789, term73789.getClass(), "hash2", 0);
        setIntField(term73789, term73789.getClass(), "hash3", 0);
        setField(term73789, term73789.getClass(), "key1", null);
        setField(term73789, term73789.getClass(), "key2", null);
        setField(term73789, term73789.getClass(), "key3", null);
        setField(term73789, term73789.getClass(), "value1", null);
        setField(term73789, term73789.getClass(), "value2", null);
        setField(term73789, term73789.getClass(), "value3", null);
        setIntField(term73790, term73790.getClass(), "maxSize", 0);
        setBooleanField(term73790, term73790.getClass(), "scanUntilRemovable", false);
        setField(term73790, term73790.getClass(), "header", null);
        setFloatField(term73790, term73790.getClass(), "loadFactor", 0.0F);
        setIntField(term73790, term73790.getClass(), "size", 0);
        setField(term73790, term73790.getClass(), "data", null);
        setIntField(term73790, term73790.getClass(), "threshold", 0);
        setIntField(term73790, term73790.getClass(), "modCount", 0);
        setField(term73790, term73790.getClass(), "entrySet", null);
        setField(term73790, term73790.getClass(), "keySet", null);
        setField(term73790, term73790.getClass(), "values", null);
        setField(term73790, term73790.getClass(), "keySet", null);
        setField(term73790, term73790.getClass(), "values", null);
        setField(term73789, term73789.getClass(), "delegateMap", term73790);
        setField(term73788, term73788.getClass(), "key1", term73789);
        setField(term73788, term73788.getClass(), "key2", null);
        setField(term73788, term73788.getClass(), "key3", null);
        setField(term73788, term73788.getClass(), "value1", null);
        setField(term73788, term73788.getClass(), "value2", null);
        setField(term73788, term73788.getClass(), "value3", null);
        setField(term73788, term73788.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term73610;
        Object retValue = callMethod(klass, "get", argTypes, term73610, args);
        assertTrue(recursiveEquals(term73610, term73785));
        assertTrue(recursiveEquals(term73610, term73788));
        assertTrue(recursiveEquals(retValue, null));
    }

};
