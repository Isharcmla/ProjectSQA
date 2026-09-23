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

public class Flat3Map_put_19447407251093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322030;
     Object term322122;
     Object term322813;
     Object term322821;

    public Flat3Map_put_19447407251093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322030 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term322030, term322030.getClass(), "delegateMap", null);
        setIntField(term322030, term322030.getClass(), "size", 3);
        setIntField(term322030, term322030.getClass(), "hash3", 0);
        setField(term322030, term322030.getClass(), "key3", null);
        setIntField(term322030, term322030.getClass(), "hash2", 0);
        setField(term322030, term322030.getClass(), "key2", null);
        setIntField(term322030, term322030.getClass(), "hash1", 0);
        setField(term322030, term322030.getClass(), "key1", term322030);
        setField(term322030, term322030.getClass(), "value3", null);
        term322122 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term322232 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term322296 = newInstance(Class.forName("java.util.stream.WhileOps$3$1"));
        setField(term322122, term322122.getClass(), "delegateMap", null);
        setIntField(term322122, term322122.getClass(), "size", 3);
        setIntField(term322122, term322122.getClass(), "hash3", 0);
        setField(term322122, term322122.getClass(), "value3", null);
        setIntField(term322122, term322122.getClass(), "hash2", 0);
        setField(term322122, term322122.getClass(), "value2", null);
        setIntField(term322122, term322122.getClass(), "hash1", 0);
        setIntField(term322232, term322232.getClass(), "size", 0);
        setField(term322122, term322122.getClass(), "value1", term322232);
        setField(term322122, term322122.getClass(), "key3", null);
        setField(term322122, term322122.getClass(), "key2", null);
        setField(term322122, term322122.getClass(), "key1", term322296);
        term322813 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term322814 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term322815 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term322816 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term322817 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term322818 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term322819 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term322820 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term322813, term322813.getClass(), "size", 0);
        setIntField(term322813, term322813.getClass(), "hash1", 0);
        setIntField(term322813, term322813.getClass(), "hash2", 0);
        setIntField(term322813, term322813.getClass(), "hash3", 0);
        setField(term322813, term322813.getClass(), "key1", null);
        setField(term322813, term322813.getClass(), "key2", null);
        setField(term322813, term322813.getClass(), "key3", null);
        setField(term322813, term322813.getClass(), "value1", null);
        setField(term322813, term322813.getClass(), "value2", null);
        setField(term322813, term322813.getClass(), "value3", null);
        setFloatField(term322814, term322814.getClass(), "loadFactor", 0.75F);
        setIntField(term322814, term322814.getClass(), "size", 3);
        setField(term322817, term322817.getClass(), "next", null);
        setField(term322817, term322817.getClass(), "key", term322813);
        setField(term322817, term322817.getClass(), "value", null);
        setField(term322816, term322816.getClass(), "next", term322817);
        setIntField(term322818, term322818.getClass(), "size", 3);
        setIntField(term322818, term322818.getClass(), "hash1", 0);
        setIntField(term322818, term322818.getClass(), "hash2", 0);
        setIntField(term322818, term322818.getClass(), "hash3", 0);
        setField(term322818, term322818.getClass(), "key1", null);
        setField(term322818, term322818.getClass(), "key2", null);
        setField(term322818, term322818.getClass(), "key3", null);
        setField(term322818, term322818.getClass(), "value1", null);
        setField(term322818, term322818.getClass(), "value2", null);
        setField(term322818, term322818.getClass(), "value3", null);
        setField(term322818, term322818.getClass(), "delegateMap", null);
        setField(term322816, term322816.getClass(), "key", term322818);
        setField(term322816, term322816.getClass(), "value", null);
        setElement(term322815, 0, term322816);
        setField(term322819, term322819.getClass(), "next", null);
        setField(term322819, term322819.getClass(), "key", term322820);
        setField(term322819, term322819.getClass(), "value", null);
        setElement(term322815, 6, term322819);
        setField(term322814, term322814.getClass(), "data", term322815);
        setIntField(term322814, term322814.getClass(), "threshold", 12);
        setIntField(term322814, term322814.getClass(), "modCount", 3);
        setField(term322814, term322814.getClass(), "entrySet", null);
        setField(term322814, term322814.getClass(), "keySet", null);
        setField(term322814, term322814.getClass(), "values", null);
        setField(term322814, term322814.getClass(), "keySet", null);
        setField(term322814, term322814.getClass(), "values", null);
        setField(term322813, term322813.getClass(), "delegateMap", term322814);
        term322821 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term322821, term322821.getClass(), "size", 3);
        setIntField(term322821, term322821.getClass(), "hash1", 0);
        setIntField(term322821, term322821.getClass(), "hash2", 0);
        setIntField(term322821, term322821.getClass(), "hash3", 0);
        setField(term322821, term322821.getClass(), "key1", null);
        setField(term322821, term322821.getClass(), "key2", null);
        setField(term322821, term322821.getClass(), "key3", null);
        setField(term322821, term322821.getClass(), "value1", null);
        setField(term322821, term322821.getClass(), "value2", null);
        setField(term322821, term322821.getClass(), "value3", null);
        setField(term322821, term322821.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term322122;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term322030, args);
        assertTrue(recursiveEquals(term322030, term322813));
        assertTrue(recursiveEquals(term322122, term322821));
        assertTrue(recursiveEquals(retValue, null));
    }

};


