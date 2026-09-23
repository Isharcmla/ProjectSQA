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

public class CaseInsensitiveMap_init_638985562108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18868;
     Object term19372;
     Object term19380;

    public CaseInsensitiveMap_init_638985562108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18808 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term18808, term18808.getClass(), "loadFactor", 0.0F);
        setIntField(term18808, term18808.getClass(), "threshold", 0);
        setField(term18808, term18808.getClass(), "data", null);
        setIntField(term18808, term18808.getClass(), "size", -8);
        Object term18958 = newInstance(Class.forName("java.lang.Object"));
        term18868 = new LinkedHashMap();
        ((LinkedHashMap) term18868).put(term18958, term18958);
        ((LinkedHashMap) term18868).put((Object)null, (Object)null);
        ((LinkedHashMap) term18868).put((Object)null, (Object)null);
        ((LinkedHashMap) term18868).put((Object)null, (Object)null);
        ((LinkedHashMap) term18868).put((Object)null, (Object)null);
        ((LinkedHashMap) term18868).put((Object)null, (Object)null);
        ((LinkedHashMap) term18868).put((Object)null, (Object)null);
        ((LinkedHashMap) term18868).put((Object)null, (Object)null);
        term19372 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term19373 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term19374 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term19375 = newInstance(Class.forName("java.lang.Object"));
        Object term19376 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term19379 = newInstance(Class.forName("java.lang.Object"));
        setFloatField(term19372, term19372.getClass(), "loadFactor", 0.75F);
        setIntField(term19372, term19372.getClass(), "size", 2);
        setField(term19374, term19374.getClass(), "next", null);
        setField(term19374, term19374.getClass(), "key", term19375);
        setField(term19374, term19374.getClass(), "value", null);
        setElement(term19373, 4, term19374);
        setField(term19376, term19376.getClass(), "next", null);
        setField(term19376, term19376.getClass(), "key", "java.lang.object@313352cb");
        setField(term19376, term19376.getClass(), "value", term19379);
        setElement(term19373, 11, term19376);
        setField(term19372, term19372.getClass(), "data", term19373);
        setIntField(term19372, term19372.getClass(), "threshold", 12);
        setIntField(term19372, term19372.getClass(), "modCount", 2);
        setField(term19372, term19372.getClass(), "entrySet", null);
        setField(term19372, term19372.getClass(), "keySet", null);
        setField(term19372, term19372.getClass(), "values", null);
        setField(term19372, term19372.getClass(), "keySet", null);
        setField(term19372, term19372.getClass(), "values", null);
        term19380 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term18868;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19372));
        assertTrue(recursiveEquals(term18868, term19380));
    }

};


