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

public class Flat3Map_remove_840690279971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195019;
     Object term195167;
     Object term195169;

    public Flat3Map_remove_840690279971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195019 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term195074 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term195019, term195019.getClass(), "delegateMap", null);
        setIntField(term195019, term195019.getClass(), "size", 3);
        setIntField(term195019, term195019.getClass(), "hash3", -1);
        setIntField(term195074, term195074.getClass(), "size", 0);
        setField(term195019, term195019.getClass(), "value3", term195074);
        setIntField(term195019, term195019.getClass(), "hash2", 0);
        setField(term195019, term195019.getClass(), "value2", null);
        setIntField(term195019, term195019.getClass(), "hash1", 0);
        setField(term195019, term195019.getClass(), "value1", null);
        setField(term195019, term195019.getClass(), "key2", null);
        term195167 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term195168 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term195167, term195167.getClass(), "size", 3);
        setIntField(term195167, term195167.getClass(), "hash1", 0);
        setIntField(term195167, term195167.getClass(), "hash2", 0);
        setIntField(term195167, term195167.getClass(), "hash3", -1);
        setField(term195167, term195167.getClass(), "key1", null);
        setField(term195167, term195167.getClass(), "key2", null);
        setField(term195167, term195167.getClass(), "key3", null);
        setField(term195167, term195167.getClass(), "value1", null);
        setField(term195167, term195167.getClass(), "value2", null);
        setFloatField(term195168, term195168.getClass(), "loadFactor", 0.0F);
        setIntField(term195168, term195168.getClass(), "size", 0);
        setField(term195168, term195168.getClass(), "data", null);
        setIntField(term195168, term195168.getClass(), "threshold", 0);
        setIntField(term195168, term195168.getClass(), "modCount", 0);
        setField(term195168, term195168.getClass(), "entrySet", null);
        setField(term195168, term195168.getClass(), "keySet", null);
        setField(term195168, term195168.getClass(), "values", null);
        setField(term195168, term195168.getClass(), "keySet", null);
        setField(term195168, term195168.getClass(), "values", null);
        setField(term195167, term195167.getClass(), "value3", term195168);
        setField(term195167, term195167.getClass(), "delegateMap", null);
        term195169 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term195170 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term195169, term195169.getClass(), "size", 3);
        setIntField(term195169, term195169.getClass(), "hash1", 0);
        setIntField(term195169, term195169.getClass(), "hash2", 0);
        setIntField(term195169, term195169.getClass(), "hash3", -1);
        setField(term195169, term195169.getClass(), "key1", null);
        setField(term195169, term195169.getClass(), "key2", null);
        setField(term195169, term195169.getClass(), "key3", null);
        setField(term195169, term195169.getClass(), "value1", null);
        setField(term195169, term195169.getClass(), "value2", null);
        setFloatField(term195170, term195170.getClass(), "loadFactor", 0.0F);
        setIntField(term195170, term195170.getClass(), "size", 0);
        setField(term195170, term195170.getClass(), "data", null);
        setIntField(term195170, term195170.getClass(), "threshold", 0);
        setIntField(term195170, term195170.getClass(), "modCount", 0);
        setField(term195170, term195170.getClass(), "entrySet", null);
        setField(term195170, term195170.getClass(), "keySet", null);
        setField(term195170, term195170.getClass(), "values", null);
        setField(term195170, term195170.getClass(), "keySet", null);
        setField(term195170, term195170.getClass(), "values", null);
        setField(term195169, term195169.getClass(), "value3", term195170);
        setField(term195169, term195169.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term195019;
        Object retValue = callMethod(klass, "remove", argTypes, term195019, args);
        assertTrue(recursiveEquals(term195019, term195167));
        assertTrue(recursiveEquals(term195019, term195169));
        assertTrue(recursiveEquals(retValue, null));
    }

};
