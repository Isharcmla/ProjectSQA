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

public class Flat3Map_get_229621781333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59731;
     Object term59823;
     Object term60720;
     Object term60721;

    public Flat3Map_get_229621781333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59731 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term59731, term59731.getClass(), "delegateMap", null);
        setIntField(term59731, term59731.getClass(), "size", 2);
        setIntField(term59731, term59731.getClass(), "hash2", 0);
        setField(term59731, term59731.getClass(), "key2", null);
        setIntField(term59731, term59731.getClass(), "hash1", 0);
        setField(term59731, term59731.getClass(), "key1", term59731);
        term59823 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term59933 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term59823, term59823.getClass(), "delegateMap", null);
        setIntField(term59823, term59823.getClass(), "size", 2);
        setIntField(term59823, term59823.getClass(), "hash2", 0);
        setIntField(term59933, term59933.getClass(), "size", 0);
        setField(term59823, term59823.getClass(), "value2", term59933);
        setIntField(term59823, term59823.getClass(), "hash1", 0);
        setField(term59823, term59823.getClass(), "value1", null);
        term60720 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term60720, term60720.getClass(), "size", 2);
        setIntField(term60720, term60720.getClass(), "hash1", 0);
        setIntField(term60720, term60720.getClass(), "hash2", 0);
        setIntField(term60720, term60720.getClass(), "hash3", 0);
        setField(term60720, term60720.getClass(), "key1", term60720);
        setField(term60720, term60720.getClass(), "key2", null);
        setField(term60720, term60720.getClass(), "key3", null);
        setField(term60720, term60720.getClass(), "value1", null);
        setField(term60720, term60720.getClass(), "value2", null);
        setField(term60720, term60720.getClass(), "value3", null);
        setField(term60720, term60720.getClass(), "delegateMap", null);
        term60721 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term60722 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term60721, term60721.getClass(), "size", 2);
        setIntField(term60721, term60721.getClass(), "hash1", 0);
        setIntField(term60721, term60721.getClass(), "hash2", 0);
        setIntField(term60721, term60721.getClass(), "hash3", 0);
        setField(term60721, term60721.getClass(), "key1", null);
        setField(term60721, term60721.getClass(), "key2", null);
        setField(term60721, term60721.getClass(), "key3", null);
        setField(term60721, term60721.getClass(), "value1", null);
        setFloatField(term60722, term60722.getClass(), "loadFactor", 0.0F);
        setIntField(term60722, term60722.getClass(), "size", 0);
        setField(term60722, term60722.getClass(), "data", null);
        setIntField(term60722, term60722.getClass(), "threshold", 0);
        setIntField(term60722, term60722.getClass(), "modCount", 0);
        setField(term60722, term60722.getClass(), "entrySet", null);
        setField(term60722, term60722.getClass(), "keySet", null);
        setField(term60722, term60722.getClass(), "values", null);
        setField(term60722, term60722.getClass(), "keySet", null);
        setField(term60722, term60722.getClass(), "values", null);
        setField(term60721, term60721.getClass(), "value2", term60722);
        setField(term60721, term60721.getClass(), "value3", null);
        setField(term60721, term60721.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term59823;
        Object retValue = callMethod(klass, "get", argTypes, term59731, args);
        assertTrue(recursiveEquals(term59731, term60720));
        assertTrue(recursiveEquals(term59823, term60721));
        assertTrue(recursiveEquals(retValue, null));
    }

};
