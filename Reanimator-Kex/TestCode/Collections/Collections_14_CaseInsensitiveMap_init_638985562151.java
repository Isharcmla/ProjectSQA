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

public class CaseInsensitiveMap_init_638985562151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28114;
     Object term28508;
     Object term28516;

    public CaseInsensitiveMap_init_638985562151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28054 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term27856 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setFloatField(term28054, term28054.getClass(), "loadFactor", 0.0F);
        setIntField(term28054, term28054.getClass(), "threshold", 0);
        setField(term28054, term28054.getClass(), "data", term27856);
        setIntField(term28054, term28054.getClass(), "size", -8);
        Object term28204 = newInstance(Class.forName("java.lang.Object"));
        term28114 = new LinkedHashMap();
        ((LinkedHashMap) term28114).put(term28204, term28204);
        ((LinkedHashMap) term28114).put((Object)null, (Object)null);
        ((LinkedHashMap) term28114).put((Object)null, (Object)null);
        ((LinkedHashMap) term28114).put((Object)null, (Object)null);
        ((LinkedHashMap) term28114).put((Object)null, (Object)null);
        ((LinkedHashMap) term28114).put((Object)null, (Object)null);
        ((LinkedHashMap) term28114).put((Object)null, (Object)null);
        ((LinkedHashMap) term28114).put((Object)null, (Object)null);
        term28508 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term28509 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term28510 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term28513 = newInstance(Class.forName("java.lang.Object"));
        Object term28514 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term28515 = newInstance(Class.forName("java.lang.Object"));
        setFloatField(term28508, term28508.getClass(), "loadFactor", 0.75F);
        setIntField(term28508, term28508.getClass(), "size", 2);
        setField(term28510, term28510.getClass(), "next", null);
        setField(term28510, term28510.getClass(), "key", "java.lang.object@51e815ea");
        setField(term28510, term28510.getClass(), "value", term28513);
        setElement(term28509, 0, term28510);
        setField(term28514, term28514.getClass(), "next", null);
        setField(term28514, term28514.getClass(), "key", term28515);
        setField(term28514, term28514.getClass(), "value", null);
        setElement(term28509, 4, term28514);
        setField(term28508, term28508.getClass(), "data", term28509);
        setIntField(term28508, term28508.getClass(), "threshold", 12);
        setIntField(term28508, term28508.getClass(), "modCount", 2);
        setField(term28508, term28508.getClass(), "entrySet", null);
        setField(term28508, term28508.getClass(), "keySet", null);
        setField(term28508, term28508.getClass(), "values", null);
        setField(term28508, term28508.getClass(), "keySet", null);
        setField(term28508, term28508.getClass(), "values", null);
        term28516 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term28114;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28508));
        assertTrue(recursiveEquals(term28114, term28516));
    }

};


