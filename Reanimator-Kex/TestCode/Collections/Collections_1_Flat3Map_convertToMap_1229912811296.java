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
import java.util.HashMap;

public class Flat3Map_convertToMap_1229912811296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52538;
     Object term53205;

    public Flat3Map_convertToMap_1229912811296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term52696 = new HashMap();
        term52538 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term52648 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term52788 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term52538, term52538.getClass(), "delegateMap", term52648);
        setIntField(term52538, term52538.getClass(), "size", 2);
        setField(term52538, term52538.getClass(), "key2", null);
        setField(term52538, term52538.getClass(), "value2", term52696);
        setField(term52538, term52538.getClass(), "key1", null);
        setField(term52538, term52538.getClass(), "value1", term52788);
        term53205 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term53206 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term53207 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term53208 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term53209 = newInstance(Class.forName("java.lang.Object"));
        Object term53210 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term53205, term53205.getClass(), "size", 0);
        setIntField(term53205, term53205.getClass(), "hash1", 0);
        setIntField(term53205, term53205.getClass(), "hash2", 0);
        setIntField(term53205, term53205.getClass(), "hash3", 0);
        setField(term53205, term53205.getClass(), "key1", null);
        setField(term53205, term53205.getClass(), "key2", null);
        setField(term53205, term53205.getClass(), "key3", null);
        setField(term53205, term53205.getClass(), "value1", null);
        setField(term53205, term53205.getClass(), "value2", null);
        setField(term53205, term53205.getClass(), "value3", null);
        setFloatField(term53206, term53206.getClass(), "loadFactor", 0.75F);
        setIntField(term53206, term53206.getClass(), "size", 1);
        setField(term53208, term53208.getClass(), "next", null);
        setField(term53208, term53208.getClass(), "key", term53209);
        setIntField(term53210, term53210.getClass(), "size", 0);
        setIntField(term53210, term53210.getClass(), "hash1", 0);
        setIntField(term53210, term53210.getClass(), "hash2", 0);
        setIntField(term53210, term53210.getClass(), "hash3", 0);
        setField(term53210, term53210.getClass(), "key1", null);
        setField(term53210, term53210.getClass(), "key2", null);
        setField(term53210, term53210.getClass(), "key3", null);
        setField(term53210, term53210.getClass(), "value1", null);
        setField(term53210, term53210.getClass(), "value2", null);
        setField(term53210, term53210.getClass(), "value3", null);
        setField(term53210, term53210.getClass(), "delegateMap", null);
        setField(term53208, term53208.getClass(), "value", term53210);
        setElement(term53207, 0, term53208);
        setField(term53206, term53206.getClass(), "data", term53207);
        setIntField(term53206, term53206.getClass(), "threshold", 12);
        setIntField(term53206, term53206.getClass(), "modCount", 1);
        setField(term53206, term53206.getClass(), "entrySet", null);
        setField(term53206, term53206.getClass(), "keySet", null);
        setField(term53206, term53206.getClass(), "values", null);
        setField(term53206, term53206.getClass(), "keySet", null);
        setField(term53206, term53206.getClass(), "values", null);
        setField(term53205, term53205.getClass(), "delegateMap", term53206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term52538, args);
        assertTrue(recursiveEquals(term52538, term53205));
    }

};
