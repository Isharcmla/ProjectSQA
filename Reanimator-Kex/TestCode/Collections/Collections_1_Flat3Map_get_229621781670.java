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

public class Flat3Map_get_229621781670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131213;
     Object term131397;
     Object term131773;
     Object term131775;

    public Flat3Map_get_229621781670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131213 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term131305 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term131213, term131213.getClass(), "delegateMap", null);
        setIntField(term131213, term131213.getClass(), "size", 3);
        setIntField(term131213, term131213.getClass(), "hash3", 0);
        setField(term131213, term131213.getClass(), "key3", null);
        setIntField(term131213, term131213.getClass(), "hash2", -1);
        setIntField(term131213, term131213.getClass(), "hash1", 0);
        setField(term131213, term131213.getClass(), "key1", term131305);
        term131397 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term131397, term131397.getClass(), "delegateMap", null);
        setIntField(term131397, term131397.getClass(), "size", 3);
        setIntField(term131397, term131397.getClass(), "hash3", 0);
        setField(term131397, term131397.getClass(), "value3", null);
        setIntField(term131397, term131397.getClass(), "hash2", 0);
        setField(term131397, term131397.getClass(), "value2", null);
        setIntField(term131397, term131397.getClass(), "hash1", 0);
        setField(term131397, term131397.getClass(), "value1", null);
        term131773 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term131774 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term131773, term131773.getClass(), "size", 3);
        setIntField(term131773, term131773.getClass(), "hash1", 0);
        setIntField(term131773, term131773.getClass(), "hash2", -1);
        setIntField(term131773, term131773.getClass(), "hash3", 0);
        setIntField(term131774, term131774.getClass(), "size", 0);
        setIntField(term131774, term131774.getClass(), "hash1", 0);
        setIntField(term131774, term131774.getClass(), "hash2", 0);
        setIntField(term131774, term131774.getClass(), "hash3", 0);
        setField(term131774, term131774.getClass(), "key1", null);
        setField(term131774, term131774.getClass(), "key2", null);
        setField(term131774, term131774.getClass(), "key3", null);
        setField(term131774, term131774.getClass(), "value1", null);
        setField(term131774, term131774.getClass(), "value2", null);
        setField(term131774, term131774.getClass(), "value3", null);
        setField(term131774, term131774.getClass(), "delegateMap", null);
        setField(term131773, term131773.getClass(), "key1", term131774);
        setField(term131773, term131773.getClass(), "key2", null);
        setField(term131773, term131773.getClass(), "key3", null);
        setField(term131773, term131773.getClass(), "value1", null);
        setField(term131773, term131773.getClass(), "value2", null);
        setField(term131773, term131773.getClass(), "value3", null);
        setField(term131773, term131773.getClass(), "delegateMap", null);
        term131775 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term131775, term131775.getClass(), "size", 3);
        setIntField(term131775, term131775.getClass(), "hash1", 0);
        setIntField(term131775, term131775.getClass(), "hash2", 0);
        setIntField(term131775, term131775.getClass(), "hash3", 0);
        setField(term131775, term131775.getClass(), "key1", null);
        setField(term131775, term131775.getClass(), "key2", null);
        setField(term131775, term131775.getClass(), "key3", null);
        setField(term131775, term131775.getClass(), "value1", null);
        setField(term131775, term131775.getClass(), "value2", null);
        setField(term131775, term131775.getClass(), "value3", null);
        setField(term131775, term131775.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term131397;
        Object retValue = callMethod(klass, "get", argTypes, term131213, args);
        assertTrue(recursiveEquals(term131213, term131773));
        assertTrue(recursiveEquals(term131397, term131775));
        assertTrue(recursiveEquals(retValue, null));
    }

};
