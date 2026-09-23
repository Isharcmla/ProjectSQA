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

public class CaseInsensitiveMap_init_638985562119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20850;
     Object term21244;
     Object term21252;

    public CaseInsensitiveMap_init_638985562119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20790 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term20594 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setFloatField(term20790, term20790.getClass(), "loadFactor", 0.0F);
        setIntField(term20790, term20790.getClass(), "threshold", 0);
        setField(term20790, term20790.getClass(), "data", term20594);
        setIntField(term20790, term20790.getClass(), "size", -8);
        Object term20940 = newInstance(Class.forName("java.lang.Object"));
        term20850 = new LinkedHashMap();
        ((LinkedHashMap) term20850).put(term20940, term20940);
        ((LinkedHashMap) term20850).put((Object)null, (Object)null);
        ((LinkedHashMap) term20850).put((Object)null, (Object)null);
        ((LinkedHashMap) term20850).put((Object)null, (Object)null);
        ((LinkedHashMap) term20850).put((Object)null, (Object)null);
        ((LinkedHashMap) term20850).put((Object)null, (Object)null);
        ((LinkedHashMap) term20850).put((Object)null, (Object)null);
        ((LinkedHashMap) term20850).put((Object)null, (Object)null);
        term21244 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term21245 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term21246 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term21247 = newInstance(Class.forName("java.lang.Object"));
        Object term21248 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term21251 = newInstance(Class.forName("java.lang.Object"));
        setFloatField(term21244, term21244.getClass(), "loadFactor", 0.75F);
        setIntField(term21244, term21244.getClass(), "size", 2);
        setField(term21246, term21246.getClass(), "next", null);
        setField(term21246, term21246.getClass(), "key", term21247);
        setField(term21246, term21246.getClass(), "value", null);
        setElement(term21245, 4, term21246);
        setField(term21248, term21248.getClass(), "next", null);
        setField(term21248, term21248.getClass(), "key", "java.lang.object@252bca41");
        setField(term21248, term21248.getClass(), "value", term21251);
        setElement(term21245, 14, term21248);
        setField(term21244, term21244.getClass(), "data", term21245);
        setIntField(term21244, term21244.getClass(), "threshold", 12);
        setIntField(term21244, term21244.getClass(), "modCount", 2);
        setField(term21244, term21244.getClass(), "entrySet", null);
        setField(term21244, term21244.getClass(), "keySet", null);
        setField(term21244, term21244.getClass(), "values", null);
        setField(term21244, term21244.getClass(), "keySet", null);
        setField(term21244, term21244.getClass(), "values", null);
        term21252 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term20850;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21244));
        assertTrue(recursiveEquals(term20850, term21252));
    }

};


