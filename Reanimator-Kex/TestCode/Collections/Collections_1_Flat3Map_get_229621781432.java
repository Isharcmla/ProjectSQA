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

public class Flat3Map_get_229621781432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79193;
     Object term79525;
     Object term79933;
     Object term79937;

    public Flat3Map_get_229621781432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79193 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term79231 = newInstance(Class.forName("java.lang.Object"));
        Object term79323 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term79433 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term79193, term79193.getClass(), "delegateMap", null);
        setIntField(term79193, term79193.getClass(), "size", 2);
        setIntField(term79193, term79193.getClass(), "hash2", 0);
        setField(term79193, term79193.getClass(), "key2", term79231);
        setIntField(term79193, term79193.getClass(), "hash1", 0);
        setField(term79323, term79323.getClass(), "delegateMap", null);
        setIntField(term79323, term79323.getClass(), "size", 2);
        setField(term79323, term79323.getClass(), "key2", term79433);
        setField(term79193, term79193.getClass(), "key1", term79323);
        term79525 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term79525, term79525.getClass(), "delegateMap", null);
        setIntField(term79525, term79525.getClass(), "size", 2);
        setIntField(term79525, term79525.getClass(), "hash2", 0);
        setField(term79525, term79525.getClass(), "value2", null);
        setIntField(term79525, term79525.getClass(), "hash1", 0);
        setField(term79525, term79525.getClass(), "value1", null);
        setField(term79525, term79525.getClass(), "key2", null);
        term79933 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term79934 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term79935 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term79936 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term79933, term79933.getClass(), "size", 2);
        setIntField(term79933, term79933.getClass(), "hash1", 0);
        setIntField(term79933, term79933.getClass(), "hash2", 0);
        setIntField(term79933, term79933.getClass(), "hash3", 0);
        setIntField(term79934, term79934.getClass(), "size", 2);
        setIntField(term79934, term79934.getClass(), "hash1", 0);
        setIntField(term79934, term79934.getClass(), "hash2", 0);
        setIntField(term79934, term79934.getClass(), "hash3", 0);
        setField(term79934, term79934.getClass(), "key1", null);
        setFloatField(term79935, term79935.getClass(), "loadFactor", 0.0F);
        setIntField(term79935, term79935.getClass(), "size", 0);
        setField(term79935, term79935.getClass(), "data", null);
        setIntField(term79935, term79935.getClass(), "threshold", 0);
        setIntField(term79935, term79935.getClass(), "modCount", 0);
        setField(term79935, term79935.getClass(), "entrySet", null);
        setField(term79935, term79935.getClass(), "keySet", null);
        setField(term79935, term79935.getClass(), "values", null);
        setField(term79935, term79935.getClass(), "keySet", null);
        setField(term79935, term79935.getClass(), "values", null);
        setField(term79934, term79934.getClass(), "key2", term79935);
        setField(term79934, term79934.getClass(), "key3", null);
        setField(term79934, term79934.getClass(), "value1", null);
        setField(term79934, term79934.getClass(), "value2", null);
        setField(term79934, term79934.getClass(), "value3", null);
        setField(term79934, term79934.getClass(), "delegateMap", null);
        setField(term79933, term79933.getClass(), "key1", term79934);
        setField(term79933, term79933.getClass(), "key2", term79936);
        setField(term79933, term79933.getClass(), "key3", null);
        setField(term79933, term79933.getClass(), "value1", null);
        setField(term79933, term79933.getClass(), "value2", null);
        setField(term79933, term79933.getClass(), "value3", null);
        setField(term79933, term79933.getClass(), "delegateMap", null);
        term79937 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term79937, term79937.getClass(), "size", 2);
        setIntField(term79937, term79937.getClass(), "hash1", 0);
        setIntField(term79937, term79937.getClass(), "hash2", 0);
        setIntField(term79937, term79937.getClass(), "hash3", 0);
        setField(term79937, term79937.getClass(), "key1", null);
        setField(term79937, term79937.getClass(), "key2", null);
        setField(term79937, term79937.getClass(), "key3", null);
        setField(term79937, term79937.getClass(), "value1", null);
        setField(term79937, term79937.getClass(), "value2", null);
        setField(term79937, term79937.getClass(), "value3", null);
        setField(term79937, term79937.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term79525;
        Object retValue = callMethod(klass, "get", argTypes, term79193, args);
        assertTrue(recursiveEquals(term79193, term79933));
        assertTrue(recursiveEquals(term79525, term79937));
        assertTrue(recursiveEquals(retValue, null));
    }

};
