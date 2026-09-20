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

public class Flat3Map_get_229621781307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55251;
     Object term55311;
     Object term55313;

    public Flat3Map_get_229621781307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55251 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55297 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term55251, term55251.getClass(), "delegateMap", null);
        setIntField(term55251, term55251.getClass(), "size", 0);
        setIntField(term55251, term55251.getClass(), "hash1", 0);
        setField(term55251, term55251.getClass(), "key1", term55297);
        term55311 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55312 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term55311, term55311.getClass(), "size", 0);
        setIntField(term55311, term55311.getClass(), "hash1", 0);
        setIntField(term55311, term55311.getClass(), "hash2", 0);
        setIntField(term55311, term55311.getClass(), "hash3", 0);
        setIntField(term55312, term55312.getClass(), "size", 0);
        setIntField(term55312, term55312.getClass(), "hash1", 0);
        setIntField(term55312, term55312.getClass(), "hash2", 0);
        setIntField(term55312, term55312.getClass(), "hash3", 0);
        setField(term55312, term55312.getClass(), "key1", null);
        setField(term55312, term55312.getClass(), "key2", null);
        setField(term55312, term55312.getClass(), "key3", null);
        setField(term55312, term55312.getClass(), "value1", null);
        setField(term55312, term55312.getClass(), "value2", null);
        setField(term55312, term55312.getClass(), "value3", null);
        setField(term55312, term55312.getClass(), "delegateMap", null);
        setField(term55311, term55311.getClass(), "key1", term55312);
        setField(term55311, term55311.getClass(), "key2", null);
        setField(term55311, term55311.getClass(), "key3", null);
        setField(term55311, term55311.getClass(), "value1", null);
        setField(term55311, term55311.getClass(), "value2", null);
        setField(term55311, term55311.getClass(), "value3", null);
        setField(term55311, term55311.getClass(), "delegateMap", null);
        term55313 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term55314 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term55313, term55313.getClass(), "size", 0);
        setIntField(term55313, term55313.getClass(), "hash1", 0);
        setIntField(term55313, term55313.getClass(), "hash2", 0);
        setIntField(term55313, term55313.getClass(), "hash3", 0);
        setIntField(term55314, term55314.getClass(), "size", 0);
        setIntField(term55314, term55314.getClass(), "hash1", 0);
        setIntField(term55314, term55314.getClass(), "hash2", 0);
        setIntField(term55314, term55314.getClass(), "hash3", 0);
        setField(term55314, term55314.getClass(), "key1", null);
        setField(term55314, term55314.getClass(), "key2", null);
        setField(term55314, term55314.getClass(), "key3", null);
        setField(term55314, term55314.getClass(), "value1", null);
        setField(term55314, term55314.getClass(), "value2", null);
        setField(term55314, term55314.getClass(), "value3", null);
        setField(term55314, term55314.getClass(), "delegateMap", null);
        setField(term55313, term55313.getClass(), "key1", term55314);
        setField(term55313, term55313.getClass(), "key2", null);
        setField(term55313, term55313.getClass(), "key3", null);
        setField(term55313, term55313.getClass(), "value1", null);
        setField(term55313, term55313.getClass(), "value2", null);
        setField(term55313, term55313.getClass(), "value3", null);
        setField(term55313, term55313.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term55251;
        Object retValue = callMethod(klass, "get", argTypes, term55251, args);
        assertTrue(recursiveEquals(term55251, term55311));
        assertTrue(recursiveEquals(term55251, term55313));
        assertTrue(recursiveEquals(retValue, null));
    }

};
