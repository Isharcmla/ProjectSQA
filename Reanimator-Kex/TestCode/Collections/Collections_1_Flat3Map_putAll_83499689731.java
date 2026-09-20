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
import java.util.LinkedHashMap;

public class Flat3Map_putAll_83499689731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127;
     Object term143;
     Object term7232;
     Object term7240;

    public Flat3Map_putAll_83499689731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term132 = newInstance(Class.forName("java.lang.Object"));
        Object term133 = newInstance(Class.forName("java.lang.Object"));
        Object term134 = newInstance(Class.forName("java.lang.Object"));
        Object term135 = newInstance(Class.forName("java.lang.Object"));
        Object term136 = newInstance(Class.forName("java.lang.Object"));
        Object term137 = newInstance(Class.forName("java.lang.Object"));
        Object term138 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term127, term127.getClass(), "size", 548228925);
        setIntField(term127, term127.getClass(), "hash1", -749861210);
        setIntField(term127, term127.getClass(), "hash2", 1694224101);
        setIntField(term127, term127.getClass(), "hash3", 937859191);
        setField(term127, term127.getClass(), "key1", term132);
        setField(term127, term127.getClass(), "key2", term133);
        setField(term127, term127.getClass(), "key3", term134);
        setField(term127, term127.getClass(), "value1", term135);
        setField(term127, term127.getClass(), "value2", term136);
        setField(term127, term127.getClass(), "value3", term137);
        setFloatField(term138, term138.getClass(), "loadFactor", 0.0F);
        setIntField(term138, term138.getClass(), "size", 0);
        setField(term138, term138.getClass(), "data", null);
        setIntField(term138, term138.getClass(), "threshold", 0);
        setIntField(term138, term138.getClass(), "modCount", 0);
        setField(term138, term138.getClass(), "entrySet", null);
        setField(term138, term138.getClass(), "keySet", null);
        setField(term138, term138.getClass(), "values", null);
        setField(term138, term138.getClass(), "keySet", null);
        setField(term138, term138.getClass(), "values", null);
        setField(term127, term127.getClass(), "delegateMap", term138);
        term143 = new LinkedHashMap();
        term7232 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7233 = newInstance(Class.forName("java.lang.Object"));
        Object term7234 = newInstance(Class.forName("java.lang.Object"));
        Object term7235 = newInstance(Class.forName("java.lang.Object"));
        Object term7236 = newInstance(Class.forName("java.lang.Object"));
        Object term7237 = newInstance(Class.forName("java.lang.Object"));
        Object term7238 = newInstance(Class.forName("java.lang.Object"));
        Object term7239 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term7232, term7232.getClass(), "size", 548228925);
        setIntField(term7232, term7232.getClass(), "hash1", -749861210);
        setIntField(term7232, term7232.getClass(), "hash2", 1694224101);
        setIntField(term7232, term7232.getClass(), "hash3", 937859191);
        setField(term7232, term7232.getClass(), "key1", term7233);
        setField(term7232, term7232.getClass(), "key2", term7234);
        setField(term7232, term7232.getClass(), "key3", term7235);
        setField(term7232, term7232.getClass(), "value1", term7236);
        setField(term7232, term7232.getClass(), "value2", term7237);
        setField(term7232, term7232.getClass(), "value3", term7238);
        setFloatField(term7239, term7239.getClass(), "loadFactor", 0.0F);
        setIntField(term7239, term7239.getClass(), "size", 0);
        setField(term7239, term7239.getClass(), "data", null);
        setIntField(term7239, term7239.getClass(), "threshold", 0);
        setIntField(term7239, term7239.getClass(), "modCount", 0);
        setField(term7239, term7239.getClass(), "entrySet", null);
        setField(term7239, term7239.getClass(), "keySet", null);
        setField(term7239, term7239.getClass(), "values", null);
        setField(term7239, term7239.getClass(), "keySet", null);
        setField(term7239, term7239.getClass(), "values", null);
        setField(term7232, term7232.getClass(), "delegateMap", term7239);
        term7240 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term143;
        callMethod(klass, "putAll", argTypes, term127, args);
        assertTrue(recursiveEquals(term127, term7232));
        assertTrue(recursiveEquals(term143, term7240));
    }

};
