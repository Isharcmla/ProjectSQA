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

public class CaseInsensitiveMap_init_63898556290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15446;
     Object term16016;
     Object term16024;

    public CaseInsensitiveMap_init_63898556290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15386 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setFloatField(term15386, term15386.getClass(), "loadFactor", 0.0F);
        setIntField(term15386, term15386.getClass(), "threshold", 0);
        setField(term15386, term15386.getClass(), "data", null);
        Object term15536 = newInstance(Class.forName("java.lang.Object"));
        term15446 = new LinkedHashMap();
        ((LinkedHashMap) term15446).put(term15536, term15536);
        ((LinkedHashMap) term15446).put((Object)null, (Object)null);
        ((LinkedHashMap) term15446).put((Object)null, (Object)null);
        ((LinkedHashMap) term15446).put((Object)null, (Object)null);
        ((LinkedHashMap) term15446).put((Object)null, (Object)null);
        ((LinkedHashMap) term15446).put((Object)null, (Object)null);
        ((LinkedHashMap) term15446).put((Object)null, (Object)null);
        ((LinkedHashMap) term15446).put((Object)null, (Object)null);
        term16016 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term16017 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term16018 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term16021 = newInstance(Class.forName("java.lang.Object"));
        Object term16022 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term16023 = newInstance(Class.forName("java.lang.Object"));
        setFloatField(term16016, term16016.getClass(), "loadFactor", 0.75F);
        setIntField(term16016, term16016.getClass(), "size", 2);
        setField(term16018, term16018.getClass(), "next", null);
        setField(term16018, term16018.getClass(), "key", "java.lang.object@7472fc74");
        setField(term16018, term16018.getClass(), "value", term16021);
        setElement(term16017, 2, term16018);
        setField(term16022, term16022.getClass(), "next", null);
        setField(term16022, term16022.getClass(), "key", term16023);
        setField(term16022, term16022.getClass(), "value", null);
        setElement(term16017, 4, term16022);
        setField(term16016, term16016.getClass(), "data", term16017);
        setIntField(term16016, term16016.getClass(), "threshold", 12);
        setIntField(term16016, term16016.getClass(), "modCount", 2);
        setField(term16016, term16016.getClass(), "entrySet", null);
        setField(term16016, term16016.getClass(), "keySet", null);
        setField(term16016, term16016.getClass(), "values", null);
        setField(term16016, term16016.getClass(), "keySet", null);
        setField(term16016, term16016.getClass(), "values", null);
        term16024 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term15446;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16016));
        assertTrue(recursiveEquals(term15446, term16024));
    }

};


