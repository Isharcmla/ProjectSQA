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

public class Flat3Map_convertToMap_122991281132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149;
     Object term7261;

    public Flat3Map_convertToMap_122991281132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term154 = newInstance(Class.forName("java.lang.Object"));
        Object term155 = newInstance(Class.forName("java.lang.Object"));
        Object term156 = newInstance(Class.forName("java.lang.Object"));
        Object term157 = newInstance(Class.forName("java.lang.Object"));
        Object term158 = newInstance(Class.forName("java.lang.Object"));
        Object term159 = newInstance(Class.forName("java.lang.Object"));
        Object term160 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term149, term149.getClass(), "size", -1022990421);
        setIntField(term149, term149.getClass(), "hash1", 1045547089);
        setIntField(term149, term149.getClass(), "hash2", -1122880881);
        setIntField(term149, term149.getClass(), "hash3", -542712742);
        setField(term149, term149.getClass(), "key1", term154);
        setField(term149, term149.getClass(), "key2", term155);
        setField(term149, term149.getClass(), "key3", term156);
        setField(term149, term149.getClass(), "value1", term157);
        setField(term149, term149.getClass(), "value2", term158);
        setField(term149, term149.getClass(), "value3", term159);
        setFloatField(term160, term160.getClass(), "loadFactor", 0.0F);
        setIntField(term160, term160.getClass(), "size", 0);
        setField(term160, term160.getClass(), "data", null);
        setIntField(term160, term160.getClass(), "threshold", 0);
        setIntField(term160, term160.getClass(), "modCount", 0);
        setField(term160, term160.getClass(), "entrySet", null);
        setField(term160, term160.getClass(), "keySet", null);
        setField(term160, term160.getClass(), "values", null);
        setField(term160, term160.getClass(), "keySet", null);
        setField(term160, term160.getClass(), "values", null);
        setField(term149, term149.getClass(), "delegateMap", term160);
        term7261 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7262 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term7263 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        setIntField(term7261, term7261.getClass(), "size", 0);
        setIntField(term7261, term7261.getClass(), "hash1", 0);
        setIntField(term7261, term7261.getClass(), "hash2", 0);
        setIntField(term7261, term7261.getClass(), "hash3", 0);
        setField(term7261, term7261.getClass(), "key1", null);
        setField(term7261, term7261.getClass(), "key2", null);
        setField(term7261, term7261.getClass(), "key3", null);
        setField(term7261, term7261.getClass(), "value1", null);
        setField(term7261, term7261.getClass(), "value2", null);
        setField(term7261, term7261.getClass(), "value3", null);
        setFloatField(term7262, term7262.getClass(), "loadFactor", 0.75F);
        setIntField(term7262, term7262.getClass(), "size", 0);
        setField(term7262, term7262.getClass(), "data", term7263);
        setIntField(term7262, term7262.getClass(), "threshold", 12);
        setIntField(term7262, term7262.getClass(), "modCount", 0);
        setField(term7262, term7262.getClass(), "entrySet", null);
        setField(term7262, term7262.getClass(), "keySet", null);
        setField(term7262, term7262.getClass(), "values", null);
        setField(term7262, term7262.getClass(), "keySet", null);
        setField(term7262, term7262.getClass(), "values", null);
        setField(term7261, term7261.getClass(), "delegateMap", term7262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term149, args);
        assertTrue(recursiveEquals(term149, term7261));
    }

};
