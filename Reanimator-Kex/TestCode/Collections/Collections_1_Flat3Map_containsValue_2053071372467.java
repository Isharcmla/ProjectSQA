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

public class Flat3Map_containsValue_2053071372467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87317;
     Object term87450;
     Object term87453;

    public Flat3Map_containsValue_2053071372467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87317 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87363 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87418 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term87317, term87317.getClass(), "delegateMap", null);
        setIntField(term87317, term87317.getClass(), "size", 0);
        setField(term87363, term87363.getClass(), "delegateMap", term87418);
        setField(term87317, term87317.getClass(), "value2", term87363);
        term87450 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87451 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87452 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term87450, term87450.getClass(), "size", 0);
        setIntField(term87450, term87450.getClass(), "hash1", 0);
        setIntField(term87450, term87450.getClass(), "hash2", 0);
        setIntField(term87450, term87450.getClass(), "hash3", 0);
        setField(term87450, term87450.getClass(), "key1", null);
        setField(term87450, term87450.getClass(), "key2", null);
        setField(term87450, term87450.getClass(), "key3", null);
        setField(term87450, term87450.getClass(), "value1", null);
        setIntField(term87451, term87451.getClass(), "size", 0);
        setIntField(term87451, term87451.getClass(), "hash1", 0);
        setIntField(term87451, term87451.getClass(), "hash2", 0);
        setIntField(term87451, term87451.getClass(), "hash3", 0);
        setField(term87451, term87451.getClass(), "key1", null);
        setField(term87451, term87451.getClass(), "key2", null);
        setField(term87451, term87451.getClass(), "key3", null);
        setField(term87451, term87451.getClass(), "value1", null);
        setField(term87451, term87451.getClass(), "value2", null);
        setField(term87451, term87451.getClass(), "value3", null);
        setFloatField(term87452, term87452.getClass(), "loadFactor", 0.0F);
        setIntField(term87452, term87452.getClass(), "size", 0);
        setField(term87452, term87452.getClass(), "data", null);
        setIntField(term87452, term87452.getClass(), "threshold", 0);
        setIntField(term87452, term87452.getClass(), "modCount", 0);
        setField(term87452, term87452.getClass(), "entrySet", null);
        setField(term87452, term87452.getClass(), "keySet", null);
        setField(term87452, term87452.getClass(), "values", null);
        setField(term87452, term87452.getClass(), "keySet", null);
        setField(term87452, term87452.getClass(), "values", null);
        setField(term87451, term87451.getClass(), "delegateMap", term87452);
        setField(term87450, term87450.getClass(), "value2", term87451);
        setField(term87450, term87450.getClass(), "value3", null);
        setField(term87450, term87450.getClass(), "delegateMap", null);
        term87453 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87454 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term87455 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term87453, term87453.getClass(), "size", 0);
        setIntField(term87453, term87453.getClass(), "hash1", 0);
        setIntField(term87453, term87453.getClass(), "hash2", 0);
        setIntField(term87453, term87453.getClass(), "hash3", 0);
        setField(term87453, term87453.getClass(), "key1", null);
        setField(term87453, term87453.getClass(), "key2", null);
        setField(term87453, term87453.getClass(), "key3", null);
        setField(term87453, term87453.getClass(), "value1", null);
        setIntField(term87454, term87454.getClass(), "size", 0);
        setIntField(term87454, term87454.getClass(), "hash1", 0);
        setIntField(term87454, term87454.getClass(), "hash2", 0);
        setIntField(term87454, term87454.getClass(), "hash3", 0);
        setField(term87454, term87454.getClass(), "key1", null);
        setField(term87454, term87454.getClass(), "key2", null);
        setField(term87454, term87454.getClass(), "key3", null);
        setField(term87454, term87454.getClass(), "value1", null);
        setField(term87454, term87454.getClass(), "value2", null);
        setField(term87454, term87454.getClass(), "value3", null);
        setFloatField(term87455, term87455.getClass(), "loadFactor", 0.0F);
        setIntField(term87455, term87455.getClass(), "size", 0);
        setField(term87455, term87455.getClass(), "data", null);
        setIntField(term87455, term87455.getClass(), "threshold", 0);
        setIntField(term87455, term87455.getClass(), "modCount", 0);
        setField(term87455, term87455.getClass(), "entrySet", null);
        setField(term87455, term87455.getClass(), "keySet", null);
        setField(term87455, term87455.getClass(), "values", null);
        setField(term87455, term87455.getClass(), "keySet", null);
        setField(term87455, term87455.getClass(), "values", null);
        setField(term87454, term87454.getClass(), "delegateMap", term87455);
        setField(term87453, term87453.getClass(), "value2", term87454);
        setField(term87453, term87453.getClass(), "value3", null);
        setField(term87453, term87453.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term87317;
        callMethod(klass, "containsValue", argTypes, term87317, args);
        assertTrue(recursiveEquals(term87317, term87450));
        assertTrue(recursiveEquals(term87317, term87453));
    }

};
