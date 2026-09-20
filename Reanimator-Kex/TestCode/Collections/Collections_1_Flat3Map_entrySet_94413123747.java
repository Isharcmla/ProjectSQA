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

public class Flat3Map_entrySet_94413123747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13801;
     Object term13815;
     Object term13814;

    public Flat3Map_entrySet_94413123747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13801 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term13801, term13801.getClass(), "delegateMap", null);
        term13815 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term13815, term13815.getClass(), "size", 0);
        setIntField(term13815, term13815.getClass(), "hash1", 0);
        setIntField(term13815, term13815.getClass(), "hash2", 0);
        setIntField(term13815, term13815.getClass(), "hash3", 0);
        setField(term13815, term13815.getClass(), "key1", null);
        setField(term13815, term13815.getClass(), "key2", null);
        setField(term13815, term13815.getClass(), "key3", null);
        setField(term13815, term13815.getClass(), "value1", null);
        setField(term13815, term13815.getClass(), "value2", null);
        setField(term13815, term13815.getClass(), "value3", null);
        setField(term13815, term13815.getClass(), "delegateMap", null);
        term13814 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map$EntrySet"));
        Object term13809 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term13809, term13809.getClass(), "size", 0);
        setIntField(term13809, term13809.getClass(), "hash1", 0);
        setIntField(term13809, term13809.getClass(), "hash2", 0);
        setIntField(term13809, term13809.getClass(), "hash3", 0);
        setField(term13809, term13809.getClass(), "key1", null);
        setField(term13809, term13809.getClass(), "key2", null);
        setField(term13809, term13809.getClass(), "key3", null);
        setField(term13809, term13809.getClass(), "value1", null);
        setField(term13809, term13809.getClass(), "value2", null);
        setField(term13809, term13809.getClass(), "value3", null);
        setField(term13809, term13809.getClass(), "delegateMap", null);
        setField(term13814, term13814.getClass(), "parent", term13809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "entrySet", argTypes, term13801, args);
        assertTrue(recursiveEquals(term13801, term13815));
        assertTrue(recursiveEquals(retValue, term13814));
    }

};
