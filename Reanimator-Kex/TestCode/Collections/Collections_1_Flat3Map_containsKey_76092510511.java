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

public class Flat3Map_containsKey_76092510511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96057;
     Object term96279;
     Object term97090;
     Object term97093;

    public Flat3Map_containsKey_76092510511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96057 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term96095 = newInstance(Class.forName("java.lang.Object"));
        Object term96187 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term96057, term96057.getClass(), "delegateMap", null);
        setIntField(term96057, term96057.getClass(), "size", 2);
        setIntField(term96057, term96057.getClass(), "hash2", 0);
        setField(term96057, term96057.getClass(), "key2", term96095);
        setIntField(term96057, term96057.getClass(), "hash1", 0);
        setField(term96057, term96057.getClass(), "key1", term96187);
        term96279 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term96279, term96279.getClass(), "delegateMap", null);
        setIntField(term96279, term96279.getClass(), "size", 2);
        setIntField(term96279, term96279.getClass(), "hash2", 0);
        setField(term96279, term96279.getClass(), "value2", null);
        setIntField(term96279, term96279.getClass(), "hash1", 0);
        setField(term96279, term96279.getClass(), "value1", null);
        term97090 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term97091 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term97092 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term97090, term97090.getClass(), "size", 2);
        setIntField(term97090, term97090.getClass(), "hash1", 0);
        setIntField(term97090, term97090.getClass(), "hash2", 0);
        setIntField(term97090, term97090.getClass(), "hash3", 0);
        setIntField(term97091, term97091.getClass(), "size", 0);
        setIntField(term97091, term97091.getClass(), "hash1", 0);
        setIntField(term97091, term97091.getClass(), "hash2", 0);
        setIntField(term97091, term97091.getClass(), "hash3", 0);
        setField(term97091, term97091.getClass(), "key1", null);
        setField(term97091, term97091.getClass(), "key2", null);
        setField(term97091, term97091.getClass(), "key3", null);
        setField(term97091, term97091.getClass(), "value1", null);
        setField(term97091, term97091.getClass(), "value2", null);
        setField(term97091, term97091.getClass(), "value3", null);
        setField(term97091, term97091.getClass(), "delegateMap", null);
        setField(term97090, term97090.getClass(), "key1", term97091);
        setField(term97090, term97090.getClass(), "key2", term97092);
        setField(term97090, term97090.getClass(), "key3", null);
        setField(term97090, term97090.getClass(), "value1", null);
        setField(term97090, term97090.getClass(), "value2", null);
        setField(term97090, term97090.getClass(), "value3", null);
        setField(term97090, term97090.getClass(), "delegateMap", null);
        term97093 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term97093, term97093.getClass(), "size", 2);
        setIntField(term97093, term97093.getClass(), "hash1", 0);
        setIntField(term97093, term97093.getClass(), "hash2", 0);
        setIntField(term97093, term97093.getClass(), "hash3", 0);
        setField(term97093, term97093.getClass(), "key1", null);
        setField(term97093, term97093.getClass(), "key2", null);
        setField(term97093, term97093.getClass(), "key3", null);
        setField(term97093, term97093.getClass(), "value1", null);
        setField(term97093, term97093.getClass(), "value2", null);
        setField(term97093, term97093.getClass(), "value3", null);
        setField(term97093, term97093.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term96279;
        callMethod(klass, "containsKey", argTypes, term96057, args);
        assertTrue(recursiveEquals(term96057, term97090));
        assertTrue(recursiveEquals(term96279, term97093));
    }

};
