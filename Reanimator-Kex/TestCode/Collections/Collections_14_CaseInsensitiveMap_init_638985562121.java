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

public class CaseInsensitiveMap_init_638985562121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21601;
     Object term21957;
     Object term21965;

    public CaseInsensitiveMap_init_638985562121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21541 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term21347 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setFloatField(term21541, term21541.getClass(), "loadFactor", 0.0F);
        setIntField(term21541, term21541.getClass(), "threshold", 0);
        setField(term21541, term21541.getClass(), "data", term21347);
        setIntField(term21541, term21541.getClass(), "size", 64648);
        Object term21691 = newInstance(Class.forName("java.lang.Object"));
        term21601 = new LinkedHashMap();
        ((LinkedHashMap) term21601).put(term21691, term21691);
        ((LinkedHashMap) term21601).put((Object)null, (Object)null);
        ((LinkedHashMap) term21601).put((Object)null, (Object)null);
        ((LinkedHashMap) term21601).put((Object)null, (Object)null);
        ((LinkedHashMap) term21601).put((Object)null, (Object)null);
        ((LinkedHashMap) term21601).put((Object)null, (Object)null);
        ((LinkedHashMap) term21601).put((Object)null, (Object)null);
        ((LinkedHashMap) term21601).put((Object)null, (Object)null);
        term21957 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term21958 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term21959 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term21960 = newInstance(Class.forName("java.lang.Object"));
        Object term21961 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term21964 = newInstance(Class.forName("java.lang.Object"));
        setFloatField(term21957, term21957.getClass(), "loadFactor", 0.75F);
        setIntField(term21957, term21957.getClass(), "size", 2);
        setField(term21959, term21959.getClass(), "next", null);
        setField(term21959, term21959.getClass(), "key", term21960);
        setField(term21959, term21959.getClass(), "value", null);
        setElement(term21958, 4, term21959);
        setField(term21961, term21961.getClass(), "next", null);
        setField(term21961, term21961.getClass(), "key", "java.lang.object@50b16358");
        setField(term21961, term21961.getClass(), "value", term21964);
        setElement(term21958, 11, term21961);
        setField(term21957, term21957.getClass(), "data", term21958);
        setIntField(term21957, term21957.getClass(), "threshold", 12);
        setIntField(term21957, term21957.getClass(), "modCount", 2);
        setField(term21957, term21957.getClass(), "entrySet", null);
        setField(term21957, term21957.getClass(), "keySet", null);
        setField(term21957, term21957.getClass(), "values", null);
        setField(term21957, term21957.getClass(), "keySet", null);
        setField(term21957, term21957.getClass(), "values", null);
        term21965 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term21601;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21957));
        assertTrue(recursiveEquals(term21601, term21965));
    }

};


