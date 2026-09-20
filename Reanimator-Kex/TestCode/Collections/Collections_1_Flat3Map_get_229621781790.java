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

public class Flat3Map_get_229621781790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160751;
     Object term161027;
     Object term161511;
     Object term161514;

    public Flat3Map_get_229621781790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160751 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term160843 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term160935 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term160751, term160751.getClass(), "delegateMap", null);
        setIntField(term160751, term160751.getClass(), "size", 2);
        setIntField(term160751, term160751.getClass(), "hash2", 0);
        setField(term160843, term160843.getClass(), "delegateMap", null);
        setIntField(term160843, term160843.getClass(), "size", -3);
        setField(term160751, term160751.getClass(), "key2", term160843);
        setIntField(term160751, term160751.getClass(), "hash1", 0);
        setField(term160935, term160935.getClass(), "delegateMap", null);
        setIntField(term160935, term160935.getClass(), "size", 2);
        setField(term160751, term160751.getClass(), "key1", term160935);
        term161027 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term161137 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term161027, term161027.getClass(), "delegateMap", null);
        setIntField(term161027, term161027.getClass(), "size", 2);
        setIntField(term161027, term161027.getClass(), "hash2", 0);
        setField(term161027, term161027.getClass(), "value2", null);
        setIntField(term161027, term161027.getClass(), "hash1", 0);
        setField(term161027, term161027.getClass(), "value1", null);
        setField(term161027, term161027.getClass(), "key2", term161137);
        term161511 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term161512 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term161513 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term161511, term161511.getClass(), "size", 2);
        setIntField(term161511, term161511.getClass(), "hash1", 0);
        setIntField(term161511, term161511.getClass(), "hash2", 0);
        setIntField(term161511, term161511.getClass(), "hash3", 0);
        setIntField(term161512, term161512.getClass(), "size", 2);
        setIntField(term161512, term161512.getClass(), "hash1", 0);
        setIntField(term161512, term161512.getClass(), "hash2", 0);
        setIntField(term161512, term161512.getClass(), "hash3", 0);
        setField(term161512, term161512.getClass(), "key1", null);
        setField(term161512, term161512.getClass(), "key2", null);
        setField(term161512, term161512.getClass(), "key3", null);
        setField(term161512, term161512.getClass(), "value1", null);
        setField(term161512, term161512.getClass(), "value2", null);
        setField(term161512, term161512.getClass(), "value3", null);
        setField(term161512, term161512.getClass(), "delegateMap", null);
        setField(term161511, term161511.getClass(), "key1", term161512);
        setIntField(term161513, term161513.getClass(), "size", -3);
        setIntField(term161513, term161513.getClass(), "hash1", 0);
        setIntField(term161513, term161513.getClass(), "hash2", 0);
        setIntField(term161513, term161513.getClass(), "hash3", 0);
        setField(term161513, term161513.getClass(), "key1", null);
        setField(term161513, term161513.getClass(), "key2", null);
        setField(term161513, term161513.getClass(), "key3", null);
        setField(term161513, term161513.getClass(), "value1", null);
        setField(term161513, term161513.getClass(), "value2", null);
        setField(term161513, term161513.getClass(), "value3", null);
        setField(term161513, term161513.getClass(), "delegateMap", null);
        setField(term161511, term161511.getClass(), "key2", term161513);
        setField(term161511, term161511.getClass(), "key3", null);
        setField(term161511, term161511.getClass(), "value1", null);
        setField(term161511, term161511.getClass(), "value2", null);
        setField(term161511, term161511.getClass(), "value3", null);
        setField(term161511, term161511.getClass(), "delegateMap", null);
        term161514 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term161515 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term161514, term161514.getClass(), "size", 2);
        setIntField(term161514, term161514.getClass(), "hash1", 0);
        setIntField(term161514, term161514.getClass(), "hash2", 0);
        setIntField(term161514, term161514.getClass(), "hash3", 0);
        setField(term161514, term161514.getClass(), "key1", null);
        setFloatField(term161515, term161515.getClass(), "loadFactor", 0.0F);
        setIntField(term161515, term161515.getClass(), "size", 0);
        setField(term161515, term161515.getClass(), "data", null);
        setIntField(term161515, term161515.getClass(), "threshold", 0);
        setIntField(term161515, term161515.getClass(), "modCount", 0);
        setField(term161515, term161515.getClass(), "entrySet", null);
        setField(term161515, term161515.getClass(), "keySet", null);
        setField(term161515, term161515.getClass(), "values", null);
        setField(term161515, term161515.getClass(), "keySet", null);
        setField(term161515, term161515.getClass(), "values", null);
        setField(term161514, term161514.getClass(), "key2", term161515);
        setField(term161514, term161514.getClass(), "key3", null);
        setField(term161514, term161514.getClass(), "value1", null);
        setField(term161514, term161514.getClass(), "value2", null);
        setField(term161514, term161514.getClass(), "value3", null);
        setField(term161514, term161514.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term161027;
        Object retValue = callMethod(klass, "get", argTypes, term160751, args);
        assertTrue(recursiveEquals(term160751, term161511));
        assertTrue(recursiveEquals(term161027, term161514));
        assertTrue(recursiveEquals(retValue, null));
    }

};
