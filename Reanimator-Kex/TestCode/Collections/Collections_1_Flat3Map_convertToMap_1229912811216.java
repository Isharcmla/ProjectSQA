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

public class Flat3Map_convertToMap_1229912811216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37134;
     Object term38172;

    public Flat3Map_convertToMap_1229912811216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37134 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term37226 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term37318 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term37134, term37134.getClass(), "delegateMap", null);
        setIntField(term37134, term37134.getClass(), "size", 1);
        setField(term37226, term37226.getClass(), "delegateMap", null);
        setIntField(term37226, term37226.getClass(), "size", 3);
        setField(term37134, term37134.getClass(), "key1", term37226);
        setField(term37134, term37134.getClass(), "value1", term37318);
        term38172 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term38173 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term38174 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term38175 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term38176 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term38177 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term38172, term38172.getClass(), "size", 0);
        setIntField(term38172, term38172.getClass(), "hash1", 0);
        setIntField(term38172, term38172.getClass(), "hash2", 0);
        setIntField(term38172, term38172.getClass(), "hash3", 0);
        setField(term38172, term38172.getClass(), "key1", null);
        setField(term38172, term38172.getClass(), "key2", null);
        setField(term38172, term38172.getClass(), "key3", null);
        setField(term38172, term38172.getClass(), "value1", null);
        setField(term38172, term38172.getClass(), "value2", null);
        setField(term38172, term38172.getClass(), "value3", null);
        setFloatField(term38173, term38173.getClass(), "loadFactor", 0.75F);
        setIntField(term38173, term38173.getClass(), "size", 1);
        setField(term38175, term38175.getClass(), "next", null);
        setIntField(term38176, term38176.getClass(), "size", 3);
        setIntField(term38176, term38176.getClass(), "hash1", 0);
        setIntField(term38176, term38176.getClass(), "hash2", 0);
        setIntField(term38176, term38176.getClass(), "hash3", 0);
        setField(term38176, term38176.getClass(), "key1", null);
        setField(term38176, term38176.getClass(), "key2", null);
        setField(term38176, term38176.getClass(), "key3", null);
        setField(term38176, term38176.getClass(), "value1", null);
        setField(term38176, term38176.getClass(), "value2", null);
        setField(term38176, term38176.getClass(), "value3", null);
        setField(term38176, term38176.getClass(), "delegateMap", null);
        setField(term38175, term38175.getClass(), "key", term38176);
        setIntField(term38177, term38177.getClass(), "size", 0);
        setIntField(term38177, term38177.getClass(), "hash1", 0);
        setIntField(term38177, term38177.getClass(), "hash2", 0);
        setIntField(term38177, term38177.getClass(), "hash3", 0);
        setField(term38177, term38177.getClass(), "key1", null);
        setField(term38177, term38177.getClass(), "key2", null);
        setField(term38177, term38177.getClass(), "key3", null);
        setField(term38177, term38177.getClass(), "value1", null);
        setField(term38177, term38177.getClass(), "value2", null);
        setField(term38177, term38177.getClass(), "value3", null);
        setField(term38177, term38177.getClass(), "delegateMap", null);
        setField(term38175, term38175.getClass(), "value", term38177);
        setElement(term38174, 0, term38175);
        setField(term38173, term38173.getClass(), "data", term38174);
        setIntField(term38173, term38173.getClass(), "threshold", 12);
        setIntField(term38173, term38173.getClass(), "modCount", 1);
        setField(term38173, term38173.getClass(), "entrySet", null);
        setField(term38173, term38173.getClass(), "keySet", null);
        setField(term38173, term38173.getClass(), "values", null);
        setField(term38173, term38173.getClass(), "keySet", null);
        setField(term38173, term38173.getClass(), "values", null);
        setField(term38172, term38172.getClass(), "delegateMap", term38173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term37134, args);
        assertTrue(recursiveEquals(term37134, term38172));
    }

};
