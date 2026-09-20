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

public class Flat3Map_get_229621781708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140218;
     Object term140604;
     Object term141278;
     Object term141282;

    public Flat3Map_get_229621781708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140218 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140310 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140402 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140512 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term140218, term140218.getClass(), "delegateMap", null);
        setIntField(term140218, term140218.getClass(), "size", 3);
        setIntField(term140218, term140218.getClass(), "hash3", 0);
        setField(term140310, term140310.getClass(), "delegateMap", null);
        setIntField(term140310, term140310.getClass(), "size", 3);
        setField(term140402, term140402.getClass(), "delegateMap", term140512);
        setField(term140310, term140310.getClass(), "key3", term140402);
        setField(term140310, term140310.getClass(), "key2", null);
        setField(term140310, term140310.getClass(), "value2", null);
        setIntField(term140310, term140310.getClass(), "hash3", 0);
        setField(term140218, term140218.getClass(), "key3", term140310);
        term140604 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140696 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term140604, term140604.getClass(), "delegateMap", null);
        setIntField(term140604, term140604.getClass(), "size", 3);
        setIntField(term140604, term140604.getClass(), "hash3", 0);
        setField(term140604, term140604.getClass(), "value3", null);
        setIntField(term140604, term140604.getClass(), "hash2", 0);
        setField(term140604, term140604.getClass(), "value2", null);
        setIntField(term140604, term140604.getClass(), "hash1", 0);
        setField(term140604, term140604.getClass(), "value1", null);
        setField(term140604, term140604.getClass(), "key3", null);
        setField(term140604, term140604.getClass(), "key2", null);
        setField(term140696, term140696.getClass(), "delegateMap", null);
        setIntField(term140696, term140696.getClass(), "size", 0);
        setField(term140604, term140604.getClass(), "key1", term140696);
        term141278 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141279 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141280 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141281 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term141278, term141278.getClass(), "size", 3);
        setIntField(term141278, term141278.getClass(), "hash1", 0);
        setIntField(term141278, term141278.getClass(), "hash2", 0);
        setIntField(term141278, term141278.getClass(), "hash3", 0);
        setField(term141278, term141278.getClass(), "key1", null);
        setField(term141278, term141278.getClass(), "key2", null);
        setIntField(term141279, term141279.getClass(), "size", 3);
        setIntField(term141279, term141279.getClass(), "hash1", 0);
        setIntField(term141279, term141279.getClass(), "hash2", 0);
        setIntField(term141279, term141279.getClass(), "hash3", 0);
        setField(term141279, term141279.getClass(), "key1", null);
        setField(term141279, term141279.getClass(), "key2", null);
        setIntField(term141280, term141280.getClass(), "size", 0);
        setIntField(term141280, term141280.getClass(), "hash1", 0);
        setIntField(term141280, term141280.getClass(), "hash2", 0);
        setIntField(term141280, term141280.getClass(), "hash3", 0);
        setField(term141280, term141280.getClass(), "key1", null);
        setField(term141280, term141280.getClass(), "key2", null);
        setField(term141280, term141280.getClass(), "key3", null);
        setField(term141280, term141280.getClass(), "value1", null);
        setField(term141280, term141280.getClass(), "value2", null);
        setField(term141280, term141280.getClass(), "value3", null);
        setFloatField(term141281, term141281.getClass(), "loadFactor", 0.0F);
        setIntField(term141281, term141281.getClass(), "size", 0);
        setField(term141281, term141281.getClass(), "data", null);
        setIntField(term141281, term141281.getClass(), "threshold", 0);
        setIntField(term141281, term141281.getClass(), "modCount", 0);
        setField(term141281, term141281.getClass(), "entrySet", null);
        setField(term141281, term141281.getClass(), "keySet", null);
        setField(term141281, term141281.getClass(), "values", null);
        setField(term141281, term141281.getClass(), "keySet", null);
        setField(term141281, term141281.getClass(), "values", null);
        setField(term141280, term141280.getClass(), "delegateMap", term141281);
        setField(term141279, term141279.getClass(), "key3", term141280);
        setField(term141279, term141279.getClass(), "value1", null);
        setField(term141279, term141279.getClass(), "value2", null);
        setField(term141279, term141279.getClass(), "value3", null);
        setField(term141279, term141279.getClass(), "delegateMap", null);
        setField(term141278, term141278.getClass(), "key3", term141279);
        setField(term141278, term141278.getClass(), "value1", null);
        setField(term141278, term141278.getClass(), "value2", null);
        setField(term141278, term141278.getClass(), "value3", null);
        setField(term141278, term141278.getClass(), "delegateMap", null);
        term141282 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141283 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term141282, term141282.getClass(), "size", 3);
        setIntField(term141282, term141282.getClass(), "hash1", 0);
        setIntField(term141282, term141282.getClass(), "hash2", 0);
        setIntField(term141282, term141282.getClass(), "hash3", 0);
        setIntField(term141283, term141283.getClass(), "size", 0);
        setIntField(term141283, term141283.getClass(), "hash1", 0);
        setIntField(term141283, term141283.getClass(), "hash2", 0);
        setIntField(term141283, term141283.getClass(), "hash3", 0);
        setField(term141283, term141283.getClass(), "key1", null);
        setField(term141283, term141283.getClass(), "key2", null);
        setField(term141283, term141283.getClass(), "key3", null);
        setField(term141283, term141283.getClass(), "value1", null);
        setField(term141283, term141283.getClass(), "value2", null);
        setField(term141283, term141283.getClass(), "value3", null);
        setField(term141283, term141283.getClass(), "delegateMap", null);
        setField(term141282, term141282.getClass(), "key1", term141283);
        setField(term141282, term141282.getClass(), "key2", null);
        setField(term141282, term141282.getClass(), "key3", null);
        setField(term141282, term141282.getClass(), "value1", null);
        setField(term141282, term141282.getClass(), "value2", null);
        setField(term141282, term141282.getClass(), "value3", null);
        setField(term141282, term141282.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term140604;
        Object retValue = callMethod(klass, "get", argTypes, term140218, args);
        assertTrue(recursiveEquals(term140218, term141278));
        assertTrue(recursiveEquals(term140604, term141282));
        assertTrue(recursiveEquals(retValue, null));
    }

};
